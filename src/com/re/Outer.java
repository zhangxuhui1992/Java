package com.re;

/**
 * @author zxh
 * @create 2020-02-12 11:27
 */
public class Outer {

    int age = 18;

    public void song(){
        System.out.println("�һ����ٻ�����꣡");
    }

    class Inner{
        int age = 28;

        public void sayAge(){
            int age  = 38;
            System.out.println("�ⲿ�ڵ�age "+ Outer.this.age);
            System.out.println("�ڲ����age "+ this.age);
            System.out.println("�ڲ���ֲ�����age "+ age);
        }

    }
}

class testOuter{
    public static void main(String [] args){

        /**
         * �ȴ����ⲿ��Ķ����ٴ����ڲ���Ķ���
         */
        Outer.Inner inner = new Outer().new Inner();
        inner.sayAge();
    }
}

