package com.aseit.binarySearch;

/**
 * Created with IntelliJ IDEA.
 * User: @ziyu  freedomziyua@gmail.com
 * Date: 2019-04-02
 * Time: 15:46
 * Description: 切木头
 * https://www.lintcode.com/problem/wood-cut/description
 */
public class WoodCut {

    public static void main(String args[]) {
        int[] arr = {4, 8, 16};
        System.out.println(WoodCut.cut(arr, 4));
    }
    /**
     * 1,2,3,4,5 ..... 456
     *
     * @param arr 木材长度的数组
     * @param k 要切分的段数
     * @return
     */
    public  static int cut(int[] arr, int k) {
        int max = 0;
        for(int i = 0 ;i < arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        int start = 1, end = max;

        while (start + 1 < end) {
            int mid = start + ((end - start) >> 1);
            if (count(arr,end) >= k) {
                start = mid;
            }else{
                end = mid;
            }
        }
        //double check
        if(count(arr,end) >= k){
            return end;
        }
        if(count(arr,start) >= k ){
            return start;
        }
        return 0;
    }

    //计算一共能切多少段
    private static int count(int[] arr, int length) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / length;
        }
        return sum;
    }
}
