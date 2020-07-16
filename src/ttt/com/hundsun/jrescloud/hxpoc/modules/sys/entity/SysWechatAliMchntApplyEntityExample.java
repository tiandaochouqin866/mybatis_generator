package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysWechatAliMchntApplyEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysWechatAliMchntApplyEntityExample() {
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

        public Criteria andCommonSerialNoIsNull() {
            addCriterion("COMMON_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoIsNotNull() {
            addCriterion("COMMON_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoEqualTo(BigDecimal value) {
            addCriterion("COMMON_SERIAL_NO =", value, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoNotEqualTo(BigDecimal value) {
            addCriterion("COMMON_SERIAL_NO <>", value, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoGreaterThan(BigDecimal value) {
            addCriterion("COMMON_SERIAL_NO >", value, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMON_SERIAL_NO >=", value, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoLessThan(BigDecimal value) {
            addCriterion("COMMON_SERIAL_NO <", value, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMON_SERIAL_NO <=", value, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoIn(List<BigDecimal> values) {
            addCriterion("COMMON_SERIAL_NO in", values, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoNotIn(List<BigDecimal> values) {
            addCriterion("COMMON_SERIAL_NO not in", values, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMON_SERIAL_NO between", value1, value2, "commonSerialNo");
            return (Criteria) this;
        }

        public Criteria andCommonSerialNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMON_SERIAL_NO not between", value1, value2, "commonSerialNo");
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

        public Criteria andOperInIsNull() {
            addCriterion("OPER_IN is null");
            return (Criteria) this;
        }

        public Criteria andOperInIsNotNull() {
            addCriterion("OPER_IN is not null");
            return (Criteria) this;
        }

        public Criteria andOperInEqualTo(String value) {
            addCriterion("OPER_IN =", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInNotEqualTo(String value) {
            addCriterion("OPER_IN <>", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInGreaterThan(String value) {
            addCriterion("OPER_IN >", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_IN >=", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInLessThan(String value) {
            addCriterion("OPER_IN <", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInLessThanOrEqualTo(String value) {
            addCriterion("OPER_IN <=", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInLike(String value) {
            addCriterion("OPER_IN like", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInNotLike(String value) {
            addCriterion("OPER_IN not like", value, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInIn(List<String> values) {
            addCriterion("OPER_IN in", values, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInNotIn(List<String> values) {
            addCriterion("OPER_IN not in", values, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInBetween(String value1, String value2) {
            addCriterion("OPER_IN between", value1, value2, "operIn");
            return (Criteria) this;
        }

        public Criteria andOperInNotBetween(String value1, String value2) {
            addCriterion("OPER_IN not between", value1, value2, "operIn");
            return (Criteria) this;
        }

        public Criteria andPayCompyCodeIsNull() {
            addCriterion("PAY_COMPY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPayCompyCodeIsNotNull() {
            addCriterion("PAY_COMPY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayCompyCodeEqualTo(Short value) {
            addCriterion("PAY_COMPY_CODE =", value, "payCompyCode");
            return (Criteria) this;
        }

        public Criteria andPayCompyCodeNotEqualTo(Short value) {
            addCriterion("PAY_COMPY_CODE <>", value, "payCompyCode");
            return (Criteria) this;
        }

        public Criteria andPayCompyCodeGreaterThan(Short value) {
            addCriterion("PAY_COMPY_CODE >", value, "payCompyCode");
            return (Criteria) this;
        }

        public Criteria andPayCompyCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("PAY_COMPY_CODE >=", value, "payCompyCode");
            return (Criteria) this;
        }

        public Criteria andPayCompyCodeLessThan(Short value) {
            addCriterion("PAY_COMPY_CODE <", value, "payCompyCode");
            return (Criteria) this;
        }

        public Criteria andPayCompyCodeLessThanOrEqualTo(Short value) {
            addCriterion("PAY_COMPY_CODE <=", value, "payCompyCode");
            return (Criteria) this;
        }

        public Criteria andPayCompyCodeIn(List<Short> values) {
            addCriterion("PAY_COMPY_CODE in", values, "payCompyCode");
            return (Criteria) this;
        }

        public Criteria andPayCompyCodeNotIn(List<Short> values) {
            addCriterion("PAY_COMPY_CODE not in", values, "payCompyCode");
            return (Criteria) this;
        }

        public Criteria andPayCompyCodeBetween(Short value1, Short value2) {
            addCriterion("PAY_COMPY_CODE between", value1, value2, "payCompyCode");
            return (Criteria) this;
        }

        public Criteria andPayCompyCodeNotBetween(Short value1, Short value2) {
            addCriterion("PAY_COMPY_CODE not between", value1, value2, "payCompyCode");
            return (Criteria) this;
        }

        public Criteria andPayCompyActIsNull() {
            addCriterion("PAY_COMPY_ACT is null");
            return (Criteria) this;
        }

        public Criteria andPayCompyActIsNotNull() {
            addCriterion("PAY_COMPY_ACT is not null");
            return (Criteria) this;
        }

        public Criteria andPayCompyActEqualTo(String value) {
            addCriterion("PAY_COMPY_ACT =", value, "payCompyAct");
            return (Criteria) this;
        }

        public Criteria andPayCompyActNotEqualTo(String value) {
            addCriterion("PAY_COMPY_ACT <>", value, "payCompyAct");
            return (Criteria) this;
        }

        public Criteria andPayCompyActGreaterThan(String value) {
            addCriterion("PAY_COMPY_ACT >", value, "payCompyAct");
            return (Criteria) this;
        }

        public Criteria andPayCompyActGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_COMPY_ACT >=", value, "payCompyAct");
            return (Criteria) this;
        }

        public Criteria andPayCompyActLessThan(String value) {
            addCriterion("PAY_COMPY_ACT <", value, "payCompyAct");
            return (Criteria) this;
        }

        public Criteria andPayCompyActLessThanOrEqualTo(String value) {
            addCriterion("PAY_COMPY_ACT <=", value, "payCompyAct");
            return (Criteria) this;
        }

        public Criteria andPayCompyActLike(String value) {
            addCriterion("PAY_COMPY_ACT like", value, "payCompyAct");
            return (Criteria) this;
        }

        public Criteria andPayCompyActNotLike(String value) {
            addCriterion("PAY_COMPY_ACT not like", value, "payCompyAct");
            return (Criteria) this;
        }

        public Criteria andPayCompyActIn(List<String> values) {
            addCriterion("PAY_COMPY_ACT in", values, "payCompyAct");
            return (Criteria) this;
        }

        public Criteria andPayCompyActNotIn(List<String> values) {
            addCriterion("PAY_COMPY_ACT not in", values, "payCompyAct");
            return (Criteria) this;
        }

        public Criteria andPayCompyActBetween(String value1, String value2) {
            addCriterion("PAY_COMPY_ACT between", value1, value2, "payCompyAct");
            return (Criteria) this;
        }

        public Criteria andPayCompyActNotBetween(String value1, String value2) {
            addCriterion("PAY_COMPY_ACT not between", value1, value2, "payCompyAct");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("APPID is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("APPID is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("APPID =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("APPID <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("APPID >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("APPID >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("APPID <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("APPID <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("APPID like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("APPID not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("APPID in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("APPID not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("APPID between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("APPID not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNull() {
            addCriterion("BRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNotNull() {
            addCriterion("BRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNameEqualTo(String value) {
            addCriterion("BRANCH_NAME =", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotEqualTo(String value) {
            addCriterion("BRANCH_NAME <>", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThan(String value) {
            addCriterion("BRANCH_NAME >", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_NAME >=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThan(String value) {
            addCriterion("BRANCH_NAME <", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_NAME <=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameIn(List<String> values) {
            addCriterion("BRANCH_NAME in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotIn(List<String> values) {
            addCriterion("BRANCH_NAME not in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameBetween(String value1, String value2) {
            addCriterion("BRANCH_NAME between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotBetween(String value1, String value2) {
            addCriterion("BRANCH_NAME not between", value1, value2, "branchName");
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

        public Criteria andMobileNoIsNull() {
            addCriterion("MOBILE_NO is null");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNotNull() {
            addCriterion("MOBILE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNoEqualTo(String value) {
            addCriterion("MOBILE_NO =", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotEqualTo(String value) {
            addCriterion("MOBILE_NO <>", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThan(String value) {
            addCriterion("MOBILE_NO >", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_NO >=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThan(String value) {
            addCriterion("MOBILE_NO <", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_NO <=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLike(String value) {
            addCriterion("MOBILE_NO like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotLike(String value) {
            addCriterion("MOBILE_NO not like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoIn(List<String> values) {
            addCriterion("MOBILE_NO in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotIn(List<String> values) {
            addCriterion("MOBILE_NO not in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoBetween(String value1, String value2) {
            addCriterion("MOBILE_NO between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotBetween(String value1, String value2) {
            addCriterion("MOBILE_NO not between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdIsNull() {
            addCriterion("WECHAT_CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdIsNotNull() {
            addCriterion("WECHAT_CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdEqualTo(String value) {
            addCriterion("WECHAT_CHANNEL_ID =", value, "wechatChannelId");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdNotEqualTo(String value) {
            addCriterion("WECHAT_CHANNEL_ID <>", value, "wechatChannelId");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdGreaterThan(String value) {
            addCriterion("WECHAT_CHANNEL_ID >", value, "wechatChannelId");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("WECHAT_CHANNEL_ID >=", value, "wechatChannelId");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdLessThan(String value) {
            addCriterion("WECHAT_CHANNEL_ID <", value, "wechatChannelId");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdLessThanOrEqualTo(String value) {
            addCriterion("WECHAT_CHANNEL_ID <=", value, "wechatChannelId");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdLike(String value) {
            addCriterion("WECHAT_CHANNEL_ID like", value, "wechatChannelId");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdNotLike(String value) {
            addCriterion("WECHAT_CHANNEL_ID not like", value, "wechatChannelId");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdIn(List<String> values) {
            addCriterion("WECHAT_CHANNEL_ID in", values, "wechatChannelId");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdNotIn(List<String> values) {
            addCriterion("WECHAT_CHANNEL_ID not in", values, "wechatChannelId");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdBetween(String value1, String value2) {
            addCriterion("WECHAT_CHANNEL_ID between", value1, value2, "wechatChannelId");
            return (Criteria) this;
        }

        public Criteria andWechatChannelIdNotBetween(String value1, String value2) {
            addCriterion("WECHAT_CHANNEL_ID not between", value1, value2, "wechatChannelId");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIsNull() {
            addCriterion("BUSI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIsNotNull() {
            addCriterion("BUSI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusiTypeEqualTo(String value) {
            addCriterion("BUSI_TYPE =", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotEqualTo(String value) {
            addCriterion("BUSI_TYPE <>", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThan(String value) {
            addCriterion("BUSI_TYPE >", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_TYPE >=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThan(String value) {
            addCriterion("BUSI_TYPE <", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSI_TYPE <=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLike(String value) {
            addCriterion("BUSI_TYPE like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotLike(String value) {
            addCriterion("BUSI_TYPE not like", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIn(List<String> values) {
            addCriterion("BUSI_TYPE in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotIn(List<String> values) {
            addCriterion("BUSI_TYPE not in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeBetween(String value1, String value2) {
            addCriterion("BUSI_TYPE between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotBetween(String value1, String value2) {
            addCriterion("BUSI_TYPE not between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andLicTypeIsNull() {
            addCriterion("LIC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLicTypeIsNotNull() {
            addCriterion("LIC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLicTypeEqualTo(String value) {
            addCriterion("LIC_TYPE =", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeNotEqualTo(String value) {
            addCriterion("LIC_TYPE <>", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeGreaterThan(String value) {
            addCriterion("LIC_TYPE >", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LIC_TYPE >=", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeLessThan(String value) {
            addCriterion("LIC_TYPE <", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeLessThanOrEqualTo(String value) {
            addCriterion("LIC_TYPE <=", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeLike(String value) {
            addCriterion("LIC_TYPE like", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeNotLike(String value) {
            addCriterion("LIC_TYPE not like", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeIn(List<String> values) {
            addCriterion("LIC_TYPE in", values, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeNotIn(List<String> values) {
            addCriterion("LIC_TYPE not in", values, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeBetween(String value1, String value2) {
            addCriterion("LIC_TYPE between", value1, value2, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeNotBetween(String value1, String value2) {
            addCriterion("LIC_TYPE not between", value1, value2, "licType");
            return (Criteria) this;
        }

        public Criteria andLicNoIsNull() {
            addCriterion("LIC_NO is null");
            return (Criteria) this;
        }

        public Criteria andLicNoIsNotNull() {
            addCriterion("LIC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLicNoEqualTo(String value) {
            addCriterion("LIC_NO =", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoNotEqualTo(String value) {
            addCriterion("LIC_NO <>", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoGreaterThan(String value) {
            addCriterion("LIC_NO >", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoGreaterThanOrEqualTo(String value) {
            addCriterion("LIC_NO >=", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoLessThan(String value) {
            addCriterion("LIC_NO <", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoLessThanOrEqualTo(String value) {
            addCriterion("LIC_NO <=", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoLike(String value) {
            addCriterion("LIC_NO like", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoNotLike(String value) {
            addCriterion("LIC_NO not like", value, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoIn(List<String> values) {
            addCriterion("LIC_NO in", values, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoNotIn(List<String> values) {
            addCriterion("LIC_NO not in", values, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoBetween(String value1, String value2) {
            addCriterion("LIC_NO between", value1, value2, "licNo");
            return (Criteria) this;
        }

        public Criteria andLicNoNotBetween(String value1, String value2) {
            addCriterion("LIC_NO not between", value1, value2, "licNo");
            return (Criteria) this;
        }

        public Criteria andContacterTypeIsNull() {
            addCriterion("CONTACTER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContacterTypeIsNotNull() {
            addCriterion("CONTACTER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContacterTypeEqualTo(String value) {
            addCriterion("CONTACTER_TYPE =", value, "contacterType");
            return (Criteria) this;
        }

        public Criteria andContacterTypeNotEqualTo(String value) {
            addCriterion("CONTACTER_TYPE <>", value, "contacterType");
            return (Criteria) this;
        }

        public Criteria andContacterTypeGreaterThan(String value) {
            addCriterion("CONTACTER_TYPE >", value, "contacterType");
            return (Criteria) this;
        }

        public Criteria andContacterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTER_TYPE >=", value, "contacterType");
            return (Criteria) this;
        }

        public Criteria andContacterTypeLessThan(String value) {
            addCriterion("CONTACTER_TYPE <", value, "contacterType");
            return (Criteria) this;
        }

        public Criteria andContacterTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTACTER_TYPE <=", value, "contacterType");
            return (Criteria) this;
        }

        public Criteria andContacterTypeLike(String value) {
            addCriterion("CONTACTER_TYPE like", value, "contacterType");
            return (Criteria) this;
        }

        public Criteria andContacterTypeNotLike(String value) {
            addCriterion("CONTACTER_TYPE not like", value, "contacterType");
            return (Criteria) this;
        }

        public Criteria andContacterTypeIn(List<String> values) {
            addCriterion("CONTACTER_TYPE in", values, "contacterType");
            return (Criteria) this;
        }

        public Criteria andContacterTypeNotIn(List<String> values) {
            addCriterion("CONTACTER_TYPE not in", values, "contacterType");
            return (Criteria) this;
        }

        public Criteria andContacterTypeBetween(String value1, String value2) {
            addCriterion("CONTACTER_TYPE between", value1, value2, "contacterType");
            return (Criteria) this;
        }

        public Criteria andContacterTypeNotBetween(String value1, String value2) {
            addCriterion("CONTACTER_TYPE not between", value1, value2, "contacterType");
            return (Criteria) this;
        }

        public Criteria andLegalCertNameIsNull() {
            addCriterion("LEGAL_CERT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLegalCertNameIsNotNull() {
            addCriterion("LEGAL_CERT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLegalCertNameEqualTo(String value) {
            addCriterion("LEGAL_CERT_NAME =", value, "legalCertName");
            return (Criteria) this;
        }

        public Criteria andLegalCertNameNotEqualTo(String value) {
            addCriterion("LEGAL_CERT_NAME <>", value, "legalCertName");
            return (Criteria) this;
        }

        public Criteria andLegalCertNameGreaterThan(String value) {
            addCriterion("LEGAL_CERT_NAME >", value, "legalCertName");
            return (Criteria) this;
        }

        public Criteria andLegalCertNameGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_CERT_NAME >=", value, "legalCertName");
            return (Criteria) this;
        }

        public Criteria andLegalCertNameLessThan(String value) {
            addCriterion("LEGAL_CERT_NAME <", value, "legalCertName");
            return (Criteria) this;
        }

        public Criteria andLegalCertNameLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_CERT_NAME <=", value, "legalCertName");
            return (Criteria) this;
        }

        public Criteria andLegalCertNameIn(List<String> values) {
            addCriterion("LEGAL_CERT_NAME in", values, "legalCertName");
            return (Criteria) this;
        }

        public Criteria andLegalCertNameNotIn(List<String> values) {
            addCriterion("LEGAL_CERT_NAME not in", values, "legalCertName");
            return (Criteria) this;
        }

        public Criteria andLegalCertNameBetween(String value1, String value2) {
            addCriterion("LEGAL_CERT_NAME between", value1, value2, "legalCertName");
            return (Criteria) this;
        }

        public Criteria andLegalCertNameNotBetween(String value1, String value2) {
            addCriterion("LEGAL_CERT_NAME not between", value1, value2, "legalCertName");
            return (Criteria) this;
        }

        public Criteria andIdCertNoIsNull() {
            addCriterion("ID_CERT_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdCertNoIsNotNull() {
            addCriterion("ID_CERT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdCertNoEqualTo(String value) {
            addCriterion("ID_CERT_NO =", value, "idCertNo");
            return (Criteria) this;
        }

        public Criteria andIdCertNoNotEqualTo(String value) {
            addCriterion("ID_CERT_NO <>", value, "idCertNo");
            return (Criteria) this;
        }

        public Criteria andIdCertNoGreaterThan(String value) {
            addCriterion("ID_CERT_NO >", value, "idCertNo");
            return (Criteria) this;
        }

        public Criteria andIdCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CERT_NO >=", value, "idCertNo");
            return (Criteria) this;
        }

        public Criteria andIdCertNoLessThan(String value) {
            addCriterion("ID_CERT_NO <", value, "idCertNo");
            return (Criteria) this;
        }

        public Criteria andIdCertNoLessThanOrEqualTo(String value) {
            addCriterion("ID_CERT_NO <=", value, "idCertNo");
            return (Criteria) this;
        }

        public Criteria andIdCertNoLike(String value) {
            addCriterion("ID_CERT_NO like", value, "idCertNo");
            return (Criteria) this;
        }

        public Criteria andIdCertNoNotLike(String value) {
            addCriterion("ID_CERT_NO not like", value, "idCertNo");
            return (Criteria) this;
        }

        public Criteria andIdCertNoIn(List<String> values) {
            addCriterion("ID_CERT_NO in", values, "idCertNo");
            return (Criteria) this;
        }

        public Criteria andIdCertNoNotIn(List<String> values) {
            addCriterion("ID_CERT_NO not in", values, "idCertNo");
            return (Criteria) this;
        }

        public Criteria andIdCertNoBetween(String value1, String value2) {
            addCriterion("ID_CERT_NO between", value1, value2, "idCertNo");
            return (Criteria) this;
        }

        public Criteria andIdCertNoNotBetween(String value1, String value2) {
            addCriterion("ID_CERT_NO not between", value1, value2, "idCertNo");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("PROVINCE_CODE =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("PROVINCE_CODE <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("PROVINCE_CODE >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("PROVINCE_CODE <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("PROVINCE_CODE like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("PROVINCE_CODE not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("PROVINCE_CODE in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("PROVINCE_CODE not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIsNull() {
            addCriterion("DISTRICT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIsNotNull() {
            addCriterion("DISTRICT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeEqualTo(String value) {
            addCriterion("DISTRICT_CODE =", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotEqualTo(String value) {
            addCriterion("DISTRICT_CODE <>", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThan(String value) {
            addCriterion("DISTRICT_CODE >", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT_CODE >=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThan(String value) {
            addCriterion("DISTRICT_CODE <", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT_CODE <=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLike(String value) {
            addCriterion("DISTRICT_CODE like", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotLike(String value) {
            addCriterion("DISTRICT_CODE not like", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIn(List<String> values) {
            addCriterion("DISTRICT_CODE in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotIn(List<String> values) {
            addCriterion("DISTRICT_CODE not in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeBetween(String value1, String value2) {
            addCriterion("DISTRICT_CODE between", value1, value2, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotBetween(String value1, String value2) {
            addCriterion("DISTRICT_CODE not between", value1, value2, "districtCode");
            return (Criteria) this;
        }

        public Criteria andBusiAddrIsNull() {
            addCriterion("BUSI_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andBusiAddrIsNotNull() {
            addCriterion("BUSI_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andBusiAddrEqualTo(String value) {
            addCriterion("BUSI_ADDR =", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrNotEqualTo(String value) {
            addCriterion("BUSI_ADDR <>", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrGreaterThan(String value) {
            addCriterion("BUSI_ADDR >", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_ADDR >=", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrLessThan(String value) {
            addCriterion("BUSI_ADDR <", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrLessThanOrEqualTo(String value) {
            addCriterion("BUSI_ADDR <=", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrIn(List<String> values) {
            addCriterion("BUSI_ADDR in", values, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrNotIn(List<String> values) {
            addCriterion("BUSI_ADDR not in", values, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrBetween(String value1, String value2) {
            addCriterion("BUSI_ADDR between", value1, value2, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrNotBetween(String value1, String value2) {
            addCriterion("BUSI_ADDR not between", value1, value2, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andMerchantRemarkIsNull() {
            addCriterion("MERCHANT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andMerchantRemarkIsNotNull() {
            addCriterion("MERCHANT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantRemarkEqualTo(String value) {
            addCriterion("MERCHANT_REMARK =", value, "merchantRemark");
            return (Criteria) this;
        }

        public Criteria andMerchantRemarkNotEqualTo(String value) {
            addCriterion("MERCHANT_REMARK <>", value, "merchantRemark");
            return (Criteria) this;
        }

        public Criteria andMerchantRemarkGreaterThan(String value) {
            addCriterion("MERCHANT_REMARK >", value, "merchantRemark");
            return (Criteria) this;
        }

        public Criteria andMerchantRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANT_REMARK >=", value, "merchantRemark");
            return (Criteria) this;
        }

        public Criteria andMerchantRemarkLessThan(String value) {
            addCriterion("MERCHANT_REMARK <", value, "merchantRemark");
            return (Criteria) this;
        }

        public Criteria andMerchantRemarkLessThanOrEqualTo(String value) {
            addCriterion("MERCHANT_REMARK <=", value, "merchantRemark");
            return (Criteria) this;
        }

        public Criteria andMerchantRemarkIn(List<String> values) {
            addCriterion("MERCHANT_REMARK in", values, "merchantRemark");
            return (Criteria) this;
        }

        public Criteria andMerchantRemarkNotIn(List<String> values) {
            addCriterion("MERCHANT_REMARK not in", values, "merchantRemark");
            return (Criteria) this;
        }

        public Criteria andMerchantRemarkBetween(String value1, String value2) {
            addCriterion("MERCHANT_REMARK between", value1, value2, "merchantRemark");
            return (Criteria) this;
        }

        public Criteria andMerchantRemarkNotBetween(String value1, String value2) {
            addCriterion("MERCHANT_REMARK not between", value1, value2, "merchantRemark");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdIsNull() {
            addCriterion("SUB_MERCHANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdIsNotNull() {
            addCriterion("SUB_MERCHANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdEqualTo(String value) {
            addCriterion("SUB_MERCHANT_ID =", value, "subMerchantId");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdNotEqualTo(String value) {
            addCriterion("SUB_MERCHANT_ID <>", value, "subMerchantId");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdGreaterThan(String value) {
            addCriterion("SUB_MERCHANT_ID >", value, "subMerchantId");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_MERCHANT_ID >=", value, "subMerchantId");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdLessThan(String value) {
            addCriterion("SUB_MERCHANT_ID <", value, "subMerchantId");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("SUB_MERCHANT_ID <=", value, "subMerchantId");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdLike(String value) {
            addCriterion("SUB_MERCHANT_ID like", value, "subMerchantId");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdNotLike(String value) {
            addCriterion("SUB_MERCHANT_ID not like", value, "subMerchantId");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdIn(List<String> values) {
            addCriterion("SUB_MERCHANT_ID in", values, "subMerchantId");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdNotIn(List<String> values) {
            addCriterion("SUB_MERCHANT_ID not in", values, "subMerchantId");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdBetween(String value1, String value2) {
            addCriterion("SUB_MERCHANT_ID between", value1, value2, "subMerchantId");
            return (Criteria) this;
        }

        public Criteria andSubMerchantIdNotBetween(String value1, String value2) {
            addCriterion("SUB_MERCHANT_ID not between", value1, value2, "subMerchantId");
            return (Criteria) this;
        }

        public Criteria andRespCpdeIsNull() {
            addCriterion("RESP_CPDE is null");
            return (Criteria) this;
        }

        public Criteria andRespCpdeIsNotNull() {
            addCriterion("RESP_CPDE is not null");
            return (Criteria) this;
        }

        public Criteria andRespCpdeEqualTo(String value) {
            addCriterion("RESP_CPDE =", value, "respCpde");
            return (Criteria) this;
        }

        public Criteria andRespCpdeNotEqualTo(String value) {
            addCriterion("RESP_CPDE <>", value, "respCpde");
            return (Criteria) this;
        }

        public Criteria andRespCpdeGreaterThan(String value) {
            addCriterion("RESP_CPDE >", value, "respCpde");
            return (Criteria) this;
        }

        public Criteria andRespCpdeGreaterThanOrEqualTo(String value) {
            addCriterion("RESP_CPDE >=", value, "respCpde");
            return (Criteria) this;
        }

        public Criteria andRespCpdeLessThan(String value) {
            addCriterion("RESP_CPDE <", value, "respCpde");
            return (Criteria) this;
        }

        public Criteria andRespCpdeLessThanOrEqualTo(String value) {
            addCriterion("RESP_CPDE <=", value, "respCpde");
            return (Criteria) this;
        }

        public Criteria andRespCpdeLike(String value) {
            addCriterion("RESP_CPDE like", value, "respCpde");
            return (Criteria) this;
        }

        public Criteria andRespCpdeNotLike(String value) {
            addCriterion("RESP_CPDE not like", value, "respCpde");
            return (Criteria) this;
        }

        public Criteria andRespCpdeIn(List<String> values) {
            addCriterion("RESP_CPDE in", values, "respCpde");
            return (Criteria) this;
        }

        public Criteria andRespCpdeNotIn(List<String> values) {
            addCriterion("RESP_CPDE not in", values, "respCpde");
            return (Criteria) this;
        }

        public Criteria andRespCpdeBetween(String value1, String value2) {
            addCriterion("RESP_CPDE between", value1, value2, "respCpde");
            return (Criteria) this;
        }

        public Criteria andRespCpdeNotBetween(String value1, String value2) {
            addCriterion("RESP_CPDE not between", value1, value2, "respCpde");
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