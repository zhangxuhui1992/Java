package new2023.juc;

/**
 * @Author zhangxuhui
 * @Date 2023/3/19
 * @email zxh_1633@163.com
 */
public class synchronizedTest {

     static int count=0;
    public static void main(String[] args)throws Exception {
        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            for (int i = 0 ; i < 5000 ;i++){
                synchronized(lock){
                    count++;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0 ; i < 5000 ;i++){
                synchronized (lock) {
                    count--;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(count);
    }
}
