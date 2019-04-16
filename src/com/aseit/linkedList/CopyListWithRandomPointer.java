package com.aseit.linkedList;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-16
 * Time: 15:42
 * Description:
 * OJ:https://www.lintcode.com/problem/copy-list-with-random-pointer/description
 */
public class CopyListWithRandomPointer {

    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }

    //HashMap version
    public RandomListNode copyRandomList(RandomListNode head) {
        while (head == null) {
            return null;
        }
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();

        RandomListNode dummy = new RandomListNode(0);
        RandomListNode pre = dummy, newNode;

        while (head != null) {

            if (map.containsKey(head)) {
                newNode = map.get(head);
            } else {
                newNode = new RandomListNode(head.label);
                map.put(head, newNode);
            }
            pre.next = newNode;

            if (head.random != null) {
                if(map .containsKey(head.random)){
                    newNode.random = map.get(head.random);
                }else{
                    newNode.random = new RandomListNode(head.random.label);
                    map.put(head.random, newNode.random);
                }
            }
            pre = newNode;
            head = head.next;
        }
        return dummy.next;
    }
}
