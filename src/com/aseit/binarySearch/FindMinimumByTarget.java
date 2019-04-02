package com.aseit.binarySearch;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-02
 * Time: 11:33
 * Description:跟FindMinimum 相比 ，是根据目标元素查找的。
 */
public class FindMinimumByTarget {

    public static void main(String args[]) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 5));

    }
    /**
     * 根据目标target 查找，有的话则返回下标，没有的话则返回-1
     *
     * @param arr
     * @param target
     * @return
     */
    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start + 1 < end) {
            int mid = start + ((end - start) >> 1);
            if(arr[mid] ==target){
                return mid;
            }
            if (arr[start] < arr[mid]) {
                if (arr[start] < target && target < arr[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else {
                if (arr[mid] < target && target < arr[end]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }//while
        if (arr[start] == target) {
            return start;
        }
        if (arr[end] == target) {
            return end;
        }
        return -1;
    }
}
