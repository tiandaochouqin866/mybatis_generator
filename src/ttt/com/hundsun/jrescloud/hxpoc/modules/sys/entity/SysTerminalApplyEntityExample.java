package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysTerminalApplyEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTerminalApplyEntityExample() {
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

        public Criteria andDepositPaymentSerialIsNull() {
            addCriterion("DEPOSIT_PAYMENT_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentSerialIsNotNull() {
            addCriterion("DEPOSIT_PAYMENT_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentSerialEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT_PAYMENT_SERIAL =", value, "depositPaymentSerial");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentSerialNotEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT_PAYMENT_SERIAL <>", value, "depositPaymentSerial");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentSerialGreaterThan(BigDecimal value) {
            addCriterion("DEPOSIT_PAYMENT_SERIAL >", value, "depositPaymentSerial");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentSerialGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT_PAYMENT_SERIAL >=", value, "depositPaymentSerial");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentSerialLessThan(BigDecimal value) {
            addCriterion("DEPOSIT_PAYMENT_SERIAL <", value, "depositPaymentSerial");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentSerialLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT_PAYMENT_SERIAL <=", value, "depositPaymentSerial");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentSerialIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT_PAYMENT_SERIAL in", values, "depositPaymentSerial");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentSerialNotIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT_PAYMENT_SERIAL not in", values, "depositPaymentSerial");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentSerialBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT_PAYMENT_SERIAL between", value1, value2, "depositPaymentSerial");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentSerialNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT_PAYMENT_SERIAL not between", value1, value2, "depositPaymentSerial");
            return (Criteria) this;
        }

        public Criteria andApplyBranchIsNull() {
            addCriterion("APPLY_BRANCH is null");
            return (Criteria) this;
        }

        public Criteria andApplyBranchIsNotNull() {
            addCriterion("APPLY_BRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andApplyBranchEqualTo(Long value) {
            addCriterion("APPLY_BRANCH =", value, "applyBranch");
            return (Criteria) this;
        }

        public Criteria andApplyBranchNotEqualTo(Long value) {
            addCriterion("APPLY_BRANCH <>", value, "applyBranch");
            return (Criteria) this;
        }

        public Criteria andApplyBranchGreaterThan(Long value) {
            addCriterion("APPLY_BRANCH >", value, "applyBranch");
            return (Criteria) this;
        }

        public Criteria andApplyBranchGreaterThanOrEqualTo(Long value) {
            addCriterion("APPLY_BRANCH >=", value, "applyBranch");
            return (Criteria) this;
        }

        public Criteria andApplyBranchLessThan(Long value) {
            addCriterion("APPLY_BRANCH <", value, "applyBranch");
            return (Criteria) this;
        }

        public Criteria andApplyBranchLessThanOrEqualTo(Long value) {
            addCriterion("APPLY_BRANCH <=", value, "applyBranch");
            return (Criteria) this;
        }

        public Criteria andApplyBranchIn(List<Long> values) {
            addCriterion("APPLY_BRANCH in", values, "applyBranch");
            return (Criteria) this;
        }

        public Criteria andApplyBranchNotIn(List<Long> values) {
            addCriterion("APPLY_BRANCH not in", values, "applyBranch");
            return (Criteria) this;
        }

        public Criteria andApplyBranchBetween(Long value1, Long value2) {
            addCriterion("APPLY_BRANCH between", value1, value2, "applyBranch");
            return (Criteria) this;
        }

        public Criteria andApplyBranchNotBetween(Long value1, Long value2) {
            addCriterion("APPLY_BRANCH not between", value1, value2, "applyBranch");
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