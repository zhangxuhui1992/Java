package new2023.juc;

import java.util.concurrent.TimeUnit;

/**
 * @Author zhangxuhui
 * @Date 2023/3/17
 * @email zxh_1633@163.com
 */
public class InterruptRunningThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
           while(true){
               boolean interrupted = Thread.currentThread().isInterrupted();
               System.out.println(interrupted);
               if(interrupted){
                   System.out.println("thread is inturrupted : stop");
                   break;
               }
           }
        });

        t.start();

        TimeUnit.SECONDS.sleep(1);

        t.interrupt();

        System.out.println("main thread is stop");
    }
}
