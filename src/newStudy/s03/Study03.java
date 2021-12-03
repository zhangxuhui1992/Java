package newStudy.s03;

/**
 * @Author zhangxuhui
 * @Date 2021/12/3
 * @email zxh_1633@163.com
 * 运算符
 */
public class Study03 {
    public static void main(String[] args) {
        System.out.println(4/3);//除取整
        System.out.println(20%3);//模取余

        byte b = 3;

        //b = b + 4;编译不通过，应为左边为byte类型右边为int类型
        b+=4;//+=有隐式的类型转换


    }
}
