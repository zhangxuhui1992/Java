package com.ybjt.test;

/**
 * @author zxh
 * @create 2019-08-08 22:40
 */
public class For {
    public static void main(String[] args) {
        int flag = 0;
        for(;;){
            flag ++;
            if(flag >= 10000){
                System.out.println("我爱你"+flag);
                break;
            }
            System.out.println("我爱你"+flag);
        }
    }
}
