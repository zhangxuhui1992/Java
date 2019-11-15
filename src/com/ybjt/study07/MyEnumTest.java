package com.ybjt.study07;

import org.junit.Test;

/**
 * @author zxh
 * @create 2019-11-14 11:21
 */
public class MyEnumTest {

    @Test
    public void test(){
        Week ewe = Week.EWE;
        System.out.println(ewe.getName());
    }
}

enum  Week{

    MOD("星期一","好好上班"),
    EWE("星期二","好好学习");

    private final String name;
    private final String desc;

    private Week(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }


    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
