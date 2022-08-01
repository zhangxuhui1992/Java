package juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author zhangxuhui
 * @Date 2022/8/1
 * @email zxh_1633@163.com
 */
public class AtomicDemo {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger ai = new AtomicInteger(0);

        //boolean b = ai.compareAndSet(1, 2);

        //System.out.println(b+"\t"+ai.get());

        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                for (int k = 0; k < 10; k++) {
                    ai.getAndIncrement();
                }
            }).start();
        }

        TimeUnit.SECONDS.sleep(3);

        System.out.println(ai.get());
    }
}
