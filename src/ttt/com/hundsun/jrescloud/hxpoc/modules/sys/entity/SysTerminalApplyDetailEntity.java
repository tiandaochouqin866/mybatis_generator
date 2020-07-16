package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class SysTerminalApplyDetailEntity {
    private Long id;

    private Long applyBatchNo;

    private String terminalType;

    private String terminalNetWay;

    private Short telecomOperator;

    private String bindPhoneNo;

    private BigDecimal defaultDeposit;

    private BigDecimal actualDeposit;

    private String createTime;

    private BigDecimal checkDeposit;

    private String depositStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplyBatchNo() {
        return applyBatchNo;
    }

    public void setApplyBatchNo(Long applyBatchNo) {
        this.applyBatchNo = applyBatchNo;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
    }

    public String getTerminalNetWay() {
        return terminalNetWay;
    }

    public void setTerminalNetWay(String terminalNetWay) {
        this.terminalNetWay = terminalNetWay == null ? null : terminalNetWay.trim();
    }

    public Short getTelecomOperator() {
        return telecomOperator;
    }

    public void setTelecomOperator(Short telecomOperator) {
        this.telecomOperator = telecomOperator;
    }

    public String getBindPhoneNo() {
        return bindPhoneNo;
    }

    public void setBindPhoneNo(String bindPhoneNo) {
        this.bindPhoneNo = bindPhoneNo == null ? null : bindPhoneNo.trim();
    }

    public BigDecimal getDefaultDeposit() {
        return defaultDeposit;
    }

    public void setDefaultDeposit(BigDecimal defaultDeposit) {
        this.defaultDeposit = defaultDeposit;
    }

    public BigDecimal getActualDeposit() {
        return actualDeposit;
    }

    public void setActualDeposit(BigDecimal actualDeposit) {
        this.actualDeposit = actualDeposit;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public BigDecimal getCheckDeposit() {
        return checkDeposit;
    }

    public void setCheckDeposit(BigDecimal checkDeposit) {
        this.checkDeposit = checkDeposit;
    }

    public String getDepositStatus() {
        return depositStatus;
    }

    public void setDepositStatus(String depositStatus) {
        this.depositStatus = depositStatus == null ? null : depositStatus.trim();
    }
}