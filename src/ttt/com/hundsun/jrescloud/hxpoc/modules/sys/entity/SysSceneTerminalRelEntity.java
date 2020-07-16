package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysSceneTerminalRelEntity {
    private Long id;

    private Short payType;

    private Short payScene;

    private String terminalType;

    private String remark;

    private String creator;

    private String craeteTime;

    private String updTime;

    private Short sceneType;

    private String terminalNetWay;

    private Short thirdPlatCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getPayType() {
        return payType;
    }

    public void setPayType(Short payType) {
        this.payType = payType;
    }

    public Short getPayScene() {
        return payScene;
    }

    public void setPayScene(Short payScene) {
        this.payScene = payScene;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType == null ? null : terminalType.trim();
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
        this.creator = creator;
    }

    public String getCraeteTime() {
        return craeteTime;
    }

    public void setCraeteTime(String craeteTime) {
        this.craeteTime = craeteTime == null ? null : craeteTime.trim();
    }

    public String getUpdTime() {
        return updTime;
    }

    public void setUpdTime(String updTime) {
        this.updTime = updTime == null ? null : updTime.trim();
    }

    public Short getSceneType() {
        return sceneType;
    }

    public void setSceneType(Short sceneType) {
        this.sceneType = sceneType;
    }

    public String getTerminalNetWay() {
        return terminalNetWay;
    }

    public void setTerminalNetWay(String terminalNetWay) {
        this.terminalNetWay = terminalNetWay == null ? null : terminalNetWay.trim();
    }

    public Short getThirdPlatCode() {
        return thirdPlatCode;
    }

    public void setThirdPlatCode(Short thirdPlatCode) {
        this.thirdPlatCode = thirdPlatCode;
    }
}