package com.ybjt.utils;

import java.io.File;

/**
 * @author zxh 666
 * @create 2019-07-31 16:20
 */
public class IOTools {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        boolean bool = IOTools.deleteFile("E:\\迅雷下载\\阳光电影www.ygdy8.com.神盾局特工第六季第05集[中英双字].mkv");
        long end = System.currentTimeMillis();
        System.out.println(bool+"删除成功！");
        System.out.println("耗时="+(end-start)+"毫秒");
    }
    /**
     * $删除单个文件
     * fileName文件全路径
     */
    public static boolean deleteFile(String fileName){
        File file = new File(fileName);
        if(file.exists() && file.isFile()){
            if(file.delete()){
                return true;
            }else{
                return false;
            }
        }else{
            return  false;
        }
    }
}
