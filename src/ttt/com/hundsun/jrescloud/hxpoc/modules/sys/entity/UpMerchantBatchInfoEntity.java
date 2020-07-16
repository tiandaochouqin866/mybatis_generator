package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class UpMerchantBatchInfoEntity {
    private Long upBatchId;

    private String upBatchNo;

    private String upUploadFileName;

    private String upDownloadFileName;

    private String bankUploadFileName;

    private String bankUpDownloadFile;

    private String upType;

    private String states;

    private String remark;

    private String createTime;

    private String updateTime;

    public Long getUpBatchId() {
        return upBatchId;
    }

    public void setUpBatchId(Long upBatchId) {
        this.upBatchId = upBatchId;
    }

    public String getUpBatchNo() {
        return upBatchNo;
    }

    public void setUpBatchNo(String upBatchNo) {
        this.upBatchNo = upBatchNo == null ? null : upBatchNo.trim();
    }

    public String getUpUploadFileName() {
        return upUploadFileName;
    }

    public void setUpUploadFileName(String upUploadFileName) {
        this.upUploadFileName = upUploadFileName == null ? null : upUploadFileName.trim();
    }

    public String getUpDownloadFileName() {
        return upDownloadFileName;
    }

    public void setUpDownloadFileName(String upDownloadFileName) {
        this.upDownloadFileName = upDownloadFileName == null ? null : upDownloadFileName.trim();
    }

    public String getBankUploadFileName() {
        return bankUploadFileName;
    }

    public void setBankUploadFileName(String bankUploadFileName) {
        this.bankUploadFileName = bankUploadFileName == null ? null : bankUploadFileName.trim();
    }

    public String getBankUpDownloadFile() {
        return bankUpDownloadFile;
    }

    public void setBankUpDownloadFile(String bankUpDownloadFile) {
        this.bankUpDownloadFile = bankUpDownloadFile == null ? null : bankUpDownloadFile.trim();
    }

    public String getUpType() {
        return upType;
    }

    public void setUpType(String upType) {
        this.upType = upType == null ? null : upType.trim();
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states == null ? null : states.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}