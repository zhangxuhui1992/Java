package com.ybjt.study03;

/**
 * 数组元素的赋值
 * 创建一个长度为6的int类型的数组，要求元素的值都在1-30之间
 * 且是随机赋值，同时要求各元素的值不相同
 * @author zxh
 * @create 2019-09-05 21:25
 */
public class ArrayTestFuZhi {
    public static void main(String[] args) {
        int [] arr = new int [6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 30) + 1);
            for (int j = 0; j <i; j++) {
                if(arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }
        for (int num:arr) {
            System.out.println(num);
        }
    }
}
