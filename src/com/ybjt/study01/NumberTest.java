package com.ybjt.study01;

/**
 * 类型转换
 * @author zxh
 * @create 2019-08-29 20:34
 */
public class NumberTest {
    public static void main(String[] args) {
        //小类型赋值给大类型，自动类型提升
        byte s = 2;
        int s1 = 120;
        int s2 = s + s1;
        System.out.println(s2);

        double s3 = 12.3;
        float s4 = (float) s3;
        System.out.println(s4);
    }
}
