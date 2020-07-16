package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TTradeClearEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTradeClearEntityExample() {
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

        public Criteria andSerialNoIsNull() {
            addCriterion("SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNotNull() {
            addCriterion("SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNoEqualTo(BigDecimal value) {
            addCriterion("SERIAL_NO =", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotEqualTo(BigDecimal value) {
            addCriterion("SERIAL_NO <>", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThan(BigDecimal value) {
            addCriterion("SERIAL_NO >", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SERIAL_NO >=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThan(BigDecimal value) {
            addCriterion("SERIAL_NO <", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SERIAL_NO <=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoIn(List<BigDecimal> values) {
            addCriterion("SERIAL_NO in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotIn(List<BigDecimal> values) {
            addCriterion("SERIAL_NO not in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERIAL_NO between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERIAL_NO not between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoIsNull() {
            addCriterion("CLEAR_BATCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoIsNotNull() {
            addCriterion("CLEAR_BATCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoEqualTo(BigDecimal value) {
            addCriterion("CLEAR_BATCH_NO =", value, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoNotEqualTo(BigDecimal value) {
            addCriterion("CLEAR_BATCH_NO <>", value, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoGreaterThan(BigDecimal value) {
            addCriterion("CLEAR_BATCH_NO >", value, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLEAR_BATCH_NO >=", value, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoLessThan(BigDecimal value) {
            addCriterion("CLEAR_BATCH_NO <", value, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLEAR_BATCH_NO <=", value, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoIn(List<BigDecimal> values) {
            addCriterion("CLEAR_BATCH_NO in", values, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoNotIn(List<BigDecimal> values) {
            addCriterion("CLEAR_BATCH_NO not in", values, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLEAR_BATCH_NO between", value1, value2, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLEAR_BATCH_NO not between", value1, value2, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeIsNull() {
            addCriterion("THIRD_PLAT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeIsNotNull() {
            addCriterion("THIRD_PLAT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeEqualTo(Short value) {
            addCriterion("THIRD_PLAT_CODE =", value, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeNotEqualTo(Short value) {
            addCriterion("THIRD_PLAT_CODE <>", value, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeGreaterThan(Short value) {
            addCriterion("THIRD_PLAT_CODE >", value, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("THIRD_PLAT_CODE >=", value, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeLessThan(Short value) {
            addCriterion("THIRD_PLAT_CODE <", value, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeLessThanOrEqualTo(Short value) {
            addCriterion("THIRD_PLAT_CODE <=", value, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeIn(List<Short> values) {
            addCriterion("THIRD_PLAT_CODE in", values, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeNotIn(List<Short> values) {
            addCriterion("THIRD_PLAT_CODE not in", values, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeBetween(Short value1, Short value2) {
            addCriterion("THIRD_PLAT_CODE between", value1, value2, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeNotBetween(Short value1, Short value2) {
            addCriterion("THIRD_PLAT_CODE not between", value1, value2, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoIsNull() {
            addCriterion("TRAD_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoIsNotNull() {
            addCriterion("TRAD_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoEqualTo(BigDecimal value) {
            addCriterion("TRAD_SERIAL_NO =", value, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoNotEqualTo(BigDecimal value) {
            addCriterion("TRAD_SERIAL_NO <>", value, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoGreaterThan(BigDecimal value) {
            addCriterion("TRAD_SERIAL_NO >", value, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRAD_SERIAL_NO >=", value, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoLessThan(BigDecimal value) {
            addCriterion("TRAD_SERIAL_NO <", value, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRAD_SERIAL_NO <=", value, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoIn(List<BigDecimal> values) {
            addCriterion("TRAD_SERIAL_NO in", values, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoNotIn(List<BigDecimal> values) {
            addCriterion("TRAD_SERIAL_NO not in", values, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRAD_SERIAL_NO between", value1, value2, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRAD_SERIAL_NO not between", value1, value2, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(String value) {
            addCriterion("BEGIN_TIME =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(String value) {
            addCriterion("BEGIN_TIME <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(String value) {
            addCriterion("BEGIN_TIME >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("BEGIN_TIME >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(String value) {
            addCriterion("BEGIN_TIME <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(String value) {
            addCriterion("BEGIN_TIME <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLike(String value) {
            addCriterion("BEGIN_TIME like", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotLike(String value) {
            addCriterion("BEGIN_TIME not like", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<String> values) {
            addCriterion("BEGIN_TIME in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<String> values) {
            addCriterion("BEGIN_TIME not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(String value1, String value2) {
            addCriterion("BEGIN_TIME between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(String value1, String value2) {
            addCriterion("BEGIN_TIME not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("END_TIME like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("END_TIME not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActIsNull() {
            addCriterion("CLEARING_ADVANCE_ACT is null");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActIsNotNull() {
            addCriterion("CLEARING_ADVANCE_ACT is not null");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActEqualTo(String value) {
            addCriterion("CLEARING_ADVANCE_ACT =", value, "clearingAdvanceAct");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActNotEqualTo(String value) {
            addCriterion("CLEARING_ADVANCE_ACT <>", value, "clearingAdvanceAct");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActGreaterThan(String value) {
            addCriterion("CLEARING_ADVANCE_ACT >", value, "clearingAdvanceAct");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActGreaterThanOrEqualTo(String value) {
            addCriterion("CLEARING_ADVANCE_ACT >=", value, "clearingAdvanceAct");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActLessThan(String value) {
            addCriterion("CLEARING_ADVANCE_ACT <", value, "clearingAdvanceAct");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActLessThanOrEqualTo(String value) {
            addCriterion("CLEARING_ADVANCE_ACT <=", value, "clearingAdvanceAct");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActLike(String value) {
            addCriterion("CLEARING_ADVANCE_ACT like", value, "clearingAdvanceAct");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActNotLike(String value) {
            addCriterion("CLEARING_ADVANCE_ACT not like", value, "clearingAdvanceAct");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActIn(List<String> values) {
            addCriterion("CLEARING_ADVANCE_ACT in", values, "clearingAdvanceAct");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActNotIn(List<String> values) {
            addCriterion("CLEARING_ADVANCE_ACT not in", values, "clearingAdvanceAct");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActBetween(String value1, String value2) {
            addCriterion("CLEARING_ADVANCE_ACT between", value1, value2, "clearingAdvanceAct");
            return (Criteria) this;
        }

        public Criteria andClearingAdvanceActNotBetween(String value1, String value2) {
            addCriterion("CLEARING_ADVANCE_ACT not between", value1, value2, "clearingAdvanceAct");
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

        public Criteria andBankActNoIsNull() {
            addCriterion("BANK_ACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankActNoIsNotNull() {
            addCriterion("BANK_ACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankActNoEqualTo(String value) {
            addCriterion("BANK_ACT_NO =", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoNotEqualTo(String value) {
            addCriterion("BANK_ACT_NO <>", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoGreaterThan(String value) {
            addCriterion("BANK_ACT_NO >", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACT_NO >=", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoLessThan(String value) {
            addCriterion("BANK_ACT_NO <", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACT_NO <=", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoLike(String value) {
            addCriterion("BANK_ACT_NO like", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoNotLike(String value) {
            addCriterion("BANK_ACT_NO not like", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoIn(List<String> values) {
            addCriterion("BANK_ACT_NO in", values, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoNotIn(List<String> values) {
            addCriterion("BANK_ACT_NO not in", values, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoBetween(String value1, String value2) {
            addCriterion("BANK_ACT_NO between", value1, value2, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoNotBetween(String value1, String value2) {
            addCriterion("BANK_ACT_NO not between", value1, value2, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andClearAmtIsNull() {
            addCriterion("CLEAR_AMT is null");
            return (Criteria) this;
        }

        public Criteria andClearAmtIsNotNull() {
            addCriterion("CLEAR_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andClearAmtEqualTo(BigDecimal value) {
            addCriterion("CLEAR_AMT =", value, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtNotEqualTo(BigDecimal value) {
            addCriterion("CLEAR_AMT <>", value, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtGreaterThan(BigDecimal value) {
            addCriterion("CLEAR_AMT >", value, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLEAR_AMT >=", value, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtLessThan(BigDecimal value) {
            addCriterion("CLEAR_AMT <", value, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLEAR_AMT <=", value, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtIn(List<BigDecimal> values) {
            addCriterion("CLEAR_AMT in", values, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtNotIn(List<BigDecimal> values) {
            addCriterion("CLEAR_AMT not in", values, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLEAR_AMT between", value1, value2, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLEAR_AMT not between", value1, value2, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andPlatSerialNoIsNull() {
            addCriterion("PLAT_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andPlatSerialNoIsNotNull() {
            addCriterion("PLAT_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPlatSerialNoEqualTo(Long value) {
            addCriterion("PLAT_SERIAL_NO =", value, "platSerialNo");
            return (Criteria) this;
        }

        public Criteria andPlatSerialNoNotEqualTo(Long value) {
            addCriterion("PLAT_SERIAL_NO <>", value, "platSerialNo");
            return (Criteria) this;
        }

        public Criteria andPlatSerialNoGreaterThan(Long value) {
            addCriterion("PLAT_SERIAL_NO >", value, "platSerialNo");
            return (Criteria) this;
        }

        public Criteria andPlatSerialNoGreaterThanOrEqualTo(Long value) {
            addCriterion("PLAT_SERIAL_NO >=", value, "platSerialNo");
            return (Criteria) this;
        }

        public Criteria andPlatSerialNoLessThan(Long value) {
            addCriterion("PLAT_SERIAL_NO <", value, "platSerialNo");
            return (Criteria) this;
        }

        public Criteria andPlatSerialNoLessThanOrEqualTo(Long value) {
            addCriterion("PLAT_SERIAL_NO <=", value, "platSerialNo");
            return (Criteria) this;
        }

        public Criteria andPlatSerialNoIn(List<Long> values) {
            addCriterion("PLAT_SERIAL_NO in", values, "platSerialNo");
            return (Criteria) this;
        }

        public Criteria andPlatSerialNoNotIn(List<Long> values) {
            addCriterion("PLAT_SERIAL_NO not in", values, "platSerialNo");
            return (Criteria) this;
        }

        public Criteria andPlatSerialNoBetween(Long value1, Long value2) {
            addCriterion("PLAT_SERIAL_NO between", value1, value2, "platSerialNo");
            return (Criteria) this;
        }

        public Criteria andPlatSerialNoNotBetween(Long value1, Long value2) {
            addCriterion("PLAT_SERIAL_NO not between", value1, value2, "platSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoIsNull() {
            addCriterion("CORE_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoIsNotNull() {
            addCriterion("CORE_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoEqualTo(String value) {
            addCriterion("CORE_SERIAL_NO =", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoNotEqualTo(String value) {
            addCriterion("CORE_SERIAL_NO <>", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoGreaterThan(String value) {
            addCriterion("CORE_SERIAL_NO >", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("CORE_SERIAL_NO >=", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoLessThan(String value) {
            addCriterion("CORE_SERIAL_NO <", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoLessThanOrEqualTo(String value) {
            addCriterion("CORE_SERIAL_NO <=", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoLike(String value) {
            addCriterion("CORE_SERIAL_NO like", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoNotLike(String value) {
            addCriterion("CORE_SERIAL_NO not like", value, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoIn(List<String> values) {
            addCriterion("CORE_SERIAL_NO in", values, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoNotIn(List<String> values) {
            addCriterion("CORE_SERIAL_NO not in", values, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoBetween(String value1, String value2) {
            addCriterion("CORE_SERIAL_NO between", value1, value2, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andCoreSerialNoNotBetween(String value1, String value2) {
            addCriterion("CORE_SERIAL_NO not between", value1, value2, "coreSerialNo");
            return (Criteria) this;
        }

        public Criteria andClearTimeIsNull() {
            addCriterion("CLEAR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andClearTimeIsNotNull() {
            addCriterion("CLEAR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andClearTimeEqualTo(String value) {
            addCriterion("CLEAR_TIME =", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotEqualTo(String value) {
            addCriterion("CLEAR_TIME <>", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeGreaterThan(String value) {
            addCriterion("CLEAR_TIME >", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CLEAR_TIME >=", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLessThan(String value) {
            addCriterion("CLEAR_TIME <", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLessThanOrEqualTo(String value) {
            addCriterion("CLEAR_TIME <=", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLike(String value) {
            addCriterion("CLEAR_TIME like", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotLike(String value) {
            addCriterion("CLEAR_TIME not like", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeIn(List<String> values) {
            addCriterion("CLEAR_TIME in", values, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotIn(List<String> values) {
            addCriterion("CLEAR_TIME not in", values, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeBetween(String value1, String value2) {
            addCriterion("CLEAR_TIME between", value1, value2, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotBetween(String value1, String value2) {
            addCriterion("CLEAR_TIME not between", value1, value2, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearResultIsNull() {
            addCriterion("CLEAR_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andClearResultIsNotNull() {
            addCriterion("CLEAR_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andClearResultEqualTo(Short value) {
            addCriterion("CLEAR_RESULT =", value, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultNotEqualTo(Short value) {
            addCriterion("CLEAR_RESULT <>", value, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultGreaterThan(Short value) {
            addCriterion("CLEAR_RESULT >", value, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultGreaterThanOrEqualTo(Short value) {
            addCriterion("CLEAR_RESULT >=", value, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultLessThan(Short value) {
            addCriterion("CLEAR_RESULT <", value, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultLessThanOrEqualTo(Short value) {
            addCriterion("CLEAR_RESULT <=", value, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultIn(List<Short> values) {
            addCriterion("CLEAR_RESULT in", values, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultNotIn(List<Short> values) {
            addCriterion("CLEAR_RESULT not in", values, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultBetween(Short value1, Short value2) {
            addCriterion("CLEAR_RESULT between", value1, value2, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultNotBetween(Short value1, Short value2) {
            addCriterion("CLEAR_RESULT not between", value1, value2, "clearResult");
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

        public Criteria andRespMsgLike(String value) {
            addCriterion("RESP_MSG like", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgNotLike(String value) {
            addCriterion("RESP_MSG not like", value, "respMsg");
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

        public Criteria andProfitTypeIsNull() {
            addCriterion("PROFIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIsNotNull() {
            addCriterion("PROFIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeEqualTo(Short value) {
            addCriterion("PROFIT_TYPE =", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotEqualTo(Short value) {
            addCriterion("PROFIT_TYPE <>", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThan(Short value) {
            addCriterion("PROFIT_TYPE >", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("PROFIT_TYPE >=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThan(Short value) {
            addCriterion("PROFIT_TYPE <", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThanOrEqualTo(Short value) {
            addCriterion("PROFIT_TYPE <=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIn(List<Short> values) {
            addCriterion("PROFIT_TYPE in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotIn(List<Short> values) {
            addCriterion("PROFIT_TYPE not in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeBetween(Short value1, Short value2) {
            addCriterion("PROFIT_TYPE between", value1, value2, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotBetween(Short value1, Short value2) {
            addCriterion("PROFIT_TYPE not between", value1, value2, "profitType");
            return (Criteria) this;
        }

        public Criteria andClearingRuleIsNull() {
            addCriterion("CLEARING_RULE is null");
            return (Criteria) this;
        }

        public Criteria andClearingRuleIsNotNull() {
            addCriterion("CLEARING_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andClearingRuleEqualTo(String value) {
            addCriterion("CLEARING_RULE =", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleNotEqualTo(String value) {
            addCriterion("CLEARING_RULE <>", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleGreaterThan(String value) {
            addCriterion("CLEARING_RULE >", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleGreaterThanOrEqualTo(String value) {
            addCriterion("CLEARING_RULE >=", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleLessThan(String value) {
            addCriterion("CLEARING_RULE <", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleLessThanOrEqualTo(String value) {
            addCriterion("CLEARING_RULE <=", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleLike(String value) {
            addCriterion("CLEARING_RULE like", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleNotLike(String value) {
            addCriterion("CLEARING_RULE not like", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleIn(List<String> values) {
            addCriterion("CLEARING_RULE in", values, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleNotIn(List<String> values) {
            addCriterion("CLEARING_RULE not in", values, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleBetween(String value1, String value2) {
            addCriterion("CLEARING_RULE between", value1, value2, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleNotBetween(String value1, String value2) {
            addCriterion("CLEARING_RULE not between", value1, value2, "clearingRule");
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