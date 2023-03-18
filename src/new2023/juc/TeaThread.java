package new2023.juc;

/**
 * @Author zhangxuhui
 * @Date 2023/3/18
 * @email zxh_1633@163.com
 */
public class TeaThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(1000);
                System.out.println("小王 洗水壶");

                Thread.sleep(5000);
                System.out.println("小王 烧开水");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },"小王");


        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(1000);
                System.out.println("大王 洗茶壶");

                Thread.sleep(1000);
                System.out.println("大王 洗茶杯");

                Thread.sleep(1000);
                System.out.println("大王 拿茶叶");

                t1.join();

                System.out.println("大王 泡茶");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"大王");

        t1.start();
        t2.start();
    }
}
