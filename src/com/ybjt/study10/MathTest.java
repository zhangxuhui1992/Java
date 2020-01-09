package com.ybjt.study10;

/**
 * @author zxh
 * @create 2019-11-28 21:01
 */
public class MathTest{
    public static void main(String[] args) {
        double count = 1.01;
        for(int i = 2;i<= 365;i++){
            count *= 1.01;
        }
        System.out.println(count);

        double sum = 1.02;
        for(int i = 2;i<= 365;i++){
            sum *= 1.02;
        }
        System.out.println(sum);
    }
}
