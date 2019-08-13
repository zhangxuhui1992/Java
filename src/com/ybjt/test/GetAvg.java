package com.ybjt.test;

/**
 * 求数组的平均值
 * @author zxh
 * @create 2019-08-12 20:16
 */
public class GetAvg {
    public static void main(String[] args) {
        int [] arry = {1,1,1,1,1,1};
        double d = getAverage(arry);
        System.out.println(d);
    }

    public static double getAverage(int [] arr){
        double s = 0.0;
        for(int num:arr){
            s += num;
        }
        return s/arr.length;
    }
}
