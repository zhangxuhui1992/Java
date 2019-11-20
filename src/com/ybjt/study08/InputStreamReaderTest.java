package com.ybjt.study08;

import org.junit.Test;

import java.io.*;

/**
 * @author zxh
 * @create 2019-11-20 9:07
 */
public class InputStreamReaderTest {
    @Test
    /**
     * 转换流测试
     */
    public void test(){
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            File file = new File("古诗.txt");
            File dest = new File("复制.txt");

            isr = new InputStreamReader(new FileInputStream(file),"utf-8");

            osw = new OutputStreamWriter(new FileOutputStream(dest),"utf-8");

            char [] buf = new char[10];
            int lent ;
            while((lent = isr.read(buf)) != -1){
                osw.write(buf,0,lent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(osw != null){
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(isr != null){
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
