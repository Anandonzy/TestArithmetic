package com.aseit.Array;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-17
 * Time: 15:30
 * Description:
 * OJ:https://www.lintcode.com/problem/window-sum/description
 */
public class WindowSum {

    public static void main(String args[]) {

        int[] sum = new int[]{1, 2, 7, 8, 5};
        int[] ints = winSum(sum, 3);
        for(int a : ints){
            System.out.println(a);
        }


    }

    /**
     * 考虑三种异常情况
     * 数组为空
     * 数组元素个数不足k
     * 数组不为空但k小于等于0
     *
     * @param nums
     * @param k
     * @return
     */
    public static int[] winSum(int[] nums, int k) {
        // write your code here
        if (nums == null || nums.length < k || k <= 0) {
            return new int[0];
        }

        /**
         * 输入：array = [1,2,7,8,5], k = 3
         输出：[10,17,20]
         解析：
         1 + 2 + 7 = 10
         2 + 7 + 8 = 17
         7 + 8 + 5 = 20
         */
        int[] sum = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            sum[0] += nums[i];
        }

        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i + k - 1] - nums[i - 1];
        }
        return sum;
    }
}
