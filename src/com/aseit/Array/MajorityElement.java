package com.aseit.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-17
 * Time: 10:55
 * Description:
 */
public class MajorityElement {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(majorityNumber(list));

    }

    //[1, 1, 1, 1, 2, 2, 2]
    public static int majorityNumber(List<Integer> nums) {
        // write your code here
        int n = 1;
        int temp = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (temp == nums.get(i))
                n++;
            if (temp != nums.get(i))
                n--;
            if (n == 0) {
                temp = nums.get(i);
                n = 1;
            }
        }
        return temp;
    }
}
