package new2023.线程池;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author zhangxuhui
 * @Date 2023/4/14
 * @email zxh_1633@163.com
 */
public class TimerTaskTest {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        ScheduledExecutorService pool = new ScheduledThreadPoolExecutor(2);
        pool.schedule(()->{
            System.out.println("123");
            int x = 1/0;
        },1, TimeUnit.SECONDS);
        pool.schedule(()->{
            System.out.println("123");
        },1, TimeUnit.SECONDS);

        pool.shutdown();


        //timer任务顺序执行
        //异常后将影响后续任务执行
        //使用带调度功能的线程池解决
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println(1);
            }
        };

        TimerTask task1 = new TimerTask() {
            @Override
            public void run() {
                System.out.println(2);
            }
        };

        timer.schedule(task,1000);
        timer.schedule(task1,1000);

        Thread.sleep(2000);

        timer.cancel();

    }
}
