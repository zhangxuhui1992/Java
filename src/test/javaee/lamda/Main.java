package test.javaee.lamda;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-02 16:48
 */
public class Main {

    public static void test(MyInterface myInterface){
        myInterface.say();
    }


    public static void main(String [] args){
        /**
         * 匿名内部类
         */
//        test(new MyInterface() {
//            @Override
//            public void say() {
//                System.out.println("Java is the best code language");
//            }
//        });
        //lamda表达式改写
        test(()-> System.out.println("JavaScript is the best code language"));
    }

}
