package newStudy.s03;

/**
 * @Author zhangxuhui
 * @Date 2021/12/3
 * @email zxh_1633@163.com
 * 运算符
 * 算术 逻辑 赋值 比较 位运算符
 */
public class Study03 {
    public static void main(String[] args) {
        System.out.println(4/3);//除取整
        System.out.println(20%3);//模取余

        byte b = 3;

        //b = b + 4;编译不通过，应为左边为byte类型右边为int类型
        b+=4;//+=有隐式的类型转换

        System.out.println(!false);

        System.out.println(3<<2);//左移乘2的位数次幂 3*2的平方 = 12
        System.out.println(-12>>2);//右移除，原最高位是什么就补什么
        System.out.println(12>>>2);//无符号右移，空位都补零，用于二进制数据位移，数据截取。

        System.out.println(6&3);//用来获取二进制中的有效位1 110 & 011 = 010
        System.out.println(6^3);//异或
        System.out.println(6^3^3);//6
        System.out.println(~6);//取反 所以位取反
        System.out.println(~6);
        System.out.println(6|3);// 110 | 011 = 111
        System.out.println(6&7);//111
    }
}
