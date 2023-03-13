package com.study;

import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @Author zhangxuhui
 * @Date 2023/3/13
 * @email zxh_1633@163.com
 */
public class ByteBufferTest {
    public static void main(String[] args) {

        ByteBuffer bb = ByteBuffer.allocate(4);
        bb.putInt(15);
        bb.flip();
        System.out.println(Arrays.toString(bb.array()));

    }
}
