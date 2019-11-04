package com.ybjt.study06;

/**
 * @author zxh
 * @create 2019-11-04 10:37
 */
public class StaticProxy {
    public static void main(String[] args) {
        ChenHeProxy proxy = new ChenHeProxy(new ChenHe());
        proxy.work();
    }
}

//接口定义功能
interface Star{
    void song();
    void dance();
}

//实现功能的真是对象
class ChenHe implements Star{
    @Override
    public void song(){
        System.out.println("陈赫唱歌！");
    }

    @Override
    public void dance() {
        System.out.println("陈赫跳舞！");
    }
}

class ChenHeProxy implements Star{
    private Star realStar;

    ChenHeProxy(Star realStar){
        this.realStar = realStar;
    }

    @Override
    public void song(){
        realStar.song();
    }

    @Override
    public void dance(){
        realStar.dance();
    }

    public void work(){
        System.out.println("代理人准备舞台！");
        song();
        dance();
    }
}
