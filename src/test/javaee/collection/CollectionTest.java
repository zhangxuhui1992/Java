package test.javaee.collection;

import java.util.*;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-03 14:43
 */
public class CollectionTest {
    public static void main(String[] args) {
        /**
         * list 有序可以重复 ArrayList 底层使用obejct数组
         * set 无序不可以重复
         */
        List list = new ArrayList<String>();

        List lined = new LinkedList();

        Map map = new HashMap();

        list.add("java");
        list.add("python");
        list.add("javascript");
        list.add("go");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }


    }
}
