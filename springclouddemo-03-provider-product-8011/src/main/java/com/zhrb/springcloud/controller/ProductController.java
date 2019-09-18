package com.zhrb.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhrb.springcloud.entity.Product;
import com.zhrb.springcloud.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author zhrb
 * @Date 2019/9/3 15:18
 * @Version
 */
@RestController
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
    //当get方法出现异常时，则会调用hystrixGet方法处理
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public Product get(@PathVariable("id") Long id) {
        //因为数据库中没有id为负值的商品，所以当有负值id传进来时，我们当做是恶意请求，或者是需要处理的特定流程来模拟
        if (id < 0){
            throw new RuntimeException("ID=" + id + "无效");
        }else {
            return productService.get(id);
        }
    }

    @ApiOperation(value="product,返回boolean", notes="新增商品")
    @GetMapping(value = "/list")
    public List<Product> list() {
        List<Product> productList = productService.list();
        for (Product p :productList){
            p.setProductName(p.getProductName()+"本条数据来自8011");
        }
        return productList;
    }
    public Product fallbackMethod( Long id) {
        Product p = new Product();
        p.setPid(id);
        p.setProductName("无效，进行服务降级处理");
        p.setDbSource("!");
        return p;
    }
}
