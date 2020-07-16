package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class SysBranchInheritEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysBranchInheritEntityExample() {
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

        public Criteria andHigherBranchIsNull() {
            addCriterion("HIGHER_BRANCH is null");
            return (Criteria) this;
        }

        public Criteria andHigherBranchIsNotNull() {
            addCriterion("HIGHER_BRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andHigherBranchEqualTo(Long value) {
            addCriterion("HIGHER_BRANCH =", value, "higherBranch");
            return (Criteria) this;
        }

        public Criteria andHigherBranchNotEqualTo(Long value) {
            addCriterion("HIGHER_BRANCH <>", value, "higherBranch");
            return (Criteria) this;
        }

        public Criteria andHigherBranchGreaterThan(Long value) {
            addCriterion("HIGHER_BRANCH >", value, "higherBranch");
            return (Criteria) this;
        }

        public Criteria andHigherBranchGreaterThanOrEqualTo(Long value) {
            addCriterion("HIGHER_BRANCH >=", value, "higherBranch");
            return (Criteria) this;
        }

        public Criteria andHigherBranchLessThan(Long value) {
            addCriterion("HIGHER_BRANCH <", value, "higherBranch");
            return (Criteria) this;
        }

        public Criteria andHigherBranchLessThanOrEqualTo(Long value) {
            addCriterion("HIGHER_BRANCH <=", value, "higherBranch");
            return (Criteria) this;
        }

        public Criteria andHigherBranchIn(List<Long> values) {
            addCriterion("HIGHER_BRANCH in", values, "higherBranch");
            return (Criteria) this;
        }

        public Criteria andHigherBranchNotIn(List<Long> values) {
            addCriterion("HIGHER_BRANCH not in", values, "higherBranch");
            return (Criteria) this;
        }

        public Criteria andHigherBranchBetween(Long value1, Long value2) {
            addCriterion("HIGHER_BRANCH between", value1, value2, "higherBranch");
            return (Criteria) this;
        }

        public Criteria andHigherBranchNotBetween(Long value1, Long value2) {
            addCriterion("HIGHER_BRANCH not between", value1, value2, "higherBranch");
            return (Criteria) this;
        }

        public Criteria andLowerBranchIsNull() {
            addCriterion("LOWER_BRANCH is null");
            return (Criteria) this;
        }

        public Criteria andLowerBranchIsNotNull() {
            addCriterion("LOWER_BRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andLowerBranchEqualTo(Long value) {
            addCriterion("LOWER_BRANCH =", value, "lowerBranch");
            return (Criteria) this;
        }

        public Criteria andLowerBranchNotEqualTo(Long value) {
            addCriterion("LOWER_BRANCH <>", value, "lowerBranch");
            return (Criteria) this;
        }

        public Criteria andLowerBranchGreaterThan(Long value) {
            addCriterion("LOWER_BRANCH >", value, "lowerBranch");
            return (Criteria) this;
        }

        public Criteria andLowerBranchGreaterThanOrEqualTo(Long value) {
            addCriterion("LOWER_BRANCH >=", value, "lowerBranch");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLessThan(Long value) {
            addCriterion("LOWER_BRANCH <", value, "lowerBranch");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLessThanOrEqualTo(Long value) {
            addCriterion("LOWER_BRANCH <=", value, "lowerBranch");
            return (Criteria) this;
        }

        public Criteria andLowerBranchIn(List<Long> values) {
            addCriterion("LOWER_BRANCH in", values, "lowerBranch");
            return (Criteria) this;
        }

        public Criteria andLowerBranchNotIn(List<Long> values) {
            addCriterion("LOWER_BRANCH not in", values, "lowerBranch");
            return (Criteria) this;
        }

        public Criteria andLowerBranchBetween(Long value1, Long value2) {
            addCriterion("LOWER_BRANCH between", value1, value2, "lowerBranch");
            return (Criteria) this;
        }

        public Criteria andLowerBranchNotBetween(Long value1, Long value2) {
            addCriterion("LOWER_BRANCH not between", value1, value2, "lowerBranch");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLevelIsNull() {
            addCriterion("LOWER_BRANCH_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLevelIsNotNull() {
            addCriterion("LOWER_BRANCH_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLevelEqualTo(Short value) {
            addCriterion("LOWER_BRANCH_LEVEL =", value, "lowerBranchLevel");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLevelNotEqualTo(Short value) {
            addCriterion("LOWER_BRANCH_LEVEL <>", value, "lowerBranchLevel");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLevelGreaterThan(Short value) {
            addCriterion("LOWER_BRANCH_LEVEL >", value, "lowerBranchLevel");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("LOWER_BRANCH_LEVEL >=", value, "lowerBranchLevel");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLevelLessThan(Short value) {
            addCriterion("LOWER_BRANCH_LEVEL <", value, "lowerBranchLevel");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLevelLessThanOrEqualTo(Short value) {
            addCriterion("LOWER_BRANCH_LEVEL <=", value, "lowerBranchLevel");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLevelIn(List<Short> values) {
            addCriterion("LOWER_BRANCH_LEVEL in", values, "lowerBranchLevel");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLevelNotIn(List<Short> values) {
            addCriterion("LOWER_BRANCH_LEVEL not in", values, "lowerBranchLevel");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLevelBetween(Short value1, Short value2) {
            addCriterion("LOWER_BRANCH_LEVEL between", value1, value2, "lowerBranchLevel");
            return (Criteria) this;
        }

        public Criteria andLowerBranchLevelNotBetween(Short value1, Short value2) {
            addCriterion("LOWER_BRANCH_LEVEL not between", value1, value2, "lowerBranchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchSubtractIsNull() {
            addCriterion("BRANCH_SUBTRACT is null");
            return (Criteria) this;
        }

        public Criteria andBranchSubtractIsNotNull() {
            addCriterion("BRANCH_SUBTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andBranchSubtractEqualTo(Short value) {
            addCriterion("BRANCH_SUBTRACT =", value, "branchSubtract");
            return (Criteria) this;
        }

        public Criteria andBranchSubtractNotEqualTo(Short value) {
            addCriterion("BRANCH_SUBTRACT <>", value, "branchSubtract");
            return (Criteria) this;
        }

        public Criteria andBranchSubtractGreaterThan(Short value) {
            addCriterion("BRANCH_SUBTRACT >", value, "branchSubtract");
            return (Criteria) this;
        }

        public Criteria andBranchSubtractGreaterThanOrEqualTo(Short value) {
            addCriterion("BRANCH_SUBTRACT >=", value, "branchSubtract");
            return (Criteria) this;
        }

        public Criteria andBranchSubtractLessThan(Short value) {
            addCriterion("BRANCH_SUBTRACT <", value, "branchSubtract");
            return (Criteria) this;
        }

        public Criteria andBranchSubtractLessThanOrEqualTo(Short value) {
            addCriterion("BRANCH_SUBTRACT <=", value, "branchSubtract");
            return (Criteria) this;
        }

        public Criteria andBranchSubtractIn(List<Short> values) {
            addCriterion("BRANCH_SUBTRACT in", values, "branchSubtract");
            return (Criteria) this;
        }

        public Criteria andBranchSubtractNotIn(List<Short> values) {
            addCriterion("BRANCH_SUBTRACT not in", values, "branchSubtract");
            return (Criteria) this;
        }

        public Criteria andBranchSubtractBetween(Short value1, Short value2) {
            addCriterion("BRANCH_SUBTRACT between", value1, value2, "branchSubtract");
            return (Criteria) this;
        }

        public Criteria andBranchSubtractNotBetween(Short value1, Short value2) {
            addCriterion("BRANCH_SUBTRACT not between", value1, value2, "branchSubtract");
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

        public Criteria andHigherBranchLevelIsNull() {
            addCriterion("HIGHER_BRANCH_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andHigherBranchLevelIsNotNull() {
            addCriterion("HIGHER_BRANCH_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andHigherBranchLevelEqualTo(Short value) {
            addCriterion("HIGHER_BRANCH_LEVEL =", value, "higherBranchLevel");
            return (Criteria) this;
        }

        public Criteria andHigherBranchLevelNotEqualTo(Short value) {
            addCriterion("HIGHER_BRANCH_LEVEL <>", value, "higherBranchLevel");
            return (Criteria) this;
        }

        public Criteria andHigherBranchLevelGreaterThan(Short value) {
            addCriterion("HIGHER_BRANCH_LEVEL >", value, "higherBranchLevel");
            return (Criteria) this;
        }

        public Criteria andHigherBranchLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("HIGHER_BRANCH_LEVEL >=", value, "higherBranchLevel");
            return (Criteria) this;
        }

        public Criteria andHigherBranchLevelLessThan(Short value) {
            addCriterion("HIGHER_BRANCH_LEVEL <", value, "higherBranchLevel");
            return (Criteria) this;
        }

        public Criteria andHigherBranchLevelLessThanOrEqualTo(Short value) {
            addCriterion("HIGHER_BRANCH_LEVEL <=", value, "higherBranchLevel");
            return (Criteria) this;
        }

        public Criteria andHigherBranchLevelIn(List<Short> values) {
            addCriterion("HIGHER_BRANCH_LEVEL in", values, "higherBranchLevel");
            return (Criteria) this;
        }

        public Criteria andHigherBranchLevelNotIn(List<Short> values) {
            addCriterion("HIGHER_BRANCH_LEVEL not in", values, "higherBranchLevel");
            return (Criteria) this;
        }

        public Criteria andHigherBranchLevelBetween(Short value1, Short value2) {
            addCriterion("HIGHER_BRANCH_LEVEL between", value1, value2, "higherBranchLevel");
            return (Criteria) this;
        }

        public Criteria andHigherBranchLevelNotBetween(Short value1, Short value2) {
            addCriterion("HIGHER_BRANCH_LEVEL not between", value1, value2, "higherBranchLevel");
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