package dp;

/**
 * @author ming
 * @date 2019/6/7 18:38
 */

/**
 * 判断一棵树是不是对称二叉树
 */
import dp.TreeNode;

public class P28 {
    public static void main(String[] args){

    }

    boolean isSymmetrical(TreeNode pRoot){

        if(pRoot == null){
            return true;
        }
        return isisSymmetricalCore(pRoot.left, pRoot.right);
    }

    boolean isisSymmetricalCore(TreeNode left, TreeNode right){
        if(left == null && right != null){
            return false;
        }

        if(left != null && right == null){
            return false;
        }

        if(left == null && right == null){
            return true;
        }

        if(left.val != right.val){
            return false;
        }

        return isisSymmetricalCore(left.left, right.right) && isisSymmetricalCore(left.right, right.left);
    }
}
