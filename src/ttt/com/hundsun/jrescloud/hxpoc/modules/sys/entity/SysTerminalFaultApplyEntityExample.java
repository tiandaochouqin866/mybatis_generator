package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class SysTerminalFaultApplyEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTerminalFaultApplyEntityExample() {
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

        public Criteria andReportDescIsNull() {
            addCriterion("REPORT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andReportDescIsNotNull() {
            addCriterion("REPORT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andReportDescEqualTo(String value) {
            addCriterion("REPORT_DESC =", value, "reportDesc");
            return (Criteria) this;
        }

        public Criteria andReportDescNotEqualTo(String value) {
            addCriterion("REPORT_DESC <>", value, "reportDesc");
            return (Criteria) this;
        }

        public Criteria andReportDescGreaterThan(String value) {
            addCriterion("REPORT_DESC >", value, "reportDesc");
            return (Criteria) this;
        }

        public Criteria andReportDescGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_DESC >=", value, "reportDesc");
            return (Criteria) this;
        }

        public Criteria andReportDescLessThan(String value) {
            addCriterion("REPORT_DESC <", value, "reportDesc");
            return (Criteria) this;
        }

        public Criteria andReportDescLessThanOrEqualTo(String value) {
            addCriterion("REPORT_DESC <=", value, "reportDesc");
            return (Criteria) this;
        }

        public Criteria andReportDescIn(List<String> values) {
            addCriterion("REPORT_DESC in", values, "reportDesc");
            return (Criteria) this;
        }

        public Criteria andReportDescNotIn(List<String> values) {
            addCriterion("REPORT_DESC not in", values, "reportDesc");
            return (Criteria) this;
        }

        public Criteria andReportDescBetween(String value1, String value2) {
            addCriterion("REPORT_DESC between", value1, value2, "reportDesc");
            return (Criteria) this;
        }

        public Criteria andReportDescNotBetween(String value1, String value2) {
            addCriterion("REPORT_DESC not between", value1, value2, "reportDesc");
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