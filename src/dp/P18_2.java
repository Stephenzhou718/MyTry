package dp;

/**
 * @author ming
 * @date 2019/6/7 17:06
 */

/**
 * 删除一个排序链表中的重复节点
 */

public class P18_2 {
    public static void main(String[] args){
        ListNode pHead = new ListNode(1);
        pHead.next = new ListNode(1);
        pHead.next.next = new ListNode(1);
        pHead.next.next.next= new ListNode(1);
        ListNode node = new P18_2().deleteDuplication(pHead);

        System.out.println(node.val);
    }

    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null){
            return null;
        }

        ListNode pNode = pHead;
        ListNode preNode = null;


        while (pNode != null){
           if(pNode.next != null && pNode.val == pNode.next.val){
               while (pNode.next != null && pNode.val == pNode.next.val){
                   pNode.next = pNode.next.next;
               }

               if(preNode == null){
                   pHead = pNode.next;
                   pNode = pNode.next;
               }else {
                   preNode.next = pNode.next;
                   pNode = pNode.next;
               }
            }else {
               preNode = pNode;
               pNode = pNode.next;
           }
        }

        return pHead;
    }
}
