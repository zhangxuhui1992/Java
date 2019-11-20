package com.ybjt.study08;

import org.junit.Test;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author zxh
 * @create 2019-11-20 10:44
 */
public class ObjectStreamTest {
    @Test
    /**
     * 序列化
     */
    public void test(){
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(new FileOutputStream("obj.bat"));

            stream.writeObject(new Animal("猫咪",2));
            stream.writeObject(new Animal("猫咪2",3));

            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(stream != null){
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    /**
     * 反序列化
     */
    public void test2(){
        ObjectInputStream stream = null;
        try {
            stream = new ObjectInputStream(new FileInputStream("obj.bat"));
            Object o = stream.readObject();
            Object s = stream.readObject();
            if( o instanceof Animal){
                Animal an = (Animal)o;
                System.out.println(an);
            }
            if( s instanceof Animal){
                Animal an = (Animal)s;
                System.out.println(an);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(stream != null){
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
