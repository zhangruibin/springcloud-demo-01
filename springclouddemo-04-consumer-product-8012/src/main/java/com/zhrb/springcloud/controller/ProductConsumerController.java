package com.zhrb.springcloud.controller;

import com.zhrb.springcloud.entity.Product;
import com.zhrb.springcloud.service.ConsumerService;
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

    @Autowired(required = false)
    private ConsumerService consumerService;

    @PostMapping(value = "/add")
    public boolean add(Product product) {
        return consumerService.add(product);
    }

    @GetMapping(value = "/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return consumerService.get(id);
    }

    @GetMapping(value = "/list")
    public List<Product> list() {
        return consumerService.list();
    }
}
