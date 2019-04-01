package com.aseit.BinarySearch;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-03-30
 * Time: 14:29
 * Description:SVNRepo 这个不知道如何引入 ！！！
 */

/**
 * public class SVNRepo {
 * public static boolean isBadVersion(int k);
 * }
 * you can use SVNRepo.isBadVersion(k) to judge whether
 * the kth code version is bad or not.
 */

public class FindFirstBadVersion  {
    public static void main(String args[]) {

    }

    public static int findFirstBadVserion(int n) {

        if (n <= 0) {
            return -1;
        }

        int start = 1;
        int end = n;
        int res = -1;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            //注释放开即可
           /* if (SVNRepo::isBadVersion(mid)) {
                end = mid - 1;
                res = mid;
            } else {
                start = mid + 1;
            }*/
        }

        return res;

    }
}
