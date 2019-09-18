package com.zhrb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName ConfigServer_5001
 * @Description TODO
 * @Author zhrb
 * @Date 2019/9/12 11:02
 * @Version
 */
@EnableConfigServer//开启配置中心功能
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ConfigServer_5001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_5001.class, args);
    }
}
