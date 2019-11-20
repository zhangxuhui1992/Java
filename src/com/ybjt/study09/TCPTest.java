package com.ybjt.study09;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zxh
 * @create 2019-11-20 15:25
 */
public class TCPTest {
    @Test
    public void client(){
        System.out.println("客户端启动，开始发送数据。。。");
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            socket = new Socket("127.0.0.1",5639);
            outputStream = socket.getOutputStream();
            outputStream.write("你好！".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void server(){
        System.out.println("服务端启动成功！等待接受数据。。。。");
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        ByteArrayOutputStream ods = null;
        try {
            serverSocket = new ServerSocket(5639);
            accept = serverSocket.accept();
            inputStream = accept.getInputStream();
            ods = new ByteArrayOutputStream();
            byte [] dest = new byte[5];
            int lent;
            while ((lent = inputStream.read(dest)) != -1){
                ods.write(dest,0,lent);
            }
            System.out.println(ods.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(ods != null){
                try {
                    ods.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(accept != null){
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
