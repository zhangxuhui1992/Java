package new2023.juc;

import cn.hutool.core.io.NioUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author zhangxuhui
 * @Date 2023/3/23
 * @email zxh_1633@163.com
 */
public class NIOTest {

    static Log log = LogFactory.get();
    public static void main(String[] args) throws FileNotFoundException {

        log.info("start");
        //IoUtil.read(new FileInputStream("/Users/zhangxuhui/Downloads/NemuPlayerInstaller-1.9.57-v2.dmg").getChannel());
        NioUtil.read(new FileInputStream("/Users/zhangxuhui/Downloads/NemuPlayerInstaller-1.9.57-v2.dmg").getChannel());
        log.info("end");
    }
}
