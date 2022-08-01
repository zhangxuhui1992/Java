package juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author zhangxuhui
 * @Date 2022/8/1
 * @email zxh_1633@163.com
 */
class MyNumber{

    AtomicInteger ai = new AtomicInteger();

    public void addPlus(){
        ai.getAndIncrement();
    }

}

public class AtomicIntegerDemo {
    public static void main(String[] args) throws InterruptedException {
        MyNumber mun = new MyNumber();

        CountDownLatch countDownLatch = new CountDownLatch(50);

        for (int i = 0; i < 50; i++) {
            new Thread(()->{
                try {
                    for (int j = 0; j < 100; j++) {
                        mun.addPlus();
                    }
                }finally {
                    countDownLatch.countDown();
                }
            }).start();
        }

        countDownLatch.await();

        System.out.println(mun.ai.get());
    }
}
