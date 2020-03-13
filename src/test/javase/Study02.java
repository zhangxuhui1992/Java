package test.javase;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-02-23 18:01
 */
public class Study02 {
    public static void main(String[] args) {
        int [] arr = new int[10];

        String [] strs = {"中国","北京","西安"};

        System.out.println(strs.length);

        for(String s : strs){
            System.out.println(s);
        }

        System.out.println(arr.length);

        for(int num : arr){
            System.out.println(num);
        }
    }
}
