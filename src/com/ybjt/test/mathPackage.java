package com.ybjt.test;

/**
 * Math 类中的常用方法
 * Math类中定义的静态方法，使用时直接类名打点调用即可
 * Math.PI
 * @author zxh
 * @create 2019-07-01 10:34
 */
public class mathPackage {
    public static void main(String[] args) {
        //abs 绝对值
        System.out.println(Math.abs(-3.2));
        //pi 常量
        System.out.println(Math.PI);
        //随机数
        System.out.println(Math.random());
        //向下取整，返回一个double
        System.out.println(Math.floor(2.1));
        //向上取整
        System.out.println(Math.ceil(2.1));
        /**
         * round() 四舍五入
         * min() 最小值
         * max() 最大值
         */
    }
}
