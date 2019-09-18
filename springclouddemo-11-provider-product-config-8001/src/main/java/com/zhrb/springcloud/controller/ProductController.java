package com.zhrb.springcloud.controller;

import com.zhrb.springcloud.entity.Product;
import com.zhrb.springcloud.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author zhrb
 * @Date 2019/9/3 15:18
 * @Version
 */
@RestController
@RefreshScope
@RequestMapping("/product")
@MapperScan("com.zhrb.springcloud.mapper")
@Api(value = "/product",description = "商品管理 程序员小圈圈",position = 1)
public class ProductController {

    @Autowired
    private ProductService productService;

    @ApiOperation(value="product,返回boolean", notes="新增商品")
    @PostMapping(value = "/add")
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    @ApiOperation(value="id,返回boolean", notes="新增商品")
    @GetMapping(value = "/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productService.get(id);
    }

    @ApiOperation(value="product,返回boolean", notes="新增商品")
    @GetMapping(value = "/list")
    public List<Product> list() {
        List<Product> productList = productService.list();
        for (Product p :productList){
            p.setProductName(p.getProductName()+"本条数据来自8001");
        }
        return productList;
    }

/*测试修改文件常量是否立即生效*/
    @Value("${top.saler.name}")
    private String name;
    @Value("${top.saler.age}")
    private String age;
    @GetMapping(value = "/top")
    public String top() {
       return "The top saler is <b style= 'color:red'>"+age+"</b> years old,named <b style= 'color:red'>"+name+"</b>.";
    }
}
