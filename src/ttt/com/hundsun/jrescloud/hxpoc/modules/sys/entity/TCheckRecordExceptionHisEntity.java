package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class TCheckRecordExceptionHisEntity {
    private BigDecimal exceptionSerialNo;

    private BigDecimal tradSerialNo;

    private BigDecimal orderAmt;

    private BigDecimal voucherAmt;

    private BigDecimal clearBaseAmt;

    private Short transCode;

    private Short payStatus;

    private String tradTime;

    private BigDecimal thirdPlatFee;

    private String channelSerialNo;

    private BigDecimal channelOrderAmt;

    private BigDecimal channelVoucherAmt;

    private BigDecimal channelClearBaseAmt;

    private Short channelTransCode;

    private Short channelPayStatus;

    private String channelTradTime;

    private BigDecimal channelFee;

    private Short checkStatus;

    private String exceptionInfo;

    private Long branchCode;

    private String branchSimpleName;

    private Long terminalCode;

    private String terminalSerialNo;

    private Long payCode;

    private Short thirdPlatCode;

    private Short payType;

    private Short payScene;

    private String buyerAuthCode;

    private String payAccountNo;

    private String bankCardType;

    private String goodsDesc;

    private String currencyCode;

    private BigDecimal exchangeRate;

    private Long feeRateCode;

    private String createTime;

    private String processState;

    public BigDecimal getExceptionSerialNo() {
        return exceptionSerialNo;
    }

    public void setExceptionSerialNo(BigDecimal exceptionSerialNo) {
        this.exceptionSerialNo = exceptionSerialNo;
    }

    public BigDecimal getTradSerialNo() {
        return tradSerialNo;
    }

    public void setTradSerialNo(BigDecimal tradSerialNo) {
        this.tradSerialNo = tradSerialNo;
    }

    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
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

    public Short getTransCode() {
        return transCode;
    }

    public void setTransCode(Short transCode) {
        this.transCode = transCode;
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
    }

    public String getTradTime() {
        return tradTime;
    }

    public void setTradTime(String tradTime) {
        this.tradTime = tradTime == null ? null : tradTime.trim();
    }

    public BigDecimal getThirdPlatFee() {
        return thirdPlatFee;
    }

    public void setThirdPlatFee(BigDecimal thirdPlatFee) {
        this.thirdPlatFee = thirdPlatFee;
    }

    public String getChannelSerialNo() {
        return channelSerialNo;
    }

    public void setChannelSerialNo(String channelSerialNo) {
        this.channelSerialNo = channelSerialNo == null ? null : channelSerialNo.trim();
    }

    public BigDecimal getChannelOrderAmt() {
        return channelOrderAmt;
    }

    public void setChannelOrderAmt(BigDecimal channelOrderAmt) {
        this.channelOrderAmt = channelOrderAmt;
    }

    public BigDecimal getChannelVoucherAmt() {
        return channelVoucherAmt;
    }

    public void setChannelVoucherAmt(BigDecimal channelVoucherAmt) {
        this.channelVoucherAmt = channelVoucherAmt;
    }

    public BigDecimal getChannelClearBaseAmt() {
        return channelClearBaseAmt;
    }

    public void setChannelClearBaseAmt(BigDecimal channelClearBaseAmt) {
        this.channelClearBaseAmt = channelClearBaseAmt;
    }

    public Short getChannelTransCode() {
        return channelTransCode;
    }

    public void setChannelTransCode(Short channelTransCode) {
        this.channelTransCode = channelTransCode;
    }

    public Short getChannelPayStatus() {
        return channelPayStatus;
    }

    public void setChannelPayStatus(Short channelPayStatus) {
        this.channelPayStatus = channelPayStatus;
    }

    public String getChannelTradTime() {
        return channelTradTime;
    }

    public void setChannelTradTime(String channelTradTime) {
        this.channelTradTime = channelTradTime == null ? null : channelTradTime.trim();
    }

    public BigDecimal getChannelFee() {
        return channelFee;
    }

    public void setChannelFee(BigDecimal channelFee) {
        this.channelFee = channelFee;
    }

    public Short getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Short checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo == null ? null : exceptionInfo.trim();
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

    public Long getPayCode() {
        return payCode;
    }

    public void setPayCode(Long payCode) {
        this.payCode = payCode;
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

    public Long getFeeRateCode() {
        return feeRateCode;
    }

    public void setFeeRateCode(Long feeRateCode) {
        this.feeRateCode = feeRateCode;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getProcessState() {
        return processState;
    }

    public void setProcessState(String processState) {
        this.processState = processState == null ? null : processState.trim();
    }
}