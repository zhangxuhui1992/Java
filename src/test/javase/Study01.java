package test.javase;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-02-22 17:02
 *
 *  Java语言的特点：免费、开源、安全、跨平台、面向对象
 *  path:告诉计算机操作系统JAVA的程序javac、java等在哪里。
 *  classpath：在1.5后之后不用配置，但是如果配置了一定配置准确，不然程序无法运行。指示哪里加载class文件。
 *
 *  goto和const作为保留字存在，目前并不使用。
 */
public class Study01 {

    public static final int AGE = 18;

    public static void main(String [] args){
        int age = 16 ;
        final String NAME_TOM = "程忠霞";
        System.out.println("Hello World");
        System.out.println(NAME_TOM);
        System.out.println(AGE);
        byte num = 10 ;
        //num = (byte)(num + 10) ;
        num += 10;
        System.out.println(num);

    }
}
