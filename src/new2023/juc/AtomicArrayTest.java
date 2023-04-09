package new2023.juc;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @Author zhangxuhui
 * @Date 2023/4/9
 * @email zxh_1633@163.com
 */
public class AtomicArrayTest {
    public static void main(String[] args) {
//        AtomicReferenceArray
//        AtomicLongArray
//        AtomicIntegerArray
        int [] arr = new int[10];
        for (int x = 0 ; x < arr.length;x++){
            new Thread(()->{
                for (int y = 0 ; y < 10000;y++){
                    arr[y%arr.length] = arr[y%arr.length]+1;
                }
            }).start();

        }

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(arr));

        AtomicIntegerArray ata = new AtomicIntegerArray(10);
        for (int x = 0 ; x < ata.length();x++){
            new Thread(()->{
                for (int y = 0 ; y < 10000;y++){
                    ata.getAndIncrement(y%ata.length());
                }
            }).start();

        }

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(ata);
    }
}
