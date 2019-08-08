package dp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ming
 * @date 2019/4/17 14:32
 */
public class P6 {
    //尝试下反转链表的操作
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ListNode preNode = null;
        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(4);
        ListNode head = listNode;

        ListNode nextNode = head.next;
        ArrayList<Integer> arrayList = new ArrayList<>();



        while(nextNode != null){
            listNode.next = preNode;
            preNode = listNode;
            listNode = nextNode;
            nextNode = listNode.next;
        }
        listNode.next = preNode;


        while (listNode != null)
        {
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }

        for(int i : arrayList){
            System.out.println(i);
        }

    }
}



   class ListNode {
       int val;
       ListNode next = null;

              ListNode(int val) {
           this.val = val;
       }
   }


