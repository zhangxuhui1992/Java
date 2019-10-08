package com.ybjt.study04;
import java.util.Arrays;
/**
 * Arrays数组工具类测试
 * @author zxh
 * @create 2019-09-12 9:48
 */
public class ArraysTest {
    public static void main(String[] args) {
        int [] arr = {23,45,5,9,36,78,52,-56,-2,20};
        int [] sts = {23,45,8,9,36,78,52,-56,-2,20};

        //判断是否相等
        boolean flag = Arrays.equals(arr, sts);
        System.out.println(flag);

        //输出数组信息
        String s = Arrays.toString(arr);
        System.out.println(s);

        //将数组中的元素替换成指定的元素
        Arrays.fill(arr,666);
        System.out.println(Arrays.toString(arr));

        //排序
        Arrays.sort(sts);
        System.out.println(Arrays.toString(sts));

        //二分查找,返回指定元素的索引
        int i = Arrays.binarySearch(sts, 20);
        System.out.println(i);
    }
}
