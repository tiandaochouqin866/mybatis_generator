package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TTradeProfitEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTradeProfitEntityExample() {
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

        public Criteria andProfitSerialNoIsNull() {
            addCriterion("PROFIT_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andProfitSerialNoIsNotNull() {
            addCriterion("PROFIT_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProfitSerialNoEqualTo(BigDecimal value) {
            addCriterion("PROFIT_SERIAL_NO =", value, "profitSerialNo");
            return (Criteria) this;
        }

        public Criteria andProfitSerialNoNotEqualTo(BigDecimal value) {
            addCriterion("PROFIT_SERIAL_NO <>", value, "profitSerialNo");
            return (Criteria) this;
        }

        public Criteria andProfitSerialNoGreaterThan(BigDecimal value) {
            addCriterion("PROFIT_SERIAL_NO >", value, "profitSerialNo");
            return (Criteria) this;
        }

        public Criteria andProfitSerialNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROFIT_SERIAL_NO >=", value, "profitSerialNo");
            return (Criteria) this;
        }

        public Criteria andProfitSerialNoLessThan(BigDecimal value) {
            addCriterion("PROFIT_SERIAL_NO <", value, "profitSerialNo");
            return (Criteria) this;
        }

        public Criteria andProfitSerialNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROFIT_SERIAL_NO <=", value, "profitSerialNo");
            return (Criteria) this;
        }

        public Criteria andProfitSerialNoIn(List<BigDecimal> values) {
            addCriterion("PROFIT_SERIAL_NO in", values, "profitSerialNo");
            return (Criteria) this;
        }

        public Criteria andProfitSerialNoNotIn(List<BigDecimal> values) {
            addCriterion("PROFIT_SERIAL_NO not in", values, "profitSerialNo");
            return (Criteria) this;
        }

        public Criteria andProfitSerialNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROFIT_SERIAL_NO between", value1, value2, "profitSerialNo");
            return (Criteria) this;
        }

        public Criteria andProfitSerialNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROFIT_SERIAL_NO not between", value1, value2, "profitSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoIsNull() {
            addCriterion("TRAD_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoIsNotNull() {
            addCriterion("TRAD_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoEqualTo(BigDecimal value) {
            addCriterion("TRAD_SERIAL_NO =", value, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoNotEqualTo(BigDecimal value) {
            addCriterion("TRAD_SERIAL_NO <>", value, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoGreaterThan(BigDecimal value) {
            addCriterion("TRAD_SERIAL_NO >", value, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRAD_SERIAL_NO >=", value, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoLessThan(BigDecimal value) {
            addCriterion("TRAD_SERIAL_NO <", value, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRAD_SERIAL_NO <=", value, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoIn(List<BigDecimal> values) {
            addCriterion("TRAD_SERIAL_NO in", values, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoNotIn(List<BigDecimal> values) {
            addCriterion("TRAD_SERIAL_NO not in", values, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRAD_SERIAL_NO between", value1, value2, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andTradSerialNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRAD_SERIAL_NO not between", value1, value2, "tradSerialNo");
            return (Criteria) this;
        }

        public Criteria andOriginalRelatedSerialIsNull() {
            addCriterion("ORIGINAL_RELATED_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andOriginalRelatedSerialIsNotNull() {
            addCriterion("ORIGINAL_RELATED_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalRelatedSerialEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_RELATED_SERIAL =", value, "originalRelatedSerial");
            return (Criteria) this;
        }

        public Criteria andOriginalRelatedSerialNotEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_RELATED_SERIAL <>", value, "originalRelatedSerial");
            return (Criteria) this;
        }

        public Criteria andOriginalRelatedSerialGreaterThan(BigDecimal value) {
            addCriterion("ORIGINAL_RELATED_SERIAL >", value, "originalRelatedSerial");
            return (Criteria) this;
        }

        public Criteria andOriginalRelatedSerialGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_RELATED_SERIAL >=", value, "originalRelatedSerial");
            return (Criteria) this;
        }

        public Criteria andOriginalRelatedSerialLessThan(BigDecimal value) {
            addCriterion("ORIGINAL_RELATED_SERIAL <", value, "originalRelatedSerial");
            return (Criteria) this;
        }

        public Criteria andOriginalRelatedSerialLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORIGINAL_RELATED_SERIAL <=", value, "originalRelatedSerial");
            return (Criteria) this;
        }

        public Criteria andOriginalRelatedSerialIn(List<BigDecimal> values) {
            addCriterion("ORIGINAL_RELATED_SERIAL in", values, "originalRelatedSerial");
            return (Criteria) this;
        }

        public Criteria andOriginalRelatedSerialNotIn(List<BigDecimal> values) {
            addCriterion("ORIGINAL_RELATED_SERIAL not in", values, "originalRelatedSerial");
            return (Criteria) this;
        }

        public Criteria andOriginalRelatedSerialBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGINAL_RELATED_SERIAL between", value1, value2, "originalRelatedSerial");
            return (Criteria) this;
        }

        public Criteria andOriginalRelatedSerialNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORIGINAL_RELATED_SERIAL not between", value1, value2, "originalRelatedSerial");
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

        public Criteria andOrderAmtIsNull() {
            addCriterion("ORDER_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmtIsNotNull() {
            addCriterion("ORDER_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmtEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMT =", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMT <>", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtGreaterThan(BigDecimal value) {
            addCriterion("ORDER_AMT >", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMT >=", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtLessThan(BigDecimal value) {
            addCriterion("ORDER_AMT <", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMT <=", value, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMT in", values, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMT not in", values, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMT between", value1, value2, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andOrderAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMT not between", value1, value2, "orderAmt");
            return (Criteria) this;
        }

        public Criteria andTradTimeIsNull() {
            addCriterion("TRAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTradTimeIsNotNull() {
            addCriterion("TRAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTradTimeEqualTo(String value) {
            addCriterion("TRAD_TIME =", value, "tradTime");
            return (Criteria) this;
        }

        public Criteria andTradTimeNotEqualTo(String value) {
            addCriterion("TRAD_TIME <>", value, "tradTime");
            return (Criteria) this;
        }

        public Criteria andTradTimeGreaterThan(String value) {
            addCriterion("TRAD_TIME >", value, "tradTime");
            return (Criteria) this;
        }

        public Criteria andTradTimeGreaterThanOrEqualTo(String value) {
            addCriterion("TRAD_TIME >=", value, "tradTime");
            return (Criteria) this;
        }

        public Criteria andTradTimeLessThan(String value) {
            addCriterion("TRAD_TIME <", value, "tradTime");
            return (Criteria) this;
        }

        public Criteria andTradTimeLessThanOrEqualTo(String value) {
            addCriterion("TRAD_TIME <=", value, "tradTime");
            return (Criteria) this;
        }

        public Criteria andTradTimeLike(String value) {
            addCriterion("TRAD_TIME like", value, "tradTime");
            return (Criteria) this;
        }

        public Criteria andTradTimeNotLike(String value) {
            addCriterion("TRAD_TIME not like", value, "tradTime");
            return (Criteria) this;
        }

        public Criteria andTradTimeIn(List<String> values) {
            addCriterion("TRAD_TIME in", values, "tradTime");
            return (Criteria) this;
        }

        public Criteria andTradTimeNotIn(List<String> values) {
            addCriterion("TRAD_TIME not in", values, "tradTime");
            return (Criteria) this;
        }

        public Criteria andTradTimeBetween(String value1, String value2) {
            addCriterion("TRAD_TIME between", value1, value2, "tradTime");
            return (Criteria) this;
        }

        public Criteria andTradTimeNotBetween(String value1, String value2) {
            addCriterion("TRAD_TIME not between", value1, value2, "tradTime");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeIsNull() {
            addCriterion("THIRD_PLAT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeIsNotNull() {
            addCriterion("THIRD_PLAT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeEqualTo(Short value) {
            addCriterion("THIRD_PLAT_CODE =", value, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeNotEqualTo(Short value) {
            addCriterion("THIRD_PLAT_CODE <>", value, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeGreaterThan(Short value) {
            addCriterion("THIRD_PLAT_CODE >", value, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("THIRD_PLAT_CODE >=", value, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeLessThan(Short value) {
            addCriterion("THIRD_PLAT_CODE <", value, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeLessThanOrEqualTo(Short value) {
            addCriterion("THIRD_PLAT_CODE <=", value, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeIn(List<Short> values) {
            addCriterion("THIRD_PLAT_CODE in", values, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeNotIn(List<Short> values) {
            addCriterion("THIRD_PLAT_CODE not in", values, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeBetween(Short value1, Short value2) {
            addCriterion("THIRD_PLAT_CODE between", value1, value2, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andThirdPlatCodeNotBetween(Short value1, Short value2) {
            addCriterion("THIRD_PLAT_CODE not between", value1, value2, "thirdPlatCode");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Short value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Short value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Short value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Short value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Short value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Short> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Short> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Short value1, Short value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Short value1, Short value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPaySceneIsNull() {
            addCriterion("PAY_SCENE is null");
            return (Criteria) this;
        }

        public Criteria andPaySceneIsNotNull() {
            addCriterion("PAY_SCENE is not null");
            return (Criteria) this;
        }

        public Criteria andPaySceneEqualTo(Short value) {
            addCriterion("PAY_SCENE =", value, "payScene");
            return (Criteria) this;
        }

        public Criteria andPaySceneNotEqualTo(Short value) {
            addCriterion("PAY_SCENE <>", value, "payScene");
            return (Criteria) this;
        }

        public Criteria andPaySceneGreaterThan(Short value) {
            addCriterion("PAY_SCENE >", value, "payScene");
            return (Criteria) this;
        }

        public Criteria andPaySceneGreaterThanOrEqualTo(Short value) {
            addCriterion("PAY_SCENE >=", value, "payScene");
            return (Criteria) this;
        }

        public Criteria andPaySceneLessThan(Short value) {
            addCriterion("PAY_SCENE <", value, "payScene");
            return (Criteria) this;
        }

        public Criteria andPaySceneLessThanOrEqualTo(Short value) {
            addCriterion("PAY_SCENE <=", value, "payScene");
            return (Criteria) this;
        }

        public Criteria andPaySceneIn(List<Short> values) {
            addCriterion("PAY_SCENE in", values, "payScene");
            return (Criteria) this;
        }

        public Criteria andPaySceneNotIn(List<Short> values) {
            addCriterion("PAY_SCENE not in", values, "payScene");
            return (Criteria) this;
        }

        public Criteria andPaySceneBetween(Short value1, Short value2) {
            addCriterion("PAY_SCENE between", value1, value2, "payScene");
            return (Criteria) this;
        }

        public Criteria andPaySceneNotBetween(Short value1, Short value2) {
            addCriterion("PAY_SCENE not between", value1, value2, "payScene");
            return (Criteria) this;
        }

        public Criteria andTransCodeIsNull() {
            addCriterion("TRANS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTransCodeIsNotNull() {
            addCriterion("TRANS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransCodeEqualTo(Short value) {
            addCriterion("TRANS_CODE =", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotEqualTo(Short value) {
            addCriterion("TRANS_CODE <>", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeGreaterThan(Short value) {
            addCriterion("TRANS_CODE >", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("TRANS_CODE >=", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeLessThan(Short value) {
            addCriterion("TRANS_CODE <", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeLessThanOrEqualTo(Short value) {
            addCriterion("TRANS_CODE <=", value, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeIn(List<Short> values) {
            addCriterion("TRANS_CODE in", values, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotIn(List<Short> values) {
            addCriterion("TRANS_CODE not in", values, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeBetween(Short value1, Short value2) {
            addCriterion("TRANS_CODE between", value1, value2, "transCode");
            return (Criteria) this;
        }

        public Criteria andTransCodeNotBetween(Short value1, Short value2) {
            addCriterion("TRANS_CODE not between", value1, value2, "transCode");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchIsNull() {
            addCriterion("INCOME_BRANCH is null");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchIsNotNull() {
            addCriterion("INCOME_BRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchEqualTo(Long value) {
            addCriterion("INCOME_BRANCH =", value, "incomeBranch");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchNotEqualTo(Long value) {
            addCriterion("INCOME_BRANCH <>", value, "incomeBranch");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchGreaterThan(Long value) {
            addCriterion("INCOME_BRANCH >", value, "incomeBranch");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchGreaterThanOrEqualTo(Long value) {
            addCriterion("INCOME_BRANCH >=", value, "incomeBranch");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLessThan(Long value) {
            addCriterion("INCOME_BRANCH <", value, "incomeBranch");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLessThanOrEqualTo(Long value) {
            addCriterion("INCOME_BRANCH <=", value, "incomeBranch");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchIn(List<Long> values) {
            addCriterion("INCOME_BRANCH in", values, "incomeBranch");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchNotIn(List<Long> values) {
            addCriterion("INCOME_BRANCH not in", values, "incomeBranch");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchBetween(Long value1, Long value2) {
            addCriterion("INCOME_BRANCH between", value1, value2, "incomeBranch");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchNotBetween(Long value1, Long value2) {
            addCriterion("INCOME_BRANCH not between", value1, value2, "incomeBranch");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLevelIsNull() {
            addCriterion("INCOME_BRANCH_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLevelIsNotNull() {
            addCriterion("INCOME_BRANCH_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLevelEqualTo(Long value) {
            addCriterion("INCOME_BRANCH_LEVEL =", value, "incomeBranchLevel");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLevelNotEqualTo(Long value) {
            addCriterion("INCOME_BRANCH_LEVEL <>", value, "incomeBranchLevel");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLevelGreaterThan(Long value) {
            addCriterion("INCOME_BRANCH_LEVEL >", value, "incomeBranchLevel");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("INCOME_BRANCH_LEVEL >=", value, "incomeBranchLevel");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLevelLessThan(Long value) {
            addCriterion("INCOME_BRANCH_LEVEL <", value, "incomeBranchLevel");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLevelLessThanOrEqualTo(Long value) {
            addCriterion("INCOME_BRANCH_LEVEL <=", value, "incomeBranchLevel");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLevelIn(List<Long> values) {
            addCriterion("INCOME_BRANCH_LEVEL in", values, "incomeBranchLevel");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLevelNotIn(List<Long> values) {
            addCriterion("INCOME_BRANCH_LEVEL not in", values, "incomeBranchLevel");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLevelBetween(Long value1, Long value2) {
            addCriterion("INCOME_BRANCH_LEVEL between", value1, value2, "incomeBranchLevel");
            return (Criteria) this;
        }

        public Criteria andIncomeBranchLevelNotBetween(Long value1, Long value2) {
            addCriterion("INCOME_BRANCH_LEVEL not between", value1, value2, "incomeBranchLevel");
            return (Criteria) this;
        }

        public Criteria andFeeRateCodeIsNull() {
            addCriterion("FEE_RATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFeeRateCodeIsNotNull() {
            addCriterion("FEE_RATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeRateCodeEqualTo(Long value) {
            addCriterion("FEE_RATE_CODE =", value, "feeRateCode");
            return (Criteria) this;
        }

        public Criteria andFeeRateCodeNotEqualTo(Long value) {
            addCriterion("FEE_RATE_CODE <>", value, "feeRateCode");
            return (Criteria) this;
        }

        public Criteria andFeeRateCodeGreaterThan(Long value) {
            addCriterion("FEE_RATE_CODE >", value, "feeRateCode");
            return (Criteria) this;
        }

        public Criteria andFeeRateCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("FEE_RATE_CODE >=", value, "feeRateCode");
            return (Criteria) this;
        }

        public Criteria andFeeRateCodeLessThan(Long value) {
            addCriterion("FEE_RATE_CODE <", value, "feeRateCode");
            return (Criteria) this;
        }

        public Criteria andFeeRateCodeLessThanOrEqualTo(Long value) {
            addCriterion("FEE_RATE_CODE <=", value, "feeRateCode");
            return (Criteria) this;
        }

        public Criteria andFeeRateCodeIn(List<Long> values) {
            addCriterion("FEE_RATE_CODE in", values, "feeRateCode");
            return (Criteria) this;
        }

        public Criteria andFeeRateCodeNotIn(List<Long> values) {
            addCriterion("FEE_RATE_CODE not in", values, "feeRateCode");
            return (Criteria) this;
        }

        public Criteria andFeeRateCodeBetween(Long value1, Long value2) {
            addCriterion("FEE_RATE_CODE between", value1, value2, "feeRateCode");
            return (Criteria) this;
        }

        public Criteria andFeeRateCodeNotBetween(Long value1, Long value2) {
            addCriterion("FEE_RATE_CODE not between", value1, value2, "feeRateCode");
            return (Criteria) this;
        }

        public Criteria andInFeeIsNull() {
            addCriterion("IN_FEE is null");
            return (Criteria) this;
        }

        public Criteria andInFeeIsNotNull() {
            addCriterion("IN_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andInFeeEqualTo(BigDecimal value) {
            addCriterion("IN_FEE =", value, "inFee");
            return (Criteria) this;
        }

        public Criteria andInFeeNotEqualTo(BigDecimal value) {
            addCriterion("IN_FEE <>", value, "inFee");
            return (Criteria) this;
        }

        public Criteria andInFeeGreaterThan(BigDecimal value) {
            addCriterion("IN_FEE >", value, "inFee");
            return (Criteria) this;
        }

        public Criteria andInFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IN_FEE >=", value, "inFee");
            return (Criteria) this;
        }

        public Criteria andInFeeLessThan(BigDecimal value) {
            addCriterion("IN_FEE <", value, "inFee");
            return (Criteria) this;
        }

        public Criteria andInFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IN_FEE <=", value, "inFee");
            return (Criteria) this;
        }

        public Criteria andInFeeIn(List<BigDecimal> values) {
            addCriterion("IN_FEE in", values, "inFee");
            return (Criteria) this;
        }

        public Criteria andInFeeNotIn(List<BigDecimal> values) {
            addCriterion("IN_FEE not in", values, "inFee");
            return (Criteria) this;
        }

        public Criteria andInFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IN_FEE between", value1, value2, "inFee");
            return (Criteria) this;
        }

        public Criteria andInFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IN_FEE not between", value1, value2, "inFee");
            return (Criteria) this;
        }

        public Criteria andOutFeeIsNull() {
            addCriterion("OUT_FEE is null");
            return (Criteria) this;
        }

        public Criteria andOutFeeIsNotNull() {
            addCriterion("OUT_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andOutFeeEqualTo(BigDecimal value) {
            addCriterion("OUT_FEE =", value, "outFee");
            return (Criteria) this;
        }

        public Criteria andOutFeeNotEqualTo(BigDecimal value) {
            addCriterion("OUT_FEE <>", value, "outFee");
            return (Criteria) this;
        }

        public Criteria andOutFeeGreaterThan(BigDecimal value) {
            addCriterion("OUT_FEE >", value, "outFee");
            return (Criteria) this;
        }

        public Criteria andOutFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OUT_FEE >=", value, "outFee");
            return (Criteria) this;
        }

        public Criteria andOutFeeLessThan(BigDecimal value) {
            addCriterion("OUT_FEE <", value, "outFee");
            return (Criteria) this;
        }

        public Criteria andOutFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OUT_FEE <=", value, "outFee");
            return (Criteria) this;
        }

        public Criteria andOutFeeIn(List<BigDecimal> values) {
            addCriterion("OUT_FEE in", values, "outFee");
            return (Criteria) this;
        }

        public Criteria andOutFeeNotIn(List<BigDecimal> values) {
            addCriterion("OUT_FEE not in", values, "outFee");
            return (Criteria) this;
        }

        public Criteria andOutFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUT_FEE between", value1, value2, "outFee");
            return (Criteria) this;
        }

        public Criteria andOutFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUT_FEE not between", value1, value2, "outFee");
            return (Criteria) this;
        }

        public Criteria andClearAmtIsNull() {
            addCriterion("CLEAR_AMT is null");
            return (Criteria) this;
        }

        public Criteria andClearAmtIsNotNull() {
            addCriterion("CLEAR_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andClearAmtEqualTo(BigDecimal value) {
            addCriterion("CLEAR_AMT =", value, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtNotEqualTo(BigDecimal value) {
            addCriterion("CLEAR_AMT <>", value, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtGreaterThan(BigDecimal value) {
            addCriterion("CLEAR_AMT >", value, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLEAR_AMT >=", value, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtLessThan(BigDecimal value) {
            addCriterion("CLEAR_AMT <", value, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLEAR_AMT <=", value, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtIn(List<BigDecimal> values) {
            addCriterion("CLEAR_AMT in", values, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtNotIn(List<BigDecimal> values) {
            addCriterion("CLEAR_AMT not in", values, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLEAR_AMT between", value1, value2, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andClearAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLEAR_AMT not between", value1, value2, "clearAmt");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIsNull() {
            addCriterion("PROFIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIsNotNull() {
            addCriterion("PROFIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeEqualTo(Short value) {
            addCriterion("PROFIT_TYPE =", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotEqualTo(Short value) {
            addCriterion("PROFIT_TYPE <>", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThan(Short value) {
            addCriterion("PROFIT_TYPE >", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("PROFIT_TYPE >=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThan(Short value) {
            addCriterion("PROFIT_TYPE <", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThanOrEqualTo(Short value) {
            addCriterion("PROFIT_TYPE <=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIn(List<Short> values) {
            addCriterion("PROFIT_TYPE in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotIn(List<Short> values) {
            addCriterion("PROFIT_TYPE not in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeBetween(Short value1, Short value2) {
            addCriterion("PROFIT_TYPE between", value1, value2, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotBetween(Short value1, Short value2) {
            addCriterion("PROFIT_TYPE not between", value1, value2, "profitType");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoIsNull() {
            addCriterion("CLEAR_BATCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoIsNotNull() {
            addCriterion("CLEAR_BATCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoEqualTo(BigDecimal value) {
            addCriterion("CLEAR_BATCH_NO =", value, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoNotEqualTo(BigDecimal value) {
            addCriterion("CLEAR_BATCH_NO <>", value, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoGreaterThan(BigDecimal value) {
            addCriterion("CLEAR_BATCH_NO >", value, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLEAR_BATCH_NO >=", value, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoLessThan(BigDecimal value) {
            addCriterion("CLEAR_BATCH_NO <", value, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLEAR_BATCH_NO <=", value, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoIn(List<BigDecimal> values) {
            addCriterion("CLEAR_BATCH_NO in", values, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoNotIn(List<BigDecimal> values) {
            addCriterion("CLEAR_BATCH_NO not in", values, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLEAR_BATCH_NO between", value1, value2, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearBatchNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLEAR_BATCH_NO not between", value1, value2, "clearBatchNo");
            return (Criteria) this;
        }

        public Criteria andClearingRuleIsNull() {
            addCriterion("CLEARING_RULE is null");
            return (Criteria) this;
        }

        public Criteria andClearingRuleIsNotNull() {
            addCriterion("CLEARING_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andClearingRuleEqualTo(String value) {
            addCriterion("CLEARING_RULE =", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleNotEqualTo(String value) {
            addCriterion("CLEARING_RULE <>", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleGreaterThan(String value) {
            addCriterion("CLEARING_RULE >", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleGreaterThanOrEqualTo(String value) {
            addCriterion("CLEARING_RULE >=", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleLessThan(String value) {
            addCriterion("CLEARING_RULE <", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleLessThanOrEqualTo(String value) {
            addCriterion("CLEARING_RULE <=", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleLike(String value) {
            addCriterion("CLEARING_RULE like", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleNotLike(String value) {
            addCriterion("CLEARING_RULE not like", value, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleIn(List<String> values) {
            addCriterion("CLEARING_RULE in", values, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleNotIn(List<String> values) {
            addCriterion("CLEARING_RULE not in", values, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleBetween(String value1, String value2) {
            addCriterion("CLEARING_RULE between", value1, value2, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearingRuleNotBetween(String value1, String value2) {
            addCriterion("CLEARING_RULE not between", value1, value2, "clearingRule");
            return (Criteria) this;
        }

        public Criteria andClearTimeIsNull() {
            addCriterion("CLEAR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andClearTimeIsNotNull() {
            addCriterion("CLEAR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andClearTimeEqualTo(String value) {
            addCriterion("CLEAR_TIME =", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotEqualTo(String value) {
            addCriterion("CLEAR_TIME <>", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeGreaterThan(String value) {
            addCriterion("CLEAR_TIME >", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CLEAR_TIME >=", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLessThan(String value) {
            addCriterion("CLEAR_TIME <", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLessThanOrEqualTo(String value) {
            addCriterion("CLEAR_TIME <=", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLike(String value) {
            addCriterion("CLEAR_TIME like", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotLike(String value) {
            addCriterion("CLEAR_TIME not like", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeIn(List<String> values) {
            addCriterion("CLEAR_TIME in", values, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotIn(List<String> values) {
            addCriterion("CLEAR_TIME not in", values, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeBetween(String value1, String value2) {
            addCriterion("CLEAR_TIME between", value1, value2, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotBetween(String value1, String value2) {
            addCriterion("CLEAR_TIME not between", value1, value2, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearResultIsNull() {
            addCriterion("CLEAR_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andClearResultIsNotNull() {
            addCriterion("CLEAR_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andClearResultEqualTo(Short value) {
            addCriterion("CLEAR_RESULT =", value, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultNotEqualTo(Short value) {
            addCriterion("CLEAR_RESULT <>", value, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultGreaterThan(Short value) {
            addCriterion("CLEAR_RESULT >", value, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultGreaterThanOrEqualTo(Short value) {
            addCriterion("CLEAR_RESULT >=", value, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultLessThan(Short value) {
            addCriterion("CLEAR_RESULT <", value, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultLessThanOrEqualTo(Short value) {
            addCriterion("CLEAR_RESULT <=", value, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultIn(List<Short> values) {
            addCriterion("CLEAR_RESULT in", values, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultNotIn(List<Short> values) {
            addCriterion("CLEAR_RESULT not in", values, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultBetween(Short value1, Short value2) {
            addCriterion("CLEAR_RESULT between", value1, value2, "clearResult");
            return (Criteria) this;
        }

        public Criteria andClearResultNotBetween(Short value1, Short value2) {
            addCriterion("CLEAR_RESULT not between", value1, value2, "clearResult");
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

        public Criteria andCashAmtIsNull() {
            addCriterion("CASH_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCashAmtIsNotNull() {
            addCriterion("CASH_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCashAmtEqualTo(BigDecimal value) {
            addCriterion("CASH_AMT =", value, "cashAmt");
            return (Criteria) this;
        }

        public Criteria andCashAmtNotEqualTo(BigDecimal value) {
            addCriterion("CASH_AMT <>", value, "cashAmt");
            return (Criteria) this;
        }

        public Criteria andCashAmtGreaterThan(BigDecimal value) {
            addCriterion("CASH_AMT >", value, "cashAmt");
            return (Criteria) this;
        }

        public Criteria andCashAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_AMT >=", value, "cashAmt");
            return (Criteria) this;
        }

        public Criteria andCashAmtLessThan(BigDecimal value) {
            addCriterion("CASH_AMT <", value, "cashAmt");
            return (Criteria) this;
        }

        public Criteria andCashAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASH_AMT <=", value, "cashAmt");
            return (Criteria) this;
        }

        public Criteria andCashAmtIn(List<BigDecimal> values) {
            addCriterion("CASH_AMT in", values, "cashAmt");
            return (Criteria) this;
        }

        public Criteria andCashAmtNotIn(List<BigDecimal> values) {
            addCriterion("CASH_AMT not in", values, "cashAmt");
            return (Criteria) this;
        }

        public Criteria andCashAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_AMT between", value1, value2, "cashAmt");
            return (Criteria) this;
        }

        public Criteria andCashAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASH_AMT not between", value1, value2, "cashAmt");
            return (Criteria) this;
        }

        public Criteria andVoucherAmtIsNull() {
            addCriterion("VOUCHER_AMT is null");
            return (Criteria) this;
        }

        public Criteria andVoucherAmtIsNotNull() {
            addCriterion("VOUCHER_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherAmtEqualTo(BigDecimal value) {
            addCriterion("VOUCHER_AMT =", value, "voucherAmt");
            return (Criteria) this;
        }

        public Criteria andVoucherAmtNotEqualTo(BigDecimal value) {
            addCriterion("VOUCHER_AMT <>", value, "voucherAmt");
            return (Criteria) this;
        }

        public Criteria andVoucherAmtGreaterThan(BigDecimal value) {
            addCriterion("VOUCHER_AMT >", value, "voucherAmt");
            return (Criteria) this;
        }

        public Criteria andVoucherAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOUCHER_AMT >=", value, "voucherAmt");
            return (Criteria) this;
        }

        public Criteria andVoucherAmtLessThan(BigDecimal value) {
            addCriterion("VOUCHER_AMT <", value, "voucherAmt");
            return (Criteria) this;
        }

        public Criteria andVoucherAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOUCHER_AMT <=", value, "voucherAmt");
            return (Criteria) this;
        }

        public Criteria andVoucherAmtIn(List<BigDecimal> values) {
            addCriterion("VOUCHER_AMT in", values, "voucherAmt");
            return (Criteria) this;
        }

        public Criteria andVoucherAmtNotIn(List<BigDecimal> values) {
            addCriterion("VOUCHER_AMT not in", values, "voucherAmt");
            return (Criteria) this;
        }

        public Criteria andVoucherAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOUCHER_AMT between", value1, value2, "voucherAmt");
            return (Criteria) this;
        }

        public Criteria andVoucherAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOUCHER_AMT not between", value1, value2, "voucherAmt");
            return (Criteria) this;
        }

        public Criteria andClearBaseAmtIsNull() {
            addCriterion("CLEAR_BASE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andClearBaseAmtIsNotNull() {
            addCriterion("CLEAR_BASE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andClearBaseAmtEqualTo(BigDecimal value) {
            addCriterion("CLEAR_BASE_AMT =", value, "clearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andClearBaseAmtNotEqualTo(BigDecimal value) {
            addCriterion("CLEAR_BASE_AMT <>", value, "clearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andClearBaseAmtGreaterThan(BigDecimal value) {
            addCriterion("CLEAR_BASE_AMT >", value, "clearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andClearBaseAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLEAR_BASE_AMT >=", value, "clearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andClearBaseAmtLessThan(BigDecimal value) {
            addCriterion("CLEAR_BASE_AMT <", value, "clearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andClearBaseAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLEAR_BASE_AMT <=", value, "clearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andClearBaseAmtIn(List<BigDecimal> values) {
            addCriterion("CLEAR_BASE_AMT in", values, "clearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andClearBaseAmtNotIn(List<BigDecimal> values) {
            addCriterion("CLEAR_BASE_AMT not in", values, "clearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andClearBaseAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLEAR_BASE_AMT between", value1, value2, "clearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andClearBaseAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLEAR_BASE_AMT not between", value1, value2, "clearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeIsNull() {
            addCriterion("BANK_CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeIsNotNull() {
            addCriterion("BANK_CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeEqualTo(String value) {
            addCriterion("BANK_CARD_TYPE =", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotEqualTo(String value) {
            addCriterion("BANK_CARD_TYPE <>", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeGreaterThan(String value) {
            addCriterion("BANK_CARD_TYPE >", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_TYPE >=", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLessThan(String value) {
            addCriterion("BANK_CARD_TYPE <", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLessThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_TYPE <=", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLike(String value) {
            addCriterion("BANK_CARD_TYPE like", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotLike(String value) {
            addCriterion("BANK_CARD_TYPE not like", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeIn(List<String> values) {
            addCriterion("BANK_CARD_TYPE in", values, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotIn(List<String> values) {
            addCriterion("BANK_CARD_TYPE not in", values, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeBetween(String value1, String value2) {
            addCriterion("BANK_CARD_TYPE between", value1, value2, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotBetween(String value1, String value2) {
            addCriterion("BANK_CARD_TYPE not between", value1, value2, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andChannelNoIsNull() {
            addCriterion("CHANNEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andChannelNoIsNotNull() {
            addCriterion("CHANNEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNoEqualTo(Long value) {
            addCriterion("CHANNEL_NO =", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotEqualTo(Long value) {
            addCriterion("CHANNEL_NO <>", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoGreaterThan(Long value) {
            addCriterion("CHANNEL_NO >", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoGreaterThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_NO >=", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLessThan(Long value) {
            addCriterion("CHANNEL_NO <", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoLessThanOrEqualTo(Long value) {
            addCriterion("CHANNEL_NO <=", value, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoIn(List<Long> values) {
            addCriterion("CHANNEL_NO in", values, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotIn(List<Long> values) {
            addCriterion("CHANNEL_NO not in", values, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_NO between", value1, value2, "channelNo");
            return (Criteria) this;
        }

        public Criteria andChannelNoNotBetween(Long value1, Long value2) {
            addCriterion("CHANNEL_NO not between", value1, value2, "channelNo");
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