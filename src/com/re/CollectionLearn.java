package com.re;

import java.util.ArrayList;

/**
 * @author zxh
 * @create 2020-02-12 18:58
 */
public class CollectionLearn {
    public static void main(String [] args){
        ArrayList<String> list = new ArrayList<>();

        list.add("’≈–Òª‘");
        list.add("≥Ã÷“œº");

        System.out.println(list.isEmpty());
        System.out.println(list.size());

        Object[] array = list.toArray();
        for(Object o : array){
            System.out.println(o);
        }


    }
}
