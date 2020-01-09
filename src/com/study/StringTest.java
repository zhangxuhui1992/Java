package com.study;

/**
 * @author zxh
 * @create 2020-01-08 16:43
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hello";

        //线程安全
        StringBuffer sb = new StringBuffer();
        sb.append("1123");
        System.out.println(sb.append("Java"));

        //线程不安全的
        StringBuilder sbu = new StringBuilder();
        sbu.append("456");
        System.out.println(sbu.append("python0"));

        System.out.println(s == s1);
    }
}
