package dp;

/**
 * @author ming
 * @date 2019/6/7 20:36
 */

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从上到下按之字形打印二叉树
 */
public class P32_3 {
    public static void main(String[] args){

    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(pRoot == null){
            return result;
        }

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(pRoot);
        boolean vervise = true;
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();
            if(!stack1.isEmpty()){
                while (!stack1.isEmpty()){
                    TreeNode top = stack1.pop();
                    level.add(top.val);

                    if(top.left != null){
                        stack2.push(top.left);
                    }

                    if(top.right != null){
                        stack2.push(top.right);
                    }

                }

            }else {
                while (!stack2.isEmpty()){
                    TreeNode top = stack2.pop();
                    level.add(top.val);

                    if(top.right != null){
                        stack1.push(top.right);
                    }

                    if(top.left != null){
                        stack1.push(top.left);
                    }



                }
            }

            result.add(level);
        }
        return  result;
    }
}
