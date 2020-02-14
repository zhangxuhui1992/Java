package com.re;

/**
 * @author zxh
 * @create 2020-02-12 11:27
 */
public class Outer {

    int age = 18;

    public void song(){
        System.out.println("我还想再活五百年！");
    }

    class Inner{
        int age = 28;

        public void sayAge(){
            int age  = 38;
            System.out.println("外部内的age "+ Outer.this.age);
            System.out.println("内部类的age "+ this.age);
            System.out.println("内部类局部变量age "+ age);
        }

    }
}

class testOuter{
    public static void main(String [] args){

        /**
         * 先创建外部类的对象再创建内部类的对象
         */
        Outer.Inner inner = new Outer().new Inner();
        inner.sayAge();
    }
}

