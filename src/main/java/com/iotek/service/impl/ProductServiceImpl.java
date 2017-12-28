package com.iotek.service.impl;


import com.iotek.dao.ProductDao;
import com.iotek.po.Product;
import com.iotek.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/17.
 */
@Service(value = "productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;


    public boolean add(Product product) {
        if (product == null) {
            return false;
        }
        return productDao.add(product);
    }


    public boolean delete(Product product) {
        return productDao.delete(product);
    }


    public List<Product> queryAll() {
        return productDao.queryAll();
    }


    public Product query(Product product) {
        return productDao.query(product);
    }


    public boolean update(Product product) {
        return productDao.update(product);
    }

}
