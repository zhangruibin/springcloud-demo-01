package com.zhrb.springcloud.mapper;

import com.zhrb.springcloud.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName ProductMapper
 * @Description TODO
 * @Author Administrator
 * @Date 2019/9/3 14:55
 * @Version
 */
@Mapper
public interface ProductMapper {
    Product findById(Long pid);
    List<Product> findAll();
    boolean addProduct(Product product);
}
