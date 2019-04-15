package com.aseit.binarySearch;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-02
 * Time: 11:19
 * Description:
 * https://www.lintcode.com/problem/sqrtx/description
 * 06.Sqrt(x)
 * Description
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 * <p>
 * Example
 * Example 1:
 * Input:  0
 * Output: 0
 * <p>
 * <p>
 * Example 2:
 * Input:  3
 * Output: 1
 * <p>
 * Explanation:
 * return the largest integer y that y*y <= x.
 * <p>
 * Example 3:
 * Input:  4
 * Output: 2
 */
public class Sqrt {

    public static void main(String args[]) {
        System.out.println(sqrt(9));
    }

    //求平方根，不能整开的话，取最后一个满足的。
    public static int sqrt(int x) {

        if (x < 0) {
            return -1;
        } else if (x <= 1) {
            return x;
        }
        int start = 1, end = x;

        while (start + 1 < end) {
            int mid = start + ((end - start) >> 1);

            /**
             * x 9 :1     2 3 4    5     6 7 8    9
             *      start         mid              end
             */
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                start = mid;
            } else {
                end = mid;
            }
        }

        //check 返回start即可。
        if (end > end / x)
            return start;
        return end;
    }
}
