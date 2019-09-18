package com.zhrb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @ClassName SpringCloudProductProvider_8001
 * @Description TODO
 * @Author zhrb
 * @Date 2019/9/3 15:20
 * @Version
 */
@EnableEurekaClient
@EnableHystrix //开启 Hystrix 熔断机制的支持
//@EnableCircuitBreaker
@SpringBootApplication
public class SpringCloudProductProvider_8011{
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProductProvider_8011.class, args);
    }
}
