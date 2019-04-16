package com.aseit.linkedList;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-03
 * Time: 21:06
 * Description:
 * oj:https://www.lintcode.com/problem/reverse-linked-list/description
 * 。
 */
public class ReversedLinked {
    //   Definition for ListNode
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode reverse(ListNode head) {
        ListNode preNode = null;
        ListNode currNode = head;

        while(currNode !=null){
            ListNode temp = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = temp;
        }
        return preNode;
    }
}

