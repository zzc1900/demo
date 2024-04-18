package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping("/zzc")
    public void test() {
        System.out.println(testService.getInfo("zzc"));
        testService.setInfo("zzc","123456");
        System.out.println(testService.getInfo("zzc"));
    }
}
