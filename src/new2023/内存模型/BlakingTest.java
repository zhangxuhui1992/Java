package new2023.内存模型;

/**
 * @Author zhangxuhui
 * @Date 2023/4/8
 * @email zxh_1633@163.com
 */
public class BlakingTest {

    static volatile boolean flag = false;
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            synchronized (BlakingTest.class) {
                if (flag) {
                    System.out.println("stop");
                    return;
                }
                flag = true;
                System.out.println("start");
            }
        });


        flag = true;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.start();
    }
}
