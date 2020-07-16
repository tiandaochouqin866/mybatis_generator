package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysTerminalFaultDetailEntity {
    private Long faultNo;

    private Long branchCode;

    private String terminalSerialNo;

    private Short faultType;

    private String faultDesc;

    private String faultReportTime;

    private Short solvingType;

    private String reportPerson;

    private String reportPersonPhone;

    private String reportAddr;

    private Short status;

    private String updTime;

    private Long applyNo;

    public Long getFaultNo() {
        return faultNo;
    }

    public void setFaultNo(Long faultNo) {
        this.faultNo = faultNo;
    }

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public String getTerminalSerialNo() {
        return terminalSerialNo;
    }

    public void setTerminalSerialNo(String terminalSerialNo) {
        this.terminalSerialNo = terminalSerialNo == null ? null : terminalSerialNo.trim();
    }

    public Short getFaultType() {
        return faultType;
    }

    public void setFaultType(Short faultType) {
        this.faultType = faultType;
    }

    public String getFaultDesc() {
        return faultDesc;
    }

    public void setFaultDesc(String faultDesc) {
        this.faultDesc = faultDesc;
    }

    public String getFaultReportTime() {
        return faultReportTime;
    }

    public void setFaultReportTime(String faultReportTime) {
        this.faultReportTime = faultReportTime == null ? null : faultReportTime.trim();
    }

    public Short getSolvingType() {
        return solvingType;
    }

    public void setSolvingType(Short solvingType) {
        this.solvingType = solvingType;
    }

    public String getReportPerson() {
        return reportPerson;
    }

    public void setReportPerson(String reportPerson) {
        this.reportPerson = reportPerson;
    }

    public String getReportPersonPhone() {
        return reportPersonPhone;
    }

    public void setReportPersonPhone(String reportPersonPhone) {
        this.reportPersonPhone = reportPersonPhone == null ? null : reportPersonPhone.trim();
    }

    public String getReportAddr() {
        return reportAddr;
    }

    public void setReportAddr(String reportAddr) {
        this.reportAddr = reportAddr;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime == null ? null : updTime.trim();
    }

    public Long getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(Long applyNo) {
        this.applyNo = applyNo;
    }
}