package com.ybjt.study04;

/**
 * $冒泡排序
 * @author zxh
 * @create 2019-09-10 21:32
 */
public class BubbleTest {
    public static void main(String[] args) {
        int [] arr = {23,45,5,9,36,78,52,-56,-2,20};
        for(int i = 0 ;i<arr.length-1;i++){
            for(int k = 0;k<arr.length-1-i;k++){
                if(arr[k]>arr[k+1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }

        for(int num:arr){
            System.out.print(num+"\t");
        }
    }
}
