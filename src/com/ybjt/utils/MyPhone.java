package com.ybjt.utils;

/**
 * @author zxh
 * @create 2019-08-01 17:16
 */
public class MyPhone {
    public static void main(String[] args) {
        int [] arry = {9,5,3,0,1,8};
        int [] arr = {4,5,0,0,2,4,2,4,2,4,3};
        String str = "";
        for(int i = 0;i<arr.length;i++){
            str += arry[arr[i]];
        }
        System.out.println("我的电话号码:"+str);
    }
}
