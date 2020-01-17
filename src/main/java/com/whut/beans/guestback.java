package com.whut.beans;
//用户反馈
public class guestback {
  private int  userID;
  private int  goodsId;
  private int level;//客户评价星级

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "guestback{" +
                "userID=" + userID +
                ", goodsId=" + goodsId +
                ", level=" + level +
                '}';
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
