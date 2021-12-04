package newStudy.s03;

import org.junit.Test;

/**
 * @Author zhangxuhui
 * @Date 2021/12/4
 * @email zxh_1633@163.com
 * 二进制练习
 */
public class BinaryTest {
    /**
     * 最有效的计算2乘8
     * 位移运算
     */
    @Test
    public void test01(){
        System.out.println(2<<3);// 2*2的3次方
    }

    /**
     * 交换两个变量的值
     */
    @Test
    public void test02(){
        int a = 3,b=4;
        int temp = a;
        a = b ;
        b = temp;
        System.out.println("a="+a+",b="+b);
    }

    /**
     * 交换两个变量的值
     * 不使用临时变量
     */
    @Test
    public void test03(){
        int a = 3,b=4;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a="+a+",b="+b);
    }

    /**
     * 交换两个变量的值
     * 不使用临时变量
     * 一个数异或另一个数两次等与原来的数 4^2^2 = 4
     */
    @Test
    public void test04(){
        int a = 3,b=4;
        a = a ^ b;//3 ^ 4
        b = a ^ b;// 3 ^ 4 ^ 4 = 3 b = 3
        a = a ^ b;// 3 ^ 4 ^ 3 = 4 a = 4
        System.out.println("a="+a+",b="+b);
    }

    /**
     * 获取三个数的最大值
     * 嵌套三元运算符
     */
    @Test
    public void test05(){
        int a = 30,b = 4,c = 5;
        System.out.println(a > b ? a : b>c?a > b ? a : b:c);
    }

}
