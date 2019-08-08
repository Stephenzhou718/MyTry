package dp;

/**
 * @author ming
 * @date 2019/6/7 18:56
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下分层打印二叉树
 */
public class P32_2 {
    public static void main(String[] args){

    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(pRoot == null){
            return result;
        }
        int toBePrint = 1;
        int nextLevel = 0;


        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        while (toBePrint != 0){
            ArrayList<Integer> level = new ArrayList<>();
            for(; toBePrint > 0 ; toBePrint--){
                TreeNode top = queue.poll();
                if(top == null){
                    break;
                }

                level.add(top.val);

                if(top.left != null){
                    queue.offer(top.left);
                    nextLevel++;
                }

                if(top.right != null){
                    queue.offer(top.right);
                    nextLevel++;
                }
            }
            result.add(level);
            toBePrint = nextLevel;
            nextLevel = 0;
        }

        return result;
    }
}
