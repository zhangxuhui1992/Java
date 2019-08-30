package com.ybjt.study01;

/**
 * 赋值运算符 =  支持连续赋值
 * 当=号两侧数据类型不一致时，可以使用自定类型转换或者强制类型转换进行处理。
 * 扩展运算符：+= -= /= *= %=
 * @author zxh
 * @create 2019-08-30 10:02
 */
public class FuZhiTest {
    public static void main(String[] args) {
        //连续赋值
        int num1,num2;
        int i1 = 10,i2=20;
        num1 = num2 = 10;
        System.out.println(num1);//10
        System.out.println(num2);//10
        System.out.println(i1);//10
        System.out.println(i2);//20

        num1 += 10;
        System.out.println(num1);//20

        //推荐加1、加2写法 num++ num += 2
    }
}
