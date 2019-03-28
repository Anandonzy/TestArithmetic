package com.aseit;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-03-28
 * Time: 9:59
 * Description:二分查找：已经是拍好顺序的。
 */
public class BinarySearch {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int targ = scanner.nextInt();
        int search = search(arr, targ);
        System.out.println(search);
    }

    public static int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //防止加法超出界限 或者 mid= start + ((end-start) >>1)
            int mid = start + (end - start) / 2;
            if (key < mid) {
                end = mid - 1;
            } else if (key < mid) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
