package test.javase.array;

import java.util.Arrays;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-03-14 18:20
 *
 * 选择排序：
 *   认为第一位的元素为最小值，与其后的每一个元素比较。
 *   如果后面的元素比第一个元素小，则二者交换位置，那么一轮后
 *   第一索引位置上的元素就是数组中最小的元素。如果是最后一个元素则不用比较，那么将
 *   比较arr.length-1轮。比较一轮后再从第二个元素开始比较，依次类推，
 */
public class XuanZePaiXu {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        String str = Arrays.toString(ns);
        System.out.println("排序前数组："+str);
        //Arrays.sort(ns);
        //System.out.println("工具类排序："+Arrays.toString(ns));

        System.out.println("手工实现数组选择排序。。。。。。");

        //如果是最后一个元素，则不用比较。
        for(int i = 0 ; i < ns.length-1;i++){
            for(int j = i + 1 ; j < ns.length ; j++){
                if(ns[i] > ns[j]){
                    int temp = ns[i];
                    ns[i] = ns[j];
                    ns[j] = temp;
                }
            }
        }
        System.out.println("选择排序后："+Arrays.toString(ns));
    }
}
