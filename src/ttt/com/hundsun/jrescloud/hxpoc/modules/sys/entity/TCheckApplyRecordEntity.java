package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class TCheckApplyRecordEntity {
    private BigDecimal applySerialNo;

    private Long channelNo;

    private String applyDate;

    private Short applyStatus;

    private String finishTime;

    private Short checkStatus;

    private String checkFilePath;

    private String checkFileName;

    private String checkFileStartTime;

    private String checkFileEndTime;

    private String createTime;

    private Short thirdPlatCode;

    public BigDecimal getApplySerialNo() {
        return applySerialNo;
    }

    public void setApplySerialNo(BigDecimal applySerialNo) {
        this.applySerialNo = applySerialNo;
    }

    public Long getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(Long channelNo) {
        this.channelNo = channelNo;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate == null ? null : applyDate.trim();
    }

    public Short getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(Short applyStatus) {
        this.applyStatus = applyStatus;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime == null ? null : finishTime.trim();
    }

    public Short getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Short checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getCheckFilePath() {
        return checkFilePath;
    }

    public void setCheckFilePath(String checkFilePath) {
        this.checkFilePath = checkFilePath == null ? null : checkFilePath.trim();
    }

    public String getCheckFileName() {
        return checkFileName;
    }

    public void setCheckFileName(String checkFileName) {
        this.checkFileName = checkFileName == null ? null : checkFileName.trim();
    }

    public String getCheckFileStartTime() {
        return checkFileStartTime;
    }

    public void setCheckFileStartTime(String checkFileStartTime) {
        this.checkFileStartTime = checkFileStartTime == null ? null : checkFileStartTime.trim();
    }

    public String getCheckFileEndTime() {
        return checkFileEndTime;
    }

    public void setCheckFileEndTime(String checkFileEndTime) {
        this.checkFileEndTime = checkFileEndTime == null ? null : checkFileEndTime.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Short getThirdPlatCode() {
        return thirdPlatCode;
    }

    public void setThirdPlatCode(Short thirdPlatCode) {
        this.thirdPlatCode = thirdPlatCode;
    }
}