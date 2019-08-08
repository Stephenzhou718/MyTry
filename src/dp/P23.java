package dp;

/**
 * @author ming
 * @date 2019/6/7 16:36
 */

/**
 * 链表环的入口节点
 */

import  dp.ListNode;
public class P23 {
    public static void main(String[] args){

    }

    public ListNode EntryNodeOfLoop(ListNode pHead){
        if(pHead == null){
            return null;
        }

        ListNode nodeInCircle = isCircle(pHead);
        int numOfCircle;
        if(nodeInCircle == null){
            return null;
        }else {
            numOfCircle = numOfNodeOfCircle(nodeInCircle);
        }


        ListNode pHead1 = pHead;
        ListNode pHead2 = pHead;

        for(int i = 0; i < numOfCircle; i++){
            pHead2 = pHead2.next;
        }

        while (pHead1 != pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }

        return pHead1;
    }

    public ListNode isCircle(ListNode pHead){
        //先判断列表是否成环
        ListNode pHead1 = pHead;
        ListNode pHead2 = pHead;

        do{
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
            if(pHead2 != null){
                pHead2 = pHead2;
            }else {
                break;
            }
        }while (pHead1 != pHead2);

        if(pHead1 == pHead2){
            return pHead1;
        }else {
            return null;
        }
    }

    public int numOfNodeOfCircle(ListNode listNode){
        //计算环中节点的个数
        ListNode pHead1 = listNode;
        ListNode pHead2 = listNode;

        int count = 0;
        do{
            count++;
            pHead1 = pHead1.next;
            pHead2 = pHead2.next.next;
        }while (pHead1 != pHead2);

        return count;
    }
}
