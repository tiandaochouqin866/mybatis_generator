package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class SysTerminalFaultDetailEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTerminalFaultDetailEntityExample() {
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

        public Criteria andFaultNoIsNull() {
            addCriterion("FAULT_NO is null");
            return (Criteria) this;
        }

        public Criteria andFaultNoIsNotNull() {
            addCriterion("FAULT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFaultNoEqualTo(Long value) {
            addCriterion("FAULT_NO =", value, "faultNo");
            return (Criteria) this;
        }

        public Criteria andFaultNoNotEqualTo(Long value) {
            addCriterion("FAULT_NO <>", value, "faultNo");
            return (Criteria) this;
        }

        public Criteria andFaultNoGreaterThan(Long value) {
            addCriterion("FAULT_NO >", value, "faultNo");
            return (Criteria) this;
        }

        public Criteria andFaultNoGreaterThanOrEqualTo(Long value) {
            addCriterion("FAULT_NO >=", value, "faultNo");
            return (Criteria) this;
        }

        public Criteria andFaultNoLessThan(Long value) {
            addCriterion("FAULT_NO <", value, "faultNo");
            return (Criteria) this;
        }

        public Criteria andFaultNoLessThanOrEqualTo(Long value) {
            addCriterion("FAULT_NO <=", value, "faultNo");
            return (Criteria) this;
        }

        public Criteria andFaultNoIn(List<Long> values) {
            addCriterion("FAULT_NO in", values, "faultNo");
            return (Criteria) this;
        }

        public Criteria andFaultNoNotIn(List<Long> values) {
            addCriterion("FAULT_NO not in", values, "faultNo");
            return (Criteria) this;
        }

        public Criteria andFaultNoBetween(Long value1, Long value2) {
            addCriterion("FAULT_NO between", value1, value2, "faultNo");
            return (Criteria) this;
        }

        public Criteria andFaultNoNotBetween(Long value1, Long value2) {
            addCriterion("FAULT_NO not between", value1, value2, "faultNo");
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

        public Criteria andFaultTypeIsNull() {
            addCriterion("FAULT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIsNotNull() {
            addCriterion("FAULT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFaultTypeEqualTo(Short value) {
            addCriterion("FAULT_TYPE =", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotEqualTo(Short value) {
            addCriterion("FAULT_TYPE <>", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeGreaterThan(Short value) {
            addCriterion("FAULT_TYPE >", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("FAULT_TYPE >=", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLessThan(Short value) {
            addCriterion("FAULT_TYPE <", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeLessThanOrEqualTo(Short value) {
            addCriterion("FAULT_TYPE <=", value, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeIn(List<Short> values) {
            addCriterion("FAULT_TYPE in", values, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotIn(List<Short> values) {
            addCriterion("FAULT_TYPE not in", values, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeBetween(Short value1, Short value2) {
            addCriterion("FAULT_TYPE between", value1, value2, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultTypeNotBetween(Short value1, Short value2) {
            addCriterion("FAULT_TYPE not between", value1, value2, "faultType");
            return (Criteria) this;
        }

        public Criteria andFaultDescIsNull() {
            addCriterion("FAULT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andFaultDescIsNotNull() {
            addCriterion("FAULT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andFaultDescEqualTo(String value) {
            addCriterion("FAULT_DESC =", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescNotEqualTo(String value) {
            addCriterion("FAULT_DESC <>", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescGreaterThan(String value) {
            addCriterion("FAULT_DESC >", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescGreaterThanOrEqualTo(String value) {
            addCriterion("FAULT_DESC >=", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescLessThan(String value) {
            addCriterion("FAULT_DESC <", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescLessThanOrEqualTo(String value) {
            addCriterion("FAULT_DESC <=", value, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescIn(List<String> values) {
            addCriterion("FAULT_DESC in", values, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescNotIn(List<String> values) {
            addCriterion("FAULT_DESC not in", values, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescBetween(String value1, String value2) {
            addCriterion("FAULT_DESC between", value1, value2, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultDescNotBetween(String value1, String value2) {
            addCriterion("FAULT_DESC not between", value1, value2, "faultDesc");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeIsNull() {
            addCriterion("FAULT_REPORT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeIsNotNull() {
            addCriterion("FAULT_REPORT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeEqualTo(String value) {
            addCriterion("FAULT_REPORT_TIME =", value, "faultReportTime");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeNotEqualTo(String value) {
            addCriterion("FAULT_REPORT_TIME <>", value, "faultReportTime");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeGreaterThan(String value) {
            addCriterion("FAULT_REPORT_TIME >", value, "faultReportTime");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FAULT_REPORT_TIME >=", value, "faultReportTime");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeLessThan(String value) {
            addCriterion("FAULT_REPORT_TIME <", value, "faultReportTime");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeLessThanOrEqualTo(String value) {
            addCriterion("FAULT_REPORT_TIME <=", value, "faultReportTime");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeLike(String value) {
            addCriterion("FAULT_REPORT_TIME like", value, "faultReportTime");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeNotLike(String value) {
            addCriterion("FAULT_REPORT_TIME not like", value, "faultReportTime");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeIn(List<String> values) {
            addCriterion("FAULT_REPORT_TIME in", values, "faultReportTime");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeNotIn(List<String> values) {
            addCriterion("FAULT_REPORT_TIME not in", values, "faultReportTime");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeBetween(String value1, String value2) {
            addCriterion("FAULT_REPORT_TIME between", value1, value2, "faultReportTime");
            return (Criteria) this;
        }

        public Criteria andFaultReportTimeNotBetween(String value1, String value2) {
            addCriterion("FAULT_REPORT_TIME not between", value1, value2, "faultReportTime");
            return (Criteria) this;
        }

        public Criteria andSolvingTypeIsNull() {
            addCriterion("SOLVING_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSolvingTypeIsNotNull() {
            addCriterion("SOLVING_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSolvingTypeEqualTo(Short value) {
            addCriterion("SOLVING_TYPE =", value, "solvingType");
            return (Criteria) this;
        }

        public Criteria andSolvingTypeNotEqualTo(Short value) {
            addCriterion("SOLVING_TYPE <>", value, "solvingType");
            return (Criteria) this;
        }

        public Criteria andSolvingTypeGreaterThan(Short value) {
            addCriterion("SOLVING_TYPE >", value, "solvingType");
            return (Criteria) this;
        }

        public Criteria andSolvingTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("SOLVING_TYPE >=", value, "solvingType");
            return (Criteria) this;
        }

        public Criteria andSolvingTypeLessThan(Short value) {
            addCriterion("SOLVING_TYPE <", value, "solvingType");
            return (Criteria) this;
        }

        public Criteria andSolvingTypeLessThanOrEqualTo(Short value) {
            addCriterion("SOLVING_TYPE <=", value, "solvingType");
            return (Criteria) this;
        }

        public Criteria andSolvingTypeIn(List<Short> values) {
            addCriterion("SOLVING_TYPE in", values, "solvingType");
            return (Criteria) this;
        }

        public Criteria andSolvingTypeNotIn(List<Short> values) {
            addCriterion("SOLVING_TYPE not in", values, "solvingType");
            return (Criteria) this;
        }

        public Criteria andSolvingTypeBetween(Short value1, Short value2) {
            addCriterion("SOLVING_TYPE between", value1, value2, "solvingType");
            return (Criteria) this;
        }

        public Criteria andSolvingTypeNotBetween(Short value1, Short value2) {
            addCriterion("SOLVING_TYPE not between", value1, value2, "solvingType");
            return (Criteria) this;
        }

        public Criteria andReportPersonIsNull() {
            addCriterion("REPORT_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andReportPersonIsNotNull() {
            addCriterion("REPORT_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andReportPersonEqualTo(String value) {
            addCriterion("REPORT_PERSON =", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonNotEqualTo(String value) {
            addCriterion("REPORT_PERSON <>", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonGreaterThan(String value) {
            addCriterion("REPORT_PERSON >", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_PERSON >=", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonLessThan(String value) {
            addCriterion("REPORT_PERSON <", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonLessThanOrEqualTo(String value) {
            addCriterion("REPORT_PERSON <=", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonIn(List<String> values) {
            addCriterion("REPORT_PERSON in", values, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonNotIn(List<String> values) {
            addCriterion("REPORT_PERSON not in", values, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonBetween(String value1, String value2) {
            addCriterion("REPORT_PERSON between", value1, value2, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonNotBetween(String value1, String value2) {
            addCriterion("REPORT_PERSON not between", value1, value2, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneIsNull() {
            addCriterion("REPORT_PERSON_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneIsNotNull() {
            addCriterion("REPORT_PERSON_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneEqualTo(String value) {
            addCriterion("REPORT_PERSON_PHONE =", value, "reportPersonPhone");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneNotEqualTo(String value) {
            addCriterion("REPORT_PERSON_PHONE <>", value, "reportPersonPhone");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneGreaterThan(String value) {
            addCriterion("REPORT_PERSON_PHONE >", value, "reportPersonPhone");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_PERSON_PHONE >=", value, "reportPersonPhone");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneLessThan(String value) {
            addCriterion("REPORT_PERSON_PHONE <", value, "reportPersonPhone");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("REPORT_PERSON_PHONE <=", value, "reportPersonPhone");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneLike(String value) {
            addCriterion("REPORT_PERSON_PHONE like", value, "reportPersonPhone");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneNotLike(String value) {
            addCriterion("REPORT_PERSON_PHONE not like", value, "reportPersonPhone");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneIn(List<String> values) {
            addCriterion("REPORT_PERSON_PHONE in", values, "reportPersonPhone");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneNotIn(List<String> values) {
            addCriterion("REPORT_PERSON_PHONE not in", values, "reportPersonPhone");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneBetween(String value1, String value2) {
            addCriterion("REPORT_PERSON_PHONE between", value1, value2, "reportPersonPhone");
            return (Criteria) this;
        }

        public Criteria andReportPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("REPORT_PERSON_PHONE not between", value1, value2, "reportPersonPhone");
            return (Criteria) this;
        }

        public Criteria andReportAddrIsNull() {
            addCriterion("REPORT_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andReportAddrIsNotNull() {
            addCriterion("REPORT_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andReportAddrEqualTo(String value) {
            addCriterion("REPORT_ADDR =", value, "reportAddr");
            return (Criteria) this;
        }

        public Criteria andReportAddrNotEqualTo(String value) {
            addCriterion("REPORT_ADDR <>", value, "reportAddr");
            return (Criteria) this;
        }

        public Criteria andReportAddrGreaterThan(String value) {
            addCriterion("REPORT_ADDR >", value, "reportAddr");
            return (Criteria) this;
        }

        public Criteria andReportAddrGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_ADDR >=", value, "reportAddr");
            return (Criteria) this;
        }

        public Criteria andReportAddrLessThan(String value) {
            addCriterion("REPORT_ADDR <", value, "reportAddr");
            return (Criteria) this;
        }

        public Criteria andReportAddrLessThanOrEqualTo(String value) {
            addCriterion("REPORT_ADDR <=", value, "reportAddr");
            return (Criteria) this;
        }

        public Criteria andReportAddrIn(List<String> values) {
            addCriterion("REPORT_ADDR in", values, "reportAddr");
            return (Criteria) this;
        }

        public Criteria andReportAddrNotIn(List<String> values) {
            addCriterion("REPORT_ADDR not in", values, "reportAddr");
            return (Criteria) this;
        }

        public Criteria andReportAddrBetween(String value1, String value2) {
            addCriterion("REPORT_ADDR between", value1, value2, "reportAddr");
            return (Criteria) this;
        }

        public Criteria andReportAddrNotBetween(String value1, String value2) {
            addCriterion("REPORT_ADDR not between", value1, value2, "reportAddr");
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

        public Criteria andApplyNoIsNull() {
            addCriterion("APPLY_NO is null");
            return (Criteria) this;
        }

        public Criteria andApplyNoIsNotNull() {
            addCriterion("APPLY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNoEqualTo(Long value) {
            addCriterion("APPLY_NO =", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotEqualTo(Long value) {
            addCriterion("APPLY_NO <>", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThan(Long value) {
            addCriterion("APPLY_NO >", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThanOrEqualTo(Long value) {
            addCriterion("APPLY_NO >=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThan(Long value) {
            addCriterion("APPLY_NO <", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThanOrEqualTo(Long value) {
            addCriterion("APPLY_NO <=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoIn(List<Long> values) {
            addCriterion("APPLY_NO in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotIn(List<Long> values) {
            addCriterion("APPLY_NO not in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoBetween(Long value1, Long value2) {
            addCriterion("APPLY_NO between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotBetween(Long value1, Long value2) {
            addCriterion("APPLY_NO not between", value1, value2, "applyNo");
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