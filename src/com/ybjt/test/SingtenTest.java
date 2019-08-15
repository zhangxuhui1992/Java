package com.ybjt.test;

/**
 * 单例设计模式 饿汉式
 * @author zxh
 * @create 2019-08-14 21:33
 */
public class SingtenTest {
    public static void main(String[] args) {
        Blank b1 = Blank.getInstance();
        Blank b2 = Blank.getInstance();
        System.out.println((b1 == b2));

        Customer c1 =  Customer.getCus();
        Customer c2 = Customer.getCus();
        System.out.println((c1 == c2));
    }
}

class Blank{
    private Blank(){}
    private static Blank instance = new Blank();
    public static Blank getInstance(){
        return instance;
    }

}

/**
 * 懒汉式
 */
class Customer{
    private Customer(){}

    private static Customer cus = null;

    public static Customer getCus(){
        if(cus == null){
           cus = new Customer();
        }
        return cus;
    }
}