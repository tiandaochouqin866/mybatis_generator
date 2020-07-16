package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysBranchActEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysBranchActEntityExample() {
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

        public Criteria andBankActTypeIsNull() {
            addCriterion("BANK_ACT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBankActTypeIsNotNull() {
            addCriterion("BANK_ACT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBankActTypeEqualTo(Short value) {
            addCriterion("BANK_ACT_TYPE =", value, "bankActType");
            return (Criteria) this;
        }

        public Criteria andBankActTypeNotEqualTo(Short value) {
            addCriterion("BANK_ACT_TYPE <>", value, "bankActType");
            return (Criteria) this;
        }

        public Criteria andBankActTypeGreaterThan(Short value) {
            addCriterion("BANK_ACT_TYPE >", value, "bankActType");
            return (Criteria) this;
        }

        public Criteria andBankActTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("BANK_ACT_TYPE >=", value, "bankActType");
            return (Criteria) this;
        }

        public Criteria andBankActTypeLessThan(Short value) {
            addCriterion("BANK_ACT_TYPE <", value, "bankActType");
            return (Criteria) this;
        }

        public Criteria andBankActTypeLessThanOrEqualTo(Short value) {
            addCriterion("BANK_ACT_TYPE <=", value, "bankActType");
            return (Criteria) this;
        }

        public Criteria andBankActTypeIn(List<Short> values) {
            addCriterion("BANK_ACT_TYPE in", values, "bankActType");
            return (Criteria) this;
        }

        public Criteria andBankActTypeNotIn(List<Short> values) {
            addCriterion("BANK_ACT_TYPE not in", values, "bankActType");
            return (Criteria) this;
        }

        public Criteria andBankActTypeBetween(Short value1, Short value2) {
            addCriterion("BANK_ACT_TYPE between", value1, value2, "bankActType");
            return (Criteria) this;
        }

        public Criteria andBankActTypeNotBetween(Short value1, Short value2) {
            addCriterion("BANK_ACT_TYPE not between", value1, value2, "bankActType");
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

        public Criteria andBankCardPhotoIsNull() {
            addCriterion("BANK_CARD_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoIsNotNull() {
            addCriterion("BANK_CARD_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoEqualTo(BigDecimal value) {
            addCriterion("BANK_CARD_PHOTO =", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoNotEqualTo(BigDecimal value) {
            addCriterion("BANK_CARD_PHOTO <>", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoGreaterThan(BigDecimal value) {
            addCriterion("BANK_CARD_PHOTO >", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_CARD_PHOTO >=", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoLessThan(BigDecimal value) {
            addCriterion("BANK_CARD_PHOTO <", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANK_CARD_PHOTO <=", value, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoIn(List<BigDecimal> values) {
            addCriterion("BANK_CARD_PHOTO in", values, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoNotIn(List<BigDecimal> values) {
            addCriterion("BANK_CARD_PHOTO not in", values, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_CARD_PHOTO between", value1, value2, "bankCardPhoto");
            return (Criteria) this;
        }

        public Criteria andBankCardPhotoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANK_CARD_PHOTO not between", value1, value2, "bankCardPhoto");
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

        public Criteria andProvinceCodeIsNull() {
            addCriterion("PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(Integer value) {
            addCriterion("PROVINCE_CODE =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(Integer value) {
            addCriterion("PROVINCE_CODE <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(Integer value) {
            addCriterion("PROVINCE_CODE >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROVINCE_CODE >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(Integer value) {
            addCriterion("PROVINCE_CODE <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(Integer value) {
            addCriterion("PROVINCE_CODE <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<Integer> values) {
            addCriterion("PROVINCE_CODE in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<Integer> values) {
            addCriterion("PROVINCE_CODE not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(Integer value1, Integer value2) {
            addCriterion("PROVINCE_CODE between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andCityCodeEqualTo(Integer value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(Integer value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(Integer value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(Integer value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(Integer value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<Integer> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<Integer> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(Integer value1, Integer value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameIsNull() {
            addCriterion("BANK_BRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameIsNotNull() {
            addCriterion("BANK_BRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameEqualTo(String value) {
            addCriterion("BANK_BRANCH_NAME =", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameNotEqualTo(String value) {
            addCriterion("BANK_BRANCH_NAME <>", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameGreaterThan(String value) {
            addCriterion("BANK_BRANCH_NAME >", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_BRANCH_NAME >=", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameLessThan(String value) {
            addCriterion("BANK_BRANCH_NAME <", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_BRANCH_NAME <=", value, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameIn(List<String> values) {
            addCriterion("BANK_BRANCH_NAME in", values, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameNotIn(List<String> values) {
            addCriterion("BANK_BRANCH_NAME not in", values, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameBetween(String value1, String value2) {
            addCriterion("BANK_BRANCH_NAME between", value1, value2, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andBankBranchNameNotBetween(String value1, String value2) {
            addCriterion("BANK_BRANCH_NAME not between", value1, value2, "bankBranchName");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNull() {
            addCriterion("QR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNotNull() {
            addCriterion("QR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeEqualTo(String value) {
            addCriterion("QR_CODE =", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotEqualTo(String value) {
            addCriterion("QR_CODE <>", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThan(String value) {
            addCriterion("QR_CODE >", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("QR_CODE >=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThan(String value) {
            addCriterion("QR_CODE <", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThanOrEqualTo(String value) {
            addCriterion("QR_CODE <=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLike(String value) {
            addCriterion("QR_CODE like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotLike(String value) {
            addCriterion("QR_CODE not like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeIn(List<String> values) {
            addCriterion("QR_CODE in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotIn(List<String> values) {
            addCriterion("QR_CODE not in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeBetween(String value1, String value2) {
            addCriterion("QR_CODE between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotBetween(String value1, String value2) {
            addCriterion("QR_CODE not between", value1, value2, "qrCode");
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

        public Criteria andBankCustomerNoIsNull() {
            addCriterion("BANK_CUSTOMER_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoIsNotNull() {
            addCriterion("BANK_CUSTOMER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoEqualTo(String value) {
            addCriterion("BANK_CUSTOMER_NO =", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoNotEqualTo(String value) {
            addCriterion("BANK_CUSTOMER_NO <>", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoGreaterThan(String value) {
            addCriterion("BANK_CUSTOMER_NO >", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_CUSTOMER_NO >=", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoLessThan(String value) {
            addCriterion("BANK_CUSTOMER_NO <", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_CUSTOMER_NO <=", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoLike(String value) {
            addCriterion("BANK_CUSTOMER_NO like", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoNotLike(String value) {
            addCriterion("BANK_CUSTOMER_NO not like", value, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoIn(List<String> values) {
            addCriterion("BANK_CUSTOMER_NO in", values, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoNotIn(List<String> values) {
            addCriterion("BANK_CUSTOMER_NO not in", values, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoBetween(String value1, String value2) {
            addCriterion("BANK_CUSTOMER_NO between", value1, value2, "bankCustomerNo");
            return (Criteria) this;
        }

        public Criteria andBankCustomerNoNotBetween(String value1, String value2) {
            addCriterion("BANK_CUSTOMER_NO not between", value1, value2, "bankCustomerNo");
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