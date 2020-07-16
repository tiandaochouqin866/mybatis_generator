package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysTriggerConfigEntity {
    private String triggerCode;

    private Object triggerDesc;

    private String triggerCron;

    private Short triggerStatus;

    private String preTriggerCode;

    private String creator;

    private String createTime;

    private String updTime;

    public String getTriggerCode() {
        return triggerCode;
    }

    public void setTriggerCode(String triggerCode) {
        this.triggerCode = triggerCode == null ? null : triggerCode.trim();
    }

    public Object getTriggerDesc() {
        return triggerDesc;
    }

    public void setTriggerDesc(Object triggerDesc) {
        this.triggerDesc = triggerDesc;
    }

    public String getTriggerCron() {
        return triggerCron;
    }

    public void setTriggerCron(String triggerCron) {
        this.triggerCron = triggerCron == null ? null : triggerCron.trim();
    }

    public Short getTriggerStatus() {
        return triggerStatus;
    }

    public void setTriggerStatus(Short triggerStatus) {
        this.triggerStatus = triggerStatus;
    }

    public String getPreTriggerCode() {
        return preTriggerCode;
    }

    public void setPreTriggerCode(String preTriggerCode) {
        this.preTriggerCode = preTriggerCode == null ? null : preTriggerCode.trim();
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