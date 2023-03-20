package new2023.juc;

/**
 * @Author zhangxuhui
 * @Date 2023/3/20
 * @email zxh_1633@163.com
 */
public class SafeString {
    public static void main(String[] args) {
        String s = "134";
        /**
         * public final class String
         * 声明为final类型，不让子类重写而导致线程安全问题
         * 从而保证String类的线程安全
         */
    }
}
