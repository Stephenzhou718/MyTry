package dp;

/**
 * @author ming
 * @date 2019/6/7 21:37
 */

import java.lang.annotation.Target;

/**
 * 找出搜索二叉树中第 K 小节点
 */
public class P54 {
    public static void main(String[] args){

    }

    TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot == null || k <= 0){
            return null;
        }

        TreeNode[] target = new TreeNode[1];
        KthNode(pRoot, target, k, new int[1]);
        return target[0];
    }



    void KthNode(TreeNode pRoot, TreeNode[] target, int k, int[] index){
        if(pRoot != null) {
            KthNode(pRoot.left, target, k, index);
            index[0]++;
            if(index[0] == k){
                target[0] = pRoot;
            }
            KthNode(pRoot.right, target, k, index);
        }
    }
}
