package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysTradKeyFieldEntity {
    private Short transCode;

    private String keyFieldCode;

    private String remark;

    private String creator;

    private String createTime;

    public Short getTransCode() {
        return transCode;
    }

    public void setTransCode(Short transCode) {
        this.transCode = transCode;
    }

    public String getKeyFieldCode() {
        return keyFieldCode;
    }

    public void setKeyFieldCode(String keyFieldCode) {
        this.keyFieldCode = keyFieldCode == null ? null : keyFieldCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
}