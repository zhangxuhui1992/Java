package com.ybjt.study07;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * @author zxh
 * @create 2019-11-15 15:36
 */
public class FastJsonTest {
    @Test
    public void test(){
        JSONObject obj = new JSONObject();
        obj.put("java","软件园");
        System.out.println(obj);
    }
}
