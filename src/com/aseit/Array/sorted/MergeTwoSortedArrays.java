package com.aseit.Array.sorted;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-19
 * Time: 15:45
 * Description:
 * Oj:https://www.lintcode.com/problem/merge-two-sorted-arrays/description
 */

/**
 * 合并两个数组到一个新的里面
 */
public class MergeTwoSortedArrays {

    public static void main(String args[]) {
        int[] A = {1, 2, 3, 4};
        int[] B = {2, 4, 5, 6};
        int[] ints = mergeSortedArray(A, B);
        for(int a: ints){
            System.out.println(a);
        }

    }

    /**
     * 使用两个指针分别对数组从小到大遍历，每次取二者中较小的放在新数组中。
     * 直到某个指针先到结尾，另一个数组中剩余的数字直接放在新数组后面。
     *
     * @param A
     * @param B
     * @return
     */
    public static int[] mergeSortedArray(int[] A, int[] B) {
        if (A == null || B == null) {
            return null;
        }
        int[] result = new int[A.length + B.length];

        int index = 0, i = 0, j = 0;

        while (i < A.length && j < B.length) {

            if (A[i] < B[j]) {
                result[index++] = A[i++];
            } else {
                result[index++] = B[j++];
            }
        }

        while (i < A.length) {
            result[index++] = A[i++];
        }

        while (j < B.length) {
            result[index++] = B[j++];
        }
        return result;

    }
}
