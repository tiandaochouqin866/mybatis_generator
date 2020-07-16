package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysChannelEntity {
    private Long channelNo;

    private Short thirdPlatCode;

    private String thirdPlatName;

    private String thirdPlatAct;

    private String appId;

    private String upStandardCode;

    private Short keyType;

    private String publicKey;

    private String privateKey;

    private String keyPwd;

    private Long branchCode;

    private Short status;

    private String remark;

    private String creator;

    private String createTime;

    private String updTime;

    private String appSecret;

    public Long getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(Long channelNo) {
        this.channelNo = channelNo;
    }

    public Short getThirdPlatCode() {
        return thirdPlatCode;
    }

    public void setThirdPlatCode(Short thirdPlatCode) {
        this.thirdPlatCode = thirdPlatCode;
    }

    public String getThirdPlatName() {
        return thirdPlatName;
    }

    public void setThirdPlatName(String thirdPlatName) {
        this.thirdPlatName = thirdPlatName == null ? null : thirdPlatName.trim();
    }

    public String getThirdPlatAct() {
        return thirdPlatAct;
    }

    public void setThirdPlatAct(String thirdPlatAct) {
        this.thirdPlatAct = thirdPlatAct == null ? null : thirdPlatAct.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getUpStandardCode() {
        return upStandardCode;
    }

    public void setUpStandardCode(String upStandardCode) {
        this.upStandardCode = upStandardCode == null ? null : upStandardCode.trim();
    }

    public Short getKeyType() {
        return keyType;
    }

    public void setKeyType(Short keyType) {
        this.keyType = keyType;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey == null ? null : publicKey.trim();
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey == null ? null : privateKey.trim();
    }

    public String getKeyPwd() {
        return keyPwd;
    }

    public void setKeyPwd(String keyPwd) {
        this.keyPwd = keyPwd == null ? null : keyPwd.trim();
    }

    public Long getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
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

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }
}