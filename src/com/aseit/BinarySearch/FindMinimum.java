package com.aseit.BinarySearch;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-01
 * Time: 21:13
 * Description:
 */
public class FindMinimum {
    public static void main(String args[]) {
        int[] arr = {4, 5, 6, 7, 8};
        System.out.println(search(arr));
    }

    public static int search(int[] nums) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0, end = nums.length - 1;
        int target = nums[end]; // 4

        //4 5 6 7 0 1 2
        //找第一个出现的元素小于目标元素  0 < 4
        while (start + 1 < end) {
            int mid = start + ((end - start) >> 1);
            if (nums[mid] <= target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        //Double check
        if (nums[start] <= target) {
            return nums[start];
        } else {
            return nums[end];
        }
    }
}
