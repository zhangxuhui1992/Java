package com.ybjt.study03;

/**
 * 数组
 * 一维数组的内存解析：引用类型的数据，通过内存地址找到对应的对象。
 * @author zxh
 * @create 2019-09-04 21:58
 */
public class ArrayTest {
    public static void main(String[] args) {
        //数组的声明，一旦初始化完成其长度就确定
        int [] arr = new int[10];//动态初始化
        int [] aee = new int[]{1,2,3};//静态初始化:初始化和元素的赋值同时进行
        int [] ass = {2,6,10};

        //通过角标的方式调用指定位置的元素
        //arr[0] = 5;
        //System.out.println(arr[0]);//5

        //获取数组的长度
        System.out.println(arr.length);//10

        //如何遍历数组元素
        for (int i = 0; i <aee.length ; i++) {
            System.out.println(aee[i]);// 1 2 3
        }

        //数组元素的默认初始化值:
        /**
         * 数组元素是整型：0
         * 数组元素是浮点型：0.0
         * 数组元素是char类型：0 '\u0000'
         * 数组元素是布尔类型：false
         * 数组元素是引用数据类型：null
         */
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);//000000
        }

        char [] charArr = new char[5];
        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i]);
        }
    }
}
