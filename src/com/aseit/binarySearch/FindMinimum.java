package com.aseit.binarySearch;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-01
 * Time: 21:13
 * Description:
 * oj:https://www.lintcode.com/problem/find-minimum-in-rotated-sorted-array/description
 */
public class FindMinimum {
    public static void main(String args[]) {
        int[] arr = {4, 5, 6, 7, 8, 1, 2};
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

    //提供的比较规范的写法
    public static int searchAnser(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }

        int start = 0, end = nums.length - 1;

        //这个地方为了防止从第0的位置开始旋转
        int res = 0;
        int target = nums[end];
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (nums[mid] < target) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return nums[res];
    }

}
