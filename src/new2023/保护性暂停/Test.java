package new2023.保护性暂停;

import cn.hutool.http.HttpUtil;

/**
 * @Author zhangxuhui
 * @Date 2023/4/5
 * @email zxh_1633@163.com
 */
public class Test {
    public static void main(String[] args) {
        GuardeObject gd = new GuardeObject();
        //get
        new Thread(()->{
            byte[] s = (byte[]) gd.get();
            System.out.println("t1 get "+ s);
        },"t1").start();
        //set
        new Thread(()->{
            byte[] s = HttpUtil.downloadBytes("https://img1.baidu.com/it/u=413643897,2296924942&fm=253&fmt=auto&app=138&f=JPEG?w=800&h=500");
            gd.complete(s);
            System.out.println("t2 set response");
        },"t2").start();
    }
}
