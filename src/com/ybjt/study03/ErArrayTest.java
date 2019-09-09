package com.ybjt.study03;

/**
 * 二维数组
 * @author zxh
 * @create 2019-09-04 22:53
 */
public class ErArrayTest {
    public static void main(String[] args) {
        //二维数组的声明
        int [][] arr = new int[3][2];
        int [][] ass = new int[][]{{1,1,2},{5,96,9,}};

        //调用指定位置的元素
        System.out.println(ass[0][2]);

        //遍历
        for(int i = 0;i<ass.length;i++){
            for(int k = 0 ;k<ass[i].length;k++){
                System.out.println(ass[i][k]);
            }
        }

        //二维数组的元素初始化值：外层元素的初始化值为地址值，内层元素的初始化值与
        //以为数组元素的初始化值相同

    }
}
