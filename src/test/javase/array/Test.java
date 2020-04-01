package test.javase.array;

import java.util.Arrays;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-03-17 13:15
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 选择排序
         */
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };

        System.out.println("排序前："+Arrays.toString(ns));

        for(int i = 0 ; i < ns.length-1;i++){
            for(int k = i+1 ; k<ns.length;k++){
                if(ns[i] > ns[k]){
                    int temp = ns[i];
                    ns[i] = ns[k];
                    ns[k] = temp;
                }
            }
        }

        System.out.println("选择排序："+Arrays.toString(ns));

        int[] ks = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };

        for(int i = 0 ; i< ks.length-1;i++){
            for(int k = i+1 ; k<ks.length-i-1;k++){
                if(ks[k]>ks[k+1]){
                    int tmp = ks[k];
                    ks[k] = ks[k+1];
                    ks[k+1] = tmp;
                }
            }
        }
        System.out.println("冒泡排序："+Arrays.toString(ns));
    }
}
