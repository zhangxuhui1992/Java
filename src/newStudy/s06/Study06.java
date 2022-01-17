package newStudy.s06;

/**
 * @Author zhangxuhui
 * @Date 2021/12/7
 * @email zxh_1633@163.com
 * 数组
 */
public class Study06 {
    public static void main(String[] args) throws InterruptedException {
//        int [] arr = new int[5];//会默认初始化
//        int [] arr2 = new int[]{1,2,3,4,5};
//        int [] arr3 = {6,7,8,9,10};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
//
//        getRomand();
        System.out.println(getTime(100000));
        System.out.println(getTime1(100000));
    }

    /**
     * 利用math工具类输出0-10000之间的随机数
     * 1-100 m-n
     * Math.random()*(n-m)+m
     */
    public static void getRomand() throws InterruptedException {

        for(;;){
            //System.out.println((int)(Math.random()*10000)+10000);
            System.out.println((int)((Math.random()*99)+1));
            Thread.sleep(Integer.MAX_VALUE);
        }

    }

    /**
     * 字符串拼接耗时测试
     */
    public static double getTime(int count){
        double start = System.currentTimeMillis();
        String str = "";
        for(int x = 0 ; x < count ;x++){
            str  = str +  String.valueOf(x);
        }
        System.out.println(str.length());
        double end = System.currentTimeMillis();
        return (end - start)/1000;
    }

    public static double getTime1(int count){
        double start = System.currentTimeMillis();
        StringBuilder str = new StringBuilder();
        for(int x = 0 ; x < count ;x++){
            str.append(String.valueOf(x));
        }
        System.out.println(str.length());
        double end = System.currentTimeMillis();
        return (end - start)/1000;
    }

}
