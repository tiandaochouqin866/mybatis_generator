package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class SysChannelEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysChannelEntityExample() {
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

        public Criteria andThirdPlatNameIsNull() {
            addCriterion("THIRD_PLAT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatNameIsNotNull() {
            addCriterion("THIRD_PLAT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatNameEqualTo(String value) {
            addCriterion("THIRD_PLAT_NAME =", value, "thirdPlatName");
            return (Criteria) this;
        }

        public Criteria andThirdPlatNameNotEqualTo(String value) {
            addCriterion("THIRD_PLAT_NAME <>", value, "thirdPlatName");
            return (Criteria) this;
        }

        public Criteria andThirdPlatNameGreaterThan(String value) {
            addCriterion("THIRD_PLAT_NAME >", value, "thirdPlatName");
            return (Criteria) this;
        }

        public Criteria andThirdPlatNameGreaterThanOrEqualTo(String value) {
            addCriterion("THIRD_PLAT_NAME >=", value, "thirdPlatName");
            return (Criteria) this;
        }

        public Criteria andThirdPlatNameLessThan(String value) {
            addCriterion("THIRD_PLAT_NAME <", value, "thirdPlatName");
            return (Criteria) this;
        }

        public Criteria andThirdPlatNameLessThanOrEqualTo(String value) {
            addCriterion("THIRD_PLAT_NAME <=", value, "thirdPlatName");
            return (Criteria) this;
        }

        public Criteria andThirdPlatNameLike(String value) {
            addCriterion("THIRD_PLAT_NAME like", value, "thirdPlatName");
            return (Criteria) this;
        }

        public Criteria andThirdPlatNameNotLike(String value) {
            addCriterion("THIRD_PLAT_NAME not like", value, "thirdPlatName");
            return (Criteria) this;
        }

        public Criteria andThirdPlatNameIn(List<String> values) {
            addCriterion("THIRD_PLAT_NAME in", values, "thirdPlatName");
            return (Criteria) this;
        }

        public Criteria andThirdPlatNameNotIn(List<String> values) {
            addCriterion("THIRD_PLAT_NAME not in", values, "thirdPlatName");
            return (Criteria) this;
        }

        public Criteria andThirdPlatNameBetween(String value1, String value2) {
            addCriterion("THIRD_PLAT_NAME between", value1, value2, "thirdPlatName");
            return (Criteria) this;
        }

        public Criteria andThirdPlatNameNotBetween(String value1, String value2) {
            addCriterion("THIRD_PLAT_NAME not between", value1, value2, "thirdPlatName");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActIsNull() {
            addCriterion("THIRD_PLAT_ACT is null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActIsNotNull() {
            addCriterion("THIRD_PLAT_ACT is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActEqualTo(String value) {
            addCriterion("THIRD_PLAT_ACT =", value, "thirdPlatAct");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActNotEqualTo(String value) {
            addCriterion("THIRD_PLAT_ACT <>", value, "thirdPlatAct");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActGreaterThan(String value) {
            addCriterion("THIRD_PLAT_ACT >", value, "thirdPlatAct");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActGreaterThanOrEqualTo(String value) {
            addCriterion("THIRD_PLAT_ACT >=", value, "thirdPlatAct");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActLessThan(String value) {
            addCriterion("THIRD_PLAT_ACT <", value, "thirdPlatAct");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActLessThanOrEqualTo(String value) {
            addCriterion("THIRD_PLAT_ACT <=", value, "thirdPlatAct");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActLike(String value) {
            addCriterion("THIRD_PLAT_ACT like", value, "thirdPlatAct");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActNotLike(String value) {
            addCriterion("THIRD_PLAT_ACT not like", value, "thirdPlatAct");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActIn(List<String> values) {
            addCriterion("THIRD_PLAT_ACT in", values, "thirdPlatAct");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActNotIn(List<String> values) {
            addCriterion("THIRD_PLAT_ACT not in", values, "thirdPlatAct");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActBetween(String value1, String value2) {
            addCriterion("THIRD_PLAT_ACT between", value1, value2, "thirdPlatAct");
            return (Criteria) this;
        }

        public Criteria andThirdPlatActNotBetween(String value1, String value2) {
            addCriterion("THIRD_PLAT_ACT not between", value1, value2, "thirdPlatAct");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("APP_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("APP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("APP_ID =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("APP_ID <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("APP_ID >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("APP_ID >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("APP_ID <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("APP_ID <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("APP_ID like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("APP_ID not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("APP_ID in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("APP_ID not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("APP_ID between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("APP_ID not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeIsNull() {
            addCriterion("UP_STANDARD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeIsNotNull() {
            addCriterion("UP_STANDARD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeEqualTo(String value) {
            addCriterion("UP_STANDARD_CODE =", value, "upStandardCode");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeNotEqualTo(String value) {
            addCriterion("UP_STANDARD_CODE <>", value, "upStandardCode");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeGreaterThan(String value) {
            addCriterion("UP_STANDARD_CODE >", value, "upStandardCode");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeGreaterThanOrEqualTo(String value) {
            addCriterion("UP_STANDARD_CODE >=", value, "upStandardCode");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeLessThan(String value) {
            addCriterion("UP_STANDARD_CODE <", value, "upStandardCode");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeLessThanOrEqualTo(String value) {
            addCriterion("UP_STANDARD_CODE <=", value, "upStandardCode");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeLike(String value) {
            addCriterion("UP_STANDARD_CODE like", value, "upStandardCode");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeNotLike(String value) {
            addCriterion("UP_STANDARD_CODE not like", value, "upStandardCode");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeIn(List<String> values) {
            addCriterion("UP_STANDARD_CODE in", values, "upStandardCode");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeNotIn(List<String> values) {
            addCriterion("UP_STANDARD_CODE not in", values, "upStandardCode");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeBetween(String value1, String value2) {
            addCriterion("UP_STANDARD_CODE between", value1, value2, "upStandardCode");
            return (Criteria) this;
        }

        public Criteria andUpStandardCodeNotBetween(String value1, String value2) {
            addCriterion("UP_STANDARD_CODE not between", value1, value2, "upStandardCode");
            return (Criteria) this;
        }

        public Criteria andKeyTypeIsNull() {
            addCriterion("KEY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andKeyTypeIsNotNull() {
            addCriterion("KEY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andKeyTypeEqualTo(Short value) {
            addCriterion("KEY_TYPE =", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeNotEqualTo(Short value) {
            addCriterion("KEY_TYPE <>", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeGreaterThan(Short value) {
            addCriterion("KEY_TYPE >", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("KEY_TYPE >=", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeLessThan(Short value) {
            addCriterion("KEY_TYPE <", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeLessThanOrEqualTo(Short value) {
            addCriterion("KEY_TYPE <=", value, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeIn(List<Short> values) {
            addCriterion("KEY_TYPE in", values, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeNotIn(List<Short> values) {
            addCriterion("KEY_TYPE not in", values, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeBetween(Short value1, Short value2) {
            addCriterion("KEY_TYPE between", value1, value2, "keyType");
            return (Criteria) this;
        }

        public Criteria andKeyTypeNotBetween(Short value1, Short value2) {
            addCriterion("KEY_TYPE not between", value1, value2, "keyType");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIsNull() {
            addCriterion("PUBLIC_KEY is null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIsNotNull() {
            addCriterion("PUBLIC_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyEqualTo(String value) {
            addCriterion("PUBLIC_KEY =", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotEqualTo(String value) {
            addCriterion("PUBLIC_KEY <>", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyGreaterThan(String value) {
            addCriterion("PUBLIC_KEY >", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_KEY >=", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLessThan(String value) {
            addCriterion("PUBLIC_KEY <", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_KEY <=", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLike(String value) {
            addCriterion("PUBLIC_KEY like", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotLike(String value) {
            addCriterion("PUBLIC_KEY not like", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIn(List<String> values) {
            addCriterion("PUBLIC_KEY in", values, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotIn(List<String> values) {
            addCriterion("PUBLIC_KEY not in", values, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyBetween(String value1, String value2) {
            addCriterion("PUBLIC_KEY between", value1, value2, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_KEY not between", value1, value2, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyIsNull() {
            addCriterion("PRIVATE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyIsNotNull() {
            addCriterion("PRIVATE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyEqualTo(String value) {
            addCriterion("PRIVATE_KEY =", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyNotEqualTo(String value) {
            addCriterion("PRIVATE_KEY <>", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyGreaterThan(String value) {
            addCriterion("PRIVATE_KEY >", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVATE_KEY >=", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyLessThan(String value) {
            addCriterion("PRIVATE_KEY <", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyLessThanOrEqualTo(String value) {
            addCriterion("PRIVATE_KEY <=", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyLike(String value) {
            addCriterion("PRIVATE_KEY like", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyNotLike(String value) {
            addCriterion("PRIVATE_KEY not like", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyIn(List<String> values) {
            addCriterion("PRIVATE_KEY in", values, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyNotIn(List<String> values) {
            addCriterion("PRIVATE_KEY not in", values, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyBetween(String value1, String value2) {
            addCriterion("PRIVATE_KEY between", value1, value2, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyNotBetween(String value1, String value2) {
            addCriterion("PRIVATE_KEY not between", value1, value2, "privateKey");
            return (Criteria) this;
        }

        public Criteria andKeyPwdIsNull() {
            addCriterion("KEY_PWD is null");
            return (Criteria) this;
        }

        public Criteria andKeyPwdIsNotNull() {
            addCriterion("KEY_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andKeyPwdEqualTo(String value) {
            addCriterion("KEY_PWD =", value, "keyPwd");
            return (Criteria) this;
        }

        public Criteria andKeyPwdNotEqualTo(String value) {
            addCriterion("KEY_PWD <>", value, "keyPwd");
            return (Criteria) this;
        }

        public Criteria andKeyPwdGreaterThan(String value) {
            addCriterion("KEY_PWD >", value, "keyPwd");
            return (Criteria) this;
        }

        public Criteria andKeyPwdGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_PWD >=", value, "keyPwd");
            return (Criteria) this;
        }

        public Criteria andKeyPwdLessThan(String value) {
            addCriterion("KEY_PWD <", value, "keyPwd");
            return (Criteria) this;
        }

        public Criteria andKeyPwdLessThanOrEqualTo(String value) {
            addCriterion("KEY_PWD <=", value, "keyPwd");
            return (Criteria) this;
        }

        public Criteria andKeyPwdLike(String value) {
            addCriterion("KEY_PWD like", value, "keyPwd");
            return (Criteria) this;
        }

        public Criteria andKeyPwdNotLike(String value) {
            addCriterion("KEY_PWD not like", value, "keyPwd");
            return (Criteria) this;
        }

        public Criteria andKeyPwdIn(List<String> values) {
            addCriterion("KEY_PWD in", values, "keyPwd");
            return (Criteria) this;
        }

        public Criteria andKeyPwdNotIn(List<String> values) {
            addCriterion("KEY_PWD not in", values, "keyPwd");
            return (Criteria) this;
        }

        public Criteria andKeyPwdBetween(String value1, String value2) {
            addCriterion("KEY_PWD between", value1, value2, "keyPwd");
            return (Criteria) this;
        }

        public Criteria andKeyPwdNotBetween(String value1, String value2) {
            addCriterion("KEY_PWD not between", value1, value2, "keyPwd");
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

        public Criteria andAppSecretIsNull() {
            addCriterion("APP_SECRET is null");
            return (Criteria) this;
        }

        public Criteria andAppSecretIsNotNull() {
            addCriterion("APP_SECRET is not null");
            return (Criteria) this;
        }

        public Criteria andAppSecretEqualTo(String value) {
            addCriterion("APP_SECRET =", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotEqualTo(String value) {
            addCriterion("APP_SECRET <>", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThan(String value) {
            addCriterion("APP_SECRET >", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretGreaterThanOrEqualTo(String value) {
            addCriterion("APP_SECRET >=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThan(String value) {
            addCriterion("APP_SECRET <", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLessThanOrEqualTo(String value) {
            addCriterion("APP_SECRET <=", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretLike(String value) {
            addCriterion("APP_SECRET like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotLike(String value) {
            addCriterion("APP_SECRET not like", value, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretIn(List<String> values) {
            addCriterion("APP_SECRET in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotIn(List<String> values) {
            addCriterion("APP_SECRET not in", values, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretBetween(String value1, String value2) {
            addCriterion("APP_SECRET between", value1, value2, "appSecret");
            return (Criteria) this;
        }

        public Criteria andAppSecretNotBetween(String value1, String value2) {
            addCriterion("APP_SECRET not between", value1, value2, "appSecret");
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