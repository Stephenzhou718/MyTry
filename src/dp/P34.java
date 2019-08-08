package dp;

/**
 * @author ming
 * @date 2019/4/25 16:27
 */

import java.util.ArrayList;
import java.util.Vector;

public class P34 {
    public static void main(String[] args){
        P34 p34 = new P34();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        ArrayList<ArrayList<Integer>> allPath = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<>();
        p34.findPath(root, 22, path, 0, allPath);
        for(ArrayList<Integer> item : allPath){
            System.out.println(item.toString());
        }
    }

    private void findPath(TreeNode root, int target, ArrayList<Integer> path, int currentSum, ArrayList<ArrayList<Integer>> allPath){
           path.add(root.val);
           currentSum += root.val;
           if(target == currentSum){
               allPath.add((ArrayList<Integer>) path.clone());
           }else if (currentSum < target){
               if(root.left != null){
                   findPath(root.left, target, path, currentSum, allPath);
               }

               if(root.right != null){
                   findPath(root.right, target, path, currentSum, allPath);
               }
           }

           path.remove(path.size() - 1);
           currentSum -= root.val;

    }
}
