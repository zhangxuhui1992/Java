package com.ybjt.test;
import static java.lang.Math.PI;

/**
 * @author zxh
 * @create 2019-07-26 21:21
 * $数组 数组是有序排列的，内存中一整块连续的空间
 * 数组的长度确定，不能修改！
 *  一维数组 二维数组  基本元素数组  引用元素数组
 *  数组的默认初始化值 0 null
 */
public class AarrayTest {
    public static void main(String[] args) {
        //数组的定义
        /*int []  num = new int[9];
        int [] arr = {1,2,3,4};
        String [] strs = new String[10];
        for(String s : strs){
            System.out.println(s);
        }
        System.out.println(num[0]);
        System.out.println(arr[0]);*/
        System.out.println(PI);
        char [] array = new char[10];
        for(char num:array){
            System.out.println(num);
        }
    }
}
