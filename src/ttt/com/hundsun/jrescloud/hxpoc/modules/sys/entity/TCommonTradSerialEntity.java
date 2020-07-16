package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class TCommonTradSerialEntity {
    private BigDecimal commonSerialNo;

    private Long branchCode;

    private String branchSimpleName;

    private Long terminalCode;

    private String reqSerialNo;

    private String reqTime;

    private Short transCode;

    private String keyFieldValue;

    private String channelSerialNo;

    private String channelRespTime;

    private String respCode;

    private String respMsg;

    private String updTime;

    public BigDecimal getCommonSerialNo() {
        return commonSerialNo;
    }

    public void setCommonSerialNo(BigDecimal commonSerialNo) {
        this.commonSerialNo = commonSerialNo;
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

    public Short getTransCode() {
        return transCode;
    }

    public void setTransCode(Short transCode) {
        this.transCode = transCode;
    }

    public String getKeyFieldValue() {
        return keyFieldValue;
    }

    public void setKeyFieldValue(String keyFieldValue) {
        this.keyFieldValue = keyFieldValue == null ? null : keyFieldValue.trim();
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

    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime == null ? null : updTime.trim();
    }
}