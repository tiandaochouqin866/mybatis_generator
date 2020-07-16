package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TCommonTradSerialEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCommonTradSerialEntityExample() {
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

        public Criteria andCommonSerialNoIsNull() {
            addCriterion("COMMON_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoIsNotNull() {
            addCriterion("COMMON_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoEqualTo(BigDecimal value) {
            addCriterion("COMMON_SERIAL_NO =", value, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoNotEqualTo(BigDecimal value) {
            addCriterion("COMMON_SERIAL_NO <>", value, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoGreaterThan(BigDecimal value) {
            addCriterion("COMMON_SERIAL_NO >", value, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMON_SERIAL_NO >=", value, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoLessThan(BigDecimal value) {
            addCriterion("COMMON_SERIAL_NO <", value, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMON_SERIAL_NO <=", value, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoIn(List<BigDecimal> values) {
            addCriterion("COMMON_SERIAL_NO in", values, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoNotIn(List<BigDecimal> values) {
            addCriterion("COMMON_SERIAL_NO not in", values, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMON_SERIAL_NO between", value1, value2, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMON_SERIAL_NO not between", value1, value2, "commonSerialNo");
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

        public Criteria andBranchSimpleNameIsNull() {
            addCriterion("BRANCH_SIMPLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameIsNotNull() {
            addCriterion("BRANCH_SIMPLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameEqualTo(String value) {
            addCriterion("BRANCH_SIMPLE_NAME =", value, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameNotEqualTo(String value) {
            addCriterion("BRANCH_SIMPLE_NAME <>", value, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameGreaterThan(String value) {
            addCriterion("BRANCH_SIMPLE_NAME >", value, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_SIMPLE_NAME >=", value, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameLessThan(String value) {
            addCriterion("BRANCH_SIMPLE_NAME <", value, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_SIMPLE_NAME <=", value, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameIn(List<String> values) {
            addCriterion("BRANCH_SIMPLE_NAME in", values, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameNotIn(List<String> values) {
            addCriterion("BRANCH_SIMPLE_NAME not in", values, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameBetween(String value1, String value2) {
            addCriterion("BRANCH_SIMPLE_NAME between", value1, value2, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameNotBetween(String value1, String value2) {
            addCriterion("BRANCH_SIMPLE_NAME not between", value1, value2, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeIsNull() {
            addCriterion("TERMINAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeIsNotNull() {
            addCriterion("TERMINAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeEqualTo(Long value) {
            addCriterion("TERMINAL_CODE =", value, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeNotEqualTo(Long value) {
            addCriterion("TERMINAL_CODE <>", value, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeGreaterThan(Long value) {
            addCriterion("TERMINAL_CODE >", value, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("TERMINAL_CODE >=", value, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeLessThan(Long value) {
            addCriterion("TERMINAL_CODE <", value, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeLessThanOrEqualTo(Long value) {
            addCriterion("TERMINAL_CODE <=", value, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeIn(List<Long> values) {
            addCriterion("TERMINAL_CODE in", values, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeNotIn(List<Long> values) {
            addCriterion("TERMINAL_CODE not in", values, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeBetween(Long value1, Long value2) {
            addCriterion("TERMINAL_CODE between", value1, value2, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeNotBetween(Long value1, Long value2) {
            addCriterion("TERMINAL_CODE not between", value1, value2, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoIsNull() {
            addCriterion("REQ_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoIsNotNull() {
            addCriterion("REQ_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoEqualTo(String value) {
            addCriterion("REQ_SERIAL_NO =", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoNotEqualTo(String value) {
            addCriterion("REQ_SERIAL_NO <>", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoGreaterThan(String value) {
            addCriterion("REQ_SERIAL_NO >", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_SERIAL_NO >=", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoLessThan(String value) {
            addCriterion("REQ_SERIAL_NO <", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoLessThanOrEqualTo(String value) {
            addCriterion("REQ_SERIAL_NO <=", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoLike(String value) {
            addCriterion("REQ_SERIAL_NO like", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoNotLike(String value) {
            addCriterion("REQ_SERIAL_NO not like", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoIn(List<String> values) {
            addCriterion("REQ_SERIAL_NO in", values, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoNotIn(List<String> values) {
            addCriterion("REQ_SERIAL_NO not in", values, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoBetween(String value1, String value2) {
            addCriterion("REQ_SERIAL_NO between", value1, value2, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoNotBetween(String value1, String value2) {
            addCriterion("REQ_SERIAL_NO not between", value1, value2, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNull() {
            addCriterion("REQ_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNotNull() {
            addCriterion("REQ_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReqTimeEqualTo(String value) {
            addCriterion("REQ_TIME =", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotEqualTo(String value) {
            addCriterion("REQ_TIME <>", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThan(String value) {
            addCriterion("REQ_TIME >", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_TIME >=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThan(String value) {
            addCriterion("REQ_TIME <", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThanOrEqualTo(String value) {
            addCriterion("REQ_TIME <=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLike(String value) {
            addCriterion("REQ_TIME like", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotLike(String value) {
            addCriterion("REQ_TIME not like", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeIn(List<String> values) {
            addCriterion("REQ_TIME in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotIn(List<String> values) {
            addCriterion("REQ_TIME not in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeBetween(String value1, String value2) {
            addCriterion("REQ_TIME between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotBetween(String value1, String value2) {
            addCriterion("REQ_TIME not between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andTransCodeIsNull() {
            addCriterion("TRANS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTransCodeIsNotNull() {
            addCriterion("TRANS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransCodeEqualTo(Short value) {
            addCriterion("TRANS_CODE =", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotEqualTo(Short value) {
            addCriterion("TRANS_CODE <>", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeGreaterThan(Short value) {
            addCriterion("TRANS_CODE >", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("TRANS_CODE >=", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeLessThan(Short value) {
            addCriterion("TRANS_CODE <", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeLessThanOrEqualTo(Short value) {
            addCriterion("TRANS_CODE <=", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeIn(List<Short> values) {
            addCriterion("TRANS_CODE in", values, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotIn(List<Short> values) {
            addCriterion("TRANS_CODE not in", values, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeBetween(Short value1, Short value2) {
            addCriterion("TRANS_CODE between", value1, value2, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotBetween(Short value1, Short value2) {
            addCriterion("TRANS_CODE not between", value1, value2, "transCode");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueIsNull() {
            addCriterion("KEY_FIELD_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueIsNotNull() {
            addCriterion("KEY_FIELD_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueEqualTo(String value) {
            addCriterion("KEY_FIELD_VALUE =", value, "keyFieldValue");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueNotEqualTo(String value) {
            addCriterion("KEY_FIELD_VALUE <>", value, "keyFieldValue");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueGreaterThan(String value) {
            addCriterion("KEY_FIELD_VALUE >", value, "keyFieldValue");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_FIELD_VALUE >=", value, "keyFieldValue");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueLessThan(String value) {
            addCriterion("KEY_FIELD_VALUE <", value, "keyFieldValue");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueLessThanOrEqualTo(String value) {
            addCriterion("KEY_FIELD_VALUE <=", value, "keyFieldValue");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueLike(String value) {
            addCriterion("KEY_FIELD_VALUE like", value, "keyFieldValue");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueNotLike(String value) {
            addCriterion("KEY_FIELD_VALUE not like", value, "keyFieldValue");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueIn(List<String> values) {
            addCriterion("KEY_FIELD_VALUE in", values, "keyFieldValue");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueNotIn(List<String> values) {
            addCriterion("KEY_FIELD_VALUE not in", values, "keyFieldValue");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueBetween(String value1, String value2) {
            addCriterion("KEY_FIELD_VALUE between", value1, value2, "keyFieldValue");
            return (Criteria) this;
        }

        public Criteria andKeyFieldValueNotBetween(String value1, String value2) {
            addCriterion("KEY_FIELD_VALUE not between", value1, value2, "keyFieldValue");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoIsNull() {
            addCriterion("CHANNEL_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoIsNotNull() {
            addCriterion("CHANNEL_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoEqualTo(String value) {
            addCriterion("CHANNEL_SERIAL_NO =", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoNotEqualTo(String value) {
            addCriterion("CHANNEL_SERIAL_NO <>", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoGreaterThan(String value) {
            addCriterion("CHANNEL_SERIAL_NO >", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_SERIAL_NO >=", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoLessThan(String value) {
            addCriterion("CHANNEL_SERIAL_NO <", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_SERIAL_NO <=", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoLike(String value) {
            addCriterion("CHANNEL_SERIAL_NO like", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoNotLike(String value) {
            addCriterion("CHANNEL_SERIAL_NO not like", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoIn(List<String> values) {
            addCriterion("CHANNEL_SERIAL_NO in", values, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoNotIn(List<String> values) {
            addCriterion("CHANNEL_SERIAL_NO not in", values, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoBetween(String value1, String value2) {
            addCriterion("CHANNEL_SERIAL_NO between", value1, value2, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_SERIAL_NO not between", value1, value2, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeIsNull() {
            addCriterion("CHANNEL_RESP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeIsNotNull() {
            addCriterion("CHANNEL_RESP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeEqualTo(String value) {
            addCriterion("CHANNEL_RESP_TIME =", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeNotEqualTo(String value) {
            addCriterion("CHANNEL_RESP_TIME <>", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeGreaterThan(String value) {
            addCriterion("CHANNEL_RESP_TIME >", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RESP_TIME >=", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeLessThan(String value) {
            addCriterion("CHANNEL_RESP_TIME <", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RESP_TIME <=", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeLike(String value) {
            addCriterion("CHANNEL_RESP_TIME like", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeNotLike(String value) {
            addCriterion("CHANNEL_RESP_TIME not like", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeIn(List<String> values) {
            addCriterion("CHANNEL_RESP_TIME in", values, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeNotIn(List<String> values) {
            addCriterion("CHANNEL_RESP_TIME not in", values, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeBetween(String value1, String value2) {
            addCriterion("CHANNEL_RESP_TIME between", value1, value2, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_RESP_TIME not between", value1, value2, "channelRespTime");
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