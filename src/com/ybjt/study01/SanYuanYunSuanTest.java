package com.ybjt.study01;

/**
 * 三元运算符：变量 = 条件表达式1？表达式2：表达式3；
 * 条件表达式的结果为boolean类型
 * 如果条件表达式为true，执行表达式2。
 * 如果条件表达式为false，执行表达式3。
 * 表达式2/3要求是一致的 三元运算符是可以嵌套的
 * 凡是可以使用三元运算符的地方都可以改写成if...else...结构，反之则不一定成立。
 * 如果程序既可以使用三元运算符又可以使用if...else...建议使用三元运算符，简洁效率较高
 * @author zxh
 * @create 2019-08-30 14:02
 */
public class SanYuanYunSuanTest {
    public static void main(String[] args) {
        int num = 10<0?120:(2>1?100:120);//三元运算符的嵌套
        System.out.println(num);//100

        int max = 18;
        int min = 2;
        int n = (max>min)?max:min;
        System.out.println(n);//18

        //获取三个数中的最大值
        int num1 = 5;
        int num2 = 8;
        int num3 = 13;
        int max1 = (num1>num2)?num1:num2;
        int max2 = (max1>num3)?max1:num3;
        System.out.println(max2);//13

    }
}
