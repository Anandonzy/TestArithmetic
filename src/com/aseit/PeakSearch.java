package com.aseit;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-03-28
 * Time: 10:14
 * Description:
 * 02.Find Peak Element
 * Description
 * 中文
 * English
 * 你给出一个整数数组(size为n)，其具有以下特点：
 * <p>
 * 相邻位置的数字是不同的
 * A[0] < A[1] 并且 A[n - 2] > A[n - 1]
 * 假定P是峰值的位置则满足A[P] > A[P-1]且A[P] > A[P+1]，返回数组中任意一个峰值的位置。
 * <p>
 * Example
 * 样例 1:
 * 输入:  [1, 2, 1, 3, 4, 5, 7, 6]
 * 输出:  1 or 6
 * <p>
 * 解释:
 * 返回峰顶元素的下标
 * <p>
 * 样例 2:
 * 输入: [1,2,3,4,1]
 * 输出:  3
 * <p>
 * oj:https://www.lintcode.com/problem/find-peak-element/description
 * 注意：这道题是和第一道题是有关系的，
 * 在这种特定的条件下，一定不要写出O(n)的解法，
 * 面试中也是，只要是搜索的题目，一维的是最优解O(1)或者O(logn)。
 */
public class PeakSearch {

    public static void main(String args[]) {

        int[] arr = new int[]{1,2,3,4,1};
        int search = binarySearch(arr);
        System.out.println(search);
    }

    /**
     * 最直接的做法
     *
     * @param arr
     * @return
     */
    public static int search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        //1, 2, 1, 3, 4, 5, 7, 6
        int mid = start + (end - start) / 2;

        for (int i = 1; i < arr.length; i++) {
            if (i != arr.length - 1) {
                if (arr[i] < arr[i + 1] && arr[i + 1] > arr[i - 1]) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * 用二分法求解
     *
     * @param arr
     * @return
     */
    public static int binarySearch(int[] arr) {

        if (arr.length < 3)
            return -1;

        int start = 1; //不能从0开始
        int end = arr.length - 1;

        //1, 2, 1, 3, 4, 5, 7, 6
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}