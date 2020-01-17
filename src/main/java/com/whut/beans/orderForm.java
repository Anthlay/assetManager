package com.whut.beans;

import java.util.Date;
import java.util.Timer;

public class orderForm {
    private int orderId;//下单编号
    private int goodId;//商品编号
    private  String userName;//用户名
    private Date time;//下单时间
    private   int count;//商品数量
    private int price;//商品金额
    private int petId;
    private int userId;


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getGoodsId() {
        return goodId;
    }

    public void setGoodsId(int goodsId) {
        this.goodId = goodsId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "orderForm{" +
                "orderId=" + orderId +
                ", goodsId=" + goodId +
                ", userName='" + userName + '\'' +
                ", time=" + time +
                ", count=" + count +
                ", price=" + price +
                ", petId=" + petId +
                ", userId=" + userId +
                '}';
    }
}
