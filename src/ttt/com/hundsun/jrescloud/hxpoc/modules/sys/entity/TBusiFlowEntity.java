package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

public class TBusiFlowEntity {
    private Long busiFlowNo;

    private Short busiType;

    private Long busiNo;

    private Long busiBranch;

    private Short curPrcIndex;

    private String prcCode;

    private Short operCode;

    private String operDesc;

    private String extFile;

    private String operPerson;

    private Long operBranch;

    private String operTime;

    private String remark;

    private Object operOpinion;

    public Long getBusiFlowNo() {
        return busiFlowNo;
    }

    public void setBusiFlowNo(Long busiFlowNo) {
        this.busiFlowNo = busiFlowNo;
    }

    public Short getBusiType() {
        return busiType;
    }

    public void setBusiType(Short busiType) {
        this.busiType = busiType;
    }

    public Long getBusiNo() {
        return busiNo;
    }

    public void setBusiNo(Long busiNo) {
        this.busiNo = busiNo;
    }

    public Long getBusiBranch() {
        return busiBranch;
    }

    public void setBusiBranch(Long busiBranch) {
        this.busiBranch = busiBranch;
    }

    public Short getCurPrcIndex() {
        return curPrcIndex;
    }

    public void setCurPrcIndex(Short curPrcIndex) {
        this.curPrcIndex = curPrcIndex;
    }

    public String getPrcCode() {
        return prcCode;
    }

    public void setPrcCode(String prcCode) {
        this.prcCode = prcCode == null ? null : prcCode.trim();
    }

    public Short getOperCode() {
        return operCode;
    }

    public void setOperCode(Short operCode) {
        this.operCode = operCode;
    }

    public String getOperDesc() {
        return operDesc;
    }

    public void setOperDesc(String operDesc) {
        this.operDesc = operDesc;
    }

    public String getExtFile() {
        return extFile;
    }

    public void setExtFile(String extFile) {
        this.extFile = extFile == null ? null : extFile.trim();
    }

    public String getOperPerson() {
        return operPerson;
    }

    public void setOperPerson(String operPerson) {
        this.operPerson = operPerson == null ? null : operPerson.trim();
    }

    public Long getOperBranch() {
        return operBranch;
    }

    public void setOperBranch(Long operBranch) {
        this.operBranch = operBranch;
    }

    public String getOperTime() {
        return operTime;
    }

    public void setOperTime(String operTime) {
        this.operTime = operTime == null ? null : operTime.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Object getOperOpinion() {
        return operOpinion;
    }

    public void setOperOpinion(Object operOpinion) {
        this.operOpinion = operOpinion;
    }
}