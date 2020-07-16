package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class SysWechatChannelMchntInfoEntity {
    private String wechatChannelId;

    private String mobileNo;

    private String eMail;

    private String branchSimpleName;

    private String branchName;

    private String busiType;

    private Object licRegAddr;

    private BigDecimal licPhoto;

    private String bankActName;

    private String bankCardNo;

    private String bankActNo;

    private String bankName;

    private String createTime;

    private String remark;

    private Long channelNo;

    public String getWechatChannelId() {
        return wechatChannelId;
    }

    public void setWechatChannelId(String wechatChannelId) {
        this.wechatChannelId = wechatChannelId == null ? null : wechatChannelId.trim();
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

    public String getBranchSimpleName() {
        return branchSimpleName;
    }

    public void setBranchSimpleName(String branchSimpleName) {
        this.branchSimpleName = branchSimpleName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType == null ? null : busiType.trim();
    }

    public Object getLicRegAddr() {
        return licRegAddr;
    }

    public void setLicRegAddr(Object licRegAddr) {
        this.licRegAddr = licRegAddr;
    }

    public BigDecimal getLicPhoto() {
        return licPhoto;
    }

    public void setLicPhoto(BigDecimal licPhoto) {
        this.licPhoto = licPhoto;
    }

    public String getBankActName() {
        return bankActName;
    }

    public void setBankActName(String bankActName) {
        this.bankActName = bankActName;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo == null ? null : bankCardNo.trim();
    }

    public String getBankActNo() {
        return bankActNo;
    }

    public void setBankActNo(String bankActNo) {
        this.bankActNo = bankActNo == null ? null : bankActNo.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(Long channelNo) {
        this.channelNo = channelNo;
    }
}