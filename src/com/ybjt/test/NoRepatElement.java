package com.ybjt.test;

import com.ybjt.utils.RandomNumber;

/**
 * 随机插入整数，保证每一个元素都不重复
 * 重点：递归判断，当元素重复时，新产生随机整数，要再去判断是否重复，
 * @author zxh
 * @create 2019-08-12 13:53
 */
public class NoRepatElement {
    public static void main(String[] args) {
        int [] arr = new int [100];
        for(int i = 0 ;i<arr.length;i++){
            int num = RandomNumber.Random(0,100);
            if(i>0){
                insert(arr,num,i);
            }else{
                arr[i] = num;
            }
        }
        for(int data:arr){
                System.out.println(data);
        }
    }

    /**
     *  递归判断元素是否重复
     * @param arr 数组
     * @param num 随机整数
     * @param i 要插入位置的索引
     */

    public static void insert(int [] arr,int num,int i){
        boolean flag = false;
        for(int k = 0;k<i;k++){
            if(arr[k] == num ){
                flag = true;
                if(flag){
                    insert(arr,RandomNumber.Random(0,100),i);
                }
                break;
            }else {
                arr[i] = num;
            }
        }
    }
}
