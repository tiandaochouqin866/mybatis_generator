package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TFundSerialPreEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFundSerialPreEntityExample() {
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

        public Criteria andGoodsDescIsNull() {
            addCriterion("GOODS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIsNotNull() {
            addCriterion("GOODS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescEqualTo(String value) {
            addCriterion("GOODS_DESC =", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotEqualTo(String value) {
            addCriterion("GOODS_DESC <>", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThan(String value) {
            addCriterion("GOODS_DESC >", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_DESC >=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThan(String value) {
            addCriterion("GOODS_DESC <", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThanOrEqualTo(String value) {
            addCriterion("GOODS_DESC <=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIn(List<String> values) {
            addCriterion("GOODS_DESC in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotIn(List<String> values) {
            addCriterion("GOODS_DESC not in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescBetween(String value1, String value2) {
            addCriterion("GOODS_DESC between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotBetween(String value1, String value2) {
            addCriterion("GOODS_DESC not between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIsNull() {
            addCriterion("CURRENCY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIsNotNull() {
            addCriterion("CURRENCY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeEqualTo(String value) {
            addCriterion("CURRENCY_CODE =", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotEqualTo(String value) {
            addCriterion("CURRENCY_CODE <>", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThan(String value) {
            addCriterion("CURRENCY_CODE >", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY_CODE >=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThan(String value) {
            addCriterion("CURRENCY_CODE <", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY_CODE <=", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeLike(String value) {
            addCriterion("CURRENCY_CODE like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotLike(String value) {
            addCriterion("CURRENCY_CODE not like", value, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeIn(List<String> values) {
            addCriterion("CURRENCY_CODE in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotIn(List<String> values) {
            addCriterion("CURRENCY_CODE not in", values, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeBetween(String value1, String value2) {
            addCriterion("CURRENCY_CODE between", value1, value2, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andCurrencyCodeNotBetween(String value1, String value2) {
            addCriterion("CURRENCY_CODE not between", value1, value2, "currencyCode");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNull() {
            addCriterion("EXCHANGE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIsNotNull() {
            addCriterion("EXCHANGE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeRateEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_RATE =", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_RATE <>", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGE_RATE >", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_RATE >=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThan(BigDecimal value) {
            addCriterion("EXCHANGE_RATE <", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_RATE <=", value, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateIn(List<BigDecimal> values) {
            addCriterion("EXCHANGE_RATE in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGE_RATE not in", values, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGE_RATE between", value1, value2, "exchangeRate");
            return (Criteria) this;
        }

        public Criteria andExchangeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGE_RATE not between", value1, value2, "exchangeRate");
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

        public Criteria andReqSerialNoIsNull() {
            addCriterion("REQ_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoIsNotNull() {
            addCriterion("REQ_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoEqualTo(String value) {
            addCriterion("REQ_SERIAL_NO =", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoNotEqualTo(String value) {
            addCriterion("REQ_SERIAL_NO <>", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoGreaterThan(String value) {
            addCriterion("REQ_SERIAL_NO >", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_SERIAL_NO >=", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoLessThan(String value) {
            addCriterion("REQ_SERIAL_NO <", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoLessThanOrEqualTo(String value) {
            addCriterion("REQ_SERIAL_NO <=", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoLike(String value) {
            addCriterion("REQ_SERIAL_NO like", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoNotLike(String value) {
            addCriterion("REQ_SERIAL_NO not like", value, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoIn(List<String> values) {
            addCriterion("REQ_SERIAL_NO in", values, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoNotIn(List<String> values) {
            addCriterion("REQ_SERIAL_NO not in", values, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoBetween(String value1, String value2) {
            addCriterion("REQ_SERIAL_NO between", value1, value2, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqSerialNoNotBetween(String value1, String value2) {
            addCriterion("REQ_SERIAL_NO not between", value1, value2, "reqSerialNo");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNull() {
            addCriterion("REQ_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNotNull() {
            addCriterion("REQ_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReqTimeEqualTo(String value) {
            addCriterion("REQ_TIME =", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotEqualTo(String value) {
            addCriterion("REQ_TIME <>", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThan(String value) {
            addCriterion("REQ_TIME >", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_TIME >=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThan(String value) {
            addCriterion("REQ_TIME <", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThanOrEqualTo(String value) {
            addCriterion("REQ_TIME <=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLike(String value) {
            addCriterion("REQ_TIME like", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotLike(String value) {
            addCriterion("REQ_TIME not like", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeIn(List<String> values) {
            addCriterion("REQ_TIME in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotIn(List<String> values) {
            addCriterion("REQ_TIME not in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeBetween(String value1, String value2) {
            addCriterion("REQ_TIME between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotBetween(String value1, String value2) {
            addCriterion("REQ_TIME not between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoIsNull() {
            addCriterion("CHANNEL_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoIsNotNull() {
            addCriterion("CHANNEL_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoEqualTo(String value) {
            addCriterion("CHANNEL_SERIAL_NO =", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoNotEqualTo(String value) {
            addCriterion("CHANNEL_SERIAL_NO <>", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoGreaterThan(String value) {
            addCriterion("CHANNEL_SERIAL_NO >", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_SERIAL_NO >=", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoLessThan(String value) {
            addCriterion("CHANNEL_SERIAL_NO <", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_SERIAL_NO <=", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoLike(String value) {
            addCriterion("CHANNEL_SERIAL_NO like", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoNotLike(String value) {
            addCriterion("CHANNEL_SERIAL_NO not like", value, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoIn(List<String> values) {
            addCriterion("CHANNEL_SERIAL_NO in", values, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoNotIn(List<String> values) {
            addCriterion("CHANNEL_SERIAL_NO not in", values, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoBetween(String value1, String value2) {
            addCriterion("CHANNEL_SERIAL_NO between", value1, value2, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelSerialNoNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_SERIAL_NO not between", value1, value2, "channelSerialNo");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeIsNull() {
            addCriterion("CHANNEL_RESP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeIsNotNull() {
            addCriterion("CHANNEL_RESP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeEqualTo(String value) {
            addCriterion("CHANNEL_RESP_TIME =", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeNotEqualTo(String value) {
            addCriterion("CHANNEL_RESP_TIME <>", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeGreaterThan(String value) {
            addCriterion("CHANNEL_RESP_TIME >", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RESP_TIME >=", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeLessThan(String value) {
            addCriterion("CHANNEL_RESP_TIME <", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_RESP_TIME <=", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeLike(String value) {
            addCriterion("CHANNEL_RESP_TIME like", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeNotLike(String value) {
            addCriterion("CHANNEL_RESP_TIME not like", value, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeIn(List<String> values) {
            addCriterion("CHANNEL_RESP_TIME in", values, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeNotIn(List<String> values) {
            addCriterion("CHANNEL_RESP_TIME not in", values, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeBetween(String value1, String value2) {
            addCriterion("CHANNEL_RESP_TIME between", value1, value2, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andChannelRespTimeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_RESP_TIME not between", value1, value2, "channelRespTime");
            return (Criteria) this;
        }

        public Criteria andRespCodeIsNull() {
            addCriterion("RESP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRespCodeIsNotNull() {
            addCriterion("RESP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRespCodeEqualTo(String value) {
            addCriterion("RESP_CODE =", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotEqualTo(String value) {
            addCriterion("RESP_CODE <>", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeGreaterThan(String value) {
            addCriterion("RESP_CODE >", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESP_CODE >=", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeLessThan(String value) {
            addCriterion("RESP_CODE <", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeLessThanOrEqualTo(String value) {
            addCriterion("RESP_CODE <=", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeLike(String value) {
            addCriterion("RESP_CODE like", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotLike(String value) {
            addCriterion("RESP_CODE not like", value, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeIn(List<String> values) {
            addCriterion("RESP_CODE in", values, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotIn(List<String> values) {
            addCriterion("RESP_CODE not in", values, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeBetween(String value1, String value2) {
            addCriterion("RESP_CODE between", value1, value2, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespCodeNotBetween(String value1, String value2) {
            addCriterion("RESP_CODE not between", value1, value2, "respCode");
            return (Criteria) this;
        }

        public Criteria andRespMsgIsNull() {
            addCriterion("RESP_MSG is null");
            return (Criteria) this;
        }

        public Criteria andRespMsgIsNotNull() {
            addCriterion("RESP_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andRespMsgEqualTo(String value) {
            addCriterion("RESP_MSG =", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgNotEqualTo(String value) {
            addCriterion("RESP_MSG <>", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgGreaterThan(String value) {
            addCriterion("RESP_MSG >", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgGreaterThanOrEqualTo(String value) {
            addCriterion("RESP_MSG >=", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgLessThan(String value) {
            addCriterion("RESP_MSG <", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgLessThanOrEqualTo(String value) {
            addCriterion("RESP_MSG <=", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgLike(String value) {
            addCriterion("RESP_MSG like", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgNotLike(String value) {
            addCriterion("RESP_MSG not like", value, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgIn(List<String> values) {
            addCriterion("RESP_MSG in", values, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgNotIn(List<String> values) {
            addCriterion("RESP_MSG not in", values, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgBetween(String value1, String value2) {
            addCriterion("RESP_MSG between", value1, value2, "respMsg");
            return (Criteria) this;
        }

        public Criteria andRespMsgNotBetween(String value1, String value2) {
            addCriterion("RESP_MSG not between", value1, value2, "respMsg");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("PAY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("PAY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Short value) {
            addCriterion("PAY_STATUS =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Short value) {
            addCriterion("PAY_STATUS <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Short value) {
            addCriterion("PAY_STATUS >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("PAY_STATUS >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Short value) {
            addCriterion("PAY_STATUS <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Short value) {
            addCriterion("PAY_STATUS <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Short> values) {
            addCriterion("PAY_STATUS in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Short> values) {
            addCriterion("PAY_STATUS not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Short value1, Short value2) {
            addCriterion("PAY_STATUS between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Short value1, Short value2) {
            addCriterion("PAY_STATUS not between", value1, value2, "payStatus");
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

        public Criteria andOriginalPayStatusIsNull() {
            addCriterion("ORIGINAL_PAY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPayStatusIsNotNull() {
            addCriterion("ORIGINAL_PAY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPayStatusEqualTo(Short value) {
            addCriterion("ORIGINAL_PAY_STATUS =", value, "originalPayStatus");
            return (Criteria) this;
        }

        public Criteria andOriginalPayStatusNotEqualTo(Short value) {
            addCriterion("ORIGINAL_PAY_STATUS <>", value, "originalPayStatus");
            return (Criteria) this;
        }

        public Criteria andOriginalPayStatusGreaterThan(Short value) {
            addCriterion("ORIGINAL_PAY_STATUS >", value, "originalPayStatus");
            return (Criteria) this;
        }

        public Criteria andOriginalPayStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("ORIGINAL_PAY_STATUS >=", value, "originalPayStatus");
            return (Criteria) this;
        }

        public Criteria andOriginalPayStatusLessThan(Short value) {
            addCriterion("ORIGINAL_PAY_STATUS <", value, "originalPayStatus");
            return (Criteria) this;
        }

        public Criteria andOriginalPayStatusLessThanOrEqualTo(Short value) {
            addCriterion("ORIGINAL_PAY_STATUS <=", value, "originalPayStatus");
            return (Criteria) this;
        }

        public Criteria andOriginalPayStatusIn(List<Short> values) {
            addCriterion("ORIGINAL_PAY_STATUS in", values, "originalPayStatus");
            return (Criteria) this;
        }

        public Criteria andOriginalPayStatusNotIn(List<Short> values) {
            addCriterion("ORIGINAL_PAY_STATUS not in", values, "originalPayStatus");
            return (Criteria) this;
        }

        public Criteria andOriginalPayStatusBetween(Short value1, Short value2) {
            addCriterion("ORIGINAL_PAY_STATUS between", value1, value2, "originalPayStatus");
            return (Criteria) this;
        }

        public Criteria andOriginalPayStatusNotBetween(Short value1, Short value2) {
            addCriterion("ORIGINAL_PAY_STATUS not between", value1, value2, "originalPayStatus");
            return (Criteria) this;
        }

        public Criteria andCancelFlagIsNull() {
            addCriterion("CANCEL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCancelFlagIsNotNull() {
            addCriterion("CANCEL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCancelFlagEqualTo(Short value) {
            addCriterion("CANCEL_FLAG =", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagNotEqualTo(Short value) {
            addCriterion("CANCEL_FLAG <>", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagGreaterThan(Short value) {
            addCriterion("CANCEL_FLAG >", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("CANCEL_FLAG >=", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagLessThan(Short value) {
            addCriterion("CANCEL_FLAG <", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagLessThanOrEqualTo(Short value) {
            addCriterion("CANCEL_FLAG <=", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagIn(List<Short> values) {
            addCriterion("CANCEL_FLAG in", values, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagNotIn(List<Short> values) {
            addCriterion("CANCEL_FLAG not in", values, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagBetween(Short value1, Short value2) {
            addCriterion("CANCEL_FLAG between", value1, value2, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagNotBetween(Short value1, Short value2) {
            addCriterion("CANCEL_FLAG not between", value1, value2, "cancelFlag");
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

        public Criteria andSettleKeyIsNull() {
            addCriterion("SETTLE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andSettleKeyIsNotNull() {
            addCriterion("SETTLE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andSettleKeyEqualTo(String value) {
            addCriterion("SETTLE_KEY =", value, "settleKey");
            return (Criteria) this;
        }

        public Criteria andSettleKeyNotEqualTo(String value) {
            addCriterion("SETTLE_KEY <>", value, "settleKey");
            return (Criteria) this;
        }

        public Criteria andSettleKeyGreaterThan(String value) {
            addCriterion("SETTLE_KEY >", value, "settleKey");
            return (Criteria) this;
        }

        public Criteria andSettleKeyGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_KEY >=", value, "settleKey");
            return (Criteria) this;
        }

        public Criteria andSettleKeyLessThan(String value) {
            addCriterion("SETTLE_KEY <", value, "settleKey");
            return (Criteria) this;
        }

        public Criteria andSettleKeyLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_KEY <=", value, "settleKey");
            return (Criteria) this;
        }

        public Criteria andSettleKeyLike(String value) {
            addCriterion("SETTLE_KEY like", value, "settleKey");
            return (Criteria) this;
        }

        public Criteria andSettleKeyNotLike(String value) {
            addCriterion("SETTLE_KEY not like", value, "settleKey");
            return (Criteria) this;
        }

        public Criteria andSettleKeyIn(List<String> values) {
            addCriterion("SETTLE_KEY in", values, "settleKey");
            return (Criteria) this;
        }

        public Criteria andSettleKeyNotIn(List<String> values) {
            addCriterion("SETTLE_KEY not in", values, "settleKey");
            return (Criteria) this;
        }

        public Criteria andSettleKeyBetween(String value1, String value2) {
            addCriterion("SETTLE_KEY between", value1, value2, "settleKey");
            return (Criteria) this;
        }

        public Criteria andSettleKeyNotBetween(String value1, String value2) {
            addCriterion("SETTLE_KEY not between", value1, value2, "settleKey");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIsNull() {
            addCriterion("GOODS_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIsNotNull() {
            addCriterion("GOODS_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailEqualTo(String value) {
            addCriterion("GOODS_DETAIL =", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotEqualTo(String value) {
            addCriterion("GOODS_DETAIL <>", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailGreaterThan(String value) {
            addCriterion("GOODS_DETAIL >", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_DETAIL >=", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailLessThan(String value) {
            addCriterion("GOODS_DETAIL <", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailLessThanOrEqualTo(String value) {
            addCriterion("GOODS_DETAIL <=", value, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailIn(List<String> values) {
            addCriterion("GOODS_DETAIL in", values, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotIn(List<String> values) {
            addCriterion("GOODS_DETAIL not in", values, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailBetween(String value1, String value2) {
            addCriterion("GOODS_DETAIL between", value1, value2, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailNotBetween(String value1, String value2) {
            addCriterion("GOODS_DETAIL not between", value1, value2, "goodsDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlIsNull() {
            addCriterion("RECEIVE_URL is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlIsNotNull() {
            addCriterion("RECEIVE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlEqualTo(String value) {
            addCriterion("RECEIVE_URL =", value, "receiveUrl");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlNotEqualTo(String value) {
            addCriterion("RECEIVE_URL <>", value, "receiveUrl");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlGreaterThan(String value) {
            addCriterion("RECEIVE_URL >", value, "receiveUrl");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_URL >=", value, "receiveUrl");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlLessThan(String value) {
            addCriterion("RECEIVE_URL <", value, "receiveUrl");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_URL <=", value, "receiveUrl");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlLike(String value) {
            addCriterion("RECEIVE_URL like", value, "receiveUrl");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlNotLike(String value) {
            addCriterion("RECEIVE_URL not like", value, "receiveUrl");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlIn(List<String> values) {
            addCriterion("RECEIVE_URL in", values, "receiveUrl");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlNotIn(List<String> values) {
            addCriterion("RECEIVE_URL not in", values, "receiveUrl");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlBetween(String value1, String value2) {
            addCriterion("RECEIVE_URL between", value1, value2, "receiveUrl");
            return (Criteria) this;
        }

        public Criteria andReceiveUrlNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_URL not between", value1, value2, "receiveUrl");
            return (Criteria) this;
        }

        public Criteria andPickupUrlIsNull() {
            addCriterion("PICKUP_URL is null");
            return (Criteria) this;
        }

        public Criteria andPickupUrlIsNotNull() {
            addCriterion("PICKUP_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPickupUrlEqualTo(String value) {
            addCriterion("PICKUP_URL =", value, "pickupUrl");
            return (Criteria) this;
        }

        public Criteria andPickupUrlNotEqualTo(String value) {
            addCriterion("PICKUP_URL <>", value, "pickupUrl");
            return (Criteria) this;
        }

        public Criteria andPickupUrlGreaterThan(String value) {
            addCriterion("PICKUP_URL >", value, "pickupUrl");
            return (Criteria) this;
        }

        public Criteria andPickupUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PICKUP_URL >=", value, "pickupUrl");
            return (Criteria) this;
        }

        public Criteria andPickupUrlLessThan(String value) {
            addCriterion("PICKUP_URL <", value, "pickupUrl");
            return (Criteria) this;
        }

        public Criteria andPickupUrlLessThanOrEqualTo(String value) {
            addCriterion("PICKUP_URL <=", value, "pickupUrl");
            return (Criteria) this;
        }

        public Criteria andPickupUrlLike(String value) {
            addCriterion("PICKUP_URL like", value, "pickupUrl");
            return (Criteria) this;
        }

        public Criteria andPickupUrlNotLike(String value) {
            addCriterion("PICKUP_URL not like", value, "pickupUrl");
            return (Criteria) this;
        }

        public Criteria andPickupUrlIn(List<String> values) {
            addCriterion("PICKUP_URL in", values, "pickupUrl");
            return (Criteria) this;
        }

        public Criteria andPickupUrlNotIn(List<String> values) {
            addCriterion("PICKUP_URL not in", values, "pickupUrl");
            return (Criteria) this;
        }

        public Criteria andPickupUrlBetween(String value1, String value2) {
            addCriterion("PICKUP_URL between", value1, value2, "pickupUrl");
            return (Criteria) this;
        }

        public Criteria andPickupUrlNotBetween(String value1, String value2) {
            addCriterion("PICKUP_URL not between", value1, value2, "pickupUrl");
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