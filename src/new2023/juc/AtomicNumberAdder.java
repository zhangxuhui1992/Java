package new2023.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.LongAdder;

/**
 * @Author zhangxuhui
 * @Date 2023/4/9
 * @email zxh_1633@163.com
 */
public class AtomicNumberAdder {
    public static void main(String[] args) {
        LongAdder la = new LongAdder();

        CountDownLatch cdl = new CountDownLatch(10);

        for (int x = 0 ; x < 10;x++){
            new Thread(()->{
                for(int y = 0 ; y < 20000000;y++){
                   la.increment();
                }
                cdl.countDown();
            }).start();
        }
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(la.intValue());
    }
}
