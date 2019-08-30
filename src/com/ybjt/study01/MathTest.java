package com.ybjt.study01;

/**
 * @author zxh
 * @create 2019-08-30 9:29
 * + 正号  - 负号  + 加  - 减  * 乘  / 除（取整） %（取模） 取余
 *  ++ （前后）加加 -- （前后）减减   + 字符串拼接
 */
public class MathTest {
    public static void main(String[] args) {
        //除法取整
        int num = 12;
        int num1 = 5;
        int num2 = -19;
        int num3 = num/num1;
        int num4 = num/num1*num1;
        //模取余，结果的符号与被模数相同
        //取模结果为0，表示能被除尽，常用于判断。
        int num5 = num%num1;
        int num6 = num2%num1;
        System.out.println(num3);//2
        System.out.println(num4);//10
        System.out.println(num5);//2
        System.out.println(num6);//-4

        //前++:先自增再运算 后++：先运算再自增
        int num7 = num1++;
        int num8 = ++num1;
        System.out.println(num7);//5
        System.out.println(num8);//7

        //都自增，没有区别
        num++;
        System.out.println(num);//13
        ++num;
        System.out.println(num);//14

        //++自增不会改变自身的数据类型  --自减类似于自增运算，就是减法
        //+=有隐式的自动类型转换
        short num10 = 12;
        num10 += 1 ;//相当于 num10 = num10+1;编译报错，将int类型的变量赋值给short,损失精度。
        System.out.println(num10);//13

    }
}
