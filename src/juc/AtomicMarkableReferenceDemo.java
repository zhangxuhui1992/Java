package juc;

import java.util.concurrent.atomic.AtomicMarkableReference;

/**
 * @Author zhangxuhui
 * @Date 2022/8/1
 * @email zxh_1633@163.com
 */
public class AtomicMarkableReferenceDemo {
    public static void main(String[] args) {
        //原子类+标记 默认为false，修改后设置为true。
        AtomicMarkableReference<Integer> ar = new AtomicMarkableReference<>(100,false);
        boolean marked = ar.isMarked();
        System.out.println(marked);
        ar.compareAndSet(100,200,marked,!marked);
        System.out.println(ar.isMarked());
        System.out.println(ar.getReference());
    }
}
