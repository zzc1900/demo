package com.example.demo.service.impl;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public void setInfo(String key,String value) {
        redisTemplate.opsForValue().set(key,value);
    }

    @Override
    public String getInfo(String key) {
        String str= (String) redisTemplate.opsForValue().get(key);
        return str;
    }
}
