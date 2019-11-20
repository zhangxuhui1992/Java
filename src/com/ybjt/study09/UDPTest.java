package com.ybjt.study09;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP协议编程
 * @author zxh
 * @create 2019-11-20 16:11
 */
public class UDPTest {
    @Test
    public void send(){
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();
            String str = "我的天啊";
            byte[] bytes = str.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length,InetAddress.getLocalHost(),9090);
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(socket != null){
                socket.close();
            }
        }
    }

    @Test
    public void recive(){
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(9090);
            byte [] buff = new byte[20];
            DatagramPacket packet = new DatagramPacket(buff,0,buff.length);
            socket.receive(packet);
            System.out.println(new String(packet.getData(),0,packet.getLength()));
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(socket != null){
                socket.close();
            }
        }
    }
}
