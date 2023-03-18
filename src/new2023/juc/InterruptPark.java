package new2023.juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @Author zhangxuhui
 * @Date 2023/3/18
 * @email zxh_1633@163.com
 */
public class InterruptPark {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(()->{
            System.out.println("park");
            LockSupport.park();
            System.out.println("unpark");
//            System.out.println(Thread.currentThread().isInterrupted());
            System.out.println(Thread.interrupted());//获取打断标记并清除
            System.out.println("park two");
            LockSupport.park();//打断标记为true时失效

        },"t");

        t.start();
        TimeUnit.SECONDS.sleep(2);
        t.interrupt();
    }
}
