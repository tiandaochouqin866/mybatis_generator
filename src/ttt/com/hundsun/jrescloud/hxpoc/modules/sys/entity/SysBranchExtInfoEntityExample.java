package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class SysBranchExtInfoEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysBranchExtInfoEntityExample() {
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

        public Criteria andUpAcqInsIdCdIsNull() {
            addCriterion("UP_ACQ_INS_ID_CD is null");
            return (Criteria) this;
        }

        public Criteria andUpAcqInsIdCdIsNotNull() {
            addCriterion("UP_ACQ_INS_ID_CD is not null");
            return (Criteria) this;
        }

        public Criteria andUpAcqInsIdCdEqualTo(Long value) {
            addCriterion("UP_ACQ_INS_ID_CD =", value, "upAcqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqInsIdCdNotEqualTo(Long value) {
            addCriterion("UP_ACQ_INS_ID_CD <>", value, "upAcqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqInsIdCdGreaterThan(Long value) {
            addCriterion("UP_ACQ_INS_ID_CD >", value, "upAcqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqInsIdCdGreaterThanOrEqualTo(Long value) {
            addCriterion("UP_ACQ_INS_ID_CD >=", value, "upAcqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqInsIdCdLessThan(Long value) {
            addCriterion("UP_ACQ_INS_ID_CD <", value, "upAcqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqInsIdCdLessThanOrEqualTo(Long value) {
            addCriterion("UP_ACQ_INS_ID_CD <=", value, "upAcqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqInsIdCdIn(List<Long> values) {
            addCriterion("UP_ACQ_INS_ID_CD in", values, "upAcqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqInsIdCdNotIn(List<Long> values) {
            addCriterion("UP_ACQ_INS_ID_CD not in", values, "upAcqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqInsIdCdBetween(Long value1, Long value2) {
            addCriterion("UP_ACQ_INS_ID_CD between", value1, value2, "upAcqInsIdCd");
            return (Criteria) this;
        }

        public Criteria andUpAcqInsIdCdNotBetween(Long value1, Long value2) {
            addCriterion("UP_ACQ_INS_ID_CD not between", value1, value2, "upAcqInsIdCd");
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

        public Criteria andUpBussCont1EmailIsNull() {
            addCriterion("UP_BUSS_CONT1_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUpBussCont1EmailIsNotNull() {
            addCriterion("UP_BUSS_CONT1_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUpBussCont1EmailEqualTo(String value) {
            addCriterion("UP_BUSS_CONT1_EMAIL =", value, "upBussCont1Email");
            return (Criteria) this;
        }

        public Criteria andUpBussCont1EmailNotEqualTo(String value) {
            addCriterion("UP_BUSS_CONT1_EMAIL <>", value, "upBussCont1Email");
            return (Criteria) this;
        }

        public Criteria andUpBussCont1EmailGreaterThan(String value) {
            addCriterion("UP_BUSS_CONT1_EMAIL >", value, "upBussCont1Email");
            return (Criteria) this;
        }

        public Criteria andUpBussCont1EmailGreaterThanOrEqualTo(String value) {
            addCriterion("UP_BUSS_CONT1_EMAIL >=", value, "upBussCont1Email");
            return (Criteria) this;
        }

        public Criteria andUpBussCont1EmailLessThan(String value) {
            addCriterion("UP_BUSS_CONT1_EMAIL <", value, "upBussCont1Email");
            return (Criteria) this;
        }

        public Criteria andUpBussCont1EmailLessThanOrEqualTo(String value) {
            addCriterion("UP_BUSS_CONT1_EMAIL <=", value, "upBussCont1Email");
            return (Criteria) this;
        }

        public Criteria andUpBussCont1EmailLike(String value) {
            addCriterion("UP_BUSS_CONT1_EMAIL like", value, "upBussCont1Email");
            return (Criteria) this;
        }

        public Criteria andUpBussCont1EmailNotLike(String value) {
            addCriterion("UP_BUSS_CONT1_EMAIL not like", value, "upBussCont1Email");
            return (Criteria) this;
        }

        public Criteria andUpBussCont1EmailIn(List<String> values) {
            addCriterion("UP_BUSS_CONT1_EMAIL in", values, "upBussCont1Email");
            return (Criteria) this;
        }

        public Criteria andUpBussCont1EmailNotIn(List<String> values) {
            addCriterion("UP_BUSS_CONT1_EMAIL not in", values, "upBussCont1Email");
            return (Criteria) this;
        }

        public Criteria andUpBussCont1EmailBetween(String value1, String value2) {
            addCriterion("UP_BUSS_CONT1_EMAIL between", value1, value2, "upBussCont1Email");
            return (Criteria) this;
        }

        public Criteria andUpBussCont1EmailNotBetween(String value1, String value2) {
            addCriterion("UP_BUSS_CONT1_EMAIL not between", value1, value2, "upBussCont1Email");
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

        public Criteria andUpSingleCardDayAtLimitDcIsNull() {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC is null");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitDcIsNotNull() {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC is not null");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitDcEqualTo(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC =", value, "upSingleCardDayAtLimitDc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitDcNotEqualTo(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC <>", value, "upSingleCardDayAtLimitDc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitDcGreaterThan(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC >", value, "upSingleCardDayAtLimitDc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitDcGreaterThanOrEqualTo(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC >=", value, "upSingleCardDayAtLimitDc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitDcLessThan(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC <", value, "upSingleCardDayAtLimitDc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitDcLessThanOrEqualTo(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC <=", value, "upSingleCardDayAtLimitDc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitDcLike(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC like", value, "upSingleCardDayAtLimitDc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitDcNotLike(String value) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC not like", value, "upSingleCardDayAtLimitDc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitDcIn(List<String> values) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC in", values, "upSingleCardDayAtLimitDc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitDcNotIn(List<String> values) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC not in", values, "upSingleCardDayAtLimitDc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitDcBetween(String value1, String value2) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC between", value1, value2, "upSingleCardDayAtLimitDc");
            return (Criteria) this;
        }

        public Criteria andUpSingleCardDayAtLimitDcNotBetween(String value1, String value2) {
            addCriterion("UP_SINGLE_CARD_DAY_AT_LIMIT_DC not between", value1, value2, "upSingleCardDayAtLimitDc");
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

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
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

        public Criteria andUpdTimeIsNull() {
            addCriterion("UPD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("UPD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(String value) {
            addCriterion("UPD_TIME =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(String value) {
            addCriterion("UPD_TIME <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(String value) {
            addCriterion("UPD_TIME >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_TIME >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(String value) {
            addCriterion("UPD_TIME <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(String value) {
            addCriterion("UPD_TIME <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLike(String value) {
            addCriterion("UPD_TIME like", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotLike(String value) {
            addCriterion("UPD_TIME not like", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<String> values) {
            addCriterion("UPD_TIME in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<String> values) {
            addCriterion("UPD_TIME not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(String value1, String value2) {
            addCriterion("UPD_TIME between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(String value1, String value2) {
            addCriterion("UPD_TIME not between", value1, value2, "updTime");
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