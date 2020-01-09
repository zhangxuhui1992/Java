package com.study;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author zxh
 * @create 2020-01-08 10:31
 */
public class DosCommder {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("java -version");
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            //杀死子进程。
            process.destroy();
            System.out.println("Process exitValue: " + process.exitValue());
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
