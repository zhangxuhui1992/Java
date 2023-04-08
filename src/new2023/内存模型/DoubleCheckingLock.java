package new2023.内存模型;

/**
 * @Author zhangxuhui
 * @Date 2023/4/8
 * @email zxh_1633@163.com
 */
public class DoubleCheckingLock {
    public static void main(String[] args) {
        for (int x = 0 ; x < 1000; x++){
            new Thread(()->{
                System.out.println(DCL.getIns());
            }).start();
        }
    }
}

class DCL{
    private static volatile DCL ins = null;
    private DCL(){}
    public static DCL getIns(){
        if(ins == null){
            synchronized (DCL.class){
                if(ins == null){
                    ins = new DCL();
                }
            }
        }
        return ins;
    }

    @Override
    public String toString() {
        return "DCL " + this.hashCode();
    }
}
