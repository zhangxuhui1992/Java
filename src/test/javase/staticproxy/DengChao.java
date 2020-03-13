package test.javase.staticproxy;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-02-23 19:55
 */
public class DengChao implements star {

    @Override
    public void song() {
        System.out.println("邓超跪着唱征服");
    }


    @Override
    public void dance() {
        System.out.println("邓超会跳霹雳舞");
    }
}
