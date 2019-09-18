package com.zhrb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName ZuulGateway_6000
 * @Description TODO
 * @Author zhrb
 * @Date 2019/9/10 17:21
 * @Version
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ZuulGateway_7777 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway_7777.class,args);
    }
}
