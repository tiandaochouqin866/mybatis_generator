package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysTerminalApplyDetailEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTerminalApplyDetailEntityExample() {
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

        public Criteria andApplyBatchNoIsNull() {
            addCriterion("APPLY_BATCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andApplyBatchNoIsNotNull() {
            addCriterion("APPLY_BATCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andApplyBatchNoEqualTo(Long value) {
            addCriterion("APPLY_BATCH_NO =", value, "applyBatchNo");
            return (Criteria) this;
        }

        public Criteria andApplyBatchNoNotEqualTo(Long value) {
            addCriterion("APPLY_BATCH_NO <>", value, "applyBatchNo");
            return (Criteria) this;
        }

        public Criteria andApplyBatchNoGreaterThan(Long value) {
            addCriterion("APPLY_BATCH_NO >", value, "applyBatchNo");
            return (Criteria) this;
        }

        public Criteria andApplyBatchNoGreaterThanOrEqualTo(Long value) {
            addCriterion("APPLY_BATCH_NO >=", value, "applyBatchNo");
            return (Criteria) this;
        }

        public Criteria andApplyBatchNoLessThan(Long value) {
            addCriterion("APPLY_BATCH_NO <", value, "applyBatchNo");
            return (Criteria) this;
        }

        public Criteria andApplyBatchNoLessThanOrEqualTo(Long value) {
            addCriterion("APPLY_BATCH_NO <=", value, "applyBatchNo");
            return (Criteria) this;
        }

        public Criteria andApplyBatchNoIn(List<Long> values) {
            addCriterion("APPLY_BATCH_NO in", values, "applyBatchNo");
            return (Criteria) this;
        }

        public Criteria andApplyBatchNoNotIn(List<Long> values) {
            addCriterion("APPLY_BATCH_NO not in", values, "applyBatchNo");
            return (Criteria) this;
        }

        public Criteria andApplyBatchNoBetween(Long value1, Long value2) {
            addCriterion("APPLY_BATCH_NO between", value1, value2, "applyBatchNo");
            return (Criteria) this;
        }

        public Criteria andApplyBatchNoNotBetween(Long value1, Long value2) {
            addCriterion("APPLY_BATCH_NO not between", value1, value2, "applyBatchNo");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNull() {
            addCriterion("TERMINAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNotNull() {
            addCriterion("TERMINAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeEqualTo(String value) {
            addCriterion("TERMINAL_TYPE =", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotEqualTo(String value) {
            addCriterion("TERMINAL_TYPE <>", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThan(String value) {
            addCriterion("TERMINAL_TYPE >", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_TYPE >=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThan(String value) {
            addCriterion("TERMINAL_TYPE <", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_TYPE <=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLike(String value) {
            addCriterion("TERMINAL_TYPE like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotLike(String value) {
            addCriterion("TERMINAL_TYPE not like", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIn(List<String> values) {
            addCriterion("TERMINAL_TYPE in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotIn(List<String> values) {
            addCriterion("TERMINAL_TYPE not in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeBetween(String value1, String value2) {
            addCriterion("TERMINAL_TYPE between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_TYPE not between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayIsNull() {
            addCriterion("TERMINAL_NET_WAY is null");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayIsNotNull() {
            addCriterion("TERMINAL_NET_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayEqualTo(String value) {
            addCriterion("TERMINAL_NET_WAY =", value, "terminalNetWay");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayNotEqualTo(String value) {
            addCriterion("TERMINAL_NET_WAY <>", value, "terminalNetWay");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayGreaterThan(String value) {
            addCriterion("TERMINAL_NET_WAY >", value, "terminalNetWay");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_NET_WAY >=", value, "terminalNetWay");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayLessThan(String value) {
            addCriterion("TERMINAL_NET_WAY <", value, "terminalNetWay");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_NET_WAY <=", value, "terminalNetWay");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayLike(String value) {
            addCriterion("TERMINAL_NET_WAY like", value, "terminalNetWay");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayNotLike(String value) {
            addCriterion("TERMINAL_NET_WAY not like", value, "terminalNetWay");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayIn(List<String> values) {
            addCriterion("TERMINAL_NET_WAY in", values, "terminalNetWay");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayNotIn(List<String> values) {
            addCriterion("TERMINAL_NET_WAY not in", values, "terminalNetWay");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayBetween(String value1, String value2) {
            addCriterion("TERMINAL_NET_WAY between", value1, value2, "terminalNetWay");
            return (Criteria) this;
        }

        public Criteria andTerminalNetWayNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_NET_WAY not between", value1, value2, "terminalNetWay");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIsNull() {
            addCriterion("TELECOM_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIsNotNull() {
            addCriterion("TELECOM_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorEqualTo(Short value) {
            addCriterion("TELECOM_OPERATOR =", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorNotEqualTo(Short value) {
            addCriterion("TELECOM_OPERATOR <>", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorGreaterThan(Short value) {
            addCriterion("TELECOM_OPERATOR >", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorGreaterThanOrEqualTo(Short value) {
            addCriterion("TELECOM_OPERATOR >=", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorLessThan(Short value) {
            addCriterion("TELECOM_OPERATOR <", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorLessThanOrEqualTo(Short value) {
            addCriterion("TELECOM_OPERATOR <=", value, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorIn(List<Short> values) {
            addCriterion("TELECOM_OPERATOR in", values, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorNotIn(List<Short> values) {
            addCriterion("TELECOM_OPERATOR not in", values, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorBetween(Short value1, Short value2) {
            addCriterion("TELECOM_OPERATOR between", value1, value2, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andTelecomOperatorNotBetween(Short value1, Short value2) {
            addCriterion("TELECOM_OPERATOR not between", value1, value2, "telecomOperator");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoIsNull() {
            addCriterion("BIND_PHONE_NO is null");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoIsNotNull() {
            addCriterion("BIND_PHONE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoEqualTo(String value) {
            addCriterion("BIND_PHONE_NO =", value, "bindPhoneNo");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoNotEqualTo(String value) {
            addCriterion("BIND_PHONE_NO <>", value, "bindPhoneNo");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoGreaterThan(String value) {
            addCriterion("BIND_PHONE_NO >", value, "bindPhoneNo");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("BIND_PHONE_NO >=", value, "bindPhoneNo");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoLessThan(String value) {
            addCriterion("BIND_PHONE_NO <", value, "bindPhoneNo");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("BIND_PHONE_NO <=", value, "bindPhoneNo");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoLike(String value) {
            addCriterion("BIND_PHONE_NO like", value, "bindPhoneNo");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoNotLike(String value) {
            addCriterion("BIND_PHONE_NO not like", value, "bindPhoneNo");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoIn(List<String> values) {
            addCriterion("BIND_PHONE_NO in", values, "bindPhoneNo");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoNotIn(List<String> values) {
            addCriterion("BIND_PHONE_NO not in", values, "bindPhoneNo");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoBetween(String value1, String value2) {
            addCriterion("BIND_PHONE_NO between", value1, value2, "bindPhoneNo");
            return (Criteria) this;
        }

        public Criteria andBindPhoneNoNotBetween(String value1, String value2) {
            addCriterion("BIND_PHONE_NO not between", value1, value2, "bindPhoneNo");
            return (Criteria) this;
        }

        public Criteria andDefaultDepositIsNull() {
            addCriterion("DEFAULT_DEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andDefaultDepositIsNotNull() {
            addCriterion("DEFAULT_DEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultDepositEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_DEPOSIT =", value, "defaultDeposit");
            return (Criteria) this;
        }

        public Criteria andDefaultDepositNotEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_DEPOSIT <>", value, "defaultDeposit");
            return (Criteria) this;
        }

        public Criteria andDefaultDepositGreaterThan(BigDecimal value) {
            addCriterion("DEFAULT_DEPOSIT >", value, "defaultDeposit");
            return (Criteria) this;
        }

        public Criteria andDefaultDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_DEPOSIT >=", value, "defaultDeposit");
            return (Criteria) this;
        }

        public Criteria andDefaultDepositLessThan(BigDecimal value) {
            addCriterion("DEFAULT_DEPOSIT <", value, "defaultDeposit");
            return (Criteria) this;
        }

        public Criteria andDefaultDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULT_DEPOSIT <=", value, "defaultDeposit");
            return (Criteria) this;
        }

        public Criteria andDefaultDepositIn(List<BigDecimal> values) {
            addCriterion("DEFAULT_DEPOSIT in", values, "defaultDeposit");
            return (Criteria) this;
        }

        public Criteria andDefaultDepositNotIn(List<BigDecimal> values) {
            addCriterion("DEFAULT_DEPOSIT not in", values, "defaultDeposit");
            return (Criteria) this;
        }

        public Criteria andDefaultDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULT_DEPOSIT between", value1, value2, "defaultDeposit");
            return (Criteria) this;
        }

        public Criteria andDefaultDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULT_DEPOSIT not between", value1, value2, "defaultDeposit");
            return (Criteria) this;
        }

        public Criteria andActualDepositIsNull() {
            addCriterion("ACTUAL_DEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andActualDepositIsNotNull() {
            addCriterion("ACTUAL_DEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andActualDepositEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_DEPOSIT =", value, "actualDeposit");
            return (Criteria) this;
        }

        public Criteria andActualDepositNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_DEPOSIT <>", value, "actualDeposit");
            return (Criteria) this;
        }

        public Criteria andActualDepositGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_DEPOSIT >", value, "actualDeposit");
            return (Criteria) this;
        }

        public Criteria andActualDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_DEPOSIT >=", value, "actualDeposit");
            return (Criteria) this;
        }

        public Criteria andActualDepositLessThan(BigDecimal value) {
            addCriterion("ACTUAL_DEPOSIT <", value, "actualDeposit");
            return (Criteria) this;
        }

        public Criteria andActualDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_DEPOSIT <=", value, "actualDeposit");
            return (Criteria) this;
        }

        public Criteria andActualDepositIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_DEPOSIT in", values, "actualDeposit");
            return (Criteria) this;
        }

        public Criteria andActualDepositNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_DEPOSIT not in", values, "actualDeposit");
            return (Criteria) this;
        }

        public Criteria andActualDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_DEPOSIT between", value1, value2, "actualDeposit");
            return (Criteria) this;
        }

        public Criteria andActualDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_DEPOSIT not between", value1, value2, "actualDeposit");
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

        public Criteria andCheckDepositIsNull() {
            addCriterion("CHECK_DEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andCheckDepositIsNotNull() {
            addCriterion("CHECK_DEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDepositEqualTo(BigDecimal value) {
            addCriterion("CHECK_DEPOSIT =", value, "checkDeposit");
            return (Criteria) this;
        }

        public Criteria andCheckDepositNotEqualTo(BigDecimal value) {
            addCriterion("CHECK_DEPOSIT <>", value, "checkDeposit");
            return (Criteria) this;
        }

        public Criteria andCheckDepositGreaterThan(BigDecimal value) {
            addCriterion("CHECK_DEPOSIT >", value, "checkDeposit");
            return (Criteria) this;
        }

        public Criteria andCheckDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECK_DEPOSIT >=", value, "checkDeposit");
            return (Criteria) this;
        }

        public Criteria andCheckDepositLessThan(BigDecimal value) {
            addCriterion("CHECK_DEPOSIT <", value, "checkDeposit");
            return (Criteria) this;
        }

        public Criteria andCheckDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECK_DEPOSIT <=", value, "checkDeposit");
            return (Criteria) this;
        }

        public Criteria andCheckDepositIn(List<BigDecimal> values) {
            addCriterion("CHECK_DEPOSIT in", values, "checkDeposit");
            return (Criteria) this;
        }

        public Criteria andCheckDepositNotIn(List<BigDecimal> values) {
            addCriterion("CHECK_DEPOSIT not in", values, "checkDeposit");
            return (Criteria) this;
        }

        public Criteria andCheckDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECK_DEPOSIT between", value1, value2, "checkDeposit");
            return (Criteria) this;
        }

        public Criteria andCheckDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECK_DEPOSIT not between", value1, value2, "checkDeposit");
            return (Criteria) this;
        }

        public Criteria andDepositStatusIsNull() {
            addCriterion("DEPOSIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDepositStatusIsNotNull() {
            addCriterion("DEPOSIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDepositStatusEqualTo(String value) {
            addCriterion("DEPOSIT_STATUS =", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotEqualTo(String value) {
            addCriterion("DEPOSIT_STATUS <>", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusGreaterThan(String value) {
            addCriterion("DEPOSIT_STATUS >", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DEPOSIT_STATUS >=", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusLessThan(String value) {
            addCriterion("DEPOSIT_STATUS <", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusLessThanOrEqualTo(String value) {
            addCriterion("DEPOSIT_STATUS <=", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusLike(String value) {
            addCriterion("DEPOSIT_STATUS like", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotLike(String value) {
            addCriterion("DEPOSIT_STATUS not like", value, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusIn(List<String> values) {
            addCriterion("DEPOSIT_STATUS in", values, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotIn(List<String> values) {
            addCriterion("DEPOSIT_STATUS not in", values, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusBetween(String value1, String value2) {
            addCriterion("DEPOSIT_STATUS between", value1, value2, "depositStatus");
            return (Criteria) this;
        }

        public Criteria andDepositStatusNotBetween(String value1, String value2) {
            addCriterion("DEPOSIT_STATUS not between", value1, value2, "depositStatus");
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