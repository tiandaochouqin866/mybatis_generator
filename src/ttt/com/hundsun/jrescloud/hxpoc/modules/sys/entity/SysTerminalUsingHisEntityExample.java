package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysTerminalUsingHisEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTerminalUsingHisEntityExample() {
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

        public Criteria andTerminalSerialNoIsNull() {
            addCriterion("TERMINAL_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoIsNotNull() {
            addCriterion("TERMINAL_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoEqualTo(String value) {
            addCriterion("TERMINAL_SERIAL_NO =", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoNotEqualTo(String value) {
            addCriterion("TERMINAL_SERIAL_NO <>", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoGreaterThan(String value) {
            addCriterion("TERMINAL_SERIAL_NO >", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_SERIAL_NO >=", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoLessThan(String value) {
            addCriterion("TERMINAL_SERIAL_NO <", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_SERIAL_NO <=", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoLike(String value) {
            addCriterion("TERMINAL_SERIAL_NO like", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoNotLike(String value) {
            addCriterion("TERMINAL_SERIAL_NO not like", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoIn(List<String> values) {
            addCriterion("TERMINAL_SERIAL_NO in", values, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoNotIn(List<String> values) {
            addCriterion("TERMINAL_SERIAL_NO not in", values, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoBetween(String value1, String value2) {
            addCriterion("TERMINAL_SERIAL_NO between", value1, value2, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_SERIAL_NO not between", value1, value2, "terminalSerialNo");
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

        public Criteria andSimCardSerialIsNull() {
            addCriterion("SIM_CARD_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andSimCardSerialIsNotNull() {
            addCriterion("SIM_CARD_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andSimCardSerialEqualTo(String value) {
            addCriterion("SIM_CARD_SERIAL =", value, "simCardSerial");
            return (Criteria) this;
        }

        public Criteria andSimCardSerialNotEqualTo(String value) {
            addCriterion("SIM_CARD_SERIAL <>", value, "simCardSerial");
            return (Criteria) this;
        }

        public Criteria andSimCardSerialGreaterThan(String value) {
            addCriterion("SIM_CARD_SERIAL >", value, "simCardSerial");
            return (Criteria) this;
        }

        public Criteria andSimCardSerialGreaterThanOrEqualTo(String value) {
            addCriterion("SIM_CARD_SERIAL >=", value, "simCardSerial");
            return (Criteria) this;
        }

        public Criteria andSimCardSerialLessThan(String value) {
            addCriterion("SIM_CARD_SERIAL <", value, "simCardSerial");
            return (Criteria) this;
        }

        public Criteria andSimCardSerialLessThanOrEqualTo(String value) {
            addCriterion("SIM_CARD_SERIAL <=", value, "simCardSerial");
            return (Criteria) this;
        }

        public Criteria andSimCardSerialLike(String value) {
            addCriterion("SIM_CARD_SERIAL like", value, "simCardSerial");
            return (Criteria) this;
        }

        public Criteria andSimCardSerialNotLike(String value) {
            addCriterion("SIM_CARD_SERIAL not like", value, "simCardSerial");
            return (Criteria) this;
        }

        public Criteria andSimCardSerialIn(List<String> values) {
            addCriterion("SIM_CARD_SERIAL in", values, "simCardSerial");
            return (Criteria) this;
        }

        public Criteria andSimCardSerialNotIn(List<String> values) {
            addCriterion("SIM_CARD_SERIAL not in", values, "simCardSerial");
            return (Criteria) this;
        }

        public Criteria andSimCardSerialBetween(String value1, String value2) {
            addCriterion("SIM_CARD_SERIAL between", value1, value2, "simCardSerial");
            return (Criteria) this;
        }

        public Criteria andSimCardSerialNotBetween(String value1, String value2) {
            addCriterion("SIM_CARD_SERIAL not between", value1, value2, "simCardSerial");
            return (Criteria) this;
        }

        public Criteria andWithholdingAgreementPhotoIsNull() {
            addCriterion("WITHHOLDING_AGREEMENT_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andWithholdingAgreementPhotoIsNotNull() {
            addCriterion("WITHHOLDING_AGREEMENT_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andWithholdingAgreementPhotoEqualTo(BigDecimal value) {
            addCriterion("WITHHOLDING_AGREEMENT_PHOTO =", value, "withholdingAgreementPhoto");
            return (Criteria) this;
        }

        public Criteria andWithholdingAgreementPhotoNotEqualTo(BigDecimal value) {
            addCriterion("WITHHOLDING_AGREEMENT_PHOTO <>", value, "withholdingAgreementPhoto");
            return (Criteria) this;
        }

        public Criteria andWithholdingAgreementPhotoGreaterThan(BigDecimal value) {
            addCriterion("WITHHOLDING_AGREEMENT_PHOTO >", value, "withholdingAgreementPhoto");
            return (Criteria) this;
        }

        public Criteria andWithholdingAgreementPhotoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHHOLDING_AGREEMENT_PHOTO >=", value, "withholdingAgreementPhoto");
            return (Criteria) this;
        }

        public Criteria andWithholdingAgreementPhotoLessThan(BigDecimal value) {
            addCriterion("WITHHOLDING_AGREEMENT_PHOTO <", value, "withholdingAgreementPhoto");
            return (Criteria) this;
        }

        public Criteria andWithholdingAgreementPhotoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHHOLDING_AGREEMENT_PHOTO <=", value, "withholdingAgreementPhoto");
            return (Criteria) this;
        }

        public Criteria andWithholdingAgreementPhotoIn(List<BigDecimal> values) {
            addCriterion("WITHHOLDING_AGREEMENT_PHOTO in", values, "withholdingAgreementPhoto");
            return (Criteria) this;
        }

        public Criteria andWithholdingAgreementPhotoNotIn(List<BigDecimal> values) {
            addCriterion("WITHHOLDING_AGREEMENT_PHOTO not in", values, "withholdingAgreementPhoto");
            return (Criteria) this;
        }

        public Criteria andWithholdingAgreementPhotoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHHOLDING_AGREEMENT_PHOTO between", value1, value2, "withholdingAgreementPhoto");
            return (Criteria) this;
        }

        public Criteria andWithholdingAgreementPhotoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHHOLDING_AGREEMENT_PHOTO not between", value1, value2, "withholdingAgreementPhoto");
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

        public Criteria andRegAuthCodeIsNull() {
            addCriterion("REG_AUTH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRegAuthCodeIsNotNull() {
            addCriterion("REG_AUTH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegAuthCodeEqualTo(String value) {
            addCriterion("REG_AUTH_CODE =", value, "regAuthCode");
            return (Criteria) this;
        }

        public Criteria andRegAuthCodeNotEqualTo(String value) {
            addCriterion("REG_AUTH_CODE <>", value, "regAuthCode");
            return (Criteria) this;
        }

        public Criteria andRegAuthCodeGreaterThan(String value) {
            addCriterion("REG_AUTH_CODE >", value, "regAuthCode");
            return (Criteria) this;
        }

        public Criteria andRegAuthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REG_AUTH_CODE >=", value, "regAuthCode");
            return (Criteria) this;
        }

        public Criteria andRegAuthCodeLessThan(String value) {
            addCriterion("REG_AUTH_CODE <", value, "regAuthCode");
            return (Criteria) this;
        }

        public Criteria andRegAuthCodeLessThanOrEqualTo(String value) {
            addCriterion("REG_AUTH_CODE <=", value, "regAuthCode");
            return (Criteria) this;
        }

        public Criteria andRegAuthCodeLike(String value) {
            addCriterion("REG_AUTH_CODE like", value, "regAuthCode");
            return (Criteria) this;
        }

        public Criteria andRegAuthCodeNotLike(String value) {
            addCriterion("REG_AUTH_CODE not like", value, "regAuthCode");
            return (Criteria) this;
        }

        public Criteria andRegAuthCodeIn(List<String> values) {
            addCriterion("REG_AUTH_CODE in", values, "regAuthCode");
            return (Criteria) this;
        }

        public Criteria andRegAuthCodeNotIn(List<String> values) {
            addCriterion("REG_AUTH_CODE not in", values, "regAuthCode");
            return (Criteria) this;
        }

        public Criteria andRegAuthCodeBetween(String value1, String value2) {
            addCriterion("REG_AUTH_CODE between", value1, value2, "regAuthCode");
            return (Criteria) this;
        }

        public Criteria andRegAuthCodeNotBetween(String value1, String value2) {
            addCriterion("REG_AUTH_CODE not between", value1, value2, "regAuthCode");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIsNull() {
            addCriterion("PUBLIC_KEY is null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIsNotNull() {
            addCriterion("PUBLIC_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyEqualTo(String value) {
            addCriterion("PUBLIC_KEY =", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotEqualTo(String value) {
            addCriterion("PUBLIC_KEY <>", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyGreaterThan(String value) {
            addCriterion("PUBLIC_KEY >", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_KEY >=", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLessThan(String value) {
            addCriterion("PUBLIC_KEY <", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_KEY <=", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLike(String value) {
            addCriterion("PUBLIC_KEY like", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotLike(String value) {
            addCriterion("PUBLIC_KEY not like", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIn(List<String> values) {
            addCriterion("PUBLIC_KEY in", values, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotIn(List<String> values) {
            addCriterion("PUBLIC_KEY not in", values, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyBetween(String value1, String value2) {
            addCriterion("PUBLIC_KEY between", value1, value2, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_KEY not between", value1, value2, "publicKey");
            return (Criteria) this;
        }

        public Criteria andUpTerminalCodeIsNull() {
            addCriterion("UP_TERMINAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUpTerminalCodeIsNotNull() {
            addCriterion("UP_TERMINAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUpTerminalCodeEqualTo(Integer value) {
            addCriterion("UP_TERMINAL_CODE =", value, "upTerminalCode");
            return (Criteria) this;
        }

        public Criteria andUpTerminalCodeNotEqualTo(Integer value) {
            addCriterion("UP_TERMINAL_CODE <>", value, "upTerminalCode");
            return (Criteria) this;
        }

        public Criteria andUpTerminalCodeGreaterThan(Integer value) {
            addCriterion("UP_TERMINAL_CODE >", value, "upTerminalCode");
            return (Criteria) this;
        }

        public Criteria andUpTerminalCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("UP_TERMINAL_CODE >=", value, "upTerminalCode");
            return (Criteria) this;
        }

        public Criteria andUpTerminalCodeLessThan(Integer value) {
            addCriterion("UP_TERMINAL_CODE <", value, "upTerminalCode");
            return (Criteria) this;
        }

        public Criteria andUpTerminalCodeLessThanOrEqualTo(Integer value) {
            addCriterion("UP_TERMINAL_CODE <=", value, "upTerminalCode");
            return (Criteria) this;
        }

        public Criteria andUpTerminalCodeIn(List<Integer> values) {
            addCriterion("UP_TERMINAL_CODE in", values, "upTerminalCode");
            return (Criteria) this;
        }

        public Criteria andUpTerminalCodeNotIn(List<Integer> values) {
            addCriterion("UP_TERMINAL_CODE not in", values, "upTerminalCode");
            return (Criteria) this;
        }

        public Criteria andUpTerminalCodeBetween(Integer value1, Integer value2) {
            addCriterion("UP_TERMINAL_CODE between", value1, value2, "upTerminalCode");
            return (Criteria) this;
        }

        public Criteria andUpTerminalCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("UP_TERMINAL_CODE not between", value1, value2, "upTerminalCode");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeIsNull() {
            addCriterion("UP_TERMINAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeIsNotNull() {
            addCriterion("UP_TERMINAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeEqualTo(String value) {
            addCriterion("UP_TERMINAL_TYPE =", value, "upTerminalType");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeNotEqualTo(String value) {
            addCriterion("UP_TERMINAL_TYPE <>", value, "upTerminalType");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeGreaterThan(String value) {
            addCriterion("UP_TERMINAL_TYPE >", value, "upTerminalType");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("UP_TERMINAL_TYPE >=", value, "upTerminalType");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeLessThan(String value) {
            addCriterion("UP_TERMINAL_TYPE <", value, "upTerminalType");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeLessThanOrEqualTo(String value) {
            addCriterion("UP_TERMINAL_TYPE <=", value, "upTerminalType");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeLike(String value) {
            addCriterion("UP_TERMINAL_TYPE like", value, "upTerminalType");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeNotLike(String value) {
            addCriterion("UP_TERMINAL_TYPE not like", value, "upTerminalType");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeIn(List<String> values) {
            addCriterion("UP_TERMINAL_TYPE in", values, "upTerminalType");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeNotIn(List<String> values) {
            addCriterion("UP_TERMINAL_TYPE not in", values, "upTerminalType");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeBetween(String value1, String value2) {
            addCriterion("UP_TERMINAL_TYPE between", value1, value2, "upTerminalType");
            return (Criteria) this;
        }

        public Criteria andUpTerminalTypeNotBetween(String value1, String value2) {
            addCriterion("UP_TERMINAL_TYPE not between", value1, value2, "upTerminalType");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncIsNull() {
            addCriterion("UP_QR_FUNC is null");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncIsNotNull() {
            addCriterion("UP_QR_FUNC is not null");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncEqualTo(Short value) {
            addCriterion("UP_QR_FUNC =", value, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncNotEqualTo(Short value) {
            addCriterion("UP_QR_FUNC <>", value, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncGreaterThan(Short value) {
            addCriterion("UP_QR_FUNC >", value, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncGreaterThanOrEqualTo(Short value) {
            addCriterion("UP_QR_FUNC >=", value, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncLessThan(Short value) {
            addCriterion("UP_QR_FUNC <", value, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncLessThanOrEqualTo(Short value) {
            addCriterion("UP_QR_FUNC <=", value, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncIn(List<Short> values) {
            addCriterion("UP_QR_FUNC in", values, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncNotIn(List<Short> values) {
            addCriterion("UP_QR_FUNC not in", values, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncBetween(Short value1, Short value2) {
            addCriterion("UP_QR_FUNC between", value1, value2, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncNotBetween(Short value1, Short value2) {
            addCriterion("UP_QR_FUNC not between", value1, value2, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardIsNull() {
            addCriterion("UP_MAGNETIC_CARD is null");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardIsNotNull() {
            addCriterion("UP_MAGNETIC_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardEqualTo(Short value) {
            addCriterion("UP_MAGNETIC_CARD =", value, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardNotEqualTo(Short value) {
            addCriterion("UP_MAGNETIC_CARD <>", value, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardGreaterThan(Short value) {
            addCriterion("UP_MAGNETIC_CARD >", value, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardGreaterThanOrEqualTo(Short value) {
            addCriterion("UP_MAGNETIC_CARD >=", value, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardLessThan(Short value) {
            addCriterion("UP_MAGNETIC_CARD <", value, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardLessThanOrEqualTo(Short value) {
            addCriterion("UP_MAGNETIC_CARD <=", value, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardIn(List<Short> values) {
            addCriterion("UP_MAGNETIC_CARD in", values, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardNotIn(List<Short> values) {
            addCriterion("UP_MAGNETIC_CARD not in", values, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardBetween(Short value1, Short value2) {
            addCriterion("UP_MAGNETIC_CARD between", value1, value2, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardNotBetween(Short value1, Short value2) {
            addCriterion("UP_MAGNETIC_CARD not between", value1, value2, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardIsNull() {
            addCriterion("UP_CONTACT_IC_CARD is null");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardIsNotNull() {
            addCriterion("UP_CONTACT_IC_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardEqualTo(Short value) {
            addCriterion("UP_CONTACT_IC_CARD =", value, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardNotEqualTo(Short value) {
            addCriterion("UP_CONTACT_IC_CARD <>", value, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardGreaterThan(Short value) {
            addCriterion("UP_CONTACT_IC_CARD >", value, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardGreaterThanOrEqualTo(Short value) {
            addCriterion("UP_CONTACT_IC_CARD >=", value, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardLessThan(Short value) {
            addCriterion("UP_CONTACT_IC_CARD <", value, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardLessThanOrEqualTo(Short value) {
            addCriterion("UP_CONTACT_IC_CARD <=", value, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardIn(List<Short> values) {
            addCriterion("UP_CONTACT_IC_CARD in", values, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardNotIn(List<Short> values) {
            addCriterion("UP_CONTACT_IC_CARD not in", values, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardBetween(Short value1, Short value2) {
            addCriterion("UP_CONTACT_IC_CARD between", value1, value2, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardNotBetween(Short value1, Short value2) {
            addCriterion("UP_CONTACT_IC_CARD not between", value1, value2, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardIsNull() {
            addCriterion("UP_NONCONTACT_IC_CARD is null");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardIsNotNull() {
            addCriterion("UP_NONCONTACT_IC_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardEqualTo(Short value) {
            addCriterion("UP_NONCONTACT_IC_CARD =", value, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardNotEqualTo(Short value) {
            addCriterion("UP_NONCONTACT_IC_CARD <>", value, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardGreaterThan(Short value) {
            addCriterion("UP_NONCONTACT_IC_CARD >", value, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardGreaterThanOrEqualTo(Short value) {
            addCriterion("UP_NONCONTACT_IC_CARD >=", value, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardLessThan(Short value) {
            addCriterion("UP_NONCONTACT_IC_CARD <", value, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardLessThanOrEqualTo(Short value) {
            addCriterion("UP_NONCONTACT_IC_CARD <=", value, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardIn(List<Short> values) {
            addCriterion("UP_NONCONTACT_IC_CARD in", values, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardNotIn(List<Short> values) {
            addCriterion("UP_NONCONTACT_IC_CARD not in", values, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardBetween(Short value1, Short value2) {
            addCriterion("UP_NONCONTACT_IC_CARD between", value1, value2, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardNotBetween(Short value1, Short value2) {
            addCriterion("UP_NONCONTACT_IC_CARD not between", value1, value2, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardIsNull() {
            addCriterion("UP_PAY_WITHOUT_CARD is null");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardIsNotNull() {
            addCriterion("UP_PAY_WITHOUT_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardEqualTo(Short value) {
            addCriterion("UP_PAY_WITHOUT_CARD =", value, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardNotEqualTo(Short value) {
            addCriterion("UP_PAY_WITHOUT_CARD <>", value, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardGreaterThan(Short value) {
            addCriterion("UP_PAY_WITHOUT_CARD >", value, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardGreaterThanOrEqualTo(Short value) {
            addCriterion("UP_PAY_WITHOUT_CARD >=", value, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardLessThan(Short value) {
            addCriterion("UP_PAY_WITHOUT_CARD <", value, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardLessThanOrEqualTo(Short value) {
            addCriterion("UP_PAY_WITHOUT_CARD <=", value, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardIn(List<Short> values) {
            addCriterion("UP_PAY_WITHOUT_CARD in", values, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardNotIn(List<Short> values) {
            addCriterion("UP_PAY_WITHOUT_CARD not in", values, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardBetween(Short value1, Short value2) {
            addCriterion("UP_PAY_WITHOUT_CARD between", value1, value2, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardNotBetween(Short value1, Short value2) {
            addCriterion("UP_PAY_WITHOUT_CARD not between", value1, value2, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncIsNull() {
            addCriterion("UP_TERMINAL_BUSI_FUNC is null");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncIsNotNull() {
            addCriterion("UP_TERMINAL_BUSI_FUNC is not null");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncEqualTo(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC =", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncNotEqualTo(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC <>", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncGreaterThan(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC >", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncGreaterThanOrEqualTo(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC >=", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncLessThan(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC <", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncLessThanOrEqualTo(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC <=", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncLike(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC like", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncNotLike(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC not like", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncIn(List<String> values) {
            addCriterion("UP_TERMINAL_BUSI_FUNC in", values, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncNotIn(List<String> values) {
            addCriterion("UP_TERMINAL_BUSI_FUNC not in", values, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncBetween(String value1, String value2) {
            addCriterion("UP_TERMINAL_BUSI_FUNC between", value1, value2, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncNotBetween(String value1, String value2) {
            addCriterion("UP_TERMINAL_BUSI_FUNC not between", value1, value2, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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

        public Criteria andPosStatusIsNull() {
            addCriterion("POS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPosStatusIsNotNull() {
            addCriterion("POS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPosStatusEqualTo(Short value) {
            addCriterion("POS_STATUS =", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusNotEqualTo(Short value) {
            addCriterion("POS_STATUS <>", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusGreaterThan(Short value) {
            addCriterion("POS_STATUS >", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("POS_STATUS >=", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusLessThan(Short value) {
            addCriterion("POS_STATUS <", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusLessThanOrEqualTo(Short value) {
            addCriterion("POS_STATUS <=", value, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusIn(List<Short> values) {
            addCriterion("POS_STATUS in", values, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusNotIn(List<Short> values) {
            addCriterion("POS_STATUS not in", values, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusBetween(Short value1, Short value2) {
            addCriterion("POS_STATUS between", value1, value2, "posStatus");
            return (Criteria) this;
        }

        public Criteria andPosStatusNotBetween(Short value1, Short value2) {
            addCriterion("POS_STATUS not between", value1, value2, "posStatus");
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