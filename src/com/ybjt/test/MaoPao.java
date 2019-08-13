package com.ybjt.test;

/**
 * @author zxh
 * @create 2019-08-12 20:31
 * 冒泡排序
 */
public class MaoPao {
    public static void main(String[] args) {
        Object o = new Object();
        int [] arr = {2,3,4,5,1};
        for(int i = 0 ;i<arr.length-1;i++){
            for(int k = i+1;k<arr.length;k++){
                if(arr[i]>arr[k]){
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for(int num:arr){
            System.out.println(num);
        }
    }
}
