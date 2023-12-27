package com.example.demo.bean;

import com.example.demo.bean.CacheService;

public class LocalServicempl implements CacheService {
    @Override
    public void setData(String key) {
        System.out.println("本地存储存储数据成功 key= " + key);
    }
}
