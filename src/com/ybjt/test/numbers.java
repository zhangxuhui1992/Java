package com.ybjt.test;

/**
 * 基本数据类型的包装类
 * @author zxh
 * @create 2019-07-01 10:12
 */
public class numbers {
    public static void main(String[] args) {
        /**
         * 在实际开发中，经常要用到对象，包装类型正是为了解决基本数据类型无法面向对象编程所提供的
         * 格式为基本上数据类型的首字母大写，char-->character
         * 1、集合类泛型只能是包装类；(集合只能存储对象)
         * 2、成员变量不能有默认值；
         * 3、方法参数允许定义空值；
         * 自动装箱、拆箱
         *  自动装箱即自动将基本数据类型转换成包装类型
         *  自动拆箱即自动将包装类型转换成基本数据类型
         */

        Integer s = new Integer(45);

        //自动装箱
        Integer s1 = 34;

        //自动拆箱
        int s2 = s;
        //将包装类转换为基本数据类型
        int ss = s.intValue();

        System.out.println(s2 == ss);

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

    }
}
