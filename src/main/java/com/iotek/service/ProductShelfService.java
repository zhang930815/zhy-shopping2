package com.iotek.service;

import com.iotek.po.ProductShelf;

/**
 * Created by Administrator on 2017/12/21.
 */
public interface ProductShelfService extends BaseService<ProductShelf> {
    boolean isUpShelf(ProductShelf productShelf);


}
