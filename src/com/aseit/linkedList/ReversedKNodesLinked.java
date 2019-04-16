package com.aseit.linkedList;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-16
 * Time: 14:03
 * Description:
 */
public class ReversedKNodesLinked {

    //   Definition for ListNode
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        // write your code here

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;

        while (true) {
            head = reverseNextK(head, k);
            if(head == null)
                break;
        }
        return dummy.next;
    }


    // head -> n1 -> n2 ... nk -> nk+1
    // =>
    // head -> nk -> nk-1 .. n1 -> nk+1
    // return n1
    private ListNode reverseNextK(ListNode head, int k) {

        ListNode nk = head;
        for (int i = 0; i < k; i++) {
            if (nk == null) {
                return null;
            }
            nk = nk.next;
        }

        if(nk == null){
            return null;
        }
        //reverse 开始反转
        ListNode n1 = head.next;
        ListNode nkplus = nk.next;

        ListNode prev = null;
        ListNode curt = n1;

        while(curt != nkplus){

            ListNode temp = curt.next;
            curt.next = prev;
            prev = curt;
            curt = temp;
        }

        //connect 链接链表，防止断掉
        head.next = nk;
        n1.next = nkplus;
        return n1;
    }
}
