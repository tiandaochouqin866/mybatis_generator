package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysTerminalModelEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTerminalModelEntityExample() {
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

        public Criteria andTerminalModelIsNull() {
            addCriterion("TERMINAL_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andTerminalModelIsNotNull() {
            addCriterion("TERMINAL_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalModelEqualTo(String value) {
            addCriterion("TERMINAL_MODEL =", value, "terminalModel");
            return (Criteria) this;
        }

        public Criteria andTerminalModelNotEqualTo(String value) {
            addCriterion("TERMINAL_MODEL <>", value, "terminalModel");
            return (Criteria) this;
        }

        public Criteria andTerminalModelGreaterThan(String value) {
            addCriterion("TERMINAL_MODEL >", value, "terminalModel");
            return (Criteria) this;
        }

        public Criteria andTerminalModelGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_MODEL >=", value, "terminalModel");
            return (Criteria) this;
        }

        public Criteria andTerminalModelLessThan(String value) {
            addCriterion("TERMINAL_MODEL <", value, "terminalModel");
            return (Criteria) this;
        }

        public Criteria andTerminalModelLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_MODEL <=", value, "terminalModel");
            return (Criteria) this;
        }

        public Criteria andTerminalModelLike(String value) {
            addCriterion("TERMINAL_MODEL like", value, "terminalModel");
            return (Criteria) this;
        }

        public Criteria andTerminalModelNotLike(String value) {
            addCriterion("TERMINAL_MODEL not like", value, "terminalModel");
            return (Criteria) this;
        }

        public Criteria andTerminalModelIn(List<String> values) {
            addCriterion("TERMINAL_MODEL in", values, "terminalModel");
            return (Criteria) this;
        }

        public Criteria andTerminalModelNotIn(List<String> values) {
            addCriterion("TERMINAL_MODEL not in", values, "terminalModel");
            return (Criteria) this;
        }

        public Criteria andTerminalModelBetween(String value1, String value2) {
            addCriterion("TERMINAL_MODEL between", value1, value2, "terminalModel");
            return (Criteria) this;
        }

        public Criteria andTerminalModelNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_MODEL not between", value1, value2, "terminalModel");
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

        public Criteria andTerminalPhotoIsNull() {
            addCriterion("TERMINAL_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andTerminalPhotoIsNotNull() {
            addCriterion("TERMINAL_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalPhotoEqualTo(BigDecimal value) {
            addCriterion("TERMINAL_PHOTO =", value, "terminalPhoto");
            return (Criteria) this;
        }

        public Criteria andTerminalPhotoNotEqualTo(BigDecimal value) {
            addCriterion("TERMINAL_PHOTO <>", value, "terminalPhoto");
            return (Criteria) this;
        }

        public Criteria andTerminalPhotoGreaterThan(BigDecimal value) {
            addCriterion("TERMINAL_PHOTO >", value, "terminalPhoto");
            return (Criteria) this;
        }

        public Criteria andTerminalPhotoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TERMINAL_PHOTO >=", value, "terminalPhoto");
            return (Criteria) this;
        }

        public Criteria andTerminalPhotoLessThan(BigDecimal value) {
            addCriterion("TERMINAL_PHOTO <", value, "terminalPhoto");
            return (Criteria) this;
        }

        public Criteria andTerminalPhotoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TERMINAL_PHOTO <=", value, "terminalPhoto");
            return (Criteria) this;
        }

        public Criteria andTerminalPhotoIn(List<BigDecimal> values) {
            addCriterion("TERMINAL_PHOTO in", values, "terminalPhoto");
            return (Criteria) this;
        }

        public Criteria andTerminalPhotoNotIn(List<BigDecimal> values) {
            addCriterion("TERMINAL_PHOTO not in", values, "terminalPhoto");
            return (Criteria) this;
        }

        public Criteria andTerminalPhotoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TERMINAL_PHOTO between", value1, value2, "terminalPhoto");
            return (Criteria) this;
        }

        public Criteria andTerminalPhotoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TERMINAL_PHOTO not between", value1, value2, "terminalPhoto");
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

        public Criteria andProducerIsNull() {
            addCriterion("PRODUCER is null");
            return (Criteria) this;
        }

        public Criteria andProducerIsNotNull() {
            addCriterion("PRODUCER is not null");
            return (Criteria) this;
        }

        public Criteria andProducerEqualTo(String value) {
            addCriterion("PRODUCER =", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotEqualTo(String value) {
            addCriterion("PRODUCER <>", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThan(String value) {
            addCriterion("PRODUCER >", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCER >=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThan(String value) {
            addCriterion("PRODUCER <", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThanOrEqualTo(String value) {
            addCriterion("PRODUCER <=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerIn(List<String> values) {
            addCriterion("PRODUCER in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotIn(List<String> values) {
            addCriterion("PRODUCER not in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerBetween(String value1, String value2) {
            addCriterion("PRODUCER between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotBetween(String value1, String value2) {
            addCriterion("PRODUCER not between", value1, value2, "producer");
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