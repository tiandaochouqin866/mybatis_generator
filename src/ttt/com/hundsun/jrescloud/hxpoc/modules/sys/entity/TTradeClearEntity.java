package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class TTradeClearEntity {
    private BigDecimal serialNo;

    private BigDecimal clearBatchNo;

    private Short thirdPlatCode;

    private BigDecimal tradSerialNo;

    private String beginTime;

    private String endTime;

    private String clearingAdvanceAct;

    private Long branchCode;

    private String bankActNo;

    private BigDecimal clearAmt;

    private Long platSerialNo;

    private String coreSerialNo;

    private String clearTime;

    private Short clearResult;

    private String respMsg;

    private String createTime;

    private Short profitType;

    private String clearingRule;

    public BigDecimal getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(BigDecimal serialNo) {
        this.serialNo = serialNo;
    }

    public BigDecimal getClearBatchNo() {
        return clearBatchNo;
    }

    public void setClearBatchNo(BigDecimal clearBatchNo) {
        this.clearBatchNo = clearBatchNo;
    }

    public Short getThirdPlatCode() {
        return thirdPlatCode;
    }

    public void setThirdPlatCode(Short thirdPlatCode) {
        this.thirdPlatCode = thirdPlatCode;
    }

    public BigDecimal getTradSerialNo() {
        return tradSerialNo;
    }

    public void setTradSerialNo(BigDecimal tradSerialNo) {
        this.tradSerialNo = tradSerialNo;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getClearingAdvanceAct() {
        return clearingAdvanceAct;
    }

    public void setClearingAdvanceAct(String clearingAdvanceAct) {
        this.clearingAdvanceAct = clearingAdvanceAct == null ? null : clearingAdvanceAct.trim();
    }

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public String getBankActNo() {
        return bankActNo;
    }

    public void setBankActNo(String bankActNo) {
        this.bankActNo = bankActNo == null ? null : bankActNo.trim();
    }

    public BigDecimal getClearAmt() {
        return clearAmt;
    }

    public void setClearAmt(BigDecimal clearAmt) {
        this.clearAmt = clearAmt;
    }

    public Long getPlatSerialNo() {
        return platSerialNo;
    }

    public void setPlatSerialNo(Long platSerialNo) {
        this.platSerialNo = platSerialNo;
    }

    public String getCoreSerialNo() {
        return coreSerialNo;
    }

    public void setCoreSerialNo(String coreSerialNo) {
        this.coreSerialNo = coreSerialNo == null ? null : coreSerialNo.trim();
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

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg == null ? null : respMsg.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Short getProfitType() {
        return profitType;
    }

    public void setProfitType(Short profitType) {
        this.profitType = profitType;
    }

    public String getClearingRule() {
        return clearingRule;
    }

    public void setClearingRule(String clearingRule) {
        this.clearingRule = clearingRule == null ? null : clearingRule.trim();
    }
}