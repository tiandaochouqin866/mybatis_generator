package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysMchntChannelInfoEntity {
    private Long id;

    private Long branchCode;

    private Short thirdPlatCode;

    private String clearingRule;

    private String subMchntId;

    private String remark;

    private String creator;

    private String subMchntStatus;

    private String createTime;

    private String updTime;

    private String source;

    private Long channelNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public Short getThirdPlatCode() {
        return thirdPlatCode;
    }

    public void setThirdPlatCode(Short thirdPlatCode) {
        this.thirdPlatCode = thirdPlatCode;
    }

    public String getClearingRule() {
        return clearingRule;
    }

    public void setClearingRule(String clearingRule) {
        this.clearingRule = clearingRule == null ? null : clearingRule.trim();
    }

    public String getSubMchntId() {
        return subMchntId;
    }

    public void setSubMchntId(String subMchntId) {
        this.subMchntId = subMchntId == null ? null : subMchntId.trim();
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

    public String getSubMchntStatus() {
        return subMchntStatus;
    }

    public void setSubMchntStatus(String subMchntStatus) {
        this.subMchntStatus = subMchntStatus == null ? null : subMchntStatus.trim();
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Long getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(Long channelNo) {
        this.channelNo = channelNo;
    }
}