package com.example.demo.bean;

import com.example.demo.bean.CacheService;

public class RedisServicempl implements CacheService {
    @Override
    public void setData(String key) {
        System.out.println("redis存储数据成功 key= " + key);
    }
}
