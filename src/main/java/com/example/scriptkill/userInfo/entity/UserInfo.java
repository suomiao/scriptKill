package com.example.scriptkill.userInfo.entity;

import java.util.Date;

public class UserInfo {
    private Integer id;
    private String  createBy;
    private Date createDate;
    private String  updateBy;
    private Date updateDate;
    private String remarks;
    private String delFlag;

    private String userName;
    private String password;
    private Integer sex;
    private Integer grade;
    private Integer countIntegral;
    private Integer newIntegral;
    private String accountNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getCountIntegral() {
        return countIntegral;
    }

    public void setCountIntegral(Integer countIntegral) {
        this.countIntegral = countIntegral;
    }

    public Integer getNewIntegral() {
        return newIntegral;
    }

    public void setNewIntegral(Integer newIntegral) {
        this.newIntegral = newIntegral;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", createBy='" + createBy + '\'' +
                ", createDate=" + createDate +
                ", updateBy='" + updateBy + '\'' +
                ", updateDate=" + updateDate +
                ", remarks='" + remarks + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", grade=" + grade +
                ", countIntegral=" + countIntegral +
                ", newIntegral=" + newIntegral +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
