package new2023.juc;

import java.util.concurrent.TimeUnit;

/**
 * @Author zhangxuhui
 * @Date 2023/3/17
 * @email zxh_1633@163.com
 */
public class JoinTest {
    static int s = 0;
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s = 10;
            System.out.println("t is over");
        },"t");

        t.start();
        t.join(500);//插队，等待t线程结束。
        System.out.println(s);
    }
}
