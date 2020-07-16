package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysTerminalInventoryEntity {
    private Long id;

    private String terminalSerialNo;

    private String terminalModel;

    private Long storageBatchNo;

    private Short status;

    private String remark;

    private String creator;

    private String createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTerminalSerialNo() {
        return terminalSerialNo;
    }

    public void setTerminalSerialNo(String terminalSerialNo) {
        this.terminalSerialNo = terminalSerialNo == null ? null : terminalSerialNo.trim();
    }

    public String getTerminalModel() {
        return terminalModel;
    }

    public void setTerminalModel(String terminalModel) {
        this.terminalModel = terminalModel == null ? null : terminalModel.trim();
    }

    public Long getStorageBatchNo() {
        return storageBatchNo;
    }

    public void setStorageBatchNo(Long storageBatchNo) {
        this.storageBatchNo = storageBatchNo;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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