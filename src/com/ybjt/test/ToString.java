package com.ybjt.test;

/**
 * @author zxh
 * @create 2019-08-12 20:21
 *  将数组{1,2,3,4}转换成[1,2.3.4]
 */
public class ToString {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        String str = "[";
        for(int i = 0 ;i<array.length;i++){
            if(i != array.length-1){
                str += array[i]+",";
            }else{
                str += array[i]+"]";
            }
        }
        System.out.println(str);
    }
}
