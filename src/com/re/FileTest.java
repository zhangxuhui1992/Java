package com.re;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author zxh
 * @create 2020-02-13 11:18
 */
public class FileTest {
    public static void main(String [] args ) throws Exception {
        File file = new File("D:\\workSpace\\idea_workspace\\JavaSE\\1.jpg");

        System.out.println(file.length());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());


        FileInputStream is = new FileInputStream(file);
        FileOutputStream os = new FileOutputStream("D:\\workSpace\\idea_workspace\\JavaSE\\11.jpg");

        byte [] len = new byte[10];
        while(is.read(len) != (-1)){
            os.write(len);
        }

        if(is != null){
            is.close();
        }

        if(os != null){
            os.close();
        }



    }
}
