package com.ybjt.study05;

/**
 * @author zxh
 * @create 2019-10-09 21:30
 */
public class MainTest {
    public static void main(String[] args) {

        /*Students stu = new Students();
        stu.age = 18;
        stu.study();
        System.out.println(stu.toString());

        Class<?> superclass = stu.getClass().getSuperclass();
        System.out.println("superclass = " + superclass);

        Person p = new Person();
        Class<?> superclass1 = p.getClass().getSuperclass();
        System.out.println(superclass1);*/

        //基本数据类型转换包装类，调用包装类的构造器
        Integer in = new Integer(3);
        //基本数据类型转换包装类valueOf()方法
        int s = Integer.valueOf(1);
        System.out.println(in);

        //包装类转换成基本数据类型,xxxValue()
        int i = in.intValue();
        System.out.println(i);

        //基本数据类型、包装类，转换成String
        String str = 1 + "";
        String s1 = String.valueOf(123);

        //String 转换成基本数据类型或者包装类
        int i1 = Integer.parseInt("345");


        //自动装箱 自动拆箱
        Integer number = 1;  //自动装箱
        int count = number;  //自动拆箱
        System.out.println(number);
        System.out.println(count);

        Integer i3 = 1;
        Integer i4 = 1;
        System.out.println(i3 == i4);

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);

        Person p1 = Person.getInstance();
        Person p2 = Person.getInstance();
        System.out.println(p1);
        System.out.println(p2);

    }
}
