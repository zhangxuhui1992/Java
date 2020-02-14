package com.re;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author zxh
 * @create 2020-02-11 17:28
 */
public class ImagesSearch {
    public static void main(String [] args) throws Exception {
        URL url = new URL("https://image.baidu.com/search/index?tn=baiduimage&ipn=r&ct=201326592&cl=2&lm=-1&st=-1&sf=1&fmq=&pv=&ic=0&nc=1&z=&se=1&showtab=0&fb=0&width=&height=&face=0&istype=2&ie=utf-8&fm=index&pos=history&word=%E6%AF%94%E5%9F%BA%E5%B0%BC%E7%BE%8E%E5%A5%B3");

        InputStream inputStream = url.openStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));

        String str = null;

        while( null != (str = br.readLine())){
            System.out.println(str);
        }

        br.close();

    }
}
