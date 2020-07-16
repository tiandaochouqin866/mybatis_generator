package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class SysBranchContractEntity {
    private Long branchCode;

    private String busiType;

    private String busiDesc;

    private String busiPlacePhoto;

    private Short licType;

    private String licNo;

    private String licPhoto;

    private String licPeriod;

    private String licRegName;

    private String licRegAddr;

    private String legalPerson;

    private Short agentType;

    private Short legalCertType;

    private BigDecimal legalCertPhotoFront;

    private BigDecimal legalCertPhotoBack;

    private String legalCertNo;

    private String legalCertName;

    private String legalCertPeriod;

    private Short agentCertType;

    private BigDecimal agentCertPhotoFront;

    private BigDecimal agentCertPhotoBack;

    private String agentCertNo;

    private String agentCertName;

    private String agentCertPeriod;

    private String terminalNetWay;

    private String terminalFuncOpen;

    private Integer provinceCode;

    private Integer cityCode;

    private Integer districtCode;

    private String busiAddr;

    private String positionLatitude;

    private String positionLongitude;

    private String contractPhotos;

    private Short applyWay;

    private Short status;

    private String remark;

    private String creator;

    private String createTime;

    private String updTime;

    private String otherLicType;

    private String otherLegalCertType;

    private String otherAgentCertType;

    private Short icInfoCheck;

    private Short legalCertCheck;

    private Short bankActCheck;

    private Short agentCertCheck;

    private String hfflag;

    private String inflag;

    private String frefeelimt;

    private String frefeerate;

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType == null ? null : busiType.trim();
    }

    public String getBusiDesc() {
        return busiDesc;
    }

    public void setBusiDesc(String busiDesc) {
        this.busiDesc = busiDesc;
    }

    public String getBusiPlacePhoto() {
        return busiPlacePhoto;
    }

    public void setBusiPlacePhoto(String busiPlacePhoto) {
        this.busiPlacePhoto = busiPlacePhoto == null ? null : busiPlacePhoto.trim();
    }

    public Short getLicType() {
        return licType;
    }

    public void setLicType(Short licType) {
        this.licType = licType;
    }

    public String getLicNo() {
        return licNo;
    }

    public void setLicNo(String licNo) {
        this.licNo = licNo == null ? null : licNo.trim();
    }

    public String getLicPhoto() {
        return licPhoto;
    }

    public void setLicPhoto(String licPhoto) {
        this.licPhoto = licPhoto == null ? null : licPhoto.trim();
    }

    public String getLicPeriod() {
        return licPeriod;
    }

    public void setLicPeriod(String licPeriod) {
        this.licPeriod = licPeriod == null ? null : licPeriod.trim();
    }

    public String getLicRegName() {
        return licRegName;
    }

    public void setLicRegName(String licRegName) {
        this.licRegName = licRegName;
    }

    public String getLicRegAddr() {
        return licRegAddr;
    }

    public void setLicRegAddr(String licRegAddr) {
        this.licRegAddr = licRegAddr;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public Short getAgentType() {
        return agentType;
    }

    public void setAgentType(Short agentType) {
        this.agentType = agentType;
    }

    public Short getLegalCertType() {
        return legalCertType;
    }

    public void setLegalCertType(Short legalCertType) {
        this.legalCertType = legalCertType;
    }

    public BigDecimal getLegalCertPhotoFront() {
        return legalCertPhotoFront;
    }

    public void setLegalCertPhotoFront(BigDecimal legalCertPhotoFront) {
        this.legalCertPhotoFront = legalCertPhotoFront;
    }

    public BigDecimal getLegalCertPhotoBack() {
        return legalCertPhotoBack;
    }

    public void setLegalCertPhotoBack(BigDecimal legalCertPhotoBack) {
        this.legalCertPhotoBack = legalCertPhotoBack;
    }

    public String getLegalCertNo() {
        return legalCertNo;
    }

    public void setLegalCertNo(String legalCertNo) {
        this.legalCertNo = legalCertNo == null ? null : legalCertNo.trim();
    }

    public String getLegalCertName() {
        return legalCertName;
    }

    public void setLegalCertName(String legalCertName) {
        this.legalCertName = legalCertName;
    }

    public String getLegalCertPeriod() {
        return legalCertPeriod;
    }

    public void setLegalCertPeriod(String legalCertPeriod) {
        this.legalCertPeriod = legalCertPeriod == null ? null : legalCertPeriod.trim();
    }

    public Short getAgentCertType() {
        return agentCertType;
    }

    public void setAgentCertType(Short agentCertType) {
        this.agentCertType = agentCertType;
    }

    public BigDecimal getAgentCertPhotoFront() {
        return agentCertPhotoFront;
    }

    public void setAgentCertPhotoFront(BigDecimal agentCertPhotoFront) {
        this.agentCertPhotoFront = agentCertPhotoFront;
    }

    public BigDecimal getAgentCertPhotoBack() {
        return agentCertPhotoBack;
    }

    public void setAgentCertPhotoBack(BigDecimal agentCertPhotoBack) {
        this.agentCertPhotoBack = agentCertPhotoBack;
    }

    public String getAgentCertNo() {
        return agentCertNo;
    }

    public void setAgentCertNo(String agentCertNo) {
        this.agentCertNo = agentCertNo == null ? null : agentCertNo.trim();
    }

    public String getAgentCertName() {
        return agentCertName;
    }

    public void setAgentCertName(String agentCertName) {
        this.agentCertName = agentCertName;
    }

    public String getAgentCertPeriod() {
        return agentCertPeriod;
    }

    public void setAgentCertPeriod(String agentCertPeriod) {
        this.agentCertPeriod = agentCertPeriod == null ? null : agentCertPeriod.trim();
    }

    public String getTerminalNetWay() {
        return terminalNetWay;
    }

    public void setTerminalNetWay(String terminalNetWay) {
        this.terminalNetWay = terminalNetWay == null ? null : terminalNetWay.trim();
    }

    public String getTerminalFuncOpen() {
        return terminalFuncOpen;
    }

    public void setTerminalFuncOpen(String terminalFuncOpen) {
        this.terminalFuncOpen = terminalFuncOpen == null ? null : terminalFuncOpen.trim();
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

    public Integer getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Integer districtCode) {
        this.districtCode = districtCode;
    }

    public String getBusiAddr() {
        return busiAddr;
    }

    public void setBusiAddr(String busiAddr) {
        this.busiAddr = busiAddr;
    }

    public String getPositionLatitude() {
        return positionLatitude;
    }

    public void setPositionLatitude(String positionLatitude) {
        this.positionLatitude = positionLatitude == null ? null : positionLatitude.trim();
    }

    public String getPositionLongitude() {
        return positionLongitude;
    }

    public void setPositionLongitude(String positionLongitude) {
        this.positionLongitude = positionLongitude == null ? null : positionLongitude.trim();
    }

    public String getContractPhotos() {
        return contractPhotos;
    }

    public void setContractPhotos(String contractPhotos) {
        this.contractPhotos = contractPhotos == null ? null : contractPhotos.trim();
    }

    public Short getApplyWay() {
        return applyWay;
    }

    public void setApplyWay(Short applyWay) {
        this.applyWay = applyWay;
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

    public String getOtherLicType() {
        return otherLicType;
    }

    public void setOtherLicType(String otherLicType) {
        this.otherLicType = otherLicType;
    }

    public String getOtherLegalCertType() {
        return otherLegalCertType;
    }

    public void setOtherLegalCertType(String otherLegalCertType) {
        this.otherLegalCertType = otherLegalCertType;
    }

    public String getOtherAgentCertType() {
        return otherAgentCertType;
    }

    public void setOtherAgentCertType(String otherAgentCertType) {
        this.otherAgentCertType = otherAgentCertType;
    }

    public Short getIcInfoCheck() {
        return icInfoCheck;
    }

    public void setIcInfoCheck(Short icInfoCheck) {
        this.icInfoCheck = icInfoCheck;
    }

    public Short getLegalCertCheck() {
        return legalCertCheck;
    }

    public void setLegalCertCheck(Short legalCertCheck) {
        this.legalCertCheck = legalCertCheck;
    }

    public Short getBankActCheck() {
        return bankActCheck;
    }

    public void setBankActCheck(Short bankActCheck) {
        this.bankActCheck = bankActCheck;
    }

    public Short getAgentCertCheck() {
        return agentCertCheck;
    }

    public void setAgentCertCheck(Short agentCertCheck) {
        this.agentCertCheck = agentCertCheck;
    }

    public String getHfflag() {
        return hfflag;
    }

    public void setHfflag(String hfflag) {
        this.hfflag = hfflag == null ? null : hfflag.trim();
    }

    public String getInflag() {
        return inflag;
    }

    public void setInflag(String inflag) {
        this.inflag = inflag == null ? null : inflag.trim();
    }

    public String getFrefeelimt() {
        return frefeelimt;
    }

    public void setFrefeelimt(String frefeelimt) {
        this.frefeelimt = frefeelimt == null ? null : frefeelimt.trim();
    }

    public String getFrefeerate() {
        return frefeerate;
    }

    public void setFrefeerate(String frefeerate) {
        this.frefeerate = frefeerate == null ? null : frefeerate.trim();
    }
}