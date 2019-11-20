package com.ybjt.study09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

/**
 * @author zxh
 * @create 2019-11-20 17:03
 */
public class URLTest {
    public static void main(String[] args) {
        HttpURLConnection connection = null;
        InputStream inputStream = null;
        FileOutputStream stream = null;
        try {
            URL url = new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1574250661866&di=4559a0b4220146da9fec6ee73a652ad3&imgtype=0&src=http%3A%2F%2Fimg01.mall.cmbchina.com%2FProductLongDesc%2F2017-12-18%2Fee8f0968-3256-48b2-9338-9b85578370e1.jpg");
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            inputStream = connection.getInputStream();
            stream = new FileOutputStream("2.jpg");
            byte [] dd = new byte[1024];
            int lent;
            while ((lent = inputStream.read(dd)) != -1){
                stream.write(dd,0,lent);
            }
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
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(connection != null){
                connection.disconnect();
            }
        }
        System.out.println("下载完成！");
    }
}
