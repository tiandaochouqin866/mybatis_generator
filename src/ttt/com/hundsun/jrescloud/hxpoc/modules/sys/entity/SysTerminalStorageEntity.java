package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysTerminalStorageEntity {
    private Long storageBatchNo;

    private String beginSerialNo;

    private String terminalModel;

    private Short terminalCount;

    private String remark;

    private String creator;

    private String createTime;

    public Long getStorageBatchNo() {
        return storageBatchNo;
    }

    public void setStorageBatchNo(Long storageBatchNo) {
        this.storageBatchNo = storageBatchNo;
    }

    public String getBeginSerialNo() {
        return beginSerialNo;
    }

    public void setBeginSerialNo(String beginSerialNo) {
        this.beginSerialNo = beginSerialNo == null ? null : beginSerialNo.trim();
    }

    public String getTerminalModel() {
        return terminalModel;
    }

    public void setTerminalModel(String terminalModel) {
        this.terminalModel = terminalModel == null ? null : terminalModel.trim();
    }

    public Short getTerminalCount() {
        return terminalCount;
    }

    public void setTerminalCount(Short terminalCount) {
        this.terminalCount = terminalCount;
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