package com.example.scriptkill.storycharacter.entity;

import java.util.Date;

/**
 * @author yjj
 * @date 2022/01/10
 */
public class StoryCharacter {
    private Integer id;
    private String  createBy;
    private Date createDate;
    private String  updateBy;
    private Date updateDate;
    private String remarks;
    private String delFlag = "0";

    private String characterName;
    private String characterSynopsis;
    private Integer characterSex;
    private Integer characterAge;
    private Integer configurationId;
    private String imgUrl;

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

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterSynopsis() {
        return characterSynopsis;
    }

    public void setCharacterSynopsis(String characterSynopsis) {
        this.characterSynopsis = characterSynopsis;
    }

    public Integer getCharacterSex() {
        return characterSex;
    }

    public void setCharacterSex(Integer characterSex) {
        this.characterSex = characterSex;
    }

    public Integer getCharacterAge() {
        return characterAge;
    }

    public void setCharacterAge(Integer characterAge) {
        this.characterAge = characterAge;
    }

    public Integer getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(Integer configurationId) {
        this.configurationId = configurationId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "StoryCharacter{" +
                "id=" + id +
                ", createBy='" + createBy + '\'' +
                ", createDate=" + createDate +
                ", updateBy='" + updateBy + '\'' +
                ", updateDate=" + updateDate +
                ", remarks='" + remarks + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", characterName='" + characterName + '\'' +
                ", characterSynopsis='" + characterSynopsis + '\'' +
                ", characterSex=" + characterSex +
                ", characterAge=" + characterAge +
                ", configurationId=" + configurationId +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
