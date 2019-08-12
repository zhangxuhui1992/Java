package com.ybjt.test;

import com.ybjt.utils.RandomNumber;

/**
 * 数组查找
 * @author zxh
 * @create 2019-08-08 14:23
 */
public class SearchArray {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //int [] array = new int []{47,70,78,10,59,24,16,90,72,88};数组的两种声明方式
        //int [] arr = {47,70,78,10,59,24,16,90,72,88};
        int [] arr = new int [100];
        //System.out.println(arr.length);100
        for(int i = 0;i<arr.length;i++){
            int num = RandomNumber.Random(0,100);

        }
        for(int i = 0 ;i < arr.length ;i++ ){
            //System.out.println(arr[i]);
            if(arr[i] == 14){
                System.out.println("14的索引为："+i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时="+(end-start)+"s");
    }
}
