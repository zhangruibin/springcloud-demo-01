package com.zhrb.springcloud.service;

import com.zhrb.springcloud.entity.Product;

import java.util.List;

/**
 * @ClassName ProductService
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/3 15:15
 * @Version
 */
public interface ProductService {
    boolean add(Product product);
    Product get(Long id);
    List<Product> list();
}
