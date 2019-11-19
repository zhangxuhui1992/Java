package com.ybjt.study08;

import org.junit.Test;

import java.io.*;

/**
 * @author zxh
 * @create 2019-11-19 9:32
 */
public class GenericTest {


    @Test
    public void test(){
        /**
         * read()返回读入的一个字符，如果达到文件末尾返回-1
         * 为了保证流资源一定可以执行关闭操作，需要使用try-catch-finally结构处理异常
         * 读入的文件一定要存在，否则报FileNotFoundException。
         */
        //实例化File类的对象，指明要操作的文件
       File file = new File("jdbc.properties");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            int data ;
            while((data = fr.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2(){
        FileReader fr = null;
        try {
            File file = new File("jdbc.properties");
            fr = new FileReader(file);
            char [] buf = new char[1024];
            int lent;
            while((lent = fr.read(buf)) != -1){
               /* for (int i = 0; i < lent; i++) {
                    System.out.print(buf[i]);
                }*/
               String str = new String(buf,0,lent);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    @Test
    public void test3(){
        FileWriter fw = null;
        try {
            File file = new File("hello.txt");
            fw = new FileWriter(file,false);
            fw.write("good good study ! day day up !");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test4(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file = new File("1.jpg");
            File dec = new File("2.jpg");

            fis = new FileInputStream(file);
            fos = new FileOutputStream(dec);

            byte [] by = new byte [1024];
            int len ;
            while((len = fis.read(by)) != -1){
                fos.write(by,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
