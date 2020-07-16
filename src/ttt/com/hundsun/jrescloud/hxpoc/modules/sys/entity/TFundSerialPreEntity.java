package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class TFundSerialPreEntity {
    private BigDecimal tradSerialNo;

    private Long branchCode;

    private String branchSimpleName;

    private Short thirdPlatCode;

    private Short payType;

    private Short payScene;

    private BigDecimal orderAmt;

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

    private Short originalPayStatus;

    private Short cancelFlag;

    private Long channelNo;

    private String settleKey;

    private String goodsDetail;

    private String receiveUrl;

    private String pickupUrl;

    private Short transCode;

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

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public String getReceiveUrl() {
        return receiveUrl;
    }

    public void setReceiveUrl(String receiveUrl) {
        this.receiveUrl = receiveUrl == null ? null : receiveUrl.trim();
    }

    public String getPickupUrl() {
        return pickupUrl;
    }

    public void setPickupUrl(String pickupUrl) {
        this.pickupUrl = pickupUrl == null ? null : pickupUrl.trim();
    }

    public Short getTransCode() {
        return transCode;
    }

    public void setTransCode(Short transCode) {
        this.transCode = transCode;
    }
}