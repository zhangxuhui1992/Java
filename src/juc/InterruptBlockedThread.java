package juc;

/**
 * Interrupt 打断阻塞的线程，打断标记清空为false。
 * 抛出异常 sleep interrupted
 * Interrupt 打断正常执行的线程，打断标记将被设置为true。
 * 并不会抛吃异常。
 *
 * @Author zhangxuhui
 * @Date 2023/2/20
 * @email zxh_1633@163.com
 */
public class InterruptBlockedThread {
    public static void main(String[] args) {
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    boolean interrupted = Thread.currentThread().isInterrupted();
                    System.out.println(interrupted);
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread("t2") {
            @Override
            public void run() {
                    for(;;){
                        boolean interrupted = Thread.currentThread().isInterrupted();
                        System.out.println(interrupted);
                        if(interrupted){
                            break;
                        }
                    }
            }
        };

        t1.start();
        t2.start();

        t1.interrupt();
        t2.interrupt();
    }
}
