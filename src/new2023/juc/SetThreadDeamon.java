package new2023.juc;

import java.util.concurrent.TimeUnit;

/**
 * @Author zhangxuhui
 * @Date 2023/3/18
 * @email zxh_1633@163.com
 */
public class SetThreadDeamon {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (true){
                System.out.println("running...");
            }
        });
        thread.setDaemon(true);
        thread.start();
        TimeUnit.MILLISECONDS.sleep(10);
        System.out.println("thread main over");
    }
}
