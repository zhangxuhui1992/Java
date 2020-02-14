package com.threadlearn;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author zxh
 * @create 2020-02-13 15:16
 */
public class DowLoadImagFormWeb extends Thread  {

    private String url;
    private String name;

    public DowLoadImagFormWeb( String name, String url) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class TestDo{
    public static void main(String[] args) {

        DowLoadImagFormWeb d1 = new DowLoadImagFormWeb("mm.jpg","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1581589100326&di=e9beef6badd68233755e85768e838638&imgtype=0&src=http%3A%2F%2Fimg.kutoo8.com%2Fupload%2Fimage%2F43278246%2Fleisineiyi%2520%25287%2529_960x540.jpg");
        DowLoadImagFormWeb d2 = new DowLoadImagFormWeb("ss.jpg","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1581589100323&di=aad2ac396416007f0356bd50b2bed189&imgtype=0&src=http%3A%2F%2Fimg.tupianzj.com%2Fuploads%2Fallimg%2F151108%2F9-15110Q22416.jpg");

        d1.start();
        d2.start();

    }
}
