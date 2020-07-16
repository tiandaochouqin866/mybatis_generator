package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class SysMchntMaintenanceRecordEntity {
    private BigDecimal commonSerialNo;

    private Long branchCode;

    private Short operCode;

    private String bigJsonPart1;

    private String bigJsonPart2;

    private String bigJsonPart3;

    private String auditUserCode;

    private String auditTime;

    private Short auditResult;

    private String auditDesc;

    private String remark;

    private String creator;

    private String createTime;

    private String updTime;

    private String changePart;

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

    public Short getOperCode() {
        return operCode;
    }

    public void setOperCode(Short operCode) {
        this.operCode = operCode;
    }

    public String getBigJsonPart1() {
        return bigJsonPart1;
    }

    public void setBigJsonPart1(String bigJsonPart1) {
        this.bigJsonPart1 = bigJsonPart1;
    }

    public String getBigJsonPart2() {
        return bigJsonPart2;
    }

    public void setBigJsonPart2(String bigJsonPart2) {
        this.bigJsonPart2 = bigJsonPart2;
    }

    public String getBigJsonPart3() {
        return bigJsonPart3;
    }

    public void setBigJsonPart3(String bigJsonPart3) {
        this.bigJsonPart3 = bigJsonPart3;
    }

    public String getAuditUserCode() {
        return auditUserCode;
    }

    public void setAuditUserCode(String auditUserCode) {
        this.auditUserCode = auditUserCode == null ? null : auditUserCode.trim();
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime == null ? null : auditTime.trim();
    }

    public Short getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(Short auditResult) {
        this.auditResult = auditResult;
    }

    public String getAuditDesc() {
        return auditDesc;
    }

    public void setAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc;
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

    public String getChangePart() {
        return changePart;
    }

    public void setChangePart(String changePart) {
        this.changePart = changePart == null ? null : changePart.trim();
    }
}