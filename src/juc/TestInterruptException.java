package juc;

import java.util.concurrent.TimeUnit;

/**
 * @Author zhangxuhui
 * @Date 2022/7/30
 * @email zxh_1633@163.com
 */
public class TestInterruptException {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(() -> {
            while (true) {
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("thread is interrupted ");
                    break;
                }

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    //如果该线程阻塞的调用wait() ， wait(long) ，或wait(long, int)的方法Object类，
                    // 或的join() ， join(long) ， join(long, int) ， sleep(long) ，或sleep(long, int) ，
                    // 这个类的方法，那么它的中断状态将被清除，并且将收到InterrupsstedException 。
                    //清除后需要重新设置
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }

                System.out.println("thread running...");
            }
        });

        t.start();

        TimeUnit.SECONDS.sleep(1);

        new Thread(()->{
            t.interrupt();
        }).start();
    }
}
