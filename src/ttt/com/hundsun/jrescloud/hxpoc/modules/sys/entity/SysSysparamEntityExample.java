package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class SysSysparamEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysSysparamEntityExample() {
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

        public Criteria andSysparamCodeIsNull() {
            addCriterion("SYSPARAM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSysparamCodeIsNotNull() {
            addCriterion("SYSPARAM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSysparamCodeEqualTo(String value) {
            addCriterion("SYSPARAM_CODE =", value, "sysparamCode");
            return (Criteria) this;
        }

        public Criteria andSysparamCodeNotEqualTo(String value) {
            addCriterion("SYSPARAM_CODE <>", value, "sysparamCode");
            return (Criteria) this;
        }

        public Criteria andSysparamCodeGreaterThan(String value) {
            addCriterion("SYSPARAM_CODE >", value, "sysparamCode");
            return (Criteria) this;
        }

        public Criteria andSysparamCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYSPARAM_CODE >=", value, "sysparamCode");
            return (Criteria) this;
        }

        public Criteria andSysparamCodeLessThan(String value) {
            addCriterion("SYSPARAM_CODE <", value, "sysparamCode");
            return (Criteria) this;
        }

        public Criteria andSysparamCodeLessThanOrEqualTo(String value) {
            addCriterion("SYSPARAM_CODE <=", value, "sysparamCode");
            return (Criteria) this;
        }

        public Criteria andSysparamCodeLike(String value) {
            addCriterion("SYSPARAM_CODE like", value, "sysparamCode");
            return (Criteria) this;
        }

        public Criteria andSysparamCodeNotLike(String value) {
            addCriterion("SYSPARAM_CODE not like", value, "sysparamCode");
            return (Criteria) this;
        }

        public Criteria andSysparamCodeIn(List<String> values) {
            addCriterion("SYSPARAM_CODE in", values, "sysparamCode");
            return (Criteria) this;
        }

        public Criteria andSysparamCodeNotIn(List<String> values) {
            addCriterion("SYSPARAM_CODE not in", values, "sysparamCode");
            return (Criteria) this;
        }

        public Criteria andSysparamCodeBetween(String value1, String value2) {
            addCriterion("SYSPARAM_CODE between", value1, value2, "sysparamCode");
            return (Criteria) this;
        }

        public Criteria andSysparamCodeNotBetween(String value1, String value2) {
            addCriterion("SYSPARAM_CODE not between", value1, value2, "sysparamCode");
            return (Criteria) this;
        }

        public Criteria andSysparamValueIsNull() {
            addCriterion("SYSPARAM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andSysparamValueIsNotNull() {
            addCriterion("SYSPARAM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andSysparamValueEqualTo(String value) {
            addCriterion("SYSPARAM_VALUE =", value, "sysparamValue");
            return (Criteria) this;
        }

        public Criteria andSysparamValueNotEqualTo(String value) {
            addCriterion("SYSPARAM_VALUE <>", value, "sysparamValue");
            return (Criteria) this;
        }

        public Criteria andSysparamValueGreaterThan(String value) {
            addCriterion("SYSPARAM_VALUE >", value, "sysparamValue");
            return (Criteria) this;
        }

        public Criteria andSysparamValueGreaterThanOrEqualTo(String value) {
            addCriterion("SYSPARAM_VALUE >=", value, "sysparamValue");
            return (Criteria) this;
        }

        public Criteria andSysparamValueLessThan(String value) {
            addCriterion("SYSPARAM_VALUE <", value, "sysparamValue");
            return (Criteria) this;
        }

        public Criteria andSysparamValueLessThanOrEqualTo(String value) {
            addCriterion("SYSPARAM_VALUE <=", value, "sysparamValue");
            return (Criteria) this;
        }

        public Criteria andSysparamValueLike(String value) {
            addCriterion("SYSPARAM_VALUE like", value, "sysparamValue");
            return (Criteria) this;
        }

        public Criteria andSysparamValueNotLike(String value) {
            addCriterion("SYSPARAM_VALUE not like", value, "sysparamValue");
            return (Criteria) this;
        }

        public Criteria andSysparamValueIn(List<String> values) {
            addCriterion("SYSPARAM_VALUE in", values, "sysparamValue");
            return (Criteria) this;
        }

        public Criteria andSysparamValueNotIn(List<String> values) {
            addCriterion("SYSPARAM_VALUE not in", values, "sysparamValue");
            return (Criteria) this;
        }

        public Criteria andSysparamValueBetween(String value1, String value2) {
            addCriterion("SYSPARAM_VALUE between", value1, value2, "sysparamValue");
            return (Criteria) this;
        }

        public Criteria andSysparamValueNotBetween(String value1, String value2) {
            addCriterion("SYSPARAM_VALUE not between", value1, value2, "sysparamValue");
            return (Criteria) this;
        }

        public Criteria andSysparamTypeIsNull() {
            addCriterion("SYSPARAM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSysparamTypeIsNotNull() {
            addCriterion("SYSPARAM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSysparamTypeEqualTo(Short value) {
            addCriterion("SYSPARAM_TYPE =", value, "sysparamType");
            return (Criteria) this;
        }

        public Criteria andSysparamTypeNotEqualTo(Short value) {
            addCriterion("SYSPARAM_TYPE <>", value, "sysparamType");
            return (Criteria) this;
        }

        public Criteria andSysparamTypeGreaterThan(Short value) {
            addCriterion("SYSPARAM_TYPE >", value, "sysparamType");
            return (Criteria) this;
        }

        public Criteria andSysparamTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("SYSPARAM_TYPE >=", value, "sysparamType");
            return (Criteria) this;
        }

        public Criteria andSysparamTypeLessThan(Short value) {
            addCriterion("SYSPARAM_TYPE <", value, "sysparamType");
            return (Criteria) this;
        }

        public Criteria andSysparamTypeLessThanOrEqualTo(Short value) {
            addCriterion("SYSPARAM_TYPE <=", value, "sysparamType");
            return (Criteria) this;
        }

        public Criteria andSysparamTypeIn(List<Short> values) {
            addCriterion("SYSPARAM_TYPE in", values, "sysparamType");
            return (Criteria) this;
        }

        public Criteria andSysparamTypeNotIn(List<Short> values) {
            addCriterion("SYSPARAM_TYPE not in", values, "sysparamType");
            return (Criteria) this;
        }

        public Criteria andSysparamTypeBetween(Short value1, Short value2) {
            addCriterion("SYSPARAM_TYPE between", value1, value2, "sysparamType");
            return (Criteria) this;
        }

        public Criteria andSysparamTypeNotBetween(Short value1, Short value2) {
            addCriterion("SYSPARAM_TYPE not between", value1, value2, "sysparamType");
            return (Criteria) this;
        }

        public Criteria andSysparamDescIsNull() {
            addCriterion("SYSPARAM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSysparamDescIsNotNull() {
            addCriterion("SYSPARAM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSysparamDescEqualTo(String value) {
            addCriterion("SYSPARAM_DESC =", value, "sysparamDesc");
            return (Criteria) this;
        }

        public Criteria andSysparamDescNotEqualTo(String value) {
            addCriterion("SYSPARAM_DESC <>", value, "sysparamDesc");
            return (Criteria) this;
        }

        public Criteria andSysparamDescGreaterThan(String value) {
            addCriterion("SYSPARAM_DESC >", value, "sysparamDesc");
            return (Criteria) this;
        }

        public Criteria andSysparamDescGreaterThanOrEqualTo(String value) {
            addCriterion("SYSPARAM_DESC >=", value, "sysparamDesc");
            return (Criteria) this;
        }

        public Criteria andSysparamDescLessThan(String value) {
            addCriterion("SYSPARAM_DESC <", value, "sysparamDesc");
            return (Criteria) this;
        }

        public Criteria andSysparamDescLessThanOrEqualTo(String value) {
            addCriterion("SYSPARAM_DESC <=", value, "sysparamDesc");
            return (Criteria) this;
        }

        public Criteria andSysparamDescIn(List<String> values) {
            addCriterion("SYSPARAM_DESC in", values, "sysparamDesc");
            return (Criteria) this;
        }

        public Criteria andSysparamDescNotIn(List<String> values) {
            addCriterion("SYSPARAM_DESC not in", values, "sysparamDesc");
            return (Criteria) this;
        }

        public Criteria andSysparamDescBetween(String value1, String value2) {
            addCriterion("SYSPARAM_DESC between", value1, value2, "sysparamDesc");
            return (Criteria) this;
        }

        public Criteria andSysparamDescNotBetween(String value1, String value2) {
            addCriterion("SYSPARAM_DESC not between", value1, value2, "sysparamDesc");
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