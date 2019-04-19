package com.aseit.Array;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-17
 * Time: 14:19
 * Description:
 * OJ:https://www.lintcode.com/problem/maximum-subarray/description
 * 求子数组最大的和
 */

/**
 * 思路，前一个减去之前数里面差值最大的就是以右边届最大的子数组
 */
public class MaximumSubarray {

    public static void main(String args[]) {
        int[] A = new int[]{-2, 2, -3, 4, -1, 2, 1, -5, 3};
        System.out.println(maxSubArray(A));

    }

    public static int maxSubArray(int[] A) {

        if (A == null || A.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE, sum = 0, minSum = 0;

        //[−2,2,−3,4,−1,2,1,−5,3] 符合要求的子数组为[4,−1,2,1]，
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            max = Math.max(max, sum - minSum);
            minSum = Math.min(minSum, sum);
        }
        return max;
    }
}
