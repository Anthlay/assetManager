package com.whut.beans;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Assset {
    private int assetId;
    private  String assetName;
    private  int assetCount;//数量
    private  String assetOperator;//状态，有无操作人员
    private int assetPrice;//
    private  String IMG;
    private String assetCate;//类型
    private String assetAddress;

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public int getAssetCount() {
        return assetCount;
    }

    public void setAssetCount(int assetCount) {
        this.assetCount = assetCount;
    }

    public String getAssetOperator() {
        return assetOperator;
    }

    public void setAssetOperator(String assetOperator) {
        this.assetOperator = assetOperator;
    }

    public int getAssetPrice() {
        return assetPrice;
    }

    public void setAssetPrice(int assetPrice) {
        this.assetPrice = assetPrice;
    }

    public String getIMG() {
        return IMG;
    }

    public void setIMG(String IMG) {
        this.IMG = IMG;
    }

    public String getAssetCate() {
        return assetCate;
    }

    public void setAssetCate(String assetCate) {
        this.assetCate = assetCate;
    }

    public String getAssetAddress() {
        return assetAddress;
    }

    public void setAssetAddress(String assetAddress) {
        this.assetAddress = assetAddress;
    }

    @Override
    public String toString() {
        return "Assset{" +
                "assetId=" + assetId +
                ", assetName='" + assetName + '\'' +
                ", assetCount=" + assetCount +
                ", assetOperator='" + assetOperator + '\'' +
                ", assetPrice=" + assetPrice +
                ", IMG='" + IMG + '\'' +
                ", assetCate='" + assetCate + '\'' +
                ", assetAddress='" + assetAddress + '\'' +
                '}';
    }
}
