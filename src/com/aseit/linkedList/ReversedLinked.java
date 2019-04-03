package com.aseit.linkedList;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-03
 * Time: 21:06
 * Description:
 * oj:https://www.lintcode.com/problem/reverse-linked-list/description
 * 不是和清楚链表这种如何运行测试。
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


    public static void main(String args[]) {
    }

    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode preNode = null;
        ListNode currNode = head;
        ListNode nextNode = head.next;

        //1 - 2 - 3
        //
        while (head.next != null) {

            if (currNode.next == null) {
                currNode = preNode;
                head = currNode;
                break;
            }
            currNode = preNode;
            preNode = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
        }
        return head;
    }
}

