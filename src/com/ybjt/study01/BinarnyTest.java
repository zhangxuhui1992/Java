package com.ybjt.study01;

/**
 * 进制
 * @author zxh
 * @create 2019-08-29 21:43
 */
public class BinarnyTest {
    public static void main(String[] args) {
        int num = 0b1100;//二进制以0b开头 0.1
        int num1 = 123;//十进制0-9
        int num2 = 012357;//八进制以0开头 0-7
        int num3 = 0x23F;//十六进制以0x开头 0-9 A-F
        System.out.println(num);//12
        System.out.println(num1);//123
        System.out.println(num2);//5359
        System.out.println(num3);//575
    }
}
