package com.ybjt.study08;

import java.io.Serializable;

/**
 * @author zxh
 * @create 2019-11-20 10:44
 */
public class Animal implements Serializable {
    private static final long serialVersionUID = -1666762942900923210L;

   private String name;
   private  int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
