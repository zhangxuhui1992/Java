package newStudy.s01;

import java.util.Properties;

/**
 * @Author zhangxuhui
 * @Date 2021/12/1
 * @email zxh_1633@163.com
 * public 修饰的类的类名必须与文件名相同
 */
public class Study01 {
    public static void main(String[] args) {
        System.out.println("我爱中国。。");
        Properties pro= System.getProperties();
        //打印全部的属性
        pro.list(System.out);
    }
}
