package com.zhrb.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName EurekaServer_9002
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/5 9:02
 * @Version
 */
@RestController
@EnableEurekaServer
@EnableEurekaClient
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class EurekaServer_9002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_9002.class, args);
    }
}
