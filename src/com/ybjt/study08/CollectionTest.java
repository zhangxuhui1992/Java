package com.ybjt.study08;

import org.junit.Test;

import java.util.*;

/**
 * @author zxh
 * @create 2019-11-18 9:24
 */
public class CollectionTest {

    @Test
    public void test(){
        Collection col = new ArrayList();
        col.add(123);
        col.add("456");
        col.add(new Date());

        Iterator iterator = col.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            if("456".equals(next)){
                iterator.remove();
            }
        }

        Iterator iterator1 = col.iterator();
        while (iterator1.hasNext()){
            Object next = iterator1.next();
            System.out.println(next);
        }

    }


    @Test
    public void test1(){
        Collection col = new ArrayList();
        col.add(123);
        col.add("456");
        col.add(new Date());

        for(Object obj : col){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        LinkedList<Object> list = new LinkedList<>();
        list.add("123");

        ArrayList a = new ArrayList();
        a.add("123");
        a.remove(0);
        a.set(0,"256");
        a.get(0);
        a.size();

        ArrayList aa = new ArrayList();

    }

}
