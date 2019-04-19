package com.aseit.Array.sorted;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-19
 * Time: 14:37
 * Description:
 * Oj:https://www.lintcode.com/problem/merge-sorted-array/description
 * 合并两个排序的整数数组A和B变成一个新的数组。
 * <p>
 * Input：[1, 2, 3]  3  [4,5]  2
 * Output：[1,2,3,4,5]
 * 解释:
 * 经过合并新的数组为[1,2,3,4,5]
 */
public class MergeSortedArray {

    public static void main(String args[]) {


    }

    //    合并两个排序的整数数组A和B变成一个新的数组。
    /*
    * @param A: sorted integer array A which has m elements, but size of A is m+n
    * @param m: An integer
    * @param B: sorted integer array B which has n elements
    * @param n: An integer
    * @return: nothing
    */
    //主要思路，到这填要补缺的的位置，然后进行比较，
    public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int i = m - 1, j = n - 1, index = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[index--] = A[i--];
            } else {
                A[index--] = B[j--];
            }
        }

        while (i >= 0) {
            A[index--] = A[i--];
        }
        while (j >= 0) {
            A[index--] = B[j--];
        }
    }
}
