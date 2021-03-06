package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class SysFeeConfigEntity {
    private Long id;

    private Short thirdPlatCode;

    private String source;

    private Short payType;

    private Short payScene;

    private Short cardType;

    private Long feeRate;

    private BigDecimal freeBaseAmt;

    private Short rangeType;

    private Long branchCode;

    private String startTime;

    private String endTime;

    private Short status;

    private String remark;

    private String creator;

    private String createTime;

    private String updTime;

    private Long channelNo;

    private BigDecimal topFee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getThirdPlatCode() {
        return thirdPlatCode;
    }

    public void setThirdPlatCode(Short thirdPlatCode) {
        this.thirdPlatCode = thirdPlatCode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Short getPayType() {
        return payType;
    }

    public void setPayType(Short payType) {
        this.payType = payType;
    }

    public Short getPayScene() {
        return payScene;
    }

    public void setPayScene(Short payScene) {
        this.payScene = payScene;
    }

    public Short getCardType() {
        return cardType;
    }

    public void setCardType(Short cardType) {
        this.cardType = cardType;
    }

    public Long getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(Long feeRate) {
        this.feeRate = feeRate;
    }

    public BigDecimal getFreeBaseAmt() {
        return freeBaseAmt;
    }

    public void setFreeBaseAmt(BigDecimal freeBaseAmt) {
        this.freeBaseAmt = freeBaseAmt;
    }

    public Short getRangeType() {
        return rangeType;
    }

    public void setRangeType(Short rangeType) {
        this.rangeType = rangeType;
    }

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
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

    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime == null ? null : updTime.trim();
    }

    public Long getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(Long channelNo) {
        this.channelNo = channelNo;
    }

    public BigDecimal getTopFee() {
        return topFee;
    }

    public void setTopFee(BigDecimal topFee) {
        this.topFee = topFee;
    }
}