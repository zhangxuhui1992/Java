package test.javase.staticproxy;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-02-23 20:02
 */
public class DengChaoProxy implements star {

    private DengChao dengChao;

    public DengChaoProxy(DengChao dengChao) {
        this.dengChao = dengChao;
    }

    @Override
    public void song() {
        System.out.println("布置话筒");
        dengChao.song();
    }

    @Override
    public void dance() {
        System.out.println("布置舞台");
        dengChao.dance();
    }
}
