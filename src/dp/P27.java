package dp;

/**
 * @author ming
 * @date 2019/4/21 10:44
 */

import dp.TreeNode;
public class P27 {
    /**
     * 镜像二叉树
     * @param args
     */
    public static void main(String[] args){

    }

    public void Mirror(TreeNode root) {
        if (root == null) return;
        else if (root.left == null && root.right == null) return;
        else {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }

}
