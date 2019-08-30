package com.ybjt.study01;

/**
 * 位运算符：>> 右移除 2^位数幂    << 左移乘 2^位数幂
 * >>>无符号右移  & 与运算   | 或运算
 * ^ 异或运算（一个数异或另一个数两次，仍为原来的数） ~取反运算（安位取反，包括符号位）
 * 都是操作整型的变量的数据
 * @author zxh
 * @create 2019-08-30 13:26
 */
public class WeiYunSunTest {
    public static void main(String[] args) {
        int num = 12;
        int num1 =18;

        System.out.println(num<<2);//48
        System.out.println(num>>2);//3
        System.out.println(num^8^8);//12

        int temp;
        temp = num;
        num = num1;
        num1 = temp;

        System.out.println(num);//18
        System.out.println(num1);//12
    }
}
