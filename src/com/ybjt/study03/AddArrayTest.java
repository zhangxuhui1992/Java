package com.ybjt.study03;

/**
 * 求数组元素的最大值、最小值、平均值、总和
 * 声明一个随机2位数的10长度的整型数组
 * 10-99
 * @author zxh
 * @create 2019-09-09 20:45
 */
public class AddArrayTest {
    public static void main(String[] args) {
        int [] arr = new int [10];
        int sum = 0;
        for(int i = 0 ;i<arr.length;i++){
            arr[i] = (int)(Math.random()*90+10);
            System.out.print(arr[i]+"\t");
            sum += arr[i];

        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(sum/arr.length);
    }
}
