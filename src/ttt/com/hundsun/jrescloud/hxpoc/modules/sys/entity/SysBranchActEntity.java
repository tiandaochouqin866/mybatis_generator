package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class SysBranchActEntity {
    private Long branchCode;

    private Short bankActType;

    private String bankActName;

    private String bankCardNo;

    private BigDecimal bankCardPhoto;

    private String bankActNo;

    private String bankName;

    private Integer provinceCode;

    private Integer cityCode;

    private String bankBranchName;

    private String qrCode;

    private Short status;

    private String remark;

    private String creator;

    private String createTime;

    private String updTime;

    private String bankCustomerNo;

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public Short getBankActType() {
        return bankActType;
    }

    public void setBankActType(Short bankActType) {
        this.bankActType = bankActType;
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

    public BigDecimal getBankCardPhoto() {
        return bankCardPhoto;
    }

    public void setBankCardPhoto(BigDecimal bankCardPhoto) {
        this.bankCardPhoto = bankCardPhoto;
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

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
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

    public String getBankCustomerNo() {
        return bankCustomerNo;
    }

    public void setBankCustomerNo(String bankCustomerNo) {
        this.bankCustomerNo = bankCustomerNo == null ? null : bankCustomerNo.trim();
    }
}