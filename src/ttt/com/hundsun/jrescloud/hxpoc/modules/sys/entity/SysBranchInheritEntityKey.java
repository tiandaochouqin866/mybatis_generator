package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class SysBranchInheritEntityKey {
    private Long higherBranch;

    private Long lowerBranch;

    public Long getHigherBranch() {
        return higherBranch;
    }

    public void setHigherBranch(Long higherBranch) {
        this.higherBranch = higherBranch;
    }

    public Long getLowerBranch() {
        return lowerBranch;
    }

    public void setLowerBranch(Long lowerBranch) {
        this.lowerBranch = lowerBranch;
    }
}