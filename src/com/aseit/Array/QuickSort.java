package com.aseit.Array;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-18
 * Time: 9:26
 * Description:
 * OJ：https://www.lintcode.com/problem/sort-integers-ii/description
 * 快速排序，高频中的高高频
 */
public class QuickSort {

    public static void main(String args[]) {
        int[] A = {3, 2, 1,3,4,52,1};
        quickSort(A, 0, A.length - 1);
        for(int a : A){
            System.out.println(a);

        }
    }

    public static void quickSort(int[] A, int start, int end) {
        if (start >= end) {
            return;
        }

        int left = start, right = end;
        int pivot = A[(start + end) / 2];

        while (left <= right) {
            while (left <= right && A[left] < pivot) {
                left++;
            }
            while (left <= right && A[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;

                left++;
                right--;
            }
        }

        quickSort(A, start, right);
        quickSort(A, left, end);
    }

    }
