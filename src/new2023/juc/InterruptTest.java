package new2023.juc;

/**
 * @Author zhangxuhui
 * @Date 2023/3/17
 * @email zxh_1633@163.com
 */
public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            System.out.println("sleep....");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread is over");
        });

        t.start();
        Thread.sleep(1000);
        System.out.println("interrupt...");
        t.interrupt();
        System.out.println("打断标记："+t.isInterrupted());//false

    }
}
