package com.homepig.dubbo.provider;

import com.homepig.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService{
    public String sayHello(String name){
        String msg = "Hello "+name;
        System.out.println(msg);
        return msg;
    }
}
