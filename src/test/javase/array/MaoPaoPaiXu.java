package test.javase.array;

import java.util.Arrays;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-03-17 12:41
 *
 * 冒泡排序：
 *    选择排序是从第一个元素开始与后面的每一个元素比较，然后交换位置。
 *    冒泡排序则是从第一个元素开始，每相邻的元素比较然后交换位置。
 *    每次从首位开始，比较一轮后末尾就是数组中的最大值，
 *    第二轮比较中就不再比较末尾的元素,
 *    最后一轮就剩一个元素就不必再比较，
 *    那么n个元素的数组，则比较n-1轮。
 *
 *    一次类推。。。
 */
public class MaoPaoPaiXu {
    public static void main(String [] args){
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        System.out.println("排序前："+Arrays.toString(ns));

        /**
         * 外层循环控制比较的次数。内层循环控制真正的比较交换操作。
         * 因为比较的是ns[k+1]所以k<ns.length-i-1
         */

        for(int i = 0 ; i < ns.length- 1; i++){
            for(int  k = 0 ; k < ns.length - i -1 ; k++){
                if(ns[k] > ns[k+1]){
                    int tmp = ns[k];
                    ns[k] = ns[k+1];
                    ns[k+1] = tmp;
                 }
            }
        }
        System.out.println("排序后："+Arrays.toString(ns));
    }
}
