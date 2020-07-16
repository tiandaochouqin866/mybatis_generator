package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class SysTriggerConfigEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTriggerConfigEntityExample() {
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

        public Criteria andTriggerCodeIsNull() {
            addCriterion("TRIGGER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeIsNotNull() {
            addCriterion("TRIGGER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeEqualTo(String value) {
            addCriterion("TRIGGER_CODE =", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeNotEqualTo(String value) {
            addCriterion("TRIGGER_CODE <>", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeGreaterThan(String value) {
            addCriterion("TRIGGER_CODE >", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGGER_CODE >=", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeLessThan(String value) {
            addCriterion("TRIGGER_CODE <", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeLessThanOrEqualTo(String value) {
            addCriterion("TRIGGER_CODE <=", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeLike(String value) {
            addCriterion("TRIGGER_CODE like", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeNotLike(String value) {
            addCriterion("TRIGGER_CODE not like", value, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeIn(List<String> values) {
            addCriterion("TRIGGER_CODE in", values, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeNotIn(List<String> values) {
            addCriterion("TRIGGER_CODE not in", values, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeBetween(String value1, String value2) {
            addCriterion("TRIGGER_CODE between", value1, value2, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerCodeNotBetween(String value1, String value2) {
            addCriterion("TRIGGER_CODE not between", value1, value2, "triggerCode");
            return (Criteria) this;
        }

        public Criteria andTriggerDescIsNull() {
            addCriterion("TRIGGER_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTriggerDescIsNotNull() {
            addCriterion("TRIGGER_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerDescEqualTo(Object value) {
            addCriterion("TRIGGER_DESC =", value, "triggerDesc");
            return (Criteria) this;
        }

        public Criteria andTriggerDescNotEqualTo(Object value) {
            addCriterion("TRIGGER_DESC <>", value, "triggerDesc");
            return (Criteria) this;
        }

        public Criteria andTriggerDescGreaterThan(Object value) {
            addCriterion("TRIGGER_DESC >", value, "triggerDesc");
            return (Criteria) this;
        }

        public Criteria andTriggerDescGreaterThanOrEqualTo(Object value) {
            addCriterion("TRIGGER_DESC >=", value, "triggerDesc");
            return (Criteria) this;
        }

        public Criteria andTriggerDescLessThan(Object value) {
            addCriterion("TRIGGER_DESC <", value, "triggerDesc");
            return (Criteria) this;
        }

        public Criteria andTriggerDescLessThanOrEqualTo(Object value) {
            addCriterion("TRIGGER_DESC <=", value, "triggerDesc");
            return (Criteria) this;
        }

        public Criteria andTriggerDescIn(List<Object> values) {
            addCriterion("TRIGGER_DESC in", values, "triggerDesc");
            return (Criteria) this;
        }

        public Criteria andTriggerDescNotIn(List<Object> values) {
            addCriterion("TRIGGER_DESC not in", values, "triggerDesc");
            return (Criteria) this;
        }

        public Criteria andTriggerDescBetween(Object value1, Object value2) {
            addCriterion("TRIGGER_DESC between", value1, value2, "triggerDesc");
            return (Criteria) this;
        }

        public Criteria andTriggerDescNotBetween(Object value1, Object value2) {
            addCriterion("TRIGGER_DESC not between", value1, value2, "triggerDesc");
            return (Criteria) this;
        }

        public Criteria andTriggerCronIsNull() {
            addCriterion("TRIGGER_CRON is null");
            return (Criteria) this;
        }

        public Criteria andTriggerCronIsNotNull() {
            addCriterion("TRIGGER_CRON is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerCronEqualTo(String value) {
            addCriterion("TRIGGER_CRON =", value, "triggerCron");
            return (Criteria) this;
        }

        public Criteria andTriggerCronNotEqualTo(String value) {
            addCriterion("TRIGGER_CRON <>", value, "triggerCron");
            return (Criteria) this;
        }

        public Criteria andTriggerCronGreaterThan(String value) {
            addCriterion("TRIGGER_CRON >", value, "triggerCron");
            return (Criteria) this;
        }

        public Criteria andTriggerCronGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGGER_CRON >=", value, "triggerCron");
            return (Criteria) this;
        }

        public Criteria andTriggerCronLessThan(String value) {
            addCriterion("TRIGGER_CRON <", value, "triggerCron");
            return (Criteria) this;
        }

        public Criteria andTriggerCronLessThanOrEqualTo(String value) {
            addCriterion("TRIGGER_CRON <=", value, "triggerCron");
            return (Criteria) this;
        }

        public Criteria andTriggerCronLike(String value) {
            addCriterion("TRIGGER_CRON like", value, "triggerCron");
            return (Criteria) this;
        }

        public Criteria andTriggerCronNotLike(String value) {
            addCriterion("TRIGGER_CRON not like", value, "triggerCron");
            return (Criteria) this;
        }

        public Criteria andTriggerCronIn(List<String> values) {
            addCriterion("TRIGGER_CRON in", values, "triggerCron");
            return (Criteria) this;
        }

        public Criteria andTriggerCronNotIn(List<String> values) {
            addCriterion("TRIGGER_CRON not in", values, "triggerCron");
            return (Criteria) this;
        }

        public Criteria andTriggerCronBetween(String value1, String value2) {
            addCriterion("TRIGGER_CRON between", value1, value2, "triggerCron");
            return (Criteria) this;
        }

        public Criteria andTriggerCronNotBetween(String value1, String value2) {
            addCriterion("TRIGGER_CRON not between", value1, value2, "triggerCron");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusIsNull() {
            addCriterion("TRIGGER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusIsNotNull() {
            addCriterion("TRIGGER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusEqualTo(Short value) {
            addCriterion("TRIGGER_STATUS =", value, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusNotEqualTo(Short value) {
            addCriterion("TRIGGER_STATUS <>", value, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusGreaterThan(Short value) {
            addCriterion("TRIGGER_STATUS >", value, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("TRIGGER_STATUS >=", value, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusLessThan(Short value) {
            addCriterion("TRIGGER_STATUS <", value, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusLessThanOrEqualTo(Short value) {
            addCriterion("TRIGGER_STATUS <=", value, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusIn(List<Short> values) {
            addCriterion("TRIGGER_STATUS in", values, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusNotIn(List<Short> values) {
            addCriterion("TRIGGER_STATUS not in", values, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusBetween(Short value1, Short value2) {
            addCriterion("TRIGGER_STATUS between", value1, value2, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andTriggerStatusNotBetween(Short value1, Short value2) {
            addCriterion("TRIGGER_STATUS not between", value1, value2, "triggerStatus");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeIsNull() {
            addCriterion("PRE_TRIGGER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeIsNotNull() {
            addCriterion("PRE_TRIGGER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeEqualTo(String value) {
            addCriterion("PRE_TRIGGER_CODE =", value, "preTriggerCode");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeNotEqualTo(String value) {
            addCriterion("PRE_TRIGGER_CODE <>", value, "preTriggerCode");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeGreaterThan(String value) {
            addCriterion("PRE_TRIGGER_CODE >", value, "preTriggerCode");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_TRIGGER_CODE >=", value, "preTriggerCode");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeLessThan(String value) {
            addCriterion("PRE_TRIGGER_CODE <", value, "preTriggerCode");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeLessThanOrEqualTo(String value) {
            addCriterion("PRE_TRIGGER_CODE <=", value, "preTriggerCode");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeLike(String value) {
            addCriterion("PRE_TRIGGER_CODE like", value, "preTriggerCode");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeNotLike(String value) {
            addCriterion("PRE_TRIGGER_CODE not like", value, "preTriggerCode");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeIn(List<String> values) {
            addCriterion("PRE_TRIGGER_CODE in", values, "preTriggerCode");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeNotIn(List<String> values) {
            addCriterion("PRE_TRIGGER_CODE not in", values, "preTriggerCode");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeBetween(String value1, String value2) {
            addCriterion("PRE_TRIGGER_CODE between", value1, value2, "preTriggerCode");
            return (Criteria) this;
        }

        public Criteria andPreTriggerCodeNotBetween(String value1, String value2) {
            addCriterion("PRE_TRIGGER_CODE not between", value1, value2, "preTriggerCode");
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