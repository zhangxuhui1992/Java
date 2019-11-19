package com.ybjt.study08;

import org.junit.Test;

import java.io.FileInputStream;
import java.util.*;

/**
 * @author zxh
 * @create 2019-11-18 15:21
 */
public class MapTest {

    @Test
    public void test(){

        Properties pro = new Properties();
        FileInputStream ins = null;
        try {
            ins = new FileInputStream("jdbc.properties");
            pro.load(ins);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        String name = pro.getProperty("name");
        System.out.println(name);
    }

    @Test
    public void test2(){
        List list = new ArrayList();
        list.add("123");
        list.add("456");
        list.add("789");

        System.out.println(list);

        List<Object> des = Arrays.asList(new Object[list.size()]);
        System.out.println(des);
        Collections.copy(des,list);
        System.out.println(des);
    }
}
