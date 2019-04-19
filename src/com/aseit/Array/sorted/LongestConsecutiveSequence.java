package com.aseit.Array.sorted;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-19
 * Time: 10:01
 * Description:
 * OJ:https://www.lintcode.com/problem/longest-consecutive-sequence/description
 */
public class LongestConsecutiveSequence {

    /**
     * 给出数组[100, 4, 200, 1, 3, 2]，这个最长的连续序列是 [1, 2, 3, 4]，
     *
     * @param args
     */
    public static void main(String args[]) {

        int[] num={100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(num));
    }

    /**
     * @param num: A list of integers
     * @return: An integer
     */
    public static  int longestConsecutive(int[] num) {
        // write your code here

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            set.add(num[i]);
        }
        int longest = 0;
        for (int i = 0; i < num.length; i++) {
            int down = num[i] - 1;
            while (set.contains(down)) {
                set.remove(down);
                down--;
            }

            int up = num[i] + 1;
            while (set.contains(up)) {
                set.remove(up);
                up++;
            }

            longest = Math.max(longest, up - down - 1);
        }
        return longest;
    }

}
