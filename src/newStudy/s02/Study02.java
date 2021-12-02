package newStudy.s02;

/**
 * 文档注释
 * @Author zhangxuhui
 * @Date 2021/12/2
 * @email zxh_1633@163.com
 */
public class Study02 {
    public static void main(String[] args) {
        // 我的程序 单行注释
        /*
          我的
          祖国  多行注释，注意不能嵌套。
         */
        System.out.println("good good study,day day up!");
        /**
         * 进制转换
         */
        System.out.println(6);//十进制
        System.out.println(Integer.toBinaryString(6));//十进制转二进制
        System.out.println(Integer.parseInt("110",2));//二进制转十进制

        System.out.println(Integer.toHexString(123));//十进制转十六进制


    }
}
