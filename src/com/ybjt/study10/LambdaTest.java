package com.ybjt.study10;

import org.junit.Test;

import java.util.Comparator;

/**
 * @author zxh
 * @create 2019-11-21 14:30
 */
public class LambdaTest {

    @Test
    public void test(){
        Comparator com =   new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        int compare = com.compare(23, 56);
        System.out.println(compare);

        System.out.println("***********************************");

        Comparator<Integer> c =(o1,o2)->o1.compareTo(o2);
        int pare = c.compare(99, 56);
        System.out.println(pare);
    }
}
