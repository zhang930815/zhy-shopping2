package com.iotek.service.impl;

import com.iotek.dao.ProductShelfDao;
import com.iotek.po.ProductShelf;
import com.iotek.service.ProductShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/21.
 */
@Service(value = "productShelfService")
public class ProductShelfServiceImpl implements ProductShelfService {
    @Autowired
    private ProductShelfDao productShelfDao;


    public boolean add(ProductShelf productShelf) {
        return false;
    }


    public boolean delete(ProductShelf productShelf) {
        return false;
    }


    public List<ProductShelf> queryAll() {
        return null;
    }


    public ProductShelf query(ProductShelf productShelf) {
        return null;
    }


    public boolean update(ProductShelf productShelf) {
        return false;
    }


    public boolean isUpShelf(ProductShelf productShelf) {
        if (productShelf == null) {
            return false;
        }
        ProductShelf query = productShelfDao.query(productShelf);
        if (query == null) {
            productShelfDao.add(productShelf);
        } else {
            productShelfDao.update(productShelf);
        }
        return true;
    }
}
