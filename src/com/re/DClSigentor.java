package com.re;

/**
 * DCL单例设计模式: 双重检测，指令重排
 * 1.提供私有的,静态的类的实例属性
 * 2.私有化构造器
 * 3.对外提供公开的获取方法
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-02-16 16:35
 */
public class DClSigentor {

    //提供私有的,静态的类的实例属性
    private static volatile DClSigentor ins;

    //私有化构造器
    private DClSigentor(){}

    //对外提供公开的获取方法
    public static DClSigentor getIns(){
        //已经存在直接返回无需等待
        if(null != ins){
            return ins;
        }
        synchronized (DClSigentor.class){
            //不存在则创建对象
            if(null == ins){
                ins = new DClSigentor();
                //创建对象的过程中，可能发生指令重排。则添加volatile关键字
                //保证数据统一，主内存和线程内存数据一致。
            }
            return ins;
        }
    }
}


class TestDCL{
    public static void main(String[] args) {

       /*new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println(DClSigentor.getIns());
           }
       }).start();*/

       //Lambda表达式改写
       new Thread(()->{
           System.out.println(DClSigentor.getIns());
       }).start();

        System.out.println(DClSigentor.getIns());
    }
}
