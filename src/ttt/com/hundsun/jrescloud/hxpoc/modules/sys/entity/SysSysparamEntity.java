package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysSysparamEntity {
    private Long id;

    private String sysparamCode;

    private String sysparamValue;

    private Short sysparamType;

    private String sysparamDesc;

    private String creator;

    private String createTime;

    private String updTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSysparamCode() {
        return sysparamCode;
    }

    public void setSysparamCode(String sysparamCode) {
        this.sysparamCode = sysparamCode == null ? null : sysparamCode.trim();
    }

    public String getSysparamValue() {
        return sysparamValue;
    }

    public void setSysparamValue(String sysparamValue) {
        this.sysparamValue = sysparamValue == null ? null : sysparamValue.trim();
    }

    public Short getSysparamType() {
        return sysparamType;
    }

    public void setSysparamType(Short sysparamType) {
        this.sysparamType = sysparamType;
    }

    public String getSysparamDesc() {
        return sysparamDesc;
    }

    public void setSysparamDesc(String sysparamDesc) {
        this.sysparamDesc = sysparamDesc;
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