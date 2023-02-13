package com.study;

/**
 * @Author zhangxuhui
 * @Date 2023/2/13
 * @email zxh_1633@163.com
 * 验证类的加载初始化 类只加载一次
 */
public class ClassTest {
    public static void main(String[] args) {
        System.out.println(B.num);
        new B();
    }
}


class B{

    public static int num = 10;

    static {
        num = 100;
        System.out.println("static method "+num);
    }

    B(){
        num = 1000;
        System.out.println("struct b " + num);
    }

}
