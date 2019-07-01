package com.ybjt.test;

/**
 * String 测试
 * @author zxh
 * @create 2019-07-01 13:33
 */
public class stringTest {
    public static void main(String[] args) {
        String str = "Java是世界上最好的语言";
        //返回指定索引的字符
        System.out.println(str.charAt(0));
        /**
         * int indexOf(int ch)
         * 返回指定字符在此字符串中第一次出现处的索引。
         * String[] split(String regex)
         * 根据给定正则表达式的匹配拆分此字符串。
         */
        //返回字符串的长度
        System.out.println(str.length());
    }
}
