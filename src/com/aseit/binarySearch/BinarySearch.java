package com.aseit.binarySearch;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-03-28
 * Time: 9:59
 * Description:二分查找：已经是排好顺序的。
 */
public class BinarySearch {

    public static void main(String args[]) {

    /*    Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int targ = scanner.nextInt();*/

        int[] arr = {1, 3, 5, 7, 9};
//        int search = search(arr, targ);
        System.out.println(templateSearch(arr, 7));
    }

    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //防止加法超出界限 或者 mid= start + ((end-start) >>1)
            int mid = start + (end - start) / 2;
            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 套用模板的写法
     *
     * @param arr
     * @param target
     * @return
     */
    public static int templateSearch(int[] arr, int target) {

        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0, end = arr.length - 1;

        while (start + 1 < end) {
            int mid = start + ((end - start) >> 1);

            if (target < arr[mid]) {
                end = mid;
            } else if (target > arr[mid]) {
                start = mid;
            } else {
                return mid;
            }
        }

        if (arr[start] == target) {
            return start;
        }
        if (arr[end] == target) {
            return end;
        }
        return -1;
    }
}
