package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysTerminalFaultApplyEntity {
    private Long applyNo;

    private Long branchCode;

    private String reportPerson;

    private String reportAddr;

    private String reportPersonPhone;

    private String reportDesc;

    private String creator;

    private String createTime;

    public Long getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(Long applyNo) {
        this.applyNo = applyNo;
    }

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public String getReportPerson() {
        return reportPerson;
    }

    public void setReportPerson(String reportPerson) {
        this.reportPerson = reportPerson;
    }

    public String getReportAddr() {
        return reportAddr;
    }

    public void setReportAddr(String reportAddr) {
        this.reportAddr = reportAddr;
    }

    public String getReportPersonPhone() {
        return reportPersonPhone;
    }

    public void setReportPersonPhone(String reportPersonPhone) {
        this.reportPersonPhone = reportPersonPhone == null ? null : reportPersonPhone.trim();
    }

    public String getReportDesc() {
        return reportDesc;
    }

    public void setReportDesc(String reportDesc) {
        this.reportDesc = reportDesc;
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
}