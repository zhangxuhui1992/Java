package test.javase.array;

import java.util.Arrays;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-03-17 13:43
 * 二分查找法：首先对数组进行排序，折半查找，先计算出中间值
 * 如果比中间值大，则在中间值的右侧，否则就在左侧，循环折半查找
 * 直到查找的值等于中间值，退出循环。
 */
public class MiddleSerarch {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
        int num = 28;

        int max = ns.length-1;
        int min = 0;

        while (min<=max){
            int midlle = (max+min)/2;
            if(num == ns[midlle]){
                System.out.println(num+"索引位置为"+midlle);
                break;
            }
            if(num > ns[midlle]){
                min = midlle+1;
            }
            if(num < ns[midlle]){
                max = midlle-1;
            }
        }


    }
}
