package dp;

/**
 * @author ming
 * @date 2019/4/17 15:59
 */

class TreeNode{
    int val;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode(int x){
        val = x;
    }
}


public class P7 {
    public static void main(String[] args){
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        new P7().go(pre,in);
    }

    private void go(int[] pre, int[] in){
        System.out.println(reBuildBinaryTree(pre, in, 0, pre.length - 1, 0, in.length - 1));
    }

    private TreeNode reBuildBinaryTree(int[] pre, int[] in, int startPreOrder, int endPreOrder, int startInOrder, int endInOrder){
        if(startPreOrder > endPreOrder){
            return null;
        }
        TreeNode root = new TreeNode(pre[startPreOrder]);


        for(int i = startInOrder; i <= endInOrder; i++){
            if(in[i] == pre[startPreOrder]){
                int leftEndPreOrder = i + startPreOrder - startInOrder;
                int leftEndInOrder = i - 1;
                int rightStartPreOrder = i + startPreOrder + 1 - startInOrder;
                int rightStartInOrder = i + 1;
                root.left = reBuildBinaryTree(pre, in, startPreOrder + 1, leftEndPreOrder, startInOrder, leftEndInOrder);
                root.right = reBuildBinaryTree(pre, in, rightStartPreOrder, endPreOrder, rightStartInOrder, endInOrder);
                break;
            }
        }

        return root;
    }

}
