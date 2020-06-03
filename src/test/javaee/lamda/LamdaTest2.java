package test.javaee.lamda;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-02 17:16
 */

interface MyInterface3{
    int count(int a,int b);
}

public class LamdaTest2 {

    public static void test(MyInterface3 myInterface3){
        int result = myInterface3.count(2, 2);
        System.out.println(result);
    }


    public static void main(String[] args) {
        //lamda 表达式
        test((x,y)->{return x*y;});
    }
}
