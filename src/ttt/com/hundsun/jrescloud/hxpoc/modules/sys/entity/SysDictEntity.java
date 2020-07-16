package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysDictEntity {
    private Long id;

    private String dictCode;

    private String dictDesc;

    private String dictitemCode;

    private String parentCode;

    private String dictitemDesc;

    private Long sortNum;

    private String creator;

    private String createTime;

    private String updTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    public String getDictDesc() {
        return dictDesc;
    }

    public void setDictDesc(String dictDesc) {
        this.dictDesc = dictDesc;
    }

    public String getDictitemCode() {
        return dictitemCode;
    }

    public void setDictitemCode(String dictitemCode) {
        this.dictitemCode = dictitemCode == null ? null : dictitemCode.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public String getDictitemDesc() {
        return dictitemDesc;
    }

    public void setDictitemDesc(String dictitemDesc) {
        this.dictitemDesc = dictitemDesc;
    }

    public Long getSortNum() {
        return sortNum;
    }

    public void setSortNum(Long sortNum) {
        this.sortNum = sortNum;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime == null ? null : updTime.trim();
    }
}