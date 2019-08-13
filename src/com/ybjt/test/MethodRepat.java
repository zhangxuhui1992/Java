package com.ybjt.test;

/**
 * @author zxh
 * @create 2019-08-13 14:21
 * 方法的重载（overload）：在一个类中，方法名相同，参数列表不同
 *  同一类、相同方法名、参数列表不同（参数个数不同、参数类型不同）
 *  确定具体调用的那个，看方法名。看参数列表
 */
public class MethodRepat {
    //三个方法的重载
    public void getSum(int s,int m){

    }

    public void getSum(int d,double s){

    }

    public void getSum(int d,double s,String str){

    }
}
