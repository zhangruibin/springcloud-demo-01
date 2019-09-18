package com.zhrb.springcloud.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName Product
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/3 14:26
 * @Version
 */
@Data
@ToString
public class Product {

    //主键
    private Long pid;

    //产品名称
    private String productName;

    // 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    private String dbSource;
}
