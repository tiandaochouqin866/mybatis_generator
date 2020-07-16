package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class TBusiNoticeEntity {
    private Long busiFlowNo;

    private Short busiType;

    private Long busiNo;

    private Long busiBranch;

    private Short curPrcIndex;

    private String prcCode;

    private Short prcStatus;

    private Short branchType;

    private Short branchLevel;

    private String roleCode;

    private Long branchCode;

    private String userCode;

    private String noticeTime;

    public Long getBusiFlowNo() {
        return busiFlowNo;
    }

    public void setBusiFlowNo(Long busiFlowNo) {
        this.busiFlowNo = busiFlowNo;
    }

    public Short getBusiType() {
        return busiType;
    }

    public void setBusiType(Short busiType) {
        this.busiType = busiType;
    }

    public Long getBusiNo() {
        return busiNo;
    }

    public void setBusiNo(Long busiNo) {
        this.busiNo = busiNo;
    }

    public Long getBusiBranch() {
        return busiBranch;
    }

    public void setBusiBranch(Long busiBranch) {
        this.busiBranch = busiBranch;
    }

    public Short getCurPrcIndex() {
        return curPrcIndex;
    }

    public void setCurPrcIndex(Short curPrcIndex) {
        this.curPrcIndex = curPrcIndex;
    }

    public String getPrcCode() {
        return prcCode;
    }

    public void setPrcCode(String prcCode) {
        this.prcCode = prcCode == null ? null : prcCode.trim();
    }

    public Short getPrcStatus() {
        return prcStatus;
    }

    public void setPrcStatus(Short prcStatus) {
        this.prcStatus = prcStatus;
    }

    public Short getBranchType() {
        return branchType;
    }

    public void setBranchType(Short branchType) {
        this.branchType = branchType;
    }

    public Short getBranchLevel() {
        return branchLevel;
    }

    public void setBranchLevel(Short branchLevel) {
        this.branchLevel = branchLevel;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime == null ? null : noticeTime.trim();
    }
}