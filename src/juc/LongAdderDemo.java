package juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.LongAdder;

/**
 * @Author zhangxuhui
 * @Date 2022/8/1
 * @email zxh_1633@163.com
 * 高性能点赞计数器
 */
class ClickNumber{
    int num = 0;

    public synchronized void add(){
        num++;
    }

    LongAdder longAdder = new LongAdder();

    public void addByLongAdder(){
        longAdder.increment();
    }
}


public class LongAdderDemo {
    public static void main(String[] args) throws InterruptedException {
        ClickNumber clickNumber = new ClickNumber();
        CountDownLatch countDownLatch = new CountDownLatch(50);
        CountDownLatch countDownLatch2 = new CountDownLatch(50);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 50; i++) {
            new Thread(()->{
                try {
                    for (int j = 0; j < 100*100*100; j++) {
                        clickNumber.add();
                    }
                }finally {
                    countDownLatch.countDown();
                }

            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("synchronized耗时："+(end-start)+"mm"+"\t"+clickNumber.num);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 50; i++) {
            new Thread(()->{
                try {
                    for (int j = 0; j < 100*100*100; j++) {
                        clickNumber.addByLongAdder();
                    }
                }finally {
                    countDownLatch2.countDown();
                }

            }).start();
        }
        countDownLatch2.await();
        long end2 = System.currentTimeMillis();
        System.out.println("LongAdder耗时："+(end2-start2)+"mm \t"+clickNumber.longAdder.sum());
    }
}
