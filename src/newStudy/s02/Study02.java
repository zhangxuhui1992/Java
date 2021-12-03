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

        //变量
        int a = 7;
        byte b = 3;

        int sum  = a + b;//自动类型转换

        int count = (int)3.2;
        System.out.println("count="+count);//强制类型转换 ：3

        long s = 12345678900L;
        float f = 3.2F;
        System.out.println(a);

        System.out.println((char) 97);
    }
}
