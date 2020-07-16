package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysWechatChannelMchntInfoEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysWechatChannelMchntInfoEntityExample() {
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

        public Criteria andEMailIsNull() {
            addCriterion("E_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("E_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("E_MAIL =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("E_MAIL <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("E_MAIL >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("E_MAIL >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("E_MAIL <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("E_MAIL <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("E_MAIL like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("E_MAIL not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("E_MAIL in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("E_MAIL not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("E_MAIL between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("E_MAIL not between", value1, value2, "eMail");
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

        public Criteria andLicRegAddrIsNull() {
            addCriterion("LIC_REG_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrIsNotNull() {
            addCriterion("LIC_REG_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrEqualTo(Object value) {
            addCriterion("LIC_REG_ADDR =", value, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrNotEqualTo(Object value) {
            addCriterion("LIC_REG_ADDR <>", value, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrGreaterThan(Object value) {
            addCriterion("LIC_REG_ADDR >", value, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrGreaterThanOrEqualTo(Object value) {
            addCriterion("LIC_REG_ADDR >=", value, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrLessThan(Object value) {
            addCriterion("LIC_REG_ADDR <", value, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrLessThanOrEqualTo(Object value) {
            addCriterion("LIC_REG_ADDR <=", value, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrIn(List<Object> values) {
            addCriterion("LIC_REG_ADDR in", values, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrNotIn(List<Object> values) {
            addCriterion("LIC_REG_ADDR not in", values, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrBetween(Object value1, Object value2) {
            addCriterion("LIC_REG_ADDR between", value1, value2, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrNotBetween(Object value1, Object value2) {
            addCriterion("LIC_REG_ADDR not between", value1, value2, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicPhotoIsNull() {
            addCriterion("LIC_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andLicPhotoIsNotNull() {
            addCriterion("LIC_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andLicPhotoEqualTo(BigDecimal value) {
            addCriterion("LIC_PHOTO =", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoNotEqualTo(BigDecimal value) {
            addCriterion("LIC_PHOTO <>", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoGreaterThan(BigDecimal value) {
            addCriterion("LIC_PHOTO >", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIC_PHOTO >=", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoLessThan(BigDecimal value) {
            addCriterion("LIC_PHOTO <", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIC_PHOTO <=", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoIn(List<BigDecimal> values) {
            addCriterion("LIC_PHOTO in", values, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoNotIn(List<BigDecimal> values) {
            addCriterion("LIC_PHOTO not in", values, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIC_PHOTO between", value1, value2, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIC_PHOTO not between", value1, value2, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andBankActNameIsNull() {
            addCriterion("BANK_ACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankActNameIsNotNull() {
            addCriterion("BANK_ACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankActNameEqualTo(String value) {
            addCriterion("BANK_ACT_NAME =", value, "bankActName");
            return (Criteria) this;
        }

        public Criteria andBankActNameNotEqualTo(String value) {
            addCriterion("BANK_ACT_NAME <>", value, "bankActName");
            return (Criteria) this;
        }

        public Criteria andBankActNameGreaterThan(String value) {
            addCriterion("BANK_ACT_NAME >", value, "bankActName");
            return (Criteria) this;
        }

        public Criteria andBankActNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACT_NAME >=", value, "bankActName");
            return (Criteria) this;
        }

        public Criteria andBankActNameLessThan(String value) {
            addCriterion("BANK_ACT_NAME <", value, "bankActName");
            return (Criteria) this;
        }

        public Criteria andBankActNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACT_NAME <=", value, "bankActName");
            return (Criteria) this;
        }

        public Criteria andBankActNameIn(List<String> values) {
            addCriterion("BANK_ACT_NAME in", values, "bankActName");
            return (Criteria) this;
        }

        public Criteria andBankActNameNotIn(List<String> values) {
            addCriterion("BANK_ACT_NAME not in", values, "bankActName");
            return (Criteria) this;
        }

        public Criteria andBankActNameBetween(String value1, String value2) {
            addCriterion("BANK_ACT_NAME between", value1, value2, "bankActName");
            return (Criteria) this;
        }

        public Criteria andBankActNameNotBetween(String value1, String value2) {
            addCriterion("BANK_ACT_NAME not between", value1, value2, "bankActName");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNull() {
            addCriterion("BANK_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNotNull() {
            addCriterion("BANK_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoEqualTo(String value) {
            addCriterion("BANK_CARD_NO =", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotEqualTo(String value) {
            addCriterion("BANK_CARD_NO <>", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThan(String value) {
            addCriterion("BANK_CARD_NO >", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NO >=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThan(String value) {
            addCriterion("BANK_CARD_NO <", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_CARD_NO <=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLike(String value) {
            addCriterion("BANK_CARD_NO like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotLike(String value) {
            addCriterion("BANK_CARD_NO not like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIn(List<String> values) {
            addCriterion("BANK_CARD_NO in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotIn(List<String> values) {
            addCriterion("BANK_CARD_NO not in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NO between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotBetween(String value1, String value2) {
            addCriterion("BANK_CARD_NO not between", value1, value2, "bankCardNo");
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

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
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