package com.zhrb.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigClient
 * @Description TODO
 * @Author zhrb
 * @Date 2019/9/12 11:22
 * @Version
 */
@RestController
public class ConfigClient {
    //会从github中的springcloud-config-application.yml中获取
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${server.port}")
    private String port;
    //请求访问
    @RequestMapping("/config")
    public String getConfig() {
        String content = "applicationName:" + applicationName + ", port:" +
                port;
        System.out.println("content: " + content);
        return content;
    }
}
