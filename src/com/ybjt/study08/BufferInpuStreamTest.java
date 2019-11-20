package com.ybjt.study08;

import org.junit.Test;

import java.io.*;

/**
 * @author zxh
 * @create 2019-11-19 20:59
 */
public class BufferInpuStreamTest {
    @Test
    public void test(){
        try {
            File file = new File("2.jpg");
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }

    @Test
    public void test2() throws FileNotFoundException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data.text"));
    }
}
