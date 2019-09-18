package com.zhrb.springcloud.service;

import com.zhrb.springcloud.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @ClassName FeignFallBack
 * @Description TODO
 * @Author zhrb
 * @Date 2019/9/9 10:42
 * @Version
 */
@Component
public class FeignFallBack implements ConsumerService{
    Product defultFallback = new Product();
    @Override
    public Product get(Long id) {
        return defultFallback;
    }

    @Override
    public List<Product> list() {
        System.out.println("服务中断，降级到本方法，控制台打印bilibilibiibilibilibilib ili");

        List list = new ArrayList(1);
        list.add(defultFallback);
        System.out.println("服务中断，降级到本方法，控制台打印bilibilibiibilibilibilib ili");
        return  list;
    }

    @Override
    public boolean add(Product product) {
        return false;
    }

}

