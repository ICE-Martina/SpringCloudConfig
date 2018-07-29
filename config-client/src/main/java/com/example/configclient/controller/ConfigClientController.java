package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * config client控制器
 * 返回从配置中心读取的foo变量的值
 */
@RestController
public class ConfigClientController {
    @Value("${foo}")
    String foo;
    @RequestMapping("/config-client")
    public String configclient(){
        return foo;
    }
}
