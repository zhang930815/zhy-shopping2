package com.iotek.po;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/11/12.
 */
public class Comment implements Serializable{
    private Long id;
    private Long orderItemId;
    private String commentCaption;
    private Timestamp commentCreatTime;

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getCommentCaption() {
        return commentCaption;
    }

    public void setCommentCaption(String commentCaption) {
        this.commentCaption = commentCaption;
    }

    public Timestamp getCommentCreatTime() {
        return commentCreatTime;
    }

    public void setCommentCreatTime(Timestamp commentCreatTime) {
        this.commentCreatTime = commentCreatTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", orderItemId=" + orderItemId +
                ", commentCaption='" + commentCaption + '\'' +
                ", commentCreatTime=" + commentCreatTime +
                '}';
    }
}
