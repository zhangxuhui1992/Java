package test.javaee.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhangxuhui
 * @Date 2023/2/7
 * @email zxh_1633@163.com
 */
public class ArrayListTest {
    public static void main(String[] args) {
        /**
         * list 默认为10的object数组
         * 扩容机制为原来数组大小的1.5倍
         * 底层进行数组的复制实现扩容
         */
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("java");
        }
    }
}
