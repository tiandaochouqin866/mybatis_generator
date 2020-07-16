package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;

public class SysTerminalModelEntity {
    private Long id;

    private String terminalModel;

    private String terminalType;

    private String terminalNetWay;

    private BigDecimal terminalPhoto;

    private BigDecimal defaultDeposit;

    private String producer;

    private String remark;

    private String creator;

    private String createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTerminalModel() {
        return terminalModel;
    }

    public void setTerminalModel(String terminalModel) {
        this.terminalModel = terminalModel == null ? null : terminalModel.trim();
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

    public BigDecimal getTerminalPhoto() {
        return terminalPhoto;
    }

    public void setTerminalPhoto(BigDecimal terminalPhoto) {
        this.terminalPhoto = terminalPhoto;
    }

    public BigDecimal getDefaultDeposit() {
        return defaultDeposit;
    }

    public void setDefaultDeposit(BigDecimal defaultDeposit) {
        this.defaultDeposit = defaultDeposit;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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
}