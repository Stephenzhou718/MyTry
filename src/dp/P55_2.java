package dp;

import dp.TreeNode;

/**
 * @author ming
 * @date 2019/5/30 22:37
 */

/**
 * 判断一棵树是不是平衡树
 */
public class P55_2 {
    public static void main(String[] args){

    }

    public boolean IsBalanced_Solution(TreeNode root){
        if(root == null){
            return  true;
        }

        if(Math.abs(TreeDepth(root.left) - TreeDepth(root.right)) > 1){
            return false;
        }

        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    private int TreeDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        return 1 + Math.max(TreeDepth(root.left), TreeDepth(root.right));
    }

}
