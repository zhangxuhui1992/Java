package com.ybjt.study06;

/**
 * @author zxh
 * @create 2019-11-06 16:45
 */
public class MyExeption extends RuntimeException {

    private static final long serialVersionUID = 7575524614027820768L;

    public MyExeption(){
    }

    public MyExeption(String msg){
        super(msg);
    }
}
