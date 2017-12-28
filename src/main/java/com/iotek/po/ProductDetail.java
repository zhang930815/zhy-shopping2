package com.iotek.po;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/9.
 */
public class ProductDetail implements Serializable {
    private Long id;
    private Long productId;
    private String smallImage;
    private String bigImage;
    private String productCaption;
    private Product product; //一个商品详情对应一个商品

    public ProductDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public String getBigImage() {
        return bigImage;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage;
    }

    public String getProductCaption() {
        return productCaption;
    }

    public void setProductCaption(String productCaption) {
        this.productCaption = productCaption;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductDetail{" +
                "id=" + id +
                ", productId=" + productId +
                ", smallImage='" + smallImage + '\'' +
                ", bigImage='" + bigImage + '\'' +
                ", productCaption='" + productCaption + '\'' +
                ", product=" + product +
                '}';
    }
}

