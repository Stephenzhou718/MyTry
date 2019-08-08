package dp;

/**
 * @author ming
 * @date 2019/4/20 16:58
 */


public class P24 {
    public static void main(String[] args){
        ListNode head = null;
        System.out.println(new P24().go(head));
    }

    public ListNode go(ListNode head){


        ListNode pre = null;
        ListNode now = head;
        ListNode next = now.next;

        if(head == null){
            return null;
        }

        while(next != null){
            now.next = pre;
            pre = now;
            now = next;
            next = now.next;
        }
        now.next = pre;
        return now;
    }
}
