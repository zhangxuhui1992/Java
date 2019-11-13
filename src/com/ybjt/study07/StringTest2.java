package com.ybjt.study07;

import com.sun.javafx.binding.StringFormatter;
import org.junit.Test;

/**
 * @author zxh
 * @create 2019-11-13 10:19
 */
public class StringTest2 {
    public static void main(String[] args) {
      String str = "123";
        byte[] bytes = str.getBytes();
        String s1 = new String(bytes);
        int num = 45;
      String s = String.valueOf(num);
    }

    @Test
    public void sun(){
        System.out.println("123");
    }
}
