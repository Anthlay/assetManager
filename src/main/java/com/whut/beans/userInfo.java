package com.whut.beans;

import java.util.List;

public class userInfo {
    private int userId;//编号
    private  String userName;//用户名
    private String  passWord;//用户密码
    private String  phone;//用户电话
    private String address;//用户地址
    private int account;//账户金额
    private int  isMember;//会员标志,1代表是会员，0代表是普通用户
    private List<userCost> userCostItems;//用户消费信息

    @Override
    public String toString() {
        return "userInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", account=" + account +
                ", isMember=" + isMember +
                ", userCostItems=" + userCostItems +
                '}';
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIsMember() {
        return isMember;
    }

    public void setIsMember(int isMember) {
        this.isMember = isMember;
    }

    public String getPassWord() {

        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<userCost> getUserCostItems() {
        return userCostItems;
    }

    public void setUserCostItems(List<userCost> userCostItems) {
        this.userCostItems = userCostItems;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}