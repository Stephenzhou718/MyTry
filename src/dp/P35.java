package dp;

/**
 * @author ming
 * @date 2019/5/11 11:29
 */

/**
 * 傻逼牛客网不能直接对 pHead 进行操作
 */
class RandomListNode{
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label){
        this.label = label;
    }

    RandomListNode(){}
}


public class P35 {
    public static void main(String[] args){
        RandomListNode root = new RandomListNode(1);
        RandomListNode pHead = new RandomListNode(2);
        root.next = pHead;
        pHead.next = new RandomListNode(3);
        pHead = pHead.next;
        pHead.next = new RandomListNode(4);
        pHead = pHead.next;
        pHead.next = new RandomListNode(5);
        pHead = pHead.next;
        pHead.next = new RandomListNode(3);
        pHead = pHead.next;
        pHead.next = new RandomListNode(5);
        pHead = pHead.next;
        pHead.next = new RandomListNode();
        pHead = pHead.next;
        pHead.next = new RandomListNode(2);
        pHead = pHead.next;
        pHead.next = new RandomListNode();
        pHead = pHead.next;

        root = new P35().Clone(root);
        while (root != null){
            System.out.println(root.label);
            root = root.next;
        }
    }

    private RandomListNode Clone(RandomListNode pHead){
        RandomListNode CNode = null;
        if(pHead != null){
            pHead = CloneNodes(pHead);
            pHead = CloneSiblingNodes(pHead);
            CNode = splitList(pHead);
        }
        return CNode;
    }

    /**
     * 复制链表
     * @param pHead 链表指针
     */
    private RandomListNode CloneNodes(RandomListNode pHead){
        RandomListNode root = pHead;
        while(pHead != null){
            RandomListNode CloneNode = new RandomListNode(pHead.label);
            CloneNode.next = pHead.next;
            pHead.next = CloneNode;
            pHead = CloneNode.next;
        }
        return root;
    }


    /**
     * 连接随机节点
     * @param pHead 经过复制完的链表指针
     */
    private RandomListNode CloneSiblingNodes(RandomListNode pHead){
        RandomListNode root = pHead;
        while(pHead != null){
            RandomListNode pClone = pHead.next;
            pClone.random = pHead.random;
            pHead = pClone.next;
        }
        return root;
    }

    private RandomListNode splitList(RandomListNode pHead){
        RandomListNode cloneNode = pHead.next;
        RandomListNode root = cloneNode;
        while (cloneNode.next != null){
            cloneNode.next = cloneNode.next.next;
            cloneNode = cloneNode.next;
        }
        return root;
    }
}
