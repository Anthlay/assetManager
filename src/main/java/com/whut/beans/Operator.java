package com.whut.beans;

public class Operator {

    private int operatorId;
    private String operatorName;
    private   String company;
    private   String department;
    private String asset;

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "operatorId=" + operatorId +
                ", operatorName='" + operatorName + '\'' +
                ", company='" + company + '\'' +
                ", department='" + department + '\'' +
                ", asset='" + asset + '\'' +
                '}';
    }
}
