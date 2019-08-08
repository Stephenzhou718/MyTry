package dp;

/**
 * @author ming
 * @date 2019/4/20 21:06
 */

import dp.TreeNode;

public class P26 {
    /**
     * 判断一棵树是否是另一棵树的子结构
     * @param args
     */
    public static void main(String[] args){

    }

    private boolean hasSubTree(TreeNode treeNode1, TreeNode treeNode2){
        boolean flag = false;

        if(treeNode1 != null && treeNode2 != null){
            if(equalTree(treeNode1, treeNode2)) {
                flag = true;
            }
            if(!flag){
                flag = hasSubTree(treeNode1.left, treeNode2);
            }

            if(!flag){
                flag = hasSubTree(treeNode1.right, treeNode2);
            }

        }
        return flag;
    }

    private boolean equalTree(TreeNode treeNode1, TreeNode treeNode2){
        if(treeNode2 == null){
            return true;
        }

        if(treeNode1 == null && treeNode2 != null){
            return false;
        }

        if(treeNode1 != treeNode2){
            return false;
        }else {
            return equalTree(treeNode1.left,treeNode2.left) && equalTree(treeNode1.right, treeNode2.right);
        }
    }
}
