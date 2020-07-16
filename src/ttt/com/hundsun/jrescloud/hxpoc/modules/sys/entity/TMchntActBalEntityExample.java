package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TMchntActBalEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMchntActBalEntityExample() {
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

        public Criteria andSerialNoIsNull() {
            addCriterion("SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSerialNoIsNotNull() {
            addCriterion("SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNoEqualTo(BigDecimal value) {
            addCriterion("SERIAL_NO =", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotEqualTo(BigDecimal value) {
            addCriterion("SERIAL_NO <>", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThan(BigDecimal value) {
            addCriterion("SERIAL_NO >", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SERIAL_NO >=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThan(BigDecimal value) {
            addCriterion("SERIAL_NO <", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SERIAL_NO <=", value, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoIn(List<BigDecimal> values) {
            addCriterion("SERIAL_NO in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotIn(List<BigDecimal> values) {
            addCriterion("SERIAL_NO not in", values, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERIAL_NO between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andSerialNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERIAL_NO not between", value1, value2, "serialNo");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNull() {
            addCriterion("TRADE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("TRADE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(String value) {
            addCriterion("TRADE_DATE =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(String value) {
            addCriterion("TRADE_DATE <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(String value) {
            addCriterion("TRADE_DATE >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(String value) {
            addCriterion("TRADE_DATE >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(String value) {
            addCriterion("TRADE_DATE <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(String value) {
            addCriterion("TRADE_DATE <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLike(String value) {
            addCriterion("TRADE_DATE like", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotLike(String value) {
            addCriterion("TRADE_DATE not like", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<String> values) {
            addCriterion("TRADE_DATE in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<String> values) {
            addCriterion("TRADE_DATE not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(String value1, String value2) {
            addCriterion("TRADE_DATE between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(String value1, String value2) {
            addCriterion("TRADE_DATE not between", value1, value2, "tradeDate");
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

        public Criteria andBranchSimpleNameIsNull() {
            addCriterion("BRANCH_SIMPLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameIsNotNull() {
            addCriterion("BRANCH_SIMPLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameEqualTo(String value) {
            addCriterion("BRANCH_SIMPLE_NAME =", value, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameNotEqualTo(String value) {
            addCriterion("BRANCH_SIMPLE_NAME <>", value, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameGreaterThan(String value) {
            addCriterion("BRANCH_SIMPLE_NAME >", value, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_SIMPLE_NAME >=", value, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameLessThan(String value) {
            addCriterion("BRANCH_SIMPLE_NAME <", value, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_SIMPLE_NAME <=", value, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameIn(List<String> values) {
            addCriterion("BRANCH_SIMPLE_NAME in", values, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameNotIn(List<String> values) {
            addCriterion("BRANCH_SIMPLE_NAME not in", values, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameBetween(String value1, String value2) {
            addCriterion("BRANCH_SIMPLE_NAME between", value1, value2, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBranchSimpleNameNotBetween(String value1, String value2) {
            addCriterion("BRANCH_SIMPLE_NAME not between", value1, value2, "branchSimpleName");
            return (Criteria) this;
        }

        public Criteria andBankActNoIsNull() {
            addCriterion("BANK_ACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankActNoIsNotNull() {
            addCriterion("BANK_ACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankActNoEqualTo(String value) {
            addCriterion("BANK_ACT_NO =", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoNotEqualTo(String value) {
            addCriterion("BANK_ACT_NO <>", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoGreaterThan(String value) {
            addCriterion("BANK_ACT_NO >", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACT_NO >=", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoLessThan(String value) {
            addCriterion("BANK_ACT_NO <", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACT_NO <=", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoLike(String value) {
            addCriterion("BANK_ACT_NO like", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoNotLike(String value) {
            addCriterion("BANK_ACT_NO not like", value, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoIn(List<String> values) {
            addCriterion("BANK_ACT_NO in", values, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoNotIn(List<String> values) {
            addCriterion("BANK_ACT_NO not in", values, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoBetween(String value1, String value2) {
            addCriterion("BANK_ACT_NO between", value1, value2, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andBankActNoNotBetween(String value1, String value2) {
            addCriterion("BANK_ACT_NO not between", value1, value2, "bankActNo");
            return (Criteria) this;
        }

        public Criteria andLastDayBalanceIsNull() {
            addCriterion("LAST_DAY_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andLastDayBalanceIsNotNull() {
            addCriterion("LAST_DAY_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andLastDayBalanceEqualTo(BigDecimal value) {
            addCriterion("LAST_DAY_BALANCE =", value, "lastDayBalance");
            return (Criteria) this;
        }

        public Criteria andLastDayBalanceNotEqualTo(BigDecimal value) {
            addCriterion("LAST_DAY_BALANCE <>", value, "lastDayBalance");
            return (Criteria) this;
        }

        public Criteria andLastDayBalanceGreaterThan(BigDecimal value) {
            addCriterion("LAST_DAY_BALANCE >", value, "lastDayBalance");
            return (Criteria) this;
        }

        public Criteria andLastDayBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_DAY_BALANCE >=", value, "lastDayBalance");
            return (Criteria) this;
        }

        public Criteria andLastDayBalanceLessThan(BigDecimal value) {
            addCriterion("LAST_DAY_BALANCE <", value, "lastDayBalance");
            return (Criteria) this;
        }

        public Criteria andLastDayBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAST_DAY_BALANCE <=", value, "lastDayBalance");
            return (Criteria) this;
        }

        public Criteria andLastDayBalanceIn(List<BigDecimal> values) {
            addCriterion("LAST_DAY_BALANCE in", values, "lastDayBalance");
            return (Criteria) this;
        }

        public Criteria andLastDayBalanceNotIn(List<BigDecimal> values) {
            addCriterion("LAST_DAY_BALANCE not in", values, "lastDayBalance");
            return (Criteria) this;
        }

        public Criteria andLastDayBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_DAY_BALANCE between", value1, value2, "lastDayBalance");
            return (Criteria) this;
        }

        public Criteria andLastDayBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAST_DAY_BALANCE not between", value1, value2, "lastDayBalance");
            return (Criteria) this;
        }

        public Criteria andBusiManagerIsNull() {
            addCriterion("BUSI_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andBusiManagerIsNotNull() {
            addCriterion("BUSI_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andBusiManagerEqualTo(String value) {
            addCriterion("BUSI_MANAGER =", value, "busiManager");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNotEqualTo(String value) {
            addCriterion("BUSI_MANAGER <>", value, "busiManager");
            return (Criteria) this;
        }

        public Criteria andBusiManagerGreaterThan(String value) {
            addCriterion("BUSI_MANAGER >", value, "busiManager");
            return (Criteria) this;
        }

        public Criteria andBusiManagerGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_MANAGER >=", value, "busiManager");
            return (Criteria) this;
        }

        public Criteria andBusiManagerLessThan(String value) {
            addCriterion("BUSI_MANAGER <", value, "busiManager");
            return (Criteria) this;
        }

        public Criteria andBusiManagerLessThanOrEqualTo(String value) {
            addCriterion("BUSI_MANAGER <=", value, "busiManager");
            return (Criteria) this;
        }

        public Criteria andBusiManagerLike(String value) {
            addCriterion("BUSI_MANAGER like", value, "busiManager");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNotLike(String value) {
            addCriterion("BUSI_MANAGER not like", value, "busiManager");
            return (Criteria) this;
        }

        public Criteria andBusiManagerIn(List<String> values) {
            addCriterion("BUSI_MANAGER in", values, "busiManager");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNotIn(List<String> values) {
            addCriterion("BUSI_MANAGER not in", values, "busiManager");
            return (Criteria) this;
        }

        public Criteria andBusiManagerBetween(String value1, String value2) {
            addCriterion("BUSI_MANAGER between", value1, value2, "busiManager");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNotBetween(String value1, String value2) {
            addCriterion("BUSI_MANAGER not between", value1, value2, "busiManager");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNameIsNull() {
            addCriterion("BUSI_MANAGER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNameIsNotNull() {
            addCriterion("BUSI_MANAGER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNameEqualTo(String value) {
            addCriterion("BUSI_MANAGER_NAME =", value, "busiManagerName");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNameNotEqualTo(String value) {
            addCriterion("BUSI_MANAGER_NAME <>", value, "busiManagerName");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNameGreaterThan(String value) {
            addCriterion("BUSI_MANAGER_NAME >", value, "busiManagerName");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_MANAGER_NAME >=", value, "busiManagerName");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNameLessThan(String value) {
            addCriterion("BUSI_MANAGER_NAME <", value, "busiManagerName");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNameLessThanOrEqualTo(String value) {
            addCriterion("BUSI_MANAGER_NAME <=", value, "busiManagerName");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNameIn(List<String> values) {
            addCriterion("BUSI_MANAGER_NAME in", values, "busiManagerName");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNameNotIn(List<String> values) {
            addCriterion("BUSI_MANAGER_NAME not in", values, "busiManagerName");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNameBetween(String value1, String value2) {
            addCriterion("BUSI_MANAGER_NAME between", value1, value2, "busiManagerName");
            return (Criteria) this;
        }

        public Criteria andBusiManagerNameNotBetween(String value1, String value2) {
            addCriterion("BUSI_MANAGER_NAME not between", value1, value2, "busiManagerName");
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

        public Criteria andActErrDetailIsNull() {
            addCriterion("ACT_ERR_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andActErrDetailIsNotNull() {
            addCriterion("ACT_ERR_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andActErrDetailEqualTo(Object value) {
            addCriterion("ACT_ERR_DETAIL =", value, "actErrDetail");
            return (Criteria) this;
        }

        public Criteria andActErrDetailNotEqualTo(Object value) {
            addCriterion("ACT_ERR_DETAIL <>", value, "actErrDetail");
            return (Criteria) this;
        }

        public Criteria andActErrDetailGreaterThan(Object value) {
            addCriterion("ACT_ERR_DETAIL >", value, "actErrDetail");
            return (Criteria) this;
        }

        public Criteria andActErrDetailGreaterThanOrEqualTo(Object value) {
            addCriterion("ACT_ERR_DETAIL >=", value, "actErrDetail");
            return (Criteria) this;
        }

        public Criteria andActErrDetailLessThan(Object value) {
            addCriterion("ACT_ERR_DETAIL <", value, "actErrDetail");
            return (Criteria) this;
        }

        public Criteria andActErrDetailLessThanOrEqualTo(Object value) {
            addCriterion("ACT_ERR_DETAIL <=", value, "actErrDetail");
            return (Criteria) this;
        }

        public Criteria andActErrDetailIn(List<Object> values) {
            addCriterion("ACT_ERR_DETAIL in", values, "actErrDetail");
            return (Criteria) this;
        }

        public Criteria andActErrDetailNotIn(List<Object> values) {
            addCriterion("ACT_ERR_DETAIL not in", values, "actErrDetail");
            return (Criteria) this;
        }

        public Criteria andActErrDetailBetween(Object value1, Object value2) {
            addCriterion("ACT_ERR_DETAIL between", value1, value2, "actErrDetail");
            return (Criteria) this;
        }

        public Criteria andActErrDetailNotBetween(Object value1, Object value2) {
            addCriterion("ACT_ERR_DETAIL not between", value1, value2, "actErrDetail");
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