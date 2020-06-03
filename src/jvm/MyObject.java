package jvm;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-04-20 16:23
 */
public class MyObject {
    public static void main(String[] args) {
        Object o = new Object();
        //BootStrap
        System.out.println(o.getClass().getClassLoader());

        MyObject my = new MyObject();
        System.out.println(my.getClass().getClassLoader());
        System.out.println(my.getClass().getClassLoader().getParent());
        System.out.println(my.getClass().getClassLoader().getParent().getParent());

    }
}
