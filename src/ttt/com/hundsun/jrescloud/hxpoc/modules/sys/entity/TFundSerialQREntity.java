package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class TFundSerialQREntity {
    private BigDecimal tradSerialNo;

    private Long branchCode;

    private String branchSimpleName;

    private Long terminalCode;

    private String terminalSerialNo;

    private Short thirdPlatCode;

    private Short payType;

    private Short payScene;

    private BigDecimal orderAmt;

    private String buyerAuthCode;

    private String payAccountNo;

    private String goodsDesc;

    private String currencyCode;

    private BigDecimal exchangeRate;

    private BigDecimal originalRelatedSerial;

    private String reqSerialNo;

    private String reqTime;

    private String channelSerialNo;

    private String channelRespTime;

    private String respCode;

    private String respMsg;

    private Short payStatus;

    private String createTime;

    private String updTime;

    private String bankCardType;

    private Short transCode;

    private Short originalPayStatus;

    private Short cancelFlag;

    private String billNo;

    private BigDecimal cashAmt;

    private BigDecimal voucherAmt;

    private BigDecimal clearBaseAmt;

    private Long channelNo;

    private String settleKey;

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

    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
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

    public String getChannelSerialNo() {
        return channelSerialNo;
    }

    public void setChannelSerialNo(String channelSerialNo) {
        this.channelSerialNo = channelSerialNo == null ? null : channelSerialNo.trim();
    }

    public String getChannelRespTime() {
        return channelRespTime;
    }

    public void setChannelRespTime(String channelRespTime) {
        this.channelRespTime = channelRespTime == null ? null : channelRespTime.trim();
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode == null ? null : respCode.trim();
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg == null ? null : respMsg.trim();
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

    public String getBankCardType() {
        return bankCardType;
    }

    public void setBankCardType(String bankCardType) {
        this.bankCardType = bankCardType == null ? null : bankCardType.trim();
    }

    public Short getTransCode() {
        return transCode;
    }

    public void setTransCode(Short transCode) {
        this.transCode = transCode;
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

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
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
}