package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class TFundSerialQRBakEntity {
    private BigDecimal tradSerialNo;

    private Long branchCode;

    private String branchSimpleName;

    private Long terminalCode;

    private String terminalSerialNo;

    private Short thirdPlatCode;

    private Short payType;

    private Short payScene;

    private Short transCode;

    private BigDecimal orderAmt;

    private String tradTime;

    private String buyerAuthCode;

    private String payAccountNo;

    private String bankCardType;

    private String goodsDesc;

    private String currencyCode;

    private BigDecimal exchangeRate;

    private BigDecimal originalRelatedSerial;

    private String reqSerialNo;

    private String reqTime;

    private Short payStatus;

    private Long feeRateCode;

    private BigDecimal thirdPlatFee;

    private Short thirdClearStatus;

    private String thirdClearTime;

    private String createTime;

    private String updTime;

    private BigDecimal cashAmt;

    private BigDecimal voucherAmt;

    private BigDecimal clearBaseAmt;

    private BigDecimal branchFee;

    private Short freeFlag;

    private Short freeType;

    private BigDecimal freeAmt;

    private BigDecimal finalClearSerial;

    private String clearingRule;

    private Long channelNo;

    private String settleKey;

    private String channelSerialNo;

    public BigDecimal getTradSerialNo() {
        return tradSerialNo;
    }

    public void setTradSerialNo(BigDecimal tradSerialNo) {
        this.tradSerialNo = tradSerialNo;
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

    public Long getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(Long terminalCode) {
        this.terminalCode = terminalCode;
    }

    public String getTerminalSerialNo() {
        return terminalSerialNo;
    }

    public void setTerminalSerialNo(String terminalSerialNo) {
        this.terminalSerialNo = terminalSerialNo == null ? null : terminalSerialNo.trim();
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

    public String getBuyerAuthCode() {
        return buyerAuthCode;
    }

    public void setBuyerAuthCode(String buyerAuthCode) {
        this.buyerAuthCode = buyerAuthCode == null ? null : buyerAuthCode.trim();
    }

    public String getPayAccountNo() {
        return payAccountNo;
    }

    public void setPayAccountNo(String payAccountNo) {
        this.payAccountNo = payAccountNo == null ? null : payAccountNo.trim();
    }

    public String getBankCardType() {
        return bankCardType;
    }

    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType == null ? null : bankCardType.trim();
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal getOriginalRelatedSerial() {
        return originalRelatedSerial;
    }

    public void setOriginalRelatedSerial(BigDecimal originalRelatedSerial) {
        this.originalRelatedSerial = originalRelatedSerial;
    }

    public String getReqSerialNo() {
        return reqSerialNo;
    }

    public void setReqSerialNo(String reqSerialNo) {
        this.reqSerialNo = reqSerialNo == null ? null : reqSerialNo.trim();
    }

    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime == null ? null : reqTime.trim();
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
    }

    public Long getFeeRateCode() {
        return feeRateCode;
    }

    public void setFeeRateCode(Long feeRateCode) {
        this.feeRateCode = feeRateCode;
    }

    public BigDecimal getThirdPlatFee() {
        return thirdPlatFee;
    }

    public void setThirdPlatFee(BigDecimal thirdPlatFee) {
        this.thirdPlatFee = thirdPlatFee;
    }

    public Short getThirdClearStatus() {
        return thirdClearStatus;
    }

    public void setThirdClearStatus(Short thirdClearStatus) {
        this.thirdClearStatus = thirdClearStatus;
    }

    public String getThirdClearTime() {
        return thirdClearTime;
    }

    public void setThirdClearTime(String thirdClearTime) {
        this.thirdClearTime = thirdClearTime == null ? null : thirdClearTime.trim();
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

    public BigDecimal getBranchFee() {
        return branchFee;
    }

    public void setBranchFee(BigDecimal branchFee) {
        this.branchFee = branchFee;
    }

    public Short getFreeFlag() {
        return freeFlag;
    }

    public void setFreeFlag(Short freeFlag) {
        this.freeFlag = freeFlag;
    }

    public Short getFreeType() {
        return freeType;
    }

    public void setFreeType(Short freeType) {
        this.freeType = freeType;
    }

    public BigDecimal getFreeAmt() {
        return freeAmt;
    }

    public void setFreeAmt(BigDecimal freeAmt) {
        this.freeAmt = freeAmt;
    }

    public BigDecimal getFinalClearSerial() {
        return finalClearSerial;
    }

    public void setFinalClearSerial(BigDecimal finalClearSerial) {
        this.finalClearSerial = finalClearSerial;
    }

    public String getClearingRule() {
        return clearingRule;
    }

    public void setClearingRule(String clearingRule) {
        this.clearingRule = clearingRule == null ? null : clearingRule.trim();
    }

    public Long getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(Long channelNo) {
        this.channelNo = channelNo;
    }

    public String getSettleKey() {
        return settleKey;
    }

    public void setSettleKey(String settleKey) {
        this.settleKey = settleKey == null ? null : settleKey.trim();
    }

    public String getChannelSerialNo() {
        return channelSerialNo;
    }

    public void setChannelSerialNo(String channelSerialNo) {
        this.channelSerialNo = channelSerialNo == null ? null : channelSerialNo.trim();
    }
}