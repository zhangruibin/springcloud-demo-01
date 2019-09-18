package com.zhrb.springcloud.controller;

import com.zhrb.springcloud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName ProductControllerConsumer
 * @Description TODO
 * @Author zhrb
 * @Date 2019/9/4 11:57
 * @Version
 */
@RestController
@RequestMapping(value = "/consumer/product")
public class ProductConsumerController {

    //private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";
    //修改为注册中心的地址springcloud-product
    //private static final String REST_URL_PREFIX = "http://127.0.0.1:9000";
    private static final String REST_URL_PREFIX = "http://springcloud-product";
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value = "/add")
    public boolean add(Product product) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/product/add",
                product, Boolean.class);
    }

    @GetMapping(value = "/{id}")
    public Product get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/" + id,
                Product.class);
    }

    @GetMapping(value = "/list")
    public List<Product> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/list",
                List.class);
    }
}
