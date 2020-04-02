package test.javase.file;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-04-02 16:58
 * io流测试
 */
public class fileTest {
    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();

        //创建file类的方式
        /**
         * 路径是不区分大小写
         * 路径中的文件名称分隔符windows使用反斜杠,
         * 反斜杠是转义字符,两个反斜杠代表一个普通的反斜杠
         */
        File f = new File("C:\\Users\\Administrator\\Desktop\\mv.mp4");

        File f1 = new File("C:\\Users\\Administrator\\Desktop","mv_复制.mp4");

        long l = f.lastModified();
        //获取文件最后一次修改时间，日期格式化。
        String lastTime =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(l));
        System.out.println(lastTime);

        /**
         * File类的注意点：
         * 一个File对象代表硬盘中实际存在的一个文件或者目录。
         * File类构造方法不会给你检验这个文件或文件夹是否真实存在，
         * 因此无论该路径下是否存在文件或者目录，都不影响File对象的创建。
         */


        /**
         * 案例：文件复制
         */

        BufferedInputStream bis  = new BufferedInputStream(new FileInputStream(f));

        BufferedOutputStream bps = new BufferedOutputStream(new FileOutputStream(f1));

        byte [] b = new byte[1024];

        int data ;

        while ((data = bis.read(b)) != -1){
            bps.write(b, 0, data);

        }
        bps.flush();

        if(bis != null){
            bis.close();
        }
        if(bps != null){
            bps.close();
        }

        long end = System.currentTimeMillis();

        System.out.println("耗时： "+(end-start)+"毫秒");

    }
}
