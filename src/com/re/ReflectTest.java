package com.re;

import java.lang.reflect.Field;

/**
 * JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；
 * 对于任意一个对象，都能够调用它的任意方法和属性；
 * 这种动态获取信息以及动态调用对象方法的功能称为java语言的反射机制
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-02-17 14:48
 */
public class ReflectTest {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.re.User");

            Object o = (User)clazz.newInstance();

            System.out.println(o);

            Field[] fields = clazz.getDeclaredFields();


            for(Field s : fields){
                System.out.println(s);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
