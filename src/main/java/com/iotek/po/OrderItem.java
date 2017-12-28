package com.iotek.po;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/10.
 */
public class OrderItem implements Serializable {
    private Long id;
    private Long orderListId;
    private Long productId;
    private Long productNumber;
    private Integer isSendOut;
    private Long addressId;
    private Integer orderItemState;
    private String itemNo;
    private Product product;

    public Product getProduct() {
        return product;
    }

    public OrderItem() {
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderListId() {
        return orderListId;
    }

    public void setOrderListId(Long orderListId) {
        this.orderListId = orderListId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    public Integer getIsSendOut() {
        return isSendOut;
    }

    public void setIsSendOut(Integer isSendOut) {
        this.isSendOut = isSendOut;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Integer getOrderItemState() {
        return orderItemState;
    }

    public void setOrderItemState(Integer orderItemState) {
        this.orderItemState = orderItemState;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", orderListId=" + orderListId +
                ", productId=" + productId +
                ", productNumber=" + productNumber +
                ", isSendOut=" + isSendOut +
                ", addressId=" + addressId +
                ", orderItemState=" + orderItemState +
                ", itemNo='" + itemNo + '\'' +
                ", product=" + product +
                '}';
    }
}
