package test.javaee.collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author zhangxuhui
 * @Date 2022/7/23
 * @email zxh_1633@163.com
 */
public class SyncMap {
    public static void main(String[] args) {
        //线程安全的map
        Map<String,String> map = new ConcurrentHashMap<>(20);

        for (int i = 0; i < 20; i++) {
            int x = i;
            new Thread(() -> {
                map.put("" + x, Thread.currentThread().getName());
            }).start();
        }

        System.out.println(map.toString());
    }
}
