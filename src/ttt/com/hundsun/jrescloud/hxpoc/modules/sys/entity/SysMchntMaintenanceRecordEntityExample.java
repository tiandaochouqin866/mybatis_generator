package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysMchntMaintenanceRecordEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMchntMaintenanceRecordEntityExample() {
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

        public Criteria andOperCodeIsNull() {
            addCriterion("OPER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOperCodeIsNotNull() {
            addCriterion("OPER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOperCodeEqualTo(Short value) {
            addCriterion("OPER_CODE =", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeNotEqualTo(Short value) {
            addCriterion("OPER_CODE <>", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeGreaterThan(Short value) {
            addCriterion("OPER_CODE >", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("OPER_CODE >=", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeLessThan(Short value) {
            addCriterion("OPER_CODE <", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeLessThanOrEqualTo(Short value) {
            addCriterion("OPER_CODE <=", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeIn(List<Short> values) {
            addCriterion("OPER_CODE in", values, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeNotIn(List<Short> values) {
            addCriterion("OPER_CODE not in", values, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeBetween(Short value1, Short value2) {
            addCriterion("OPER_CODE between", value1, value2, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeNotBetween(Short value1, Short value2) {
            addCriterion("OPER_CODE not between", value1, value2, "operCode");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart1IsNull() {
            addCriterion("BIG_JSON_PART1 is null");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart1IsNotNull() {
            addCriterion("BIG_JSON_PART1 is not null");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart1EqualTo(String value) {
            addCriterion("BIG_JSON_PART1 =", value, "bigJsonPart1");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart1NotEqualTo(String value) {
            addCriterion("BIG_JSON_PART1 <>", value, "bigJsonPart1");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart1GreaterThan(String value) {
            addCriterion("BIG_JSON_PART1 >", value, "bigJsonPart1");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart1GreaterThanOrEqualTo(String value) {
            addCriterion("BIG_JSON_PART1 >=", value, "bigJsonPart1");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart1LessThan(String value) {
            addCriterion("BIG_JSON_PART1 <", value, "bigJsonPart1");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart1LessThanOrEqualTo(String value) {
            addCriterion("BIG_JSON_PART1 <=", value, "bigJsonPart1");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart1In(List<String> values) {
            addCriterion("BIG_JSON_PART1 in", values, "bigJsonPart1");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart1NotIn(List<String> values) {
            addCriterion("BIG_JSON_PART1 not in", values, "bigJsonPart1");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart1Between(String value1, String value2) {
            addCriterion("BIG_JSON_PART1 between", value1, value2, "bigJsonPart1");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart1NotBetween(String value1, String value2) {
            addCriterion("BIG_JSON_PART1 not between", value1, value2, "bigJsonPart1");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart2IsNull() {
            addCriterion("BIG_JSON_PART2 is null");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart2IsNotNull() {
            addCriterion("BIG_JSON_PART2 is not null");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart2EqualTo(String value) {
            addCriterion("BIG_JSON_PART2 =", value, "bigJsonPart2");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart2NotEqualTo(String value) {
            addCriterion("BIG_JSON_PART2 <>", value, "bigJsonPart2");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart2GreaterThan(String value) {
            addCriterion("BIG_JSON_PART2 >", value, "bigJsonPart2");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart2GreaterThanOrEqualTo(String value) {
            addCriterion("BIG_JSON_PART2 >=", value, "bigJsonPart2");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart2LessThan(String value) {
            addCriterion("BIG_JSON_PART2 <", value, "bigJsonPart2");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart2LessThanOrEqualTo(String value) {
            addCriterion("BIG_JSON_PART2 <=", value, "bigJsonPart2");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart2In(List<String> values) {
            addCriterion("BIG_JSON_PART2 in", values, "bigJsonPart2");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart2NotIn(List<String> values) {
            addCriterion("BIG_JSON_PART2 not in", values, "bigJsonPart2");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart2Between(String value1, String value2) {
            addCriterion("BIG_JSON_PART2 between", value1, value2, "bigJsonPart2");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart2NotBetween(String value1, String value2) {
            addCriterion("BIG_JSON_PART2 not between", value1, value2, "bigJsonPart2");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart3IsNull() {
            addCriterion("BIG_JSON_PART3 is null");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart3IsNotNull() {
            addCriterion("BIG_JSON_PART3 is not null");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart3EqualTo(String value) {
            addCriterion("BIG_JSON_PART3 =", value, "bigJsonPart3");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart3NotEqualTo(String value) {
            addCriterion("BIG_JSON_PART3 <>", value, "bigJsonPart3");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart3GreaterThan(String value) {
            addCriterion("BIG_JSON_PART3 >", value, "bigJsonPart3");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart3GreaterThanOrEqualTo(String value) {
            addCriterion("BIG_JSON_PART3 >=", value, "bigJsonPart3");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart3LessThan(String value) {
            addCriterion("BIG_JSON_PART3 <", value, "bigJsonPart3");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart3LessThanOrEqualTo(String value) {
            addCriterion("BIG_JSON_PART3 <=", value, "bigJsonPart3");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart3In(List<String> values) {
            addCriterion("BIG_JSON_PART3 in", values, "bigJsonPart3");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart3NotIn(List<String> values) {
            addCriterion("BIG_JSON_PART3 not in", values, "bigJsonPart3");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart3Between(String value1, String value2) {
            addCriterion("BIG_JSON_PART3 between", value1, value2, "bigJsonPart3");
            return (Criteria) this;
        }

        public Criteria andBigJsonPart3NotBetween(String value1, String value2) {
            addCriterion("BIG_JSON_PART3 not between", value1, value2, "bigJsonPart3");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeIsNull() {
            addCriterion("AUDIT_USER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeIsNotNull() {
            addCriterion("AUDIT_USER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeEqualTo(String value) {
            addCriterion("AUDIT_USER_CODE =", value, "auditUserCode");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeNotEqualTo(String value) {
            addCriterion("AUDIT_USER_CODE <>", value, "auditUserCode");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeGreaterThan(String value) {
            addCriterion("AUDIT_USER_CODE >", value, "auditUserCode");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_USER_CODE >=", value, "auditUserCode");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeLessThan(String value) {
            addCriterion("AUDIT_USER_CODE <", value, "auditUserCode");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_USER_CODE <=", value, "auditUserCode");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeLike(String value) {
            addCriterion("AUDIT_USER_CODE like", value, "auditUserCode");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeNotLike(String value) {
            addCriterion("AUDIT_USER_CODE not like", value, "auditUserCode");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeIn(List<String> values) {
            addCriterion("AUDIT_USER_CODE in", values, "auditUserCode");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeNotIn(List<String> values) {
            addCriterion("AUDIT_USER_CODE not in", values, "auditUserCode");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeBetween(String value1, String value2) {
            addCriterion("AUDIT_USER_CODE between", value1, value2, "auditUserCode");
            return (Criteria) this;
        }

        public Criteria andAuditUserCodeNotBetween(String value1, String value2) {
            addCriterion("AUDIT_USER_CODE not between", value1, value2, "auditUserCode");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("AUDIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("AUDIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(String value) {
            addCriterion("AUDIT_TIME =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(String value) {
            addCriterion("AUDIT_TIME <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(String value) {
            addCriterion("AUDIT_TIME >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_TIME >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(String value) {
            addCriterion("AUDIT_TIME <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_TIME <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLike(String value) {
            addCriterion("AUDIT_TIME like", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotLike(String value) {
            addCriterion("AUDIT_TIME not like", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<String> values) {
            addCriterion("AUDIT_TIME in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<String> values) {
            addCriterion("AUDIT_TIME not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(String value1, String value2) {
            addCriterion("AUDIT_TIME between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(String value1, String value2) {
            addCriterion("AUDIT_TIME not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNull() {
            addCriterion("AUDIT_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNotNull() {
            addCriterion("AUDIT_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAuditResultEqualTo(Short value) {
            addCriterion("AUDIT_RESULT =", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotEqualTo(Short value) {
            addCriterion("AUDIT_RESULT <>", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThan(Short value) {
            addCriterion("AUDIT_RESULT >", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThanOrEqualTo(Short value) {
            addCriterion("AUDIT_RESULT >=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThan(Short value) {
            addCriterion("AUDIT_RESULT <", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThanOrEqualTo(Short value) {
            addCriterion("AUDIT_RESULT <=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultIn(List<Short> values) {
            addCriterion("AUDIT_RESULT in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotIn(List<Short> values) {
            addCriterion("AUDIT_RESULT not in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultBetween(Short value1, Short value2) {
            addCriterion("AUDIT_RESULT between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotBetween(Short value1, Short value2) {
            addCriterion("AUDIT_RESULT not between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditDescIsNull() {
            addCriterion("AUDIT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andAuditDescIsNotNull() {
            addCriterion("AUDIT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDescEqualTo(String value) {
            addCriterion("AUDIT_DESC =", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescNotEqualTo(String value) {
            addCriterion("AUDIT_DESC <>", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescGreaterThan(String value) {
            addCriterion("AUDIT_DESC >", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_DESC >=", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescLessThan(String value) {
            addCriterion("AUDIT_DESC <", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_DESC <=", value, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescIn(List<String> values) {
            addCriterion("AUDIT_DESC in", values, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescNotIn(List<String> values) {
            addCriterion("AUDIT_DESC not in", values, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescBetween(String value1, String value2) {
            addCriterion("AUDIT_DESC between", value1, value2, "auditDesc");
            return (Criteria) this;
        }

        public Criteria andAuditDescNotBetween(String value1, String value2) {
            addCriterion("AUDIT_DESC not between", value1, value2, "auditDesc");
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

        public Criteria andChangePartIsNull() {
            addCriterion("CHANGE_PART is null");
            return (Criteria) this;
        }

        public Criteria andChangePartIsNotNull() {
            addCriterion("CHANGE_PART is not null");
            return (Criteria) this;
        }

        public Criteria andChangePartEqualTo(String value) {
            addCriterion("CHANGE_PART =", value, "changePart");
            return (Criteria) this;
        }

        public Criteria andChangePartNotEqualTo(String value) {
            addCriterion("CHANGE_PART <>", value, "changePart");
            return (Criteria) this;
        }

        public Criteria andChangePartGreaterThan(String value) {
            addCriterion("CHANGE_PART >", value, "changePart");
            return (Criteria) this;
        }

        public Criteria andChangePartGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_PART >=", value, "changePart");
            return (Criteria) this;
        }

        public Criteria andChangePartLessThan(String value) {
            addCriterion("CHANGE_PART <", value, "changePart");
            return (Criteria) this;
        }

        public Criteria andChangePartLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_PART <=", value, "changePart");
            return (Criteria) this;
        }

        public Criteria andChangePartLike(String value) {
            addCriterion("CHANGE_PART like", value, "changePart");
            return (Criteria) this;
        }

        public Criteria andChangePartNotLike(String value) {
            addCriterion("CHANGE_PART not like", value, "changePart");
            return (Criteria) this;
        }

        public Criteria andChangePartIn(List<String> values) {
            addCriterion("CHANGE_PART in", values, "changePart");
            return (Criteria) this;
        }

        public Criteria andChangePartNotIn(List<String> values) {
            addCriterion("CHANGE_PART not in", values, "changePart");
            return (Criteria) this;
        }

        public Criteria andChangePartBetween(String value1, String value2) {
            addCriterion("CHANGE_PART between", value1, value2, "changePart");
            return (Criteria) this;
        }

        public Criteria andChangePartNotBetween(String value1, String value2) {
            addCriterion("CHANGE_PART not between", value1, value2, "changePart");
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