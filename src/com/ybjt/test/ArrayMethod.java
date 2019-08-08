package com.ybjt.test;

/**
 * @author zxh
 * @create 2019-08-07 21:29
 * $定义一个int类型的10元素2位数组。并随机赋值。然后求最大值、
 * 最小值、平均值、求和
 * [10,99]   (int)(Math.random()*(99-10+1)+10)
 */
public class ArrayMethod {
    public static void main(String[] args) {
        int [] array = new int [10];
        int sum = 0 ;
        for(int i = 0 ;i<array.length;i++){
            array[i] = (int)(Math.random()*(99-10+1)+10);
            System.out.print(array[i]+"\t");

            sum += array[i];
        }
        System.out.println();
        System.out.println("和为"+sum);
    }
}
