package com.ybjt.study09;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author zxh
 * @create 2019-11-20 14:56
 */
public class InetAddrssTest {
    @Test
    public void test(){
        InetAddress address = null;
        try {
            address = InetAddress.getByName("www.baidu.com");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(address);
        String hostName = address.getHostName();
        String hostAddress = address.getHostAddress();
        System.out.println(hostName);
        System.out.println(hostAddress);
    }
}
