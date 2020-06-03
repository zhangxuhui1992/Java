package test.javaee.lamda;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-02 17:01
 */

interface MyInterface2{
    void say(String str);
}

public class LamdaTest {

    public static void test(MyInterface2 myInterface2){
        myInterface2.say("Hello World");
    }

    public static void main(String [] args){
        //lamda表达式
        //test((s)->System.out.println(s));

        //lamda表达式 内部操作
        test((s)->{
            s = s +"\n"+ s;
            System.out.println(s);
        });
    }


}
