package com.ybjt.study03;

/**
 * 数组的反转
 * @author zxh
 * @create 2019-09-09 21:21
 */
public class ReserArrayTest {
    public static void main(String[] args) {
        int [] arr = {1,5,9,45,36,86,6};
        for(int i = 0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
