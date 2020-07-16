package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class TFundSerialCardEntity {
    private BigDecimal serialNo;

    private Long branchCode;

    private String branchSimpleName;

    private Long terminalCode;

    private String terminalSerialNo;

    private Short thirdPlatCode;

    private Short payType;

    private Short payScene;

    private Short transCode;

    private BigDecimal orderAmt;

    private BigDecimal cashAmt;

    private BigDecimal voucherAmt;

    private BigDecimal clearBaseAmt;

    private String currencyCode;

    private BigDecimal exchangeRate;

    private String payCardNo;

    private String consumer;

    private String bankCardType;

    private Short routeFlag;

    private String payBankName;

    private String goodsDesc;

    private String posSerialNo;

    private String pospSerialNo;

    private String originalRelatedSerial;

    private String tradTime;

    private String tradErrorMsg;

    private Short originalPayStatus;

    private Short cancelFlag;

    private Short payStatus;

    private String createTime;

    private String updTime;

    private Long channelNo;

    public BigDecimal getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(BigDecimal serialNo) {
        this.serialNo = serialNo;
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

    public String getPayCardNo() {
        return payCardNo;
    }

    public void setPayCardNo(String payCardNo) {
        this.payCardNo = payCardNo == null ? null : payCardNo.trim();
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public String getBankCardType() {
        return bankCardType;
    }

    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType == null ? null : bankCardType.trim();
    }

    public Short getRouteFlag() {
        return routeFlag;
    }

    public void setRouteFlag(Short routeFlag) {
        this.routeFlag = routeFlag;
    }

    public String getPayBankName() {
        return payBankName;
    }

    public void setPayBankName(String payBankName) {
        this.payBankName = payBankName;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getPosSerialNo() {
        return posSerialNo;
    }

    public void setPosSerialNo(String posSerialNo) {
        this.posSerialNo = posSerialNo == null ? null : posSerialNo.trim();
    }

    public String getPospSerialNo() {
        return pospSerialNo;
    }

    public void setPospSerialNo(String pospSerialNo) {
        this.pospSerialNo = pospSerialNo == null ? null : pospSerialNo.trim();
    }

    public String getOriginalRelatedSerial() {
        return originalRelatedSerial;
    }

    public void setOriginalRelatedSerial(String originalRelatedSerial) {
        this.originalRelatedSerial = originalRelatedSerial == null ? null : originalRelatedSerial.trim();
    }

    public String getTradTime() {
        return tradTime;
    }

    public void setTradTime(String tradTime) {
        this.tradTime = tradTime == null ? null : tradTime.trim();
    }

    public String getTradErrorMsg() {
        return tradErrorMsg;
    }

    public void setTradErrorMsg(String tradErrorMsg) {
        this.tradErrorMsg = tradErrorMsg == null ? null : tradErrorMsg.trim();
    }

    public Short getOriginalPayStatus() {
        return originalPayStatus;
    }

    public void setOriginalPayStatus(Short originalPayStatus) {
        this.originalPayStatus = originalPayStatus;
    }

    public Short getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(Short cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
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
}