package com.example.scriptkill.storyclue.entity;

import java.util.Date;

/**
 * @author yjj
 * @date 2022/01/10
 */
public class StoryClue {

    private Integer id;
    private String  createBy;
    private Date createDate;
    private String  updateBy;
    private Date updateDate;
    private String remarks;
    private String delFlag = "0";

    private String clueTypeId;
    private String value;
    private String imgUrl;
    private Integer opDot;
    private String password;
    private String subset;

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

    public String getClueTypeId() {
        return clueTypeId;
    }

    public void setClueTypeId(String clueTypeId) {
        this.clueTypeId = clueTypeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getOpDot() {
        return opDot;
    }

    public void setOpDot(Integer opDot) {
        this.opDot = opDot;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSubset() {
        return subset;
    }

    public void setSubset(String subset) {
        this.subset = subset;
    }

    @Override
    public String toString() {
        return "StoryClue{" +
                "id=" + id +
                ", createBy='" + createBy + '\'' +
                ", createDate=" + createDate +
                ", updateBy='" + updateBy + '\'' +
                ", updateDate=" + updateDate +
                ", remarks='" + remarks + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", clueTypeId='" + clueTypeId + '\'' +
                ", value='" + value + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", opDot=" + opDot +
                ", password='" + password + '\'' +
                ", subset='" + subset + '\'' +
                '}';
    }
}
