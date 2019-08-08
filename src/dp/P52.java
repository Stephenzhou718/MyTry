package dp;
import dp.ListNode;
/**
 * @author ming
 * @date 2019/5/30 22:00
 */

/**
 * 两个链表的第一个公共节点
 */

public class P52 {
    public static void main(String[] args){

    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){

        if(pHead1 == null || pHead2 == null){
            return null;
        }else if(pHead1 == pHead2){
            return pHead1;
        }

        ListNode p1 = pHead1;
        ListNode p2 = pHead2;


        while (p1 != p2){
            if(p1 != null){
                p1 = p1.next;
            }else {
                p1 = pHead2;
            }

            if(p2 != null){
                p2 = p2.next;
            }else {
                p2 = pHead1;
            }
        }

        return p1;

    }
}
