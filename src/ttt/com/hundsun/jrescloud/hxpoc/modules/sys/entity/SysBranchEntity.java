package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysBranchEntity {
    private Long branchCode;

    private String branchName;

    private String branchSimpleName;

    private Short branchType;

    private Short branchLevel;

    private Long parentBranch;

    private String contactor;

    private String mobileNo;

    private String eMail;

    private String contactAddr;

    private String busiManager;

    private Short status;

    private String operationStaff;

    private Short isIndependentAct;

    private String remark;

    private String creator;

    private String createTime;

    private String updTime;

    private Short isBusiShop;

    private String innerBranchCode;

    private String busiExpand;

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchSimpleName() {
        return branchSimpleName;
    }

    public void setBranchSimpleName(String branchSimpleName) {
        this.branchSimpleName = branchSimpleName;
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

    public Long getParentBranch() {
        return parentBranch;
    }

    public void setParentBranch(Long parentBranch) {
        this.parentBranch = parentBranch;
    }

    public String getContactor() {
        return contactor;
    }

    public void setContactor(String contactor) {
        this.contactor = contactor;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getContactAddr() {
        return contactAddr;
    }

    public void setContactAddr(String contactAddr) {
        this.contactAddr = contactAddr;
    }

    public String getBusiManager() {
        return busiManager;
    }

    public void setBusiManager(String busiManager) {
        this.busiManager = busiManager == null ? null : busiManager.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getOperationStaff() {
        return operationStaff;
    }

    public void setOperationStaff(String operationStaff) {
        this.operationStaff = operationStaff == null ? null : operationStaff.trim();
    }

    public Short getIsIndependentAct() {
        return isIndependentAct;
    }

    public void setIsIndependentAct(Short isIndependentAct) {
        this.isIndependentAct = isIndependentAct;
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

    public Short getIsBusiShop() {
        return isBusiShop;
    }

    public void setIsBusiShop(Short isBusiShop) {
        this.isBusiShop = isBusiShop;
    }

    public String getInnerBranchCode() {
        return innerBranchCode;
    }

    public void setInnerBranchCode(String innerBranchCode) {
        this.innerBranchCode = innerBranchCode == null ? null : innerBranchCode.trim();
    }

    public String getBusiExpand() {
        return busiExpand;
    }

    public void setBusiExpand(String busiExpand) {
        this.busiExpand = busiExpand == null ? null : busiExpand.trim();
    }
}