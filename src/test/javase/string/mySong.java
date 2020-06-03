package test.javase.string;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-04-03 21:41
 */
public class mySong implements song {
    @Override
    public void say() {
        System.out.println("say chinese");

    }

    @Override
    public void dance() {
        System.out.println("chinese do not dance");
    }
}
