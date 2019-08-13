package com.ybjt.bean;

import java.io.Serializable;

/**
 * @author zxh
 * @create 2019-07-24 15:50
 * 实体类，类的设计
 * 成员变量即类的属性
 * 局部变量声明在方法内、方法形参、代码块内、构造器形参、构造器内的变量
 */
public class User implements Serializable {
    private static final long serialVersionUID = -5555401105921349900L;
    private String name;
    private String age;
    private String address;

    public User() {
    }

    /**
     * 带参的构造器
     * @param name 名字
     * @param age 年龄
     * @param address 地址
     */
    public User(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "com.ybjt.bean.User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void song(){
        System.out.println(name+"跪着唱征服！");
    }
}
