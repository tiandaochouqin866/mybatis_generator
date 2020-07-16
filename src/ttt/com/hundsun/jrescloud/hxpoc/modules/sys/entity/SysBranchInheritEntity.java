package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysBranchInheritEntity extends SysBranchInheritEntityKey {
    private Short lowerBranchLevel;

    private Short branchSubtract;

    private String creator;

    private String createTime;

    private String updTime;

    private Short higherBranchLevel;

    public Short getLowerBranchLevel() {
        return lowerBranchLevel;
    }

    public void setLowerBranchLevel(Short lowerBranchLevel) {
        this.lowerBranchLevel = lowerBranchLevel;
    }

    public Short getBranchSubtract() {
        return branchSubtract;
    }

    public void setBranchSubtract(Short branchSubtract) {
        this.branchSubtract = branchSubtract;
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

    public Short getHigherBranchLevel() {
        return higherBranchLevel;
    }

    public void setHigherBranchLevel(Short higherBranchLevel) {
        this.higherBranchLevel = higherBranchLevel;
    }
}