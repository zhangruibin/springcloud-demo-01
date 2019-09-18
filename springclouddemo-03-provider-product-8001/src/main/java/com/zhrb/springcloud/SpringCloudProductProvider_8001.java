package com.zhrb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName SpringCloudProductProvider_8001
 * @Description TODO
 * @Author zhrb
 * @Date 2019/9/3 15:20
 * @Version
 */
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudProductProvider_8001{
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProductProvider_8001.class, args);
    }
}
