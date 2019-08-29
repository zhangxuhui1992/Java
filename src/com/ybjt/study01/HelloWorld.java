package com.ybjt.study01;

/**
 * 单行、多行注释不参与编译，生成的class文件中不包含注释信息，
 * 对程序解释说明，增强可读性。可以简单的调试程序。
 * 文档注释：注释内容可以被JDK提供的工具javadoc所解析，形成一套以网页文件形式体现的该程序的说明文件
 * @author zxh
 * @create 2019-08-29 14:26
 */
public class HelloWorld {
    public static void main(String [] args){
        System.out.println("Hello World");
       /*
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");多行注释：注释多行，不可以嵌套使用
        */
        //System.out.println("Hello World");单行注释：注释一行
    }
}
