package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class TTradeProfitEntity {
    private BigDecimal profitSerialNo;

    private BigDecimal tradSerialNo;

    private BigDecimal originalRelatedSerial;

    private Long branchCode;

    private String branchSimpleName;

    private BigDecimal orderAmt;

    private String tradTime;

    private Short thirdPlatCode;

    private Short payType;

    private Short payScene;

    private Short transCode;

    private Long incomeBranch;

    private Long incomeBranchLevel;

    private Long feeRateCode;

    private BigDecimal inFee;

    private BigDecimal outFee;

    private BigDecimal clearAmt;

    private Short profitType;

    private BigDecimal clearBatchNo;

    private String clearingRule;

    private String clearTime;

    private Short clearResult;

    private String createTime;

    private BigDecimal cashAmt;

    private BigDecimal voucherAmt;

    private BigDecimal clearBaseAmt;

    private String bankCardType;

    private Long channelNo;

    public BigDecimal getProfitSerialNo() {
        return profitSerialNo;
    }

    public void setProfitSerialNo(BigDecimal profitSerialNo) {
        this.profitSerialNo = profitSerialNo;
    }

    public BigDecimal getTradSerialNo() {
        return tradSerialNo;
    }

    public void setTradSerialNo(BigDecimal tradSerialNo) {
        this.tradSerialNo = tradSerialNo;
    }

    public BigDecimal getOriginalRelatedSerial() {
        return originalRelatedSerial;
    }

    public void setOriginalRelatedSerial(BigDecimal originalRelatedSerial) {
        this.originalRelatedSerial = originalRelatedSerial;
    }

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchSimpleName() {
        return branchSimpleName;
    }

    public void setBranchSimpleName(String branchSimpleName) {
        this.branchSimpleName = branchSimpleName;
    }

    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
    }

    public String getTradTime() {
        return tradTime;
    }

    public void setTradTime(String tradTime) {
        this.tradTime = tradTime == null ? null : tradTime.trim();
    }

    public Short getThirdPlatCode() {
        return thirdPlatCode;
    }

    public void setThirdPlatCode(Short thirdPlatCode) {
        this.thirdPlatCode = thirdPlatCode;
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

    public Short getTransCode() {
        return transCode;
    }

    public void setTransCode(Short transCode) {
        this.transCode = transCode;
    }

    public Long getIncomeBranch() {
        return incomeBranch;
    }

    public void setIncomeBranch(Long incomeBranch) {
        this.incomeBranch = incomeBranch;
    }

    public Long getIncomeBranchLevel() {
        return incomeBranchLevel;
    }

    public void setIncomeBranchLevel(Long incomeBranchLevel) {
        this.incomeBranchLevel = incomeBranchLevel;
    }

    public Long getFeeRateCode() {
        return feeRateCode;
    }

    public void setFeeRateCode(Long feeRateCode) {
        this.feeRateCode = feeRateCode;
    }

    public BigDecimal getInFee() {
        return inFee;
    }

    public void setInFee(BigDecimal inFee) {
        this.inFee = inFee;
    }

    public BigDecimal getOutFee() {
        return outFee;
    }

    public void setOutFee(BigDecimal outFee) {
        this.outFee = outFee;
    }

    public BigDecimal getClearAmt() {
        return clearAmt;
    }

    public void setClearAmt(BigDecimal clearAmt) {
        this.clearAmt = clearAmt;
    }

    public Short getProfitType() {
        return profitType;
    }

    public void setProfitType(Short profitType) {
        this.profitType = profitType;
    }

    public BigDecimal getClearBatchNo() {
        return clearBatchNo;
    }

    public void setClearBatchNo(BigDecimal clearBatchNo) {
        this.clearBatchNo = clearBatchNo;
    }

    public String getClearingRule() {
        return clearingRule;
    }

    public void setClearingRule(String clearingRule) {
        this.clearingRule = clearingRule == null ? null : clearingRule.trim();
    }

    public String getClearTime() {
        return clearTime;
    }

    public void setClearTime(String clearTime) {
        this.clearTime = clearTime == null ? null : clearTime.trim();
    }

    public Short getClearResult() {
        return clearResult;
    }

    public void setClearResult(Short clearResult) {
        this.clearResult = clearResult;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public BigDecimal getCashAmt() {
        return cashAmt;
    }

    public void setCashAmt(BigDecimal cashAmt) {
        this.cashAmt = cashAmt;
    }

    public BigDecimal getVoucherAmt() {
        return voucherAmt;
    }

    public void setVoucherAmt(BigDecimal voucherAmt) {
        this.voucherAmt = voucherAmt;
    }

    public BigDecimal getClearBaseAmt() {
        return clearBaseAmt;
    }

    public void setClearBaseAmt(BigDecimal clearBaseAmt) {
        this.clearBaseAmt = clearBaseAmt;
    }

    public String getBankCardType() {
        return bankCardType;
    }

    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType == null ? null : bankCardType.trim();
    }

    public Long getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(Long channelNo) {
        this.channelNo = channelNo;
    }
}