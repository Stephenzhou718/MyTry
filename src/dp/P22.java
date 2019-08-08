package dp;

import java.util.Scanner;

/**
 * @author ming
 * @date 2019/4/20 16:21
 */


import dp.ListNode;


public class P22 {
    public static void main(String[] args){
        System.out.println(new P22().findNode().val);

    }

    public ListNode findNode(){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);

        ListNode pAhead = listNode;
        ListNode pBehind = listNode;


        if(listNode == null || k == 0){
            return null;
        }

        for(int i = 0; i < k - 1; i++){
            if(pAhead.next != null){
                pAhead = pAhead.next;
            }else{
                return null;
            }
        }

        while (pAhead.next != null){
            pAhead = pAhead.next;
            pBehind = pBehind.next;
        }

        return pBehind;


    }
}
