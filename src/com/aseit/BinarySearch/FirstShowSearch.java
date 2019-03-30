package com.aseit.BinarySearch;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-03-28
 * Time: 11:43
 * Description:
 * 给定一个排序的整数数组（升序）和一个要查找的整数target，
 * 用O(logn)的时间查找到target第一次出现的下标（从0开始），如果target不存在于数组中，返回-1。
 * 样例  1:
 * 输入:[1,4,4,5,7,7,8,9,9,10]，1
 * 输出: 0
 * <p>
 * 样例解释:
 * 第一次出现在第0个位置。
 * <p>
 * 样例 2:
 * 输入: [1, 2, 3, 3, 4, 5, 10]，3
 * 输出: 2
 * <p>
 * 样例解释:
 * 第一次出现在第2个位置
 * <p>
 * 样例 3:
 * 输入: [1, 2, 3, 3, 4, 5, 10]，6
 * 输出: -1
 * <p>
 * 样例解释:
 * 没有出现过6， 返回-1
 */
public class FirstShowSearch {

    public static void main(String args[]) {

        int[] arr = {1, 2, 3, 3, 4, 5, 10};
//        System.out.println(arr.length);
        System.out.println(answer(arr, 3));
    }

    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start < end) {
            if (arr[mid] < target)
                start = mid + 1;
            if (arr[mid] >= target)
                end = mid;
            mid = start + (end - start) / 2;
        }
        return arr[mid] == target ? mid : -1;
    }

    /**
     * 提供的标准答案。
     *
     * @param arr
     * @param target
     * @return
     */
    public static int answer(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        System.out.println("   end :" + end);
        int res = -1;

        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (arr[mid] >= target) {
                end = mid - 1;
                res = mid;
            } else {
                start = mid + 1;
            }
        }

        if (res != -1 && arr[res] != target) {
            return -1;
        }

        return res;
    }
}
