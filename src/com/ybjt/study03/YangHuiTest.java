package com.ybjt.study03;

/**
 * 杨辉三角：使用二维数组打印杨辉三角
 * 第一行有1个元素，第n行有n个元素
 * 从第三行开始，对于非第一个和非最后一个元素的元素：即
 * arr[j][k] = arr[j-1][k]+arr[j-1][k-1]
 * @author zxh
 * @create 2019-09-05 21:08
 */
public class YangHuiTest {
    public static void main(String[] args) {
        int [][] arr = new int [10][];
        for (int i = 0; i <arr.length; i++) {
           arr[i] = new int [i+1];
           //给首末元素赋值
            arr[i][0] = arr[i][i] = 1;
            if(i>1){
                for (int j = 1; j < arr[i].length-1 ; j++) {
                    arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }

        //遍历
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
