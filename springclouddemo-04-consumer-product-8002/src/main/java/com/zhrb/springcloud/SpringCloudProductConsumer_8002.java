package com.zhrb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName SpringCloudProductConsumer_8002
 * @Description TODO
 * @Author zhrb
 * @Date 2019/9/4 11:59
 * @Version
 */
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringCloudProductConsumer_8002 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProductConsumer_8002.class, args);
    }
}
