package com.zhrb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName ConfigClient_8080
 * @Description TODO
 * @Author zhrb
 * @Date 2019/9/12 11:27
 * @Version
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ConfigClient_8080 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient_8080.class, args);
    }
}
