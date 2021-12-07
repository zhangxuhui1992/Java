package newStudy.s06;

import java.util.Arrays;

/**
 * @Author zhangxuhui
 * @Date 2021/12/7
 * @email zxh_1633@163.com
 * 数组
 */
public class Study06 {
    public static void main(String[] args) throws InterruptedException {
        int [] arr = new int[5];//会默认初始化
        int [] arr2 = new int[]{1,2,3,4,5};
        int [] arr3 = {6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        getRomand();
    }

    /**
     * 利用math工具类输出0-10000之间的随机数
     */
    public static void getRomand() throws InterruptedException {

        for(;;){
            System.out.println((int)(Math.random()*10000)+10000);
            Thread.sleep(1000);
        }

    }


}
