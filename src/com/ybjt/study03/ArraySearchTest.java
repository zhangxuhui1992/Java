package com.ybjt.study03;

/**
 * 数组的查找
 * @author zxh
 * @create 2019-09-09 21:36
 */
public class ArraySearchTest {
    public static void main(String[] args) {
        int [] arr = {1,5,6,9,36,45,86};
        //1、线性查找
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 45){
                System.out.println("找到了"+i);
            }
        }

        //二分查找:数组必须有序
        int max = arr.length-1;
        int min = 0;
        while(min<=max){
            int mindle = (max+min)/2;
            if(45>arr[mindle]){
                min = mindle +1;
            }

            if(45<arr[mindle]){
                max = mindle -1;
            }

            if(45 == arr[mindle]){
                System.out.println("找到了"+mindle);
                break;
            }
        }

    }
}
