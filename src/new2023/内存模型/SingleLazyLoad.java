package new2023.内存模型;

/**
 * @Author zhangxuhui
 * @Date 2023/4/8
 * @email zxh_1633@163.com
 */
public class SingleLazyLoad {
    public static void main(String[] args) {
        LazyLoad.ins();
    }
}

class LazyLoad{
    private LazyLoad(){
        System.out.println("0");
    }
    private static class lazy{
        static final LazyLoad ins = new LazyLoad();
    }

    public static LazyLoad ins(){
        return lazy.ins;
    }
}
