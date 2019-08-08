package dp;

/**
 * @author ming
 * @date 2019/4/20 18:49
 */

import dp.ListNode;

public class P25 {
    public static void main(String[] args){
        ListNode head1 = new P25().go();
        while (head1 != null){
            System.out.println(head1.val);
            head1 = head1.next;

        }
    }

    ListNode go(){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);


        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);
        ListNode head = null;
        ListNode now = null;

        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }

        if(list1.val < list2.val){
            now = list1;
            head = now;
            list1 = list1.next;
        }else{
            now = list2;
            head = now;
            list2 = list2.next;
        }


        while(list1 != null || list2 != null){
            if(list1 == null){
                now.next = list2;
                break;
            }else if(list2 == null){
                now.next = list1;
                break;
            }

            if(list1.val < list2.val){
                now.next = list1;
                now = now.next;
                list1 = list1.next;
            }else{
                now.next = list2;
                now = now.next;
                list2 = list2.next;
            }
        }
        return head;
    }
}
