package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class TBusiFlowConfEntity {
    private Long flowConfNo;

    private Short busiType;

    private String flowConfVer;

    private String effectTime;

    private Short curPrcIndex;

    private String prcCode;

    private String prcDesc;

    private Short prcType;

    private String functionUrl;

    private Short frontPrcIndex;

    private Short backPrcIndex;

    private Short isBranchNode;

    private Short sendMsg;

    private Short branchType;

    private Short branchLevel;

    private String roleCode;

    private Long branchCode;

    private String userCode;

    private String remark;

    private Short status;

    private String creator;

    private String createTime;

    private String updTime;

    public Long getFlowConfNo() {
        return flowConfNo;
    }

    public void setFlowConfNo(Long flowConfNo) {
        this.flowConfNo = flowConfNo;
    }

    public Short getBusiType() {
        return busiType;
    }

    public void setBusiType(Short busiType) {
        this.busiType = busiType;
    }

    public String getFlowConfVer() {
        return flowConfVer;
    }

    public void setFlowConfVer(String flowConfVer) {
        this.flowConfVer = flowConfVer == null ? null : flowConfVer.trim();
    }

    public String getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(String effectTime) {
        this.effectTime = effectTime == null ? null : effectTime.trim();
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

    public String getPrcDesc() {
        return prcDesc;
    }

    public void setPrcDesc(String prcDesc) {
        this.prcDesc = prcDesc;
    }

    public Short getPrcType() {
        return prcType;
    }

    public void setPrcType(Short prcType) {
        this.prcType = prcType;
    }

    public String getFunctionUrl() {
        return functionUrl;
    }

    public void setFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl == null ? null : functionUrl.trim();
    }

    public Short getFrontPrcIndex() {
        return frontPrcIndex;
    }

    public void setFrontPrcIndex(Short frontPrcIndex) {
        this.frontPrcIndex = frontPrcIndex;
    }

    public Short getBackPrcIndex() {
        return backPrcIndex;
    }

    public void setBackPrcIndex(Short backPrcIndex) {
        this.backPrcIndex = backPrcIndex;
    }

    public Short getIsBranchNode() {
        return isBranchNode;
    }

    public void setIsBranchNode(Short isBranchNode) {
        this.isBranchNode = isBranchNode;
    }

    public Short getSendMsg() {
        return sendMsg;
    }

    public void setSendMsg(Short sendMsg) {
        this.sendMsg = sendMsg;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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
}