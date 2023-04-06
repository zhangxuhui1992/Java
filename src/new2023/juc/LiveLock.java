package new2023.juc;

/**
 * @Author zhangxuhui
 * @Date 2023/4/6
 * @email zxh_1633@163.com
 */
public class LiveLock {
    static volatile int count = 10;
    static Object lock = new Object();
    public static void main(String[] args) {
        new Thread(()->{
                while (count > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName()+"-->"+count);
                }
        }).start();


        new Thread(()->{
                while (count < 20){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName()+"-->"+count);
                }
        }).start();


    }
}
