package com.ybjt.test;

/**
 * @author zxh
 * @create 2019-08-13 14:37
 * 可变参数,jdk5后允许直接定义能和多个实参匹配的形参。数据类型 ... 参数名
 * 可变参数被封装成数组传入方法中，可以通过遍历获取每个参数。可变参数可以是1个或者多个。
 * 可变参数必须声明在参数列表的最后面，且最多只能声明一个可变参数。
 */
public class ArgumentMethod {
    public static void main(String[] args) {
        ArgumentMethod.show("369");
       //ArgumentMethod.show("34","63");
    }

   /* public static void show(String s){
        System.out.println(s);
    }*/

    public static void show(String ... s){
        System.out.println(s.toString());
        for(String str:s){
           System.out.println(str);
        }
    }
}
