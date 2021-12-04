package test.javase.string;

import java.util.Arrays;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-04-03 21:20
 */
public class StringTest {

    public static void main(String[] args) {
        String s = new String("Java");
        System.out.println(s.hashCode());

        /**
         * String 是引用数据类型
         * 字符串常量池内的对象会重复使用
         */
        String s1 = "Hello";
        String s2 = "Hello";
        char[] chars = s1.toCharArray();
        int e = Arrays.binarySearch(chars, 'f');
        System.out.println("e="+e);

        System.out.println(s1 == s2);//true

        song s3 = new mySong();
        s3.dance();
        s3.say();
//        Arrays.binarySearch()

        StringBuffer sb = new StringBuffer();//线程安全的。效率较低。

        StringBuilder sbu = new StringBuilder();//线程不安全。效率较高。


        Integer inte = new Integer(123);

        int num = inte.intValue();

        Integer s5 = Integer.valueOf(num);

        Integer s6 = 10;

        int s7 = s6;
    }
}
