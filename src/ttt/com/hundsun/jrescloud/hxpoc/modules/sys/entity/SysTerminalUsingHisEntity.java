package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class SysTerminalUsingHisEntity {
    private Long id;

    private Long terminalCode;

    private String terminalSerialNo;

    private String terminalType;

    private String terminalNetWay;

    private Short telecomOperator;

    private String bindPhoneNo;

    private String simCardSerial;

    private BigDecimal withholdingAgreementPhoto;

    private BigDecimal defaultDeposit;

    private BigDecimal actualDeposit;

    private Long branchCode;

    private String regAuthCode;

    private String publicKey;

    private Integer upTerminalCode;

    private String upTerminalType;

    private Short upQrFunc;

    private Short upMagneticCard;

    private Short upContactIcCard;

    private Short upNoncontactIcCard;

    private Short upPayWithoutCard;

    private String upTerminalBusiFunc;

    private Short status;

    private String remark;

    private String creator;

    private String createTime;

    private String updTime;

    private Long applyBatchNo;

    private Short posStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(Long terminalCode) {
        this.terminalCode = terminalCode;
    }

    public String getTerminalSerialNo() {
        return terminalSerialNo;
    }

    public void setTerminalSerialNo(String terminalSerialNo) {
        this.terminalSerialNo = terminalSerialNo == null ? null : terminalSerialNo.trim();
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
    }

    public String getTerminalNetWay() {
        return terminalNetWay;
    }

    public void setTerminalNetWay(String terminalNetWay) {
        this.terminalNetWay = terminalNetWay == null ? null : terminalNetWay.trim();
    }

    public Short getTelecomOperator() {
        return telecomOperator;
    }

    public void setTelecomOperator(Short telecomOperator) {
        this.telecomOperator = telecomOperator;
    }

    public String getBindPhoneNo() {
        return bindPhoneNo;
    }

    public void setBindPhoneNo(String bindPhoneNo) {
        this.bindPhoneNo = bindPhoneNo == null ? null : bindPhoneNo.trim();
    }

    public String getSimCardSerial() {
        return simCardSerial;
    }

    public void setSimCardSerial(String simCardSerial) {
        this.simCardSerial = simCardSerial == null ? null : simCardSerial.trim();
    }

    public BigDecimal getWithholdingAgreementPhoto() {
        return withholdingAgreementPhoto;
    }

    public void setWithholdingAgreementPhoto(BigDecimal withholdingAgreementPhoto) {
        this.withholdingAgreementPhoto = withholdingAgreementPhoto;
    }

    public BigDecimal getDefaultDeposit() {
        return defaultDeposit;
    }

    public void setDefaultDeposit(BigDecimal defaultDeposit) {
        this.defaultDeposit = defaultDeposit;
    }

    public BigDecimal getActualDeposit() {
        return actualDeposit;
    }

    public void setActualDeposit(BigDecimal actualDeposit) {
        this.actualDeposit = actualDeposit;
    }

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public String getRegAuthCode() {
        return regAuthCode;
    }

    public void setRegAuthCode(String regAuthCode) {
        this.regAuthCode = regAuthCode == null ? null : regAuthCode.trim();
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey == null ? null : publicKey.trim();
    }

    public Integer getUpTerminalCode() {
        return upTerminalCode;
    }

    public void setUpTerminalCode(Integer upTerminalCode) {
        this.upTerminalCode = upTerminalCode;
    }

    public String getUpTerminalType() {
        return upTerminalType;
    }

    public void setUpTerminalType(String upTerminalType) {
        this.upTerminalType = upTerminalType == null ? null : upTerminalType.trim();
    }

    public Short getUpQrFunc() {
        return upQrFunc;
    }

    public void setUpQrFunc(Short upQrFunc) {
        this.upQrFunc = upQrFunc;
    }

    public Short getUpMagneticCard() {
        return upMagneticCard;
    }

    public void setUpMagneticCard(Short upMagneticCard) {
        this.upMagneticCard = upMagneticCard;
    }

    public Short getUpContactIcCard() {
        return upContactIcCard;
    }

    public void setUpContactIcCard(Short upContactIcCard) {
        this.upContactIcCard = upContactIcCard;
    }

    public Short getUpNoncontactIcCard() {
        return upNoncontactIcCard;
    }

    public void setUpNoncontactIcCard(Short upNoncontactIcCard) {
        this.upNoncontactIcCard = upNoncontactIcCard;
    }

    public Short getUpPayWithoutCard() {
        return upPayWithoutCard;
    }

    public void setUpPayWithoutCard(Short upPayWithoutCard) {
        this.upPayWithoutCard = upPayWithoutCard;
    }

    public String getUpTerminalBusiFunc() {
        return upTerminalBusiFunc;
    }

    public void setUpTerminalBusiFunc(String upTerminalBusiFunc) {
        this.upTerminalBusiFunc = upTerminalBusiFunc == null ? null : upTerminalBusiFunc.trim();
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

    public Long getApplyBatchNo() {
        return applyBatchNo;
    }

    public void setApplyBatchNo(Long applyBatchNo) {
        this.applyBatchNo = applyBatchNo;
    }

    public Short getPosStatus() {
        return posStatus;
    }

    public void setPosStatus(Short posStatus) {
        this.posStatus = posStatus;
    }
}