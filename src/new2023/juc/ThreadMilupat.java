package new2023.juc;

import java.util.Date;

/**
 * @Author zhangxuhui
 * @Date 2023/3/16
 * @email zxh_1633@163.com
 */
public class ThreadMilupat {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() + ":" + new Date());
            }
        });
        thread.start();

        MyTest();
    }

    private static void MyTest() {
        int x = 10;
        System.out.println(x);
    }
}
