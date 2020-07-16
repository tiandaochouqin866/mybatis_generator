package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class SysTerminalApplyEntity {
    private Long applyBatchNo;

    private BigDecimal depositPaymentSerial;

    private Long applyBranch;

    private String createTime;

    private Short status;

    private String remark;

    private String creator;

    private String updTime;

    public Long getApplyBatchNo() {
        return applyBatchNo;
    }

    public void setApplyBatchNo(Long applyBatchNo) {
        this.applyBatchNo = applyBatchNo;
    }

    public BigDecimal getDepositPaymentSerial() {
        return depositPaymentSerial;
    }

    public void setDepositPaymentSerial(BigDecimal depositPaymentSerial) {
        this.depositPaymentSerial = depositPaymentSerial;
    }

    public Long getApplyBranch() {
        return applyBranch;
    }

    public void setApplyBranch(Long applyBranch) {
        this.applyBranch = applyBranch;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime == null ? null : updTime.trim();
    }
}