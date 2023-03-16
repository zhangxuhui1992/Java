package new2023.juc;

import java.util.Date;

/**
 * @Author zhangxuhui
 * @Date 2023/3/16
 * @email zxh_1633@163.com
 */
public class CpuSleepTest {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            Thread.sleep(1);
            System.out.println(new Date());
        }
    }
}
