package com.example.scriptkill.characterstory.entity;

import java.util.Date;

/**
 * @author yjj
 * @date 2022/01/10
 */
public class CharacterStory {
    private Integer id;
    private String  createBy;
    private Date createDate;
    private String  updateBy;
    private Date updateDate;
    private String remarks;
    private String delFlag = "0";

    private Integer storyCharacterId;
    private Integer storyLine;
    private String characterLineName;
    private String characterStory;
    private String status;

    /**
     * Id
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * Id
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 创建人
     * @return
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建日期
     * @return
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建日期
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 修改人
     * @return
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 修改人
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 修改日期
     * @return
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 修改日期
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 备注
     * @return
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 备注
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 软删除
     * @return
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 软删除
     * @param delFlag
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 故事人物id
     * @return
     */
    public Integer getStoryCharacterId() {
        return storyCharacterId;
    }

    /**
     * 故事人物id
     * @param storyCharacterId
     */
    public void setStoryCharacterId(Integer storyCharacterId) {
        this.storyCharacterId = storyCharacterId;
    }

    /**
     * 故事线顺序
     * @return
     */
    public Integer getStoryLine() {
        return storyLine;
    }

    /**
     * 故事线顺序
     * @param storyLine
     */
    public void setStoryLine(Integer storyLine) {
        this.storyLine = storyLine;
    }

    /**
     * 故事线名称
     * @return
     */
    public String getCharacterLineName() {
        return characterLineName;
    }

    /**
     * 故事线名称
     * @param characterLineName
     */
    public void setCharacterLineName(String characterLineName) {
        this.characterLineName = characterLineName;
    }

    /**
     * 人物任务/人物故事
     * @return
     */
    public String getCharacterStory() {
        return characterStory;
    }

    /**
     * 人物任务/人物故事
     * @param characterStory
     */
    public void setCharacterStory(String characterStory) {
        this.characterStory = characterStory;
    }

    /**
     *  1任务/0故事
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     *  1任务/0故事
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CharacterStory{" +
                "id=" + id +
                ", createBy='" + createBy + '\'' +
                ", createDate=" + createDate +
                ", updateBy='" + updateBy + '\'' +
                ", updateDate=" + updateDate +
                ", remarks='" + remarks + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", storyCharacterId=" + storyCharacterId +
                ", storyLine=" + storyLine +
                ", characterLineName='" + characterLineName + '\'' +
                ", characterStory='" + characterStory + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
