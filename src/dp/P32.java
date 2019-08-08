package dp;

/**
 * @author ming
 * @date 2019/4/23 15:21
 */
import dp.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class P32 {

    public static void main(String[] args){

    }

    private ArrayList<Integer> PrintFromTopToButtom(TreeNode root){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();

        if(root == null) return arrayList;

        ((ArrayDeque<TreeNode>) queue).push(root);
        arrayList.add(root.val);
        while (!queue.isEmpty()){
            root = queue.poll();
            if(root.left != null){
                ((ArrayDeque<TreeNode>) queue).addLast(root.left);
                arrayList.add(root.left.val);
            }

            if(root.right != null){
                ((ArrayDeque<TreeNode>) queue).addLast(root.right);
                arrayList.add(root.right.val);
            }
        }
        return arrayList;

    }
}
