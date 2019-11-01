package com.ybjt.study05;

/**
 * 单例模式的懒汉式
 * @author zxh
 * @create 2019-11-01 14:08
 */
public class Students {
    private String name;
    private String age;

    //私有化构造器
    private Students(){}

    //声明返回的对象
    private static Students ins = null;

    //提供公共的方法
    public static Students getInstance(){
        if(ins == null){
            return new Students();
        }
        return ins;
    }
}
