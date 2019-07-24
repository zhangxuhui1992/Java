package com.ybjt.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @author zxh
 * @create 2019-07-24 16:50
 */
public class TestFastJSON {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        for(int i = 0;i<10;i++) {
            jsonObject.put("" + i, i);
        }
        jsonArray.add(jsonObject);
        System.out.println(JSON.toJSONString(jsonArray));
        System.out.println(JSON.toJSONString(jsonArray, SerializerFeature.DisableCircularReferenceDetect));
    }
}
