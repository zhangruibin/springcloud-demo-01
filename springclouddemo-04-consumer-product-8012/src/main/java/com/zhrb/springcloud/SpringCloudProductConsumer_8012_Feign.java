package com.zhrb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName SpringCloudProductConsumer_8012
 * @Description TODO
 * @Author zhrb
 * @Date 2019/9/4 11:59
 * @Version
 */

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaServer
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudProductConsumer_8012_Feign {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProductConsumer_8012_Feign.class, args);
    }
}
