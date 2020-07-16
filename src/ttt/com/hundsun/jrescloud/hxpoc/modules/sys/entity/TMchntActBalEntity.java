package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class TMchntActBalEntity {
    private BigDecimal serialNo;

    private String tradeDate;

    private Long branchCode;

    private String branchSimpleName;

    private String bankActNo;

    private BigDecimal lastDayBalance;

    private String busiManager;

    private String busiManagerName;

    private String createTime;

    private Object actErrDetail;

    public BigDecimal getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(BigDecimal serialNo) {
        this.serialNo = serialNo;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate == null ? null : tradeDate.trim();
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

    public String getBankActNo() {
        return bankActNo;
    }

    public void setBankActNo(String bankActNo) {
        this.bankActNo = bankActNo == null ? null : bankActNo.trim();
    }

    public BigDecimal getLastDayBalance() {
        return lastDayBalance;
    }

    public void setLastDayBalance(BigDecimal lastDayBalance) {
        this.lastDayBalance = lastDayBalance;
    }

    public String getBusiManager() {
        return busiManager;
    }

    public void setBusiManager(String busiManager) {
        this.busiManager = busiManager == null ? null : busiManager.trim();
    }

    public String getBusiManagerName() {
        return busiManagerName;
    }

    public void setBusiManagerName(String busiManagerName) {
        this.busiManagerName = busiManagerName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Object getActErrDetail() {
        return actErrDetail;
    }

    public void setActErrDetail(Object actErrDetail) {
        this.actErrDetail = actErrDetail;
    }
}