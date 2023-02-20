package juc;

import java.util.concurrent.TimeUnit;

/**
 * join 我插队，别人得等我执行完毕。
 * @Author zhangxuhui
 * @Date 2023/2/20
 * @email zxh_1633@163.com
 */
public class JoinThreadTest {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        };
        t1.start();
        for (int i = 0; i < 100; i++) {
            if(i == 10){
                t1.join();//t1 插队，t1执行完毕再去执行main线程
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
