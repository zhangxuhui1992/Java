package test.javase.staticproxy;

/**
 * 接口的使用练习：静态代理
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-02-23 18:41
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        DengChaoProxy proxy = new DengChaoProxy(new DengChao());
        proxy.song();
        proxy.dance();
    }
}
