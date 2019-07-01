package com.ybjt.test;

/**
 * 变量
 * @author zxh
 * @create 2019-06-28 11:00
 */
public class variable {
    public static void main(String [] args ){
        //byte表示数的范围-128-127 想要知道某种基本数据类型的位数、能够表示的最大值
        //和最小值，使用该数据类型的包装类打点调用相应的方法即可。
        /**
         * 整数默认为int，浮点型默认为double，声明lang类型的数据加"L"
         * 声明float类型的数据加"F",
         */
        byte a =28;
        System.out.println(a);
        System.out.println(Byte.MAX_VALUE);
    }
}
