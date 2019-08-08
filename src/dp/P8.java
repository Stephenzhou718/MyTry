package dp;

/**
 * @author ming
 * @date 2019/6/7 17:55
 */


/**
 * next 为 指向父节点的指针
 */


class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}



/**
 * 二叉树的下一个节点
 */

public class P8 {
    public static void main(String[] args){

    }

    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if(pNode == null){
            return null;
        }

        if(pNode.right != null){
            pNode = pNode.right;
            while (pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }else {
            while (pNode.next != null){
                if(pNode.next.left == pNode){
                    return pNode.next;
                }

                pNode = pNode.next;
            }

            return null;
        }
    }
}
