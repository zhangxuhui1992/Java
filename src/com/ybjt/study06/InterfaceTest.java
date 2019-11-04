package com.ybjt.study06;

/**
 * @author zxh
 * @create 2019-11-04 9:22
 */
public interface InterfaceTest {
    int AGE = 25;//省略public static final
    void song();//省略public abstract
}

class Inter implements InterfaceTest{
    //常量不可以改变
    @Override
    public void song(){
        System.out.println("我今年"+AGE+"岁！"+"我喜欢唱歌！");
    }
}


class mainTest{
    public static void main(String[] args) {
        Inter i = new Inter();
        i.song();
    }
}