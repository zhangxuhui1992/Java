package com.ybjt.study05;

/**
 * 测试代码块
 * @author zxh
 * @create 2019-11-01 11:06
 */
public class Dog {

    private String name;
    private String age;

    static {
        System.out.println("我是静态代码块！");
    }

    {
        System.out.println("我是非静态代码块！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}


class TestDog{
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}