package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class SysUpMchntApplyHisEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUpMchntApplyHisEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBranchCodeIsNull() {
            addCriterion("BRANCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBranchCodeIsNotNull() {
            addCriterion("BRANCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBranchCodeEqualTo(Long value) {
            addCriterion("BRANCH_CODE =", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotEqualTo(Long value) {
            addCriterion("BRANCH_CODE <>", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeGreaterThan(Long value) {
            addCriterion("BRANCH_CODE >", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("BRANCH_CODE >=", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeLessThan(Long value) {
            addCriterion("BRANCH_CODE <", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeLessThanOrEqualTo(Long value) {
            addCriterion("BRANCH_CODE <=", value, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeIn(List<Long> values) {
            addCriterion("BRANCH_CODE in", values, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotIn(List<Long> values) {
            addCriterion("BRANCH_CODE not in", values, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeBetween(Long value1, Long value2) {
            addCriterion("BRANCH_CODE between", value1, value2, "branchCode");
            return (Criteria) this;
        }

        public Criteria andBranchCodeNotBetween(Long value1, Long value2) {
            addCriterion("BRANCH_CODE not between", value1, value2, "branchCode");
            return (Criteria) this;
        }

        public Criteria andUpOperInIsNull() {
            addCriterion("UP_OPER_IN is null");
            return (Criteria) this;
        }

        public Criteria andUpOperInIsNotNull() {
            addCriterion("UP_OPER_IN is not null");
            return (Criteria) this;
        }

        public Criteria andUpOperInEqualTo(String value) {
            addCriterion("UP_OPER_IN =", value, "upOperIn");
            return (Criteria) this;
        }

        public Criteria andUpOperInNotEqualTo(String value) {
            addCriterion("UP_OPER_IN <>", value, "upOperIn");
            return (Criteria) this;
        }

        public Criteria andUpOperInGreaterThan(String value) {
            addCriterion("UP_OPER_IN >", value, "upOperIn");
            return (Criteria) this;
        }

        public Criteria andUpOperInGreaterThanOrEqualTo(String value) {
            addCriterion("UP_OPER_IN >=", value, "upOperIn");
            return (Criteria) this;
        }

        public Criteria andUpOperInLessThan(String value) {
            addCriterion("UP_OPER_IN <", value, "upOperIn");
            return (Criteria) this;
        }

        public Criteria andUpOperInLessThanOrEqualTo(String value) {
            addCriterion("UP_OPER_IN <=", value, "upOperIn");
            return (Criteria) this;
        }

        public Criteria andUpOperInLike(String value) {
            addCriterion("UP_OPER_IN like", value, "upOperIn");
            return (Criteria) this;
        }

        public Criteria andUpOperInNotLike(String value) {
            addCriterion("UP_OPER_IN not like", value, "upOperIn");
            return (Criteria) this;
        }

        public Criteria andUpOperInIn(List<String> values) {
            addCriterion("UP_OPER_IN in", values, "upOperIn");
            return (Criteria) this;
        }

        public Criteria andUpOperInNotIn(List<String> values) {
            addCriterion("UP_OPER_IN not in", values, "upOperIn");
            return (Criteria) this;
        }

        public Criteria andUpOperInBetween(String value1, String value2) {
            addCriterion("UP_OPER_IN between", value1, value2, "upOperIn");
            return (Criteria) this;
        }

        public Criteria andUpOperInNotBetween(String value1, String value2) {
            addCriterion("UP_OPER_IN not between", value1, value2, "upOperIn");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdIsNull() {
            addCriterion("UP_MCHNT_CD is null");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdIsNotNull() {
            addCriterion("UP_MCHNT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdEqualTo(String value) {
            addCriterion("UP_MCHNT_CD =", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdNotEqualTo(String value) {
            addCriterion("UP_MCHNT_CD <>", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdGreaterThan(String value) {
            addCriterion("UP_MCHNT_CD >", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdGreaterThanOrEqualTo(String value) {
            addCriterion("UP_MCHNT_CD >=", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdLessThan(String value) {
            addCriterion("UP_MCHNT_CD <", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdLessThanOrEqualTo(String value) {
            addCriterion("UP_MCHNT_CD <=", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdLike(String value) {
            addCriterion("UP_MCHNT_CD like", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdNotLike(String value) {
            addCriterion("UP_MCHNT_CD not like", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdIn(List<String> values) {
            addCriterion("UP_MCHNT_CD in", values, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdNotIn(List<String> values) {
            addCriterion("UP_MCHNT_CD not in", values, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdBetween(String value1, String value2) {
            addCriterion("UP_MCHNT_CD between", value1, value2, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdNotBetween(String value1, String value2) {
            addCriterion("UP_MCHNT_CD not between", value1, value2, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpIsNull() {
            addCriterion("UP_MCHNT_SVC_TP is null");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpIsNotNull() {
            addCriterion("UP_MCHNT_SVC_TP is not null");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpEqualTo(String value) {
            addCriterion("UP_MCHNT_SVC_TP =", value, "upMchntSvcTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpNotEqualTo(String value) {
            addCriterion("UP_MCHNT_SVC_TP <>", value, "upMchntSvcTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpGreaterThan(String value) {
            addCriterion("UP_MCHNT_SVC_TP >", value, "upMchntSvcTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpGreaterThanOrEqualTo(String value) {
            addCriterion("UP_MCHNT_SVC_TP >=", value, "upMchntSvcTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpLessThan(String value) {
            addCriterion("UP_MCHNT_SVC_TP <", value, "upMchntSvcTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpLessThanOrEqualTo(String value) {
            addCriterion("UP_MCHNT_SVC_TP <=", value, "upMchntSvcTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpLike(String value) {
            addCriterion("UP_MCHNT_SVC_TP like", value, "upMchntSvcTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpNotLike(String value) {
            addCriterion("UP_MCHNT_SVC_TP not like", value, "upMchntSvcTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpIn(List<String> values) {
            addCriterion("UP_MCHNT_SVC_TP in", values, "upMchntSvcTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpNotIn(List<String> values) {
            addCriterion("UP_MCHNT_SVC_TP not in", values, "upMchntSvcTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpBetween(String value1, String value2) {
            addCriterion("UP_MCHNT_SVC_TP between", value1, value2, "upMchntSvcTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntSvcTpNotBetween(String value1, String value2) {
            addCriterion("UP_MCHNT_SVC_TP not between", value1, value2, "upMchntSvcTp");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameIsNull() {
            addCriterion("UP_LIC_REG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameIsNotNull() {
            addCriterion("UP_LIC_REG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameEqualTo(String value) {
            addCriterion("UP_LIC_REG_NAME =", value, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameNotEqualTo(String value) {
            addCriterion("UP_LIC_REG_NAME <>", value, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameGreaterThan(String value) {
            addCriterion("UP_LIC_REG_NAME >", value, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameGreaterThanOrEqualTo(String value) {
            addCriterion("UP_LIC_REG_NAME >=", value, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameLessThan(String value) {
            addCriterion("UP_LIC_REG_NAME <", value, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameLessThanOrEqualTo(String value) {
            addCriterion("UP_LIC_REG_NAME <=", value, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameIn(List<String> values) {
            addCriterion("UP_LIC_REG_NAME in", values, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameNotIn(List<String> values) {
            addCriterion("UP_LIC_REG_NAME not in", values, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameBetween(String value1, String value2) {
            addCriterion("UP_LIC_REG_NAME between", value1, value2, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameNotBetween(String value1, String value2) {
            addCriterion("UP_LIC_REG_NAME not between", value1, value2, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameIsNull() {
            addCriterion("UP_BRANCH_SIMPLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameIsNotNull() {
            addCriterion("UP_BRANCH_SIMPLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameEqualTo(String value) {
            addCriterion("UP_BRANCH_SIMPLE_NAME =", value, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameNotEqualTo(String value) {
            addCriterion("UP_BRANCH_SIMPLE_NAME <>", value, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameGreaterThan(String value) {
            addCriterion("UP_BRANCH_SIMPLE_NAME >", value, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameGreaterThanOrEqualTo(String value) {
            addCriterion("UP_BRANCH_SIMPLE_NAME >=", value, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameLessThan(String value) {
            addCriterion("UP_BRANCH_SIMPLE_NAME <", value, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameLessThanOrEqualTo(String value) {
            addCriterion("UP_BRANCH_SIMPLE_NAME <=", value, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameIn(List<String> values) {
            addCriterion("UP_BRANCH_SIMPLE_NAME in", values, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameNotIn(List<String> values) {
            addCriterion("UP_BRANCH_SIMPLE_NAME not in", values, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameBetween(String value1, String value2) {
            addCriterion("UP_BRANCH_SIMPLE_NAME between", value1, value2, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameNotBetween(String value1, String value2) {
            addCriterion("UP_BRANCH_SIMPLE_NAME not between", value1, value2, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdIsNull() {
            addCriterion("UP_ACQ_REGION_CD is null");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdIsNotNull() {
            addCriterion("UP_ACQ_REGION_CD is not null");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdEqualTo(String value) {
            addCriterion("UP_ACQ_REGION_CD =", value, "upAcqRegionCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdNotEqualTo(String value) {
            addCriterion("UP_ACQ_REGION_CD <>", value, "upAcqRegionCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdGreaterThan(String value) {
            addCriterion("UP_ACQ_REGION_CD >", value, "upAcqRegionCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdGreaterThanOrEqualTo(String value) {
            addCriterion("UP_ACQ_REGION_CD >=", value, "upAcqRegionCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdLessThan(String value) {
            addCriterion("UP_ACQ_REGION_CD <", value, "upAcqRegionCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdLessThanOrEqualTo(String value) {
            addCriterion("UP_ACQ_REGION_CD <=", value, "upAcqRegionCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdLike(String value) {
            addCriterion("UP_ACQ_REGION_CD like", value, "upAcqRegionCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdNotLike(String value) {
            addCriterion("UP_ACQ_REGION_CD not like", value, "upAcqRegionCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdIn(List<String> values) {
            addCriterion("UP_ACQ_REGION_CD in", values, "upAcqRegionCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdNotIn(List<String> values) {
            addCriterion("UP_ACQ_REGION_CD not in", values, "upAcqRegionCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdBetween(String value1, String value2) {
            addCriterion("UP_ACQ_REGION_CD between", value1, value2, "upAcqRegionCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqRegionCdNotBetween(String value1, String value2) {
            addCriterion("UP_ACQ_REGION_CD not between", value1, value2, "upAcqRegionCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpIsNull() {
            addCriterion("UP_MCHNT_TP is null");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpIsNotNull() {
            addCriterion("UP_MCHNT_TP is not null");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpEqualTo(String value) {
            addCriterion("UP_MCHNT_TP =", value, "upMchntTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpNotEqualTo(String value) {
            addCriterion("UP_MCHNT_TP <>", value, "upMchntTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpGreaterThan(String value) {
            addCriterion("UP_MCHNT_TP >", value, "upMchntTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpGreaterThanOrEqualTo(String value) {
            addCriterion("UP_MCHNT_TP >=", value, "upMchntTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpLessThan(String value) {
            addCriterion("UP_MCHNT_TP <", value, "upMchntTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpLessThanOrEqualTo(String value) {
            addCriterion("UP_MCHNT_TP <=", value, "upMchntTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpLike(String value) {
            addCriterion("UP_MCHNT_TP like", value, "upMchntTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpNotLike(String value) {
            addCriterion("UP_MCHNT_TP not like", value, "upMchntTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpIn(List<String> values) {
            addCriterion("UP_MCHNT_TP in", values, "upMchntTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpNotIn(List<String> values) {
            addCriterion("UP_MCHNT_TP not in", values, "upMchntTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpBetween(String value1, String value2) {
            addCriterion("UP_MCHNT_TP between", value1, value2, "upMchntTp");
            return (Criteria) this;
        }

        public Criteria andUpMchntTpNotBetween(String value1, String value2) {
            addCriterion("UP_MCHNT_TP not between", value1, value2, "upMchntTp");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeIsNull() {
            addCriterion("UP_LIC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeIsNotNull() {
            addCriterion("UP_LIC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeEqualTo(String value) {
            addCriterion("UP_LIC_TYPE =", value, "upLicType");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeNotEqualTo(String value) {
            addCriterion("UP_LIC_TYPE <>", value, "upLicType");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeGreaterThan(String value) {
            addCriterion("UP_LIC_TYPE >", value, "upLicType");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("UP_LIC_TYPE >=", value, "upLicType");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeLessThan(String value) {
            addCriterion("UP_LIC_TYPE <", value, "upLicType");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeLessThanOrEqualTo(String value) {
            addCriterion("UP_LIC_TYPE <=", value, "upLicType");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeLike(String value) {
            addCriterion("UP_LIC_TYPE like", value, "upLicType");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeNotLike(String value) {
            addCriterion("UP_LIC_TYPE not like", value, "upLicType");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeIn(List<String> values) {
            addCriterion("UP_LIC_TYPE in", values, "upLicType");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeNotIn(List<String> values) {
            addCriterion("UP_LIC_TYPE not in", values, "upLicType");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeBetween(String value1, String value2) {
            addCriterion("UP_LIC_TYPE between", value1, value2, "upLicType");
            return (Criteria) this;
        }

        public Criteria andUpLicTypeNotBetween(String value1, String value2) {
            addCriterion("UP_LIC_TYPE not between", value1, value2, "upLicType");
            return (Criteria) this;
        }

        public Criteria andUpLicNoIsNull() {
            addCriterion("UP_LIC_NO is null");
            return (Criteria) this;
        }

        public Criteria andUpLicNoIsNotNull() {
            addCriterion("UP_LIC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUpLicNoEqualTo(String value) {
            addCriterion("UP_LIC_NO =", value, "upLicNo");
            return (Criteria) this;
        }

        public Criteria andUpLicNoNotEqualTo(String value) {
            addCriterion("UP_LIC_NO <>", value, "upLicNo");
            return (Criteria) this;
        }

        public Criteria andUpLicNoGreaterThan(String value) {
            addCriterion("UP_LIC_NO >", value, "upLicNo");
            return (Criteria) this;
        }

        public Criteria andUpLicNoGreaterThanOrEqualTo(String value) {
            addCriterion("UP_LIC_NO >=", value, "upLicNo");
            return (Criteria) this;
        }

        public Criteria andUpLicNoLessThan(String value) {
            addCriterion("UP_LIC_NO <", value, "upLicNo");
            return (Criteria) this;
        }

        public Criteria andUpLicNoLessThanOrEqualTo(String value) {
            addCriterion("UP_LIC_NO <=", value, "upLicNo");
            return (Criteria) this;
        }

        public Criteria andUpLicNoLike(String value) {
            addCriterion("UP_LIC_NO like", value, "upLicNo");
            return (Criteria) this;
        }

        public Criteria andUpLicNoNotLike(String value) {
            addCriterion("UP_LIC_NO not like", value, "upLicNo");
            return (Criteria) this;
        }

        public Criteria andUpLicNoIn(List<String> values) {
            addCriterion("UP_LIC_NO in", values, "upLicNo");
            return (Criteria) this;
        }

        public Criteria andUpLicNoNotIn(List<String> values) {
            addCriterion("UP_LIC_NO not in", values, "upLicNo");
            return (Criteria) this;
        }

        public Criteria andUpLicNoBetween(String value1, String value2) {
            addCriterion("UP_LIC_NO between", value1, value2, "upLicNo");
            return (Criteria) this;
        }

        public Criteria andUpLicNoNotBetween(String value1, String value2) {
            addCriterion("UP_LIC_NO not between", value1, value2, "upLicNo");
            return (Criteria) this;
        }

        public Criteria andUpBussAddrIsNull() {
            addCriterion("UP_BUSS_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andUpBussAddrIsNotNull() {
            addCriterion("UP_BUSS_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andUpBussAddrEqualTo(String value) {
            addCriterion("UP_BUSS_ADDR =", value, "upBussAddr");
            return (Criteria) this;
        }

        public Criteria andUpBussAddrNotEqualTo(String value) {
            addCriterion("UP_BUSS_ADDR <>", value, "upBussAddr");
            return (Criteria) this;
        }

        public Criteria andUpBussAddrGreaterThan(String value) {
            addCriterion("UP_BUSS_ADDR >", value, "upBussAddr");
            return (Criteria) this;
        }

        public Criteria andUpBussAddrGreaterThanOrEqualTo(String value) {
            addCriterion("UP_BUSS_ADDR >=", value, "upBussAddr");
            return (Criteria) this;
        }

        public Criteria andUpBussAddrLessThan(String value) {
            addCriterion("UP_BUSS_ADDR <", value, "upBussAddr");
            return (Criteria) this;
        }

        public Criteria andUpBussAddrLessThanOrEqualTo(String value) {
            addCriterion("UP_BUSS_ADDR <=", value, "upBussAddr");
            return (Criteria) this;
        }

        public Criteria andUpBussAddrIn(List<String> values) {
            addCriterion("UP_BUSS_ADDR in", values, "upBussAddr");
            return (Criteria) this;
        }

        public Criteria andUpBussAddrNotIn(List<String> values) {
            addCriterion("UP_BUSS_ADDR not in", values, "upBussAddr");
            return (Criteria) this;
        }

        public Criteria andUpBussAddrBetween(String value1, String value2) {
            addCriterion("UP_BUSS_ADDR between", value1, value2, "upBussAddr");
            return (Criteria) this;
        }

        public Criteria andUpBussAddrNotBetween(String value1, String value2) {
            addCriterion("UP_BUSS_ADDR not between", value1, value2, "upBussAddr");
            return (Criteria) this;
        }

        public Criteria andUpLicRegAddrIsNull() {
            addCriterion("UP_LIC_REG_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andUpLicRegAddrIsNotNull() {
            addCriterion("UP_LIC_REG_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andUpLicRegAddrEqualTo(String value) {
            addCriterion("UP_LIC_REG_ADDR =", value, "upLicRegAddr");
            return (Criteria) this;
        }

        public Criteria andUpLicRegAddrNotEqualTo(String value) {
            addCriterion("UP_LIC_REG_ADDR <>", value, "upLicRegAddr");
            return (Criteria) this;
        }

        public Criteria andUpLicRegAddrGreaterThan(String value) {
            addCriterion("UP_LIC_REG_ADDR >", value, "upLicRegAddr");
            return (Criteria) this;
        }

        public Criteria andUpLicRegAddrGreaterThanOrEqualTo(String value) {
            addCriterion("UP_LIC_REG_ADDR >=", value, "upLicRegAddr");
            return (Criteria) this;
        }

        public Criteria andUpLicRegAddrLessThan(String value) {
            addCriterion("UP_LIC_REG_ADDR <", value, "upLicRegAddr");
            return (Criteria) this;
        }

        public Criteria andUpLicRegAddrLessThanOrEqualTo(String value) {
            addCriterion("UP_LIC_REG_ADDR <=", value, "upLicRegAddr");
            return (Criteria) this;
        }

        public Criteria andUpLicRegAddrIn(List<String> values) {
            addCriterion("UP_LIC_REG_ADDR in", values, "upLicRegAddr");
            return (Criteria) this;
        }

        public Criteria andUpLicRegAddrNotIn(List<String> values) {
            addCriterion("UP_LIC_REG_ADDR not in", values, "upLicRegAddr");
            return (Criteria) this;
        }

        public Criteria andUpLicRegAddrBetween(String value1, String value2) {
            addCriterion("UP_LIC_REG_ADDR between", value1, value2, "upLicRegAddr");
            return (Criteria) this;
        }

        public Criteria andUpLicRegAddrNotBetween(String value1, String value2) {
            addCriterion("UP_LIC_REG_ADDR not between", value1, value2, "upLicRegAddr");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNameIsNull() {
            addCriterion("UP_LEGAL_CERT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNameIsNotNull() {
            addCriterion("UP_LEGAL_CERT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNameEqualTo(String value) {
            addCriterion("UP_LEGAL_CERT_NAME =", value, "upLegalCertName");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNameNotEqualTo(String value) {
            addCriterion("UP_LEGAL_CERT_NAME <>", value, "upLegalCertName");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNameGreaterThan(String value) {
            addCriterion("UP_LEGAL_CERT_NAME >", value, "upLegalCertName");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNameGreaterThanOrEqualTo(String value) {
            addCriterion("UP_LEGAL_CERT_NAME >=", value, "upLegalCertName");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNameLessThan(String value) {
            addCriterion("UP_LEGAL_CERT_NAME <", value, "upLegalCertName");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNameLessThanOrEqualTo(String value) {
            addCriterion("UP_LEGAL_CERT_NAME <=", value, "upLegalCertName");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNameIn(List<String> values) {
            addCriterion("UP_LEGAL_CERT_NAME in", values, "upLegalCertName");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNameNotIn(List<String> values) {
            addCriterion("UP_LEGAL_CERT_NAME not in", values, "upLegalCertName");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNameBetween(String value1, String value2) {
            addCriterion("UP_LEGAL_CERT_NAME between", value1, value2, "upLegalCertName");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNameNotBetween(String value1, String value2) {
            addCriterion("UP_LEGAL_CERT_NAME not between", value1, value2, "upLegalCertName");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeIsNull() {
            addCriterion("UP_LEGAL_CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeIsNotNull() {
            addCriterion("UP_LEGAL_CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeEqualTo(String value) {
            addCriterion("UP_LEGAL_CERT_TYPE =", value, "upLegalCertType");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeNotEqualTo(String value) {
            addCriterion("UP_LEGAL_CERT_TYPE <>", value, "upLegalCertType");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeGreaterThan(String value) {
            addCriterion("UP_LEGAL_CERT_TYPE >", value, "upLegalCertType");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("UP_LEGAL_CERT_TYPE >=", value, "upLegalCertType");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeLessThan(String value) {
            addCriterion("UP_LEGAL_CERT_TYPE <", value, "upLegalCertType");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeLessThanOrEqualTo(String value) {
            addCriterion("UP_LEGAL_CERT_TYPE <=", value, "upLegalCertType");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeLike(String value) {
            addCriterion("UP_LEGAL_CERT_TYPE like", value, "upLegalCertType");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeNotLike(String value) {
            addCriterion("UP_LEGAL_CERT_TYPE not like", value, "upLegalCertType");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeIn(List<String> values) {
            addCriterion("UP_LEGAL_CERT_TYPE in", values, "upLegalCertType");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeNotIn(List<String> values) {
            addCriterion("UP_LEGAL_CERT_TYPE not in", values, "upLegalCertType");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeBetween(String value1, String value2) {
            addCriterion("UP_LEGAL_CERT_TYPE between", value1, value2, "upLegalCertType");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertTypeNotBetween(String value1, String value2) {
            addCriterion("UP_LEGAL_CERT_TYPE not between", value1, value2, "upLegalCertType");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoIsNull() {
            addCriterion("UP_LEGAL_CERT_NO is null");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoIsNotNull() {
            addCriterion("UP_LEGAL_CERT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoEqualTo(String value) {
            addCriterion("UP_LEGAL_CERT_NO =", value, "upLegalCertNo");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoNotEqualTo(String value) {
            addCriterion("UP_LEGAL_CERT_NO <>", value, "upLegalCertNo");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoGreaterThan(String value) {
            addCriterion("UP_LEGAL_CERT_NO >", value, "upLegalCertNo");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("UP_LEGAL_CERT_NO >=", value, "upLegalCertNo");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoLessThan(String value) {
            addCriterion("UP_LEGAL_CERT_NO <", value, "upLegalCertNo");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoLessThanOrEqualTo(String value) {
            addCriterion("UP_LEGAL_CERT_NO <=", value, "upLegalCertNo");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoLike(String value) {
            addCriterion("UP_LEGAL_CERT_NO like", value, "upLegalCertNo");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoNotLike(String value) {
            addCriterion("UP_LEGAL_CERT_NO not like", value, "upLegalCertNo");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoIn(List<String> values) {
            addCriterion("UP_LEGAL_CERT_NO in", values, "upLegalCertNo");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoNotIn(List<String> values) {
            addCriterion("UP_LEGAL_CERT_NO not in", values, "upLegalCertNo");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoBetween(String value1, String value2) {
            addCriterion("UP_LEGAL_CERT_NO between", value1, value2, "upLegalCertNo");
            return (Criteria) this;
        }

        public Criteria andUpLegalCertNoNotBetween(String value1, String value2) {
            addCriterion("UP_LEGAL_CERT_NO not between", value1, value2, "upLegalCertNo");
            return (Criteria) this;
        }

        public Criteria andUpContactorIsNull() {
            addCriterion("UP_CONTACTOR is null");
            return (Criteria) this;
        }

        public Criteria andUpContactorIsNotNull() {
            addCriterion("UP_CONTACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andUpContactorEqualTo(String value) {
            addCriterion("UP_CONTACTOR =", value, "upContactor");
            return (Criteria) this;
        }

        public Criteria andUpContactorNotEqualTo(String value) {
            addCriterion("UP_CONTACTOR <>", value, "upContactor");
            return (Criteria) this;
        }

        public Criteria andUpContactorGreaterThan(String value) {
            addCriterion("UP_CONTACTOR >", value, "upContactor");
            return (Criteria) this;
        }

        public Criteria andUpContactorGreaterThanOrEqualTo(String value) {
            addCriterion("UP_CONTACTOR >=", value, "upContactor");
            return (Criteria) this;
        }

        public Criteria andUpContactorLessThan(String value) {
            addCriterion("UP_CONTACTOR <", value, "upContactor");
            return (Criteria) this;
        }

        public Criteria andUpContactorLessThanOrEqualTo(String value) {
            addCriterion("UP_CONTACTOR <=", value, "upContactor");
            return (Criteria) this;
        }

        public Criteria andUpContactorIn(List<String> values) {
            addCriterion("UP_CONTACTOR in", values, "upContactor");
            return (Criteria) this;
        }

        public Criteria andUpContactorNotIn(List<String> values) {
            addCriterion("UP_CONTACTOR not in", values, "upContactor");
            return (Criteria) this;
        }

        public Criteria andUpContactorBetween(String value1, String value2) {
            addCriterion("UP_CONTACTOR between", value1, value2, "upContactor");
            return (Criteria) this;
        }

        public Criteria andUpContactorNotBetween(String value1, String value2) {
            addCriterion("UP_CONTACTOR not between", value1, value2, "upContactor");
            return (Criteria) this;
        }

        public Criteria andUpBranchBusiAddrIsNull() {
            addCriterion("UP_BRANCH_BUSI_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andUpBranchBusiAddrIsNotNull() {
            addCriterion("UP_BRANCH_BUSI_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andUpBranchBusiAddrEqualTo(String value) {
            addCriterion("UP_BRANCH_BUSI_ADDR =", value, "upBranchBusiAddr");
            return (Criteria) this;
        }

        public Criteria andUpBranchBusiAddrNotEqualTo(String value) {
            addCriterion("UP_BRANCH_BUSI_ADDR <>", value, "upBranchBusiAddr");
            return (Criteria) this;
        }

        public Criteria andUpBranchBusiAddrGreaterThan(String value) {
            addCriterion("UP_BRANCH_BUSI_ADDR >", value, "upBranchBusiAddr");
            return (Criteria) this;
        }

        public Criteria andUpBranchBusiAddrGreaterThanOrEqualTo(String value) {
            addCriterion("UP_BRANCH_BUSI_ADDR >=", value, "upBranchBusiAddr");
            return (Criteria) this;
        }

        public Criteria andUpBranchBusiAddrLessThan(String value) {
            addCriterion("UP_BRANCH_BUSI_ADDR <", value, "upBranchBusiAddr");
            return (Criteria) this;
        }

        public Criteria andUpBranchBusiAddrLessThanOrEqualTo(String value) {
            addCriterion("UP_BRANCH_BUSI_ADDR <=", value, "upBranchBusiAddr");
            return (Criteria) this;
        }

        public Criteria andUpBranchBusiAddrIn(List<String> values) {
            addCriterion("UP_BRANCH_BUSI_ADDR in", values, "upBranchBusiAddr");
            return (Criteria) this;
        }

        public Criteria andUpBranchBusiAddrNotIn(List<String> values) {
            addCriterion("UP_BRANCH_BUSI_ADDR not in", values, "upBranchBusiAddr");
            return (Criteria) this;
        }

        public Criteria andUpBranchBusiAddrBetween(String value1, String value2) {
            addCriterion("UP_BRANCH_BUSI_ADDR between", value1, value2, "upBranchBusiAddr");
            return (Criteria) this;
        }

        public Criteria andUpBranchBusiAddrNotBetween(String value1, String value2) {
            addCriterion("UP_BRANCH_BUSI_ADDR not between", value1, value2, "upBranchBusiAddr");
            return (Criteria) this;
        }

        public Criteria andUpMobileNoIsNull() {
            addCriterion("UP_MOBILE_NO is null");
            return (Criteria) this;
        }

        public Criteria andUpMobileNoIsNotNull() {
            addCriterion("UP_MOBILE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUpMobileNoEqualTo(String value) {
            addCriterion("UP_MOBILE_NO =", value, "upMobileNo");
            return (Criteria) this;
        }

        public Criteria andUpMobileNoNotEqualTo(String value) {
            addCriterion("UP_MOBILE_NO <>", value, "upMobileNo");
            return (Criteria) this;
        }

        public Criteria andUpMobileNoGreaterThan(String value) {
            addCriterion("UP_MOBILE_NO >", value, "upMobileNo");
            return (Criteria) this;
        }

        public Criteria andUpMobileNoGreaterThanOrEqualTo(String value) {
            addCriterion("UP_MOBILE_NO >=", value, "upMobileNo");
            return (Criteria) this;
        }

        public Criteria andUpMobileNoLessThan(String value) {
            addCriterion("UP_MOBILE_NO <", value, "upMobileNo");
            return (Criteria) this;
        }

        public Criteria andUpMobileNoLessThanOrEqualTo(String value) {
            addCriterion("UP_MOBILE_NO <=", value, "upMobileNo");
            return (Criteria) this;
        }

        public Criteria andUpMobileNoIn(List<String> values) {
            addCriterion("UP_MOBILE_NO in", values, "upMobileNo");
            return (Criteria) this;
        }

        public Criteria andUpMobileNoNotIn(List<String> values) {
            addCriterion("UP_MOBILE_NO not in", values, "upMobileNo");
            return (Criteria) this;
        }

        public Criteria andUpMobileNoBetween(String value1, String value2) {
            addCriterion("UP_MOBILE_NO between", value1, value2, "upMobileNo");
            return (Criteria) this;
        }

        public Criteria andUpMobileNoNotBetween(String value1, String value2) {
            addCriterion("UP_MOBILE_NO not between", value1, value2, "upMobileNo");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInIsNull() {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN is null");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInIsNotNull() {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN is not null");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInEqualTo(String value) {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN =", value, "upDirectAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInNotEqualTo(String value) {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN <>", value, "upDirectAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInGreaterThan(String value) {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN >", value, "upDirectAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInGreaterThanOrEqualTo(String value) {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN >=", value, "upDirectAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInLessThan(String value) {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN <", value, "upDirectAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInLessThanOrEqualTo(String value) {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN <=", value, "upDirectAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInLike(String value) {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN like", value, "upDirectAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInNotLike(String value) {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN not like", value, "upDirectAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInIn(List<String> values) {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN in", values, "upDirectAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInNotIn(List<String> values) {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN not in", values, "upDirectAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInBetween(String value1, String value2) {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN between", value1, value2, "upDirectAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andUpDirectAcqSettleInNotBetween(String value1, String value2) {
            addCriterion("UP_DIRECT_ACQ_SETTLE_IN not between", value1, value2, "upDirectAcqSettleIn");
            return (Criteria) this;
        }

        public Criteria andUpPaySysSettleNo1IsNull() {
            addCriterion("UP_PAY_SYS_SETTLE_NO1 is null");
            return (Criteria) this;
        }

        public Criteria andUpPaySysSettleNo1IsNotNull() {
            addCriterion("UP_PAY_SYS_SETTLE_NO1 is not null");
            return (Criteria) this;
        }

        public Criteria andUpPaySysSettleNo1EqualTo(String value) {
            addCriterion("UP_PAY_SYS_SETTLE_NO1 =", value, "upPaySysSettleNo1");
            return (Criteria) this;
        }

        public Criteria andUpPaySysSettleNo1NotEqualTo(String value) {
            addCriterion("UP_PAY_SYS_SETTLE_NO1 <>", value, "upPaySysSettleNo1");
            return (Criteria) this;
        }

        public Criteria andUpPaySysSettleNo1GreaterThan(String value) {
            addCriterion("UP_PAY_SYS_SETTLE_NO1 >", value, "upPaySysSettleNo1");
            return (Criteria) this;
        }

        public Criteria andUpPaySysSettleNo1GreaterThanOrEqualTo(String value) {
            addCriterion("UP_PAY_SYS_SETTLE_NO1 >=", value, "upPaySysSettleNo1");
            return (Criteria) this;
        }

        public Criteria andUpPaySysSettleNo1LessThan(String value) {
            addCriterion("UP_PAY_SYS_SETTLE_NO1 <", value, "upPaySysSettleNo1");
            return (Criteria) this;
        }

        public Criteria andUpPaySysSettleNo1LessThanOrEqualTo(String value) {
            addCriterion("UP_PAY_SYS_SETTLE_NO1 <=", value, "upPaySysSettleNo1");
            return (Criteria) this;
        }

        public Criteria andUpPaySysSettleNo1In(List<String> values) {
            addCriterion("UP_PAY_SYS_SETTLE_NO1 in", values, "upPaySysSettleNo1");
            return (Criteria) this;
        }

        public Criteria andUpPaySysSettleNo1NotIn(List<String> values) {
            addCriterion("UP_PAY_SYS_SETTLE_NO1 not in", values, "upPaySysSettleNo1");
            return (Criteria) this;
        }

        public Criteria andUpPaySysSettleNo1Between(String value1, String value2) {
            addCriterion("UP_PAY_SYS_SETTLE_NO1 between", value1, value2, "upPaySysSettleNo1");
            return (Criteria) this;
        }

        public Criteria andUpPaySysSettleNo1NotBetween(String value1, String value2) {
            addCriterion("UP_PAY_SYS_SETTLE_NO1 not between", value1, value2, "upPaySysSettleNo1");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpIsNull() {
            addCriterion("UP_SPEC_DISC_TP is null");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpIsNotNull() {
            addCriterion("UP_SPEC_DISC_TP is not null");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpEqualTo(String value) {
            addCriterion("UP_SPEC_DISC_TP =", value, "upSpecDiscTp");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpNotEqualTo(String value) {
            addCriterion("UP_SPEC_DISC_TP <>", value, "upSpecDiscTp");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpGreaterThan(String value) {
            addCriterion("UP_SPEC_DISC_TP >", value, "upSpecDiscTp");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpGreaterThanOrEqualTo(String value) {
            addCriterion("UP_SPEC_DISC_TP >=", value, "upSpecDiscTp");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpLessThan(String value) {
            addCriterion("UP_SPEC_DISC_TP <", value, "upSpecDiscTp");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpLessThanOrEqualTo(String value) {
            addCriterion("UP_SPEC_DISC_TP <=", value, "upSpecDiscTp");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpLike(String value) {
            addCriterion("UP_SPEC_DISC_TP like", value, "upSpecDiscTp");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpNotLike(String value) {
            addCriterion("UP_SPEC_DISC_TP not like", value, "upSpecDiscTp");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpIn(List<String> values) {
            addCriterion("UP_SPEC_DISC_TP in", values, "upSpecDiscTp");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpNotIn(List<String> values) {
            addCriterion("UP_SPEC_DISC_TP not in", values, "upSpecDiscTp");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpBetween(String value1, String value2) {
            addCriterion("UP_SPEC_DISC_TP between", value1, value2, "upSpecDiscTp");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscTpNotBetween(String value1, String value2) {
            addCriterion("UP_SPEC_DISC_TP not between", value1, value2, "upSpecDiscTp");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlIsNull() {
            addCriterion("UP_SPEC_DISC_LVL is null");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlIsNotNull() {
            addCriterion("UP_SPEC_DISC_LVL is not null");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlEqualTo(String value) {
            addCriterion("UP_SPEC_DISC_LVL =", value, "upSpecDiscLvl");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlNotEqualTo(String value) {
            addCriterion("UP_SPEC_DISC_LVL <>", value, "upSpecDiscLvl");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlGreaterThan(String value) {
            addCriterion("UP_SPEC_DISC_LVL >", value, "upSpecDiscLvl");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlGreaterThanOrEqualTo(String value) {
            addCriterion("UP_SPEC_DISC_LVL >=", value, "upSpecDiscLvl");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlLessThan(String value) {
            addCriterion("UP_SPEC_DISC_LVL <", value, "upSpecDiscLvl");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlLessThanOrEqualTo(String value) {
            addCriterion("UP_SPEC_DISC_LVL <=", value, "upSpecDiscLvl");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlLike(String value) {
            addCriterion("UP_SPEC_DISC_LVL like", value, "upSpecDiscLvl");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlNotLike(String value) {
            addCriterion("UP_SPEC_DISC_LVL not like", value, "upSpecDiscLvl");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlIn(List<String> values) {
            addCriterion("UP_SPEC_DISC_LVL in", values, "upSpecDiscLvl");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlNotIn(List<String> values) {
            addCriterion("UP_SPEC_DISC_LVL not in", values, "upSpecDiscLvl");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlBetween(String value1, String value2) {
            addCriterion("UP_SPEC_DISC_LVL between", value1, value2, "upSpecDiscLvl");
            return (Criteria) this;
        }

        public Criteria andUpSpecDiscLvlNotBetween(String value1, String value2) {
            addCriterion("UP_SPEC_DISC_LVL not between", value1, value2, "upSpecDiscLvl");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoIsNull() {
            addCriterion("UP_ALLOT_ALGO is null");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoIsNotNull() {
            addCriterion("UP_ALLOT_ALGO is not null");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoEqualTo(String value) {
            addCriterion("UP_ALLOT_ALGO =", value, "upAllotAlgo");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoNotEqualTo(String value) {
            addCriterion("UP_ALLOT_ALGO <>", value, "upAllotAlgo");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoGreaterThan(String value) {
            addCriterion("UP_ALLOT_ALGO >", value, "upAllotAlgo");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoGreaterThanOrEqualTo(String value) {
            addCriterion("UP_ALLOT_ALGO >=", value, "upAllotAlgo");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoLessThan(String value) {
            addCriterion("UP_ALLOT_ALGO <", value, "upAllotAlgo");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoLessThanOrEqualTo(String value) {
            addCriterion("UP_ALLOT_ALGO <=", value, "upAllotAlgo");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoLike(String value) {
            addCriterion("UP_ALLOT_ALGO like", value, "upAllotAlgo");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoNotLike(String value) {
            addCriterion("UP_ALLOT_ALGO not like", value, "upAllotAlgo");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoIn(List<String> values) {
            addCriterion("UP_ALLOT_ALGO in", values, "upAllotAlgo");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoNotIn(List<String> values) {
            addCriterion("UP_ALLOT_ALGO not in", values, "upAllotAlgo");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoBetween(String value1, String value2) {
            addCriterion("UP_ALLOT_ALGO between", value1, value2, "upAllotAlgo");
            return (Criteria) this;
        }

        public Criteria andUpAllotAlgoNotBetween(String value1, String value2) {
            addCriterion("UP_ALLOT_ALGO not between", value1, value2, "upAllotAlgo");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdIsNull() {
            addCriterion("UP_ALLOT_CD is null");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdIsNotNull() {
            addCriterion("UP_ALLOT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdEqualTo(String value) {
            addCriterion("UP_ALLOT_CD =", value, "upAllotCd");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdNotEqualTo(String value) {
            addCriterion("UP_ALLOT_CD <>", value, "upAllotCd");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdGreaterThan(String value) {
            addCriterion("UP_ALLOT_CD >", value, "upAllotCd");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdGreaterThanOrEqualTo(String value) {
            addCriterion("UP_ALLOT_CD >=", value, "upAllotCd");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdLessThan(String value) {
            addCriterion("UP_ALLOT_CD <", value, "upAllotCd");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdLessThanOrEqualTo(String value) {
            addCriterion("UP_ALLOT_CD <=", value, "upAllotCd");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdLike(String value) {
            addCriterion("UP_ALLOT_CD like", value, "upAllotCd");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdNotLike(String value) {
            addCriterion("UP_ALLOT_CD not like", value, "upAllotCd");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdIn(List<String> values) {
            addCriterion("UP_ALLOT_CD in", values, "upAllotCd");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdNotIn(List<String> values) {
            addCriterion("UP_ALLOT_CD not in", values, "upAllotCd");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdBetween(String value1, String value2) {
            addCriterion("UP_ALLOT_CD between", value1, value2, "upAllotCd");
            return (Criteria) this;
        }

        public Criteria andUpAllotCdNotBetween(String value1, String value2) {
            addCriterion("UP_ALLOT_CD not between", value1, value2, "upAllotCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexIsNull() {
            addCriterion("UP_MCHNT_DISC_DET_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexIsNotNull() {
            addCriterion("UP_MCHNT_DISC_DET_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexEqualTo(String value) {
            addCriterion("UP_MCHNT_DISC_DET_INDEX =", value, "upMchntDiscDetIndex");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexNotEqualTo(String value) {
            addCriterion("UP_MCHNT_DISC_DET_INDEX <>", value, "upMchntDiscDetIndex");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexGreaterThan(String value) {
            addCriterion("UP_MCHNT_DISC_DET_INDEX >", value, "upMchntDiscDetIndex");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexGreaterThanOrEqualTo(String value) {
            addCriterion("UP_MCHNT_DISC_DET_INDEX >=", value, "upMchntDiscDetIndex");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexLessThan(String value) {
            addCriterion("UP_MCHNT_DISC_DET_INDEX <", value, "upMchntDiscDetIndex");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexLessThanOrEqualTo(String value) {
            addCriterion("UP_MCHNT_DISC_DET_INDEX <=", value, "upMchntDiscDetIndex");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexLike(String value) {
            addCriterion("UP_MCHNT_DISC_DET_INDEX like", value, "upMchntDiscDetIndex");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexNotLike(String value) {
            addCriterion("UP_MCHNT_DISC_DET_INDEX not like", value, "upMchntDiscDetIndex");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexIn(List<String> values) {
            addCriterion("UP_MCHNT_DISC_DET_INDEX in", values, "upMchntDiscDetIndex");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexNotIn(List<String> values) {
            addCriterion("UP_MCHNT_DISC_DET_INDEX not in", values, "upMchntDiscDetIndex");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexBetween(String value1, String value2) {
            addCriterion("UP_MCHNT_DISC_DET_INDEX between", value1, value2, "upMchntDiscDetIndex");
            return (Criteria) this;
        }

        public Criteria andUpMchntDiscDetIndexNotBetween(String value1, String value2) {
            addCriterion("UP_MCHNT_DISC_DET_INDEX not between", value1, value2, "upMchntDiscDetIndex");
            return (Criteria) this;
        }

        public Criteria andUpSvcNetUrlIsNull() {
            addCriterion("UP_SVC_NET_URL is null");
            return (Criteria) this;
        }

        public Criteria andUpSvcNetUrlIsNotNull() {
            addCriterion("UP_SVC_NET_URL is not null");
            return (Criteria) this;
        }

        public Criteria andUpSvcNetUrlEqualTo(String value) {
            addCriterion("UP_SVC_NET_URL =", value, "upSvcNetUrl");
            return (Criteria) this;
        }

        public Criteria andUpSvcNetUrlNotEqualTo(String value) {
            addCriterion("UP_SVC_NET_URL <>", value, "upSvcNetUrl");
            return (Criteria) this;
        }

        public Criteria andUpSvcNetUrlGreaterThan(String value) {
            addCriterion("UP_SVC_NET_URL >", value, "upSvcNetUrl");
            return (Criteria) this;
        }

        public Criteria andUpSvcNetUrlGreaterThanOrEqualTo(String value) {
            addCriterion("UP_SVC_NET_URL >=", value, "upSvcNetUrl");
            return (Criteria) this;
        }

        public Criteria andUpSvcNetUrlLessThan(String value) {
            addCriterion("UP_SVC_NET_URL <", value, "upSvcNetUrl");
            return (Criteria) this;
        }

        public Criteria andUpSvcNetUrlLessThanOrEqualTo(String value) {
            addCriterion("UP_SVC_NET_URL <=", value, "upSvcNetUrl");
            return (Criteria) this;
        }

        public Criteria andUpSvcNetUrlIn(List<String> values) {
            addCriterion("UP_SVC_NET_URL in", values, "upSvcNetUrl");
            return (Criteria) this;
        }

        public Criteria andUpSvcNetUrlNotIn(List<String> values) {
            addCriterion("UP_SVC_NET_URL not in", values, "upSvcNetUrl");
            return (Criteria) this;
        }

        public Criteria andUpSvcNetUrlBetween(String value1, String value2) {
            addCriterion("UP_SVC_NET_URL between", value1, value2, "upSvcNetUrl");
            return (Criteria) this;
        }

        public Criteria andUpSvcNetUrlNotBetween(String value1, String value2) {
            addCriterion("UP_SVC_NET_URL not between", value1, value2, "upSvcNetUrl");
            return (Criteria) this;
        }

        public Criteria andUpMchntWebSiteNmIsNull() {
            addCriterion("UP_MCHNT_WEB_SITE_NM is null");
            return (Criteria) this;
        }

        public Criteria andUpMchntWebSiteNmIsNotNull() {
            addCriterion("UP_MCHNT_WEB_SITE_NM is not null");
            return (Criteria) this;
        }

        public Criteria andUpMchntWebSiteNmEqualTo(String value) {
            addCriterion("UP_MCHNT_WEB_SITE_NM =", value, "upMchntWebSiteNm");
            return (Criteria) this;
        }

        public Criteria andUpMchntWebSiteNmNotEqualTo(String value) {
            addCriterion("UP_MCHNT_WEB_SITE_NM <>", value, "upMchntWebSiteNm");
            return (Criteria) this;
        }

        public Criteria andUpMchntWebSiteNmGreaterThan(String value) {
            addCriterion("UP_MCHNT_WEB_SITE_NM >", value, "upMchntWebSiteNm");
            return (Criteria) this;
        }

        public Criteria andUpMchntWebSiteNmGreaterThanOrEqualTo(String value) {
            addCriterion("UP_MCHNT_WEB_SITE_NM >=", value, "upMchntWebSiteNm");
            return (Criteria) this;
        }

        public Criteria andUpMchntWebSiteNmLessThan(String value) {
            addCriterion("UP_MCHNT_WEB_SITE_NM <", value, "upMchntWebSiteNm");
            return (Criteria) this;
        }

        public Criteria andUpMchntWebSiteNmLessThanOrEqualTo(String value) {
            addCriterion("UP_MCHNT_WEB_SITE_NM <=", value, "upMchntWebSiteNm");
            return (Criteria) this;
        }

        public Criteria andUpMchntWebSiteNmIn(List<String> values) {
            addCriterion("UP_MCHNT_WEB_SITE_NM in", values, "upMchntWebSiteNm");
            return (Criteria) this;
        }

        public Criteria andUpMchntWebSiteNmNotIn(List<String> values) {
            addCriterion("UP_MCHNT_WEB_SITE_NM not in", values, "upMchntWebSiteNm");
            return (Criteria) this;
        }

        public Criteria andUpMchntWebSiteNmBetween(String value1, String value2) {
            addCriterion("UP_MCHNT_WEB_SITE_NM between", value1, value2, "upMchntWebSiteNm");
            return (Criteria) this;
        }

        public Criteria andUpMchntWebSiteNmNotBetween(String value1, String value2) {
            addCriterion("UP_MCHNT_WEB_SITE_NM not between", value1, value2, "upMchntWebSiteNm");
            return (Criteria) this;
        }

        public Criteria andUpBussTpIsNull() {
            addCriterion("UP_BUSS_TP is null");
            return (Criteria) this;
        }

        public Criteria andUpBussTpIsNotNull() {
            addCriterion("UP_BUSS_TP is not null");
            return (Criteria) this;
        }

        public Criteria andUpBussTpEqualTo(String value) {
            addCriterion("UP_BUSS_TP =", value, "upBussTp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpNotEqualTo(String value) {
            addCriterion("UP_BUSS_TP <>", value, "upBussTp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpGreaterThan(String value) {
            addCriterion("UP_BUSS_TP >", value, "upBussTp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpGreaterThanOrEqualTo(String value) {
            addCriterion("UP_BUSS_TP >=", value, "upBussTp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpLessThan(String value) {
            addCriterion("UP_BUSS_TP <", value, "upBussTp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpLessThanOrEqualTo(String value) {
            addCriterion("UP_BUSS_TP <=", value, "upBussTp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpLike(String value) {
            addCriterion("UP_BUSS_TP like", value, "upBussTp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpNotLike(String value) {
            addCriterion("UP_BUSS_TP not like", value, "upBussTp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpIn(List<String> values) {
            addCriterion("UP_BUSS_TP in", values, "upBussTp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpNotIn(List<String> values) {
            addCriterion("UP_BUSS_TP not in", values, "upBussTp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBetween(String value1, String value2) {
            addCriterion("UP_BUSS_TP between", value1, value2, "upBussTp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpNotBetween(String value1, String value2) {
            addCriterion("UP_BUSS_TP not between", value1, value2, "upBussTp");
            return (Criteria) this;
        }

        public Criteria andUpProdFuncIsNull() {
            addCriterion("UP_PROD_FUNC is null");
            return (Criteria) this;
        }

        public Criteria andUpProdFuncIsNotNull() {
            addCriterion("UP_PROD_FUNC is not null");
            return (Criteria) this;
        }

        public Criteria andUpProdFuncEqualTo(String value) {
            addCriterion("UP_PROD_FUNC =", value, "upProdFunc");
            return (Criteria) this;
        }

        public Criteria andUpProdFuncNotEqualTo(String value) {
            addCriterion("UP_PROD_FUNC <>", value, "upProdFunc");
            return (Criteria) this;
        }

        public Criteria andUpProdFuncGreaterThan(String value) {
            addCriterion("UP_PROD_FUNC >", value, "upProdFunc");
            return (Criteria) this;
        }

        public Criteria andUpProdFuncGreaterThanOrEqualTo(String value) {
            addCriterion("UP_PROD_FUNC >=", value, "upProdFunc");
            return (Criteria) this;
        }

        public Criteria andUpProdFuncLessThan(String value) {
            addCriterion("UP_PROD_FUNC <", value, "upProdFunc");
            return (Criteria) this;
        }

        public Criteria andUpProdFuncLessThanOrEqualTo(String value) {
            addCriterion("UP_PROD_FUNC <=", value, "upProdFunc");
            return (Criteria) this;
        }

        public Criteria andUpProdFuncIn(List<String> values) {
            addCriterion("UP_PROD_FUNC in", values, "upProdFunc");
            return (Criteria) this;
        }

        public Criteria andUpProdFuncNotIn(List<String> values) {
            addCriterion("UP_PROD_FUNC not in", values, "upProdFunc");
            return (Criteria) this;
        }

        public Criteria andUpProdFuncBetween(String value1, String value2) {
            addCriterion("UP_PROD_FUNC between", value1, value2, "upProdFunc");
            return (Criteria) this;
        }

        public Criteria andUpProdFuncNotBetween(String value1, String value2) {
            addCriterion("UP_PROD_FUNC not between", value1, value2, "upProdFunc");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailIsNull() {
            addCriterion("UP_BRANCH_E_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailIsNotNull() {
            addCriterion("UP_BRANCH_E_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailEqualTo(String value) {
            addCriterion("UP_BRANCH_E_MAIL =", value, "upBranchEMail");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailNotEqualTo(String value) {
            addCriterion("UP_BRANCH_E_MAIL <>", value, "upBranchEMail");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailGreaterThan(String value) {
            addCriterion("UP_BRANCH_E_MAIL >", value, "upBranchEMail");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailGreaterThanOrEqualTo(String value) {
            addCriterion("UP_BRANCH_E_MAIL >=", value, "upBranchEMail");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailLessThan(String value) {
            addCriterion("UP_BRANCH_E_MAIL <", value, "upBranchEMail");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailLessThanOrEqualTo(String value) {
            addCriterion("UP_BRANCH_E_MAIL <=", value, "upBranchEMail");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailLike(String value) {
            addCriterion("UP_BRANCH_E_MAIL like", value, "upBranchEMail");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailNotLike(String value) {
            addCriterion("UP_BRANCH_E_MAIL not like", value, "upBranchEMail");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailIn(List<String> values) {
            addCriterion("UP_BRANCH_E_MAIL in", values, "upBranchEMail");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailNotIn(List<String> values) {
            addCriterion("UP_BRANCH_E_MAIL not in", values, "upBranchEMail");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailBetween(String value1, String value2) {
            addCriterion("UP_BRANCH_E_MAIL between", value1, value2, "upBranchEMail");
            return (Criteria) this;
        }

        public Criteria andUpBranchEMailNotBetween(String value1, String value2) {
            addCriterion("UP_BRANCH_E_MAIL not between", value1, value2, "upBranchEMail");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitIsNull() {
            addCriterion("UP_SINGLE_AT_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitIsNotNull() {
            addCriterion("UP_SINGLE_AT_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitEqualTo(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT =", value, "upSingleAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitNotEqualTo(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT <>", value, "upSingleAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitGreaterThan(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT >", value, "upSingleAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitGreaterThanOrEqualTo(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT >=", value, "upSingleAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitLessThan(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT <", value, "upSingleAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitLessThanOrEqualTo(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT <=", value, "upSingleAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitLike(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT like", value, "upSingleAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitNotLike(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT not like", value, "upSingleAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitIn(List<String> values) {
            addCriterion("UP_SINGLE_AT_LIMIT in", values, "upSingleAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitNotIn(List<String> values) {
            addCriterion("UP_SINGLE_AT_LIMIT not in", values, "upSingleAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitBetween(String value1, String value2) {
            addCriterion("UP_SINGLE_AT_LIMIT between", value1, value2, "upSingleAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitNotBetween(String value1, String value2) {
            addCriterion("UP_SINGLE_AT_LIMIT not between", value1, value2, "upSingleAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescIsNull() {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescIsNotNull() {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescEqualTo(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC =", value, "upSingleAtLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescNotEqualTo(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC <>", value, "upSingleAtLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescGreaterThan(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC >", value, "upSingleAtLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescGreaterThanOrEqualTo(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC >=", value, "upSingleAtLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescLessThan(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC <", value, "upSingleAtLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescLessThanOrEqualTo(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC <=", value, "upSingleAtLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescLike(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC like", value, "upSingleAtLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescNotLike(String value) {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC not like", value, "upSingleAtLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescIn(List<String> values) {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC in", values, "upSingleAtLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescNotIn(List<String> values) {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC not in", values, "upSingleAtLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescBetween(String value1, String value2) {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC between", value1, value2, "upSingleAtLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleAtLimitDescNotBetween(String value1, String value2) {
            addCriterion("UP_SINGLE_AT_LIMIT_DESC not between", value1, value2, "upSingleAtLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitIsNull() {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitIsNotNull() {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitEqualTo(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT =", value, "upSingleCardDayAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitNotEqualTo(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT <>", value, "upSingleCardDayAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitGreaterThan(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT >", value, "upSingleCardDayAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitGreaterThanOrEqualTo(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT >=", value, "upSingleCardDayAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitLessThan(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT <", value, "upSingleCardDayAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitLessThanOrEqualTo(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT <=", value, "upSingleCardDayAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitLike(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT like", value, "upSingleCardDayAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitNotLike(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT not like", value, "upSingleCardDayAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitIn(List<String> values) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT in", values, "upSingleCardDayAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitNotIn(List<String> values) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT not in", values, "upSingleCardDayAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitBetween(String value1, String value2) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT between", value1, value2, "upSingleCardDayAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitNotBetween(String value1, String value2) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT not between", value1, value2, "upSingleCardDayAtLimit");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescIsNull() {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescIsNotNull() {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescEqualTo(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC =", value, "upSingleCardDayLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescNotEqualTo(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC <>", value, "upSingleCardDayLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescGreaterThan(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC >", value, "upSingleCardDayLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescGreaterThanOrEqualTo(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC >=", value, "upSingleCardDayLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescLessThan(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC <", value, "upSingleCardDayLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescLessThanOrEqualTo(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC <=", value, "upSingleCardDayLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescLike(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC like", value, "upSingleCardDayLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescNotLike(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC not like", value, "upSingleCardDayLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescIn(List<String> values) {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC in", values, "upSingleCardDayLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescNotIn(List<String> values) {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC not in", values, "upSingleCardDayLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescBetween(String value1, String value2) {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC between", value1, value2, "upSingleCardDayLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayLimitDescNotBetween(String value1, String value2) {
            addCriterion("UP_SINGLE_CARD_DAY_LIMIT_DESC not between", value1, value2, "upSingleCardDayLimitDesc");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInIsNull() {
            addCriterion("UP_SUBMCHNT_IN is null");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInIsNotNull() {
            addCriterion("UP_SUBMCHNT_IN is not null");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInEqualTo(String value) {
            addCriterion("UP_SUBMCHNT_IN =", value, "upSubmchntIn");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInNotEqualTo(String value) {
            addCriterion("UP_SUBMCHNT_IN <>", value, "upSubmchntIn");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInGreaterThan(String value) {
            addCriterion("UP_SUBMCHNT_IN >", value, "upSubmchntIn");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInGreaterThanOrEqualTo(String value) {
            addCriterion("UP_SUBMCHNT_IN >=", value, "upSubmchntIn");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInLessThan(String value) {
            addCriterion("UP_SUBMCHNT_IN <", value, "upSubmchntIn");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInLessThanOrEqualTo(String value) {
            addCriterion("UP_SUBMCHNT_IN <=", value, "upSubmchntIn");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInLike(String value) {
            addCriterion("UP_SUBMCHNT_IN like", value, "upSubmchntIn");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInNotLike(String value) {
            addCriterion("UP_SUBMCHNT_IN not like", value, "upSubmchntIn");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInIn(List<String> values) {
            addCriterion("UP_SUBMCHNT_IN in", values, "upSubmchntIn");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInNotIn(List<String> values) {
            addCriterion("UP_SUBMCHNT_IN not in", values, "upSubmchntIn");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInBetween(String value1, String value2) {
            addCriterion("UP_SUBMCHNT_IN between", value1, value2, "upSubmchntIn");
            return (Criteria) this;
        }

        public Criteria andUpSubmchntInNotBetween(String value1, String value2) {
            addCriterion("UP_SUBMCHNT_IN not between", value1, value2, "upSubmchntIn");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmIsNull() {
            addCriterion("UP_SVC_INS_NM is null");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmIsNotNull() {
            addCriterion("UP_SVC_INS_NM is not null");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmEqualTo(String value) {
            addCriterion("UP_SVC_INS_NM =", value, "upSvcInsNm");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmNotEqualTo(String value) {
            addCriterion("UP_SVC_INS_NM <>", value, "upSvcInsNm");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmGreaterThan(String value) {
            addCriterion("UP_SVC_INS_NM >", value, "upSvcInsNm");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmGreaterThanOrEqualTo(String value) {
            addCriterion("UP_SVC_INS_NM >=", value, "upSvcInsNm");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmLessThan(String value) {
            addCriterion("UP_SVC_INS_NM <", value, "upSvcInsNm");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmLessThanOrEqualTo(String value) {
            addCriterion("UP_SVC_INS_NM <=", value, "upSvcInsNm");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmLike(String value) {
            addCriterion("UP_SVC_INS_NM like", value, "upSvcInsNm");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmNotLike(String value) {
            addCriterion("UP_SVC_INS_NM not like", value, "upSvcInsNm");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmIn(List<String> values) {
            addCriterion("UP_SVC_INS_NM in", values, "upSvcInsNm");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmNotIn(List<String> values) {
            addCriterion("UP_SVC_INS_NM not in", values, "upSvcInsNm");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmBetween(String value1, String value2) {
            addCriterion("UP_SVC_INS_NM between", value1, value2, "upSvcInsNm");
            return (Criteria) this;
        }

        public Criteria andUpSvcInsNmNotBetween(String value1, String value2) {
            addCriterion("UP_SVC_INS_NM not between", value1, value2, "upSvcInsNm");
            return (Criteria) this;
        }

        public Criteria andUpStatesIsNull() {
            addCriterion("UP_STATES is null");
            return (Criteria) this;
        }

        public Criteria andUpStatesIsNotNull() {
            addCriterion("UP_STATES is not null");
            return (Criteria) this;
        }

        public Criteria andUpStatesEqualTo(String value) {
            addCriterion("UP_STATES =", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesNotEqualTo(String value) {
            addCriterion("UP_STATES <>", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesGreaterThan(String value) {
            addCriterion("UP_STATES >", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesGreaterThanOrEqualTo(String value) {
            addCriterion("UP_STATES >=", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesLessThan(String value) {
            addCriterion("UP_STATES <", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesLessThanOrEqualTo(String value) {
            addCriterion("UP_STATES <=", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesLike(String value) {
            addCriterion("UP_STATES like", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesNotLike(String value) {
            addCriterion("UP_STATES not like", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesIn(List<String> values) {
            addCriterion("UP_STATES in", values, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesNotIn(List<String> values) {
            addCriterion("UP_STATES not in", values, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesBetween(String value1, String value2) {
            addCriterion("UP_STATES between", value1, value2, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesNotBetween(String value1, String value2) {
            addCriterion("UP_STATES not between", value1, value2, "upStates");
            return (Criteria) this;
        }

        public Criteria andRespCodeIsNull() {
            addCriterion("RESP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRespCodeIsNotNull() {
            addCriterion("RESP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRespCodeEqualTo(String value) {
            addCriterion("RESP_CODE =", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotEqualTo(String value) {
            addCriterion("RESP_CODE <>", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeGreaterThan(String value) {
            addCriterion("RESP_CODE >", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESP_CODE >=", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeLessThan(String value) {
            addCriterion("RESP_CODE <", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeLessThanOrEqualTo(String value) {
            addCriterion("RESP_CODE <=", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeLike(String value) {
            addCriterion("RESP_CODE like", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotLike(String value) {
            addCriterion("RESP_CODE not like", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeIn(List<String> values) {
            addCriterion("RESP_CODE in", values, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotIn(List<String> values) {
            addCriterion("RESP_CODE not in", values, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeBetween(String value1, String value2) {
            addCriterion("RESP_CODE between", value1, value2, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotBetween(String value1, String value2) {
            addCriterion("RESP_CODE not between", value1, value2, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespMsgIsNull() {
            addCriterion("RESP_MSG is null");
            return (Criteria) this;
        }

        public Criteria andRespMsgIsNotNull() {
            addCriterion("RESP_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andRespMsgEqualTo(String value) {
            addCriterion("RESP_MSG =", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgNotEqualTo(String value) {
            addCriterion("RESP_MSG <>", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgGreaterThan(String value) {
            addCriterion("RESP_MSG >", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgGreaterThanOrEqualTo(String value) {
            addCriterion("RESP_MSG >=", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgLessThan(String value) {
            addCriterion("RESP_MSG <", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgLessThanOrEqualTo(String value) {
            addCriterion("RESP_MSG <=", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgIn(List<String> values) {
            addCriterion("RESP_MSG in", values, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgNotIn(List<String> values) {
            addCriterion("RESP_MSG not in", values, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgBetween(String value1, String value2) {
            addCriterion("RESP_MSG between", value1, value2, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgNotBetween(String value1, String value2) {
            addCriterion("RESP_MSG not between", value1, value2, "respMsg");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("UPDATE_TIME like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("UPDATE_TIME not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}