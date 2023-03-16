package new2023.juc;

import java.util.concurrent.TimeUnit;

/**
 * @Author zhangxuhui
 * @Date 2023/3/16
 * @email zxh_1633@163.com
 */
public class SleepTest {
    public static void main(String[] args) throws Exception {
        Thread running = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("running");
        });
        running.start();

        System.out.println(running.getState());

        Thread.sleep(500);
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println(running.getState());
        running.interrupt();
    }
}
