package com.zhrb.springcloud.service;

import com.zhrb.springcloud.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassName ConsumerService
 * @Description TODO
 * @Author zhrb
 * @Date 2019/9/6 16:49
 * @Version
 */
@FeignClient(value = "springcloud-product",fallback = FeignFallBack.class)
//@Service
public interface ConsumerService {
    @RequestMapping(value = "/product/get/{id}",method = RequestMethod.GET)
    Product get(Long id);
    @RequestMapping(value = "/product/list",method = RequestMethod.GET)
    List<Product> list();
    @RequestMapping(value = "/product/add",method = RequestMethod.POST)
    boolean add(Product product);
}

