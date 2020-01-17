package com.whut.beans;

import java.util.Date;

//用户交易记录表
public class userCost {
    private int userID;//用户编号
    private String  goodsName;//交易商品名
    private Date date;//交易时间
    private  userInfo user;
    private  int cost;

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public userInfo getUser() {
        return user;
    }

    public void setUser(userInfo user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
