package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TCheckRecordExceptionHisEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCheckRecordExceptionHisEntityExample() {
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

        public Criteria andExceptionSerialNoIsNull() {
            addCriterion("EXCEPTION_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andExceptionSerialNoIsNotNull() {
            addCriterion("EXCEPTION_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionSerialNoEqualTo(BigDecimal value) {
            addCriterion("EXCEPTION_SERIAL_NO =", value, "exceptionSerialNo");
            return (Criteria) this;
        }

        public Criteria andExceptionSerialNoNotEqualTo(BigDecimal value) {
            addCriterion("EXCEPTION_SERIAL_NO <>", value, "exceptionSerialNo");
            return (Criteria) this;
        }

        public Criteria andExceptionSerialNoGreaterThan(BigDecimal value) {
            addCriterion("EXCEPTION_SERIAL_NO >", value, "exceptionSerialNo");
            return (Criteria) this;
        }

        public Criteria andExceptionSerialNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCEPTION_SERIAL_NO >=", value, "exceptionSerialNo");
            return (Criteria) this;
        }

        public Criteria andExceptionSerialNoLessThan(BigDecimal value) {
            addCriterion("EXCEPTION_SERIAL_NO <", value, "exceptionSerialNo");
            return (Criteria) this;
        }

        public Criteria andExceptionSerialNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCEPTION_SERIAL_NO <=", value, "exceptionSerialNo");
            return (Criteria) this;
        }

        public Criteria andExceptionSerialNoIn(List<BigDecimal> values) {
            addCriterion("EXCEPTION_SERIAL_NO in", values, "exceptionSerialNo");
            return (Criteria) this;
        }

        public Criteria andExceptionSerialNoNotIn(List<BigDecimal> values) {
            addCriterion("EXCEPTION_SERIAL_NO not in", values, "exceptionSerialNo");
            return (Criteria) this;
        }

        public Criteria andExceptionSerialNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCEPTION_SERIAL_NO between", value1, value2, "exceptionSerialNo");
            return (Criteria) this;
        }

        public Criteria andExceptionSerialNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCEPTION_SERIAL_NO not between", value1, value2, "exceptionSerialNo");
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

        public Criteria andThirdPlatFeeIsNull() {
            addCriterion("THIRD_PLAT_FEE is null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatFeeIsNotNull() {
            addCriterion("THIRD_PLAT_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatFeeEqualTo(BigDecimal value) {
            addCriterion("THIRD_PLAT_FEE =", value, "thirdPlatFee");
            return (Criteria) this;
        }

        public Criteria andThirdPlatFeeNotEqualTo(BigDecimal value) {
            addCriterion("THIRD_PLAT_FEE <>", value, "thirdPlatFee");
            return (Criteria) this;
        }

        public Criteria andThirdPlatFeeGreaterThan(BigDecimal value) {
            addCriterion("THIRD_PLAT_FEE >", value, "thirdPlatFee");
            return (Criteria) this;
        }

        public Criteria andThirdPlatFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THIRD_PLAT_FEE >=", value, "thirdPlatFee");
            return (Criteria) this;
        }

        public Criteria andThirdPlatFeeLessThan(BigDecimal value) {
            addCriterion("THIRD_PLAT_FEE <", value, "thirdPlatFee");
            return (Criteria) this;
        }

        public Criteria andThirdPlatFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THIRD_PLAT_FEE <=", value, "thirdPlatFee");
            return (Criteria) this;
        }

        public Criteria andThirdPlatFeeIn(List<BigDecimal> values) {
            addCriterion("THIRD_PLAT_FEE in", values, "thirdPlatFee");
            return (Criteria) this;
        }

        public Criteria andThirdPlatFeeNotIn(List<BigDecimal> values) {
            addCriterion("THIRD_PLAT_FEE not in", values, "thirdPlatFee");
            return (Criteria) this;
        }

        public Criteria andThirdPlatFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THIRD_PLAT_FEE between", value1, value2, "thirdPlatFee");
            return (Criteria) this;
        }

        public Criteria andThirdPlatFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THIRD_PLAT_FEE not between", value1, value2, "thirdPlatFee");
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

        public Criteria andChannelOrderAmtIsNull() {
            addCriterion("CHANNEL_ORDER_AMT is null");
            return (Criteria) this;
        }

        public Criteria andChannelOrderAmtIsNotNull() {
            addCriterion("CHANNEL_ORDER_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andChannelOrderAmtEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_ORDER_AMT =", value, "channelOrderAmt");
            return (Criteria) this;
        }

        public Criteria andChannelOrderAmtNotEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_ORDER_AMT <>", value, "channelOrderAmt");
            return (Criteria) this;
        }

        public Criteria andChannelOrderAmtGreaterThan(BigDecimal value) {
            addCriterion("CHANNEL_ORDER_AMT >", value, "channelOrderAmt");
            return (Criteria) this;
        }

        public Criteria andChannelOrderAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_ORDER_AMT >=", value, "channelOrderAmt");
            return (Criteria) this;
        }

        public Criteria andChannelOrderAmtLessThan(BigDecimal value) {
            addCriterion("CHANNEL_ORDER_AMT <", value, "channelOrderAmt");
            return (Criteria) this;
        }

        public Criteria andChannelOrderAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_ORDER_AMT <=", value, "channelOrderAmt");
            return (Criteria) this;
        }

        public Criteria andChannelOrderAmtIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_ORDER_AMT in", values, "channelOrderAmt");
            return (Criteria) this;
        }

        public Criteria andChannelOrderAmtNotIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_ORDER_AMT not in", values, "channelOrderAmt");
            return (Criteria) this;
        }

        public Criteria andChannelOrderAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_ORDER_AMT between", value1, value2, "channelOrderAmt");
            return (Criteria) this;
        }

        public Criteria andChannelOrderAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_ORDER_AMT not between", value1, value2, "channelOrderAmt");
            return (Criteria) this;
        }

        public Criteria andChannelVoucherAmtIsNull() {
            addCriterion("CHANNEL_VOUCHER_AMT is null");
            return (Criteria) this;
        }

        public Criteria andChannelVoucherAmtIsNotNull() {
            addCriterion("CHANNEL_VOUCHER_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andChannelVoucherAmtEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_VOUCHER_AMT =", value, "channelVoucherAmt");
            return (Criteria) this;
        }

        public Criteria andChannelVoucherAmtNotEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_VOUCHER_AMT <>", value, "channelVoucherAmt");
            return (Criteria) this;
        }

        public Criteria andChannelVoucherAmtGreaterThan(BigDecimal value) {
            addCriterion("CHANNEL_VOUCHER_AMT >", value, "channelVoucherAmt");
            return (Criteria) this;
        }

        public Criteria andChannelVoucherAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_VOUCHER_AMT >=", value, "channelVoucherAmt");
            return (Criteria) this;
        }

        public Criteria andChannelVoucherAmtLessThan(BigDecimal value) {
            addCriterion("CHANNEL_VOUCHER_AMT <", value, "channelVoucherAmt");
            return (Criteria) this;
        }

        public Criteria andChannelVoucherAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_VOUCHER_AMT <=", value, "channelVoucherAmt");
            return (Criteria) this;
        }

        public Criteria andChannelVoucherAmtIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_VOUCHER_AMT in", values, "channelVoucherAmt");
            return (Criteria) this;
        }

        public Criteria andChannelVoucherAmtNotIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_VOUCHER_AMT not in", values, "channelVoucherAmt");
            return (Criteria) this;
        }

        public Criteria andChannelVoucherAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_VOUCHER_AMT between", value1, value2, "channelVoucherAmt");
            return (Criteria) this;
        }

        public Criteria andChannelVoucherAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_VOUCHER_AMT not between", value1, value2, "channelVoucherAmt");
            return (Criteria) this;
        }

        public Criteria andChannelClearBaseAmtIsNull() {
            addCriterion("CHANNEL_CLEAR_BASE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andChannelClearBaseAmtIsNotNull() {
            addCriterion("CHANNEL_CLEAR_BASE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andChannelClearBaseAmtEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_CLEAR_BASE_AMT =", value, "channelClearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andChannelClearBaseAmtNotEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_CLEAR_BASE_AMT <>", value, "channelClearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andChannelClearBaseAmtGreaterThan(BigDecimal value) {
            addCriterion("CHANNEL_CLEAR_BASE_AMT >", value, "channelClearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andChannelClearBaseAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_CLEAR_BASE_AMT >=", value, "channelClearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andChannelClearBaseAmtLessThan(BigDecimal value) {
            addCriterion("CHANNEL_CLEAR_BASE_AMT <", value, "channelClearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andChannelClearBaseAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_CLEAR_BASE_AMT <=", value, "channelClearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andChannelClearBaseAmtIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_CLEAR_BASE_AMT in", values, "channelClearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andChannelClearBaseAmtNotIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_CLEAR_BASE_AMT not in", values, "channelClearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andChannelClearBaseAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_CLEAR_BASE_AMT between", value1, value2, "channelClearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andChannelClearBaseAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_CLEAR_BASE_AMT not between", value1, value2, "channelClearBaseAmt");
            return (Criteria) this;
        }

        public Criteria andChannelTransCodeIsNull() {
            addCriterion("CHANNEL_TRANS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andChannelTransCodeIsNotNull() {
            addCriterion("CHANNEL_TRANS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTransCodeEqualTo(Short value) {
            addCriterion("CHANNEL_TRANS_CODE =", value, "channelTransCode");
            return (Criteria) this;
        }

        public Criteria andChannelTransCodeNotEqualTo(Short value) {
            addCriterion("CHANNEL_TRANS_CODE <>", value, "channelTransCode");
            return (Criteria) this;
        }

        public Criteria andChannelTransCodeGreaterThan(Short value) {
            addCriterion("CHANNEL_TRANS_CODE >", value, "channelTransCode");
            return (Criteria) this;
        }

        public Criteria andChannelTransCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("CHANNEL_TRANS_CODE >=", value, "channelTransCode");
            return (Criteria) this;
        }

        public Criteria andChannelTransCodeLessThan(Short value) {
            addCriterion("CHANNEL_TRANS_CODE <", value, "channelTransCode");
            return (Criteria) this;
        }

        public Criteria andChannelTransCodeLessThanOrEqualTo(Short value) {
            addCriterion("CHANNEL_TRANS_CODE <=", value, "channelTransCode");
            return (Criteria) this;
        }

        public Criteria andChannelTransCodeIn(List<Short> values) {
            addCriterion("CHANNEL_TRANS_CODE in", values, "channelTransCode");
            return (Criteria) this;
        }

        public Criteria andChannelTransCodeNotIn(List<Short> values) {
            addCriterion("CHANNEL_TRANS_CODE not in", values, "channelTransCode");
            return (Criteria) this;
        }

        public Criteria andChannelTransCodeBetween(Short value1, Short value2) {
            addCriterion("CHANNEL_TRANS_CODE between", value1, value2, "channelTransCode");
            return (Criteria) this;
        }

        public Criteria andChannelTransCodeNotBetween(Short value1, Short value2) {
            addCriterion("CHANNEL_TRANS_CODE not between", value1, value2, "channelTransCode");
            return (Criteria) this;
        }

        public Criteria andChannelPayStatusIsNull() {
            addCriterion("CHANNEL_PAY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andChannelPayStatusIsNotNull() {
            addCriterion("CHANNEL_PAY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andChannelPayStatusEqualTo(Short value) {
            addCriterion("CHANNEL_PAY_STATUS =", value, "channelPayStatus");
            return (Criteria) this;
        }

        public Criteria andChannelPayStatusNotEqualTo(Short value) {
            addCriterion("CHANNEL_PAY_STATUS <>", value, "channelPayStatus");
            return (Criteria) this;
        }

        public Criteria andChannelPayStatusGreaterThan(Short value) {
            addCriterion("CHANNEL_PAY_STATUS >", value, "channelPayStatus");
            return (Criteria) this;
        }

        public Criteria andChannelPayStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("CHANNEL_PAY_STATUS >=", value, "channelPayStatus");
            return (Criteria) this;
        }

        public Criteria andChannelPayStatusLessThan(Short value) {
            addCriterion("CHANNEL_PAY_STATUS <", value, "channelPayStatus");
            return (Criteria) this;
        }

        public Criteria andChannelPayStatusLessThanOrEqualTo(Short value) {
            addCriterion("CHANNEL_PAY_STATUS <=", value, "channelPayStatus");
            return (Criteria) this;
        }

        public Criteria andChannelPayStatusIn(List<Short> values) {
            addCriterion("CHANNEL_PAY_STATUS in", values, "channelPayStatus");
            return (Criteria) this;
        }

        public Criteria andChannelPayStatusNotIn(List<Short> values) {
            addCriterion("CHANNEL_PAY_STATUS not in", values, "channelPayStatus");
            return (Criteria) this;
        }

        public Criteria andChannelPayStatusBetween(Short value1, Short value2) {
            addCriterion("CHANNEL_PAY_STATUS between", value1, value2, "channelPayStatus");
            return (Criteria) this;
        }

        public Criteria andChannelPayStatusNotBetween(Short value1, Short value2) {
            addCriterion("CHANNEL_PAY_STATUS not between", value1, value2, "channelPayStatus");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeIsNull() {
            addCriterion("CHANNEL_TRAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeIsNotNull() {
            addCriterion("CHANNEL_TRAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeEqualTo(String value) {
            addCriterion("CHANNEL_TRAD_TIME =", value, "channelTradTime");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeNotEqualTo(String value) {
            addCriterion("CHANNEL_TRAD_TIME <>", value, "channelTradTime");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeGreaterThan(String value) {
            addCriterion("CHANNEL_TRAD_TIME >", value, "channelTradTime");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TRAD_TIME >=", value, "channelTradTime");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeLessThan(String value) {
            addCriterion("CHANNEL_TRAD_TIME <", value, "channelTradTime");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_TRAD_TIME <=", value, "channelTradTime");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeLike(String value) {
            addCriterion("CHANNEL_TRAD_TIME like", value, "channelTradTime");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeNotLike(String value) {
            addCriterion("CHANNEL_TRAD_TIME not like", value, "channelTradTime");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeIn(List<String> values) {
            addCriterion("CHANNEL_TRAD_TIME in", values, "channelTradTime");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeNotIn(List<String> values) {
            addCriterion("CHANNEL_TRAD_TIME not in", values, "channelTradTime");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeBetween(String value1, String value2) {
            addCriterion("CHANNEL_TRAD_TIME between", value1, value2, "channelTradTime");
            return (Criteria) this;
        }

        public Criteria andChannelTradTimeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_TRAD_TIME not between", value1, value2, "channelTradTime");
            return (Criteria) this;
        }

        public Criteria andChannelFeeIsNull() {
            addCriterion("CHANNEL_FEE is null");
            return (Criteria) this;
        }

        public Criteria andChannelFeeIsNotNull() {
            addCriterion("CHANNEL_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelFeeEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_FEE =", value, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeNotEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_FEE <>", value, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeGreaterThan(BigDecimal value) {
            addCriterion("CHANNEL_FEE >", value, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_FEE >=", value, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeLessThan(BigDecimal value) {
            addCriterion("CHANNEL_FEE <", value, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHANNEL_FEE <=", value, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_FEE in", values, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeNotIn(List<BigDecimal> values) {
            addCriterion("CHANNEL_FEE not in", values, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_FEE between", value1, value2, "channelFee");
            return (Criteria) this;
        }

        public Criteria andChannelFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHANNEL_FEE not between", value1, value2, "channelFee");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Short value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Short value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Short value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Short value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Short value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Short> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Short> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Short value1, Short value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Short value1, Short value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoIsNull() {
            addCriterion("EXCEPTION_INFO is null");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoIsNotNull() {
            addCriterion("EXCEPTION_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoEqualTo(String value) {
            addCriterion("EXCEPTION_INFO =", value, "exceptionInfo");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoNotEqualTo(String value) {
            addCriterion("EXCEPTION_INFO <>", value, "exceptionInfo");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoGreaterThan(String value) {
            addCriterion("EXCEPTION_INFO >", value, "exceptionInfo");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_INFO >=", value, "exceptionInfo");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoLessThan(String value) {
            addCriterion("EXCEPTION_INFO <", value, "exceptionInfo");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_INFO <=", value, "exceptionInfo");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoLike(String value) {
            addCriterion("EXCEPTION_INFO like", value, "exceptionInfo");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoNotLike(String value) {
            addCriterion("EXCEPTION_INFO not like", value, "exceptionInfo");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoIn(List<String> values) {
            addCriterion("EXCEPTION_INFO in", values, "exceptionInfo");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoNotIn(List<String> values) {
            addCriterion("EXCEPTION_INFO not in", values, "exceptionInfo");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoBetween(String value1, String value2) {
            addCriterion("EXCEPTION_INFO between", value1, value2, "exceptionInfo");
            return (Criteria) this;
        }

        public Criteria andExceptionInfoNotBetween(String value1, String value2) {
            addCriterion("EXCEPTION_INFO not between", value1, value2, "exceptionInfo");
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

        public Criteria andTerminalCodeIsNull() {
            addCriterion("TERMINAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeIsNotNull() {
            addCriterion("TERMINAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeEqualTo(Long value) {
            addCriterion("TERMINAL_CODE =", value, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeNotEqualTo(Long value) {
            addCriterion("TERMINAL_CODE <>", value, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeGreaterThan(Long value) {
            addCriterion("TERMINAL_CODE >", value, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("TERMINAL_CODE >=", value, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeLessThan(Long value) {
            addCriterion("TERMINAL_CODE <", value, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeLessThanOrEqualTo(Long value) {
            addCriterion("TERMINAL_CODE <=", value, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeIn(List<Long> values) {
            addCriterion("TERMINAL_CODE in", values, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeNotIn(List<Long> values) {
            addCriterion("TERMINAL_CODE not in", values, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeBetween(Long value1, Long value2) {
            addCriterion("TERMINAL_CODE between", value1, value2, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalCodeNotBetween(Long value1, Long value2) {
            addCriterion("TERMINAL_CODE not between", value1, value2, "terminalCode");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoIsNull() {
            addCriterion("TERMINAL_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoIsNotNull() {
            addCriterion("TERMINAL_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoEqualTo(String value) {
            addCriterion("TERMINAL_SERIAL_NO =", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoNotEqualTo(String value) {
            addCriterion("TERMINAL_SERIAL_NO <>", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoGreaterThan(String value) {
            addCriterion("TERMINAL_SERIAL_NO >", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_SERIAL_NO >=", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoLessThan(String value) {
            addCriterion("TERMINAL_SERIAL_NO <", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_SERIAL_NO <=", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoLike(String value) {
            addCriterion("TERMINAL_SERIAL_NO like", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoNotLike(String value) {
            addCriterion("TERMINAL_SERIAL_NO not like", value, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoIn(List<String> values) {
            addCriterion("TERMINAL_SERIAL_NO in", values, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoNotIn(List<String> values) {
            addCriterion("TERMINAL_SERIAL_NO not in", values, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoBetween(String value1, String value2) {
            addCriterion("TERMINAL_SERIAL_NO between", value1, value2, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andTerminalSerialNoNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_SERIAL_NO not between", value1, value2, "terminalSerialNo");
            return (Criteria) this;
        }

        public Criteria andPayCodeIsNull() {
            addCriterion("PAY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPayCodeIsNotNull() {
            addCriterion("PAY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayCodeEqualTo(Long value) {
            addCriterion("PAY_CODE =", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeNotEqualTo(Long value) {
            addCriterion("PAY_CODE <>", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeGreaterThan(Long value) {
            addCriterion("PAY_CODE >", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("PAY_CODE >=", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeLessThan(Long value) {
            addCriterion("PAY_CODE <", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeLessThanOrEqualTo(Long value) {
            addCriterion("PAY_CODE <=", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeIn(List<Long> values) {
            addCriterion("PAY_CODE in", values, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeNotIn(List<Long> values) {
            addCriterion("PAY_CODE not in", values, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeBetween(Long value1, Long value2) {
            addCriterion("PAY_CODE between", value1, value2, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeNotBetween(Long value1, Long value2) {
            addCriterion("PAY_CODE not between", value1, value2, "payCode");
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

        public Criteria andBuyerAuthCodeIsNull() {
            addCriterion("BUYER_AUTH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAuthCodeIsNotNull() {
            addCriterion("BUYER_AUTH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAuthCodeEqualTo(String value) {
            addCriterion("BUYER_AUTH_CODE =", value, "buyerAuthCode");
            return (Criteria) this;
        }

        public Criteria andBuyerAuthCodeNotEqualTo(String value) {
            addCriterion("BUYER_AUTH_CODE <>", value, "buyerAuthCode");
            return (Criteria) this;
        }

        public Criteria andBuyerAuthCodeGreaterThan(String value) {
            addCriterion("BUYER_AUTH_CODE >", value, "buyerAuthCode");
            return (Criteria) this;
        }

        public Criteria andBuyerAuthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_AUTH_CODE >=", value, "buyerAuthCode");
            return (Criteria) this;
        }

        public Criteria andBuyerAuthCodeLessThan(String value) {
            addCriterion("BUYER_AUTH_CODE <", value, "buyerAuthCode");
            return (Criteria) this;
        }

        public Criteria andBuyerAuthCodeLessThanOrEqualTo(String value) {
            addCriterion("BUYER_AUTH_CODE <=", value, "buyerAuthCode");
            return (Criteria) this;
        }

        public Criteria andBuyerAuthCodeLike(String value) {
            addCriterion("BUYER_AUTH_CODE like", value, "buyerAuthCode");
            return (Criteria) this;
        }

        public Criteria andBuyerAuthCodeNotLike(String value) {
            addCriterion("BUYER_AUTH_CODE not like", value, "buyerAuthCode");
            return (Criteria) this;
        }

        public Criteria andBuyerAuthCodeIn(List<String> values) {
            addCriterion("BUYER_AUTH_CODE in", values, "buyerAuthCode");
            return (Criteria) this;
        }

        public Criteria andBuyerAuthCodeNotIn(List<String> values) {
            addCriterion("BUYER_AUTH_CODE not in", values, "buyerAuthCode");
            return (Criteria) this;
        }

        public Criteria andBuyerAuthCodeBetween(String value1, String value2) {
            addCriterion("BUYER_AUTH_CODE between", value1, value2, "buyerAuthCode");
            return (Criteria) this;
        }

        public Criteria andBuyerAuthCodeNotBetween(String value1, String value2) {
            addCriterion("BUYER_AUTH_CODE not between", value1, value2, "buyerAuthCode");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoIsNull() {
            addCriterion("PAY_ACCOUNT_NO is null");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoIsNotNull() {
            addCriterion("PAY_ACCOUNT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoEqualTo(String value) {
            addCriterion("PAY_ACCOUNT_NO =", value, "payAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoNotEqualTo(String value) {
            addCriterion("PAY_ACCOUNT_NO <>", value, "payAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoGreaterThan(String value) {
            addCriterion("PAY_ACCOUNT_NO >", value, "payAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ACCOUNT_NO >=", value, "payAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoLessThan(String value) {
            addCriterion("PAY_ACCOUNT_NO <", value, "payAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoLessThanOrEqualTo(String value) {
            addCriterion("PAY_ACCOUNT_NO <=", value, "payAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoLike(String value) {
            addCriterion("PAY_ACCOUNT_NO like", value, "payAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoNotLike(String value) {
            addCriterion("PAY_ACCOUNT_NO not like", value, "payAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoIn(List<String> values) {
            addCriterion("PAY_ACCOUNT_NO in", values, "payAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoNotIn(List<String> values) {
            addCriterion("PAY_ACCOUNT_NO not in", values, "payAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoBetween(String value1, String value2) {
            addCriterion("PAY_ACCOUNT_NO between", value1, value2, "payAccountNo");
            return (Criteria) this;
        }

        public Criteria andPayAccountNoNotBetween(String value1, String value2) {
            addCriterion("PAY_ACCOUNT_NO not between", value1, value2, "payAccountNo");
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

        public Criteria andProcessStateIsNull() {
            addCriterion("PROCESS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andProcessStateIsNotNull() {
            addCriterion("PROCESS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStateEqualTo(String value) {
            addCriterion("PROCESS_STATE =", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateNotEqualTo(String value) {
            addCriterion("PROCESS_STATE <>", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateGreaterThan(String value) {
            addCriterion("PROCESS_STATE >", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_STATE >=", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateLessThan(String value) {
            addCriterion("PROCESS_STATE <", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_STATE <=", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateLike(String value) {
            addCriterion("PROCESS_STATE like", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateNotLike(String value) {
            addCriterion("PROCESS_STATE not like", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateIn(List<String> values) {
            addCriterion("PROCESS_STATE in", values, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateNotIn(List<String> values) {
            addCriterion("PROCESS_STATE not in", values, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateBetween(String value1, String value2) {
            addCriterion("PROCESS_STATE between", value1, value2, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateNotBetween(String value1, String value2) {
            addCriterion("PROCESS_STATE not between", value1, value2, "processState");
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