package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysBranchContractEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysBranchContractEntityExample() {
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

        public Criteria andBusiDescIsNull() {
            addCriterion("BUSI_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBusiDescIsNotNull() {
            addCriterion("BUSI_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBusiDescEqualTo(String value) {
            addCriterion("BUSI_DESC =", value, "busiDesc");
            return (Criteria) this;
        }

        public Criteria andBusiDescNotEqualTo(String value) {
            addCriterion("BUSI_DESC <>", value, "busiDesc");
            return (Criteria) this;
        }

        public Criteria andBusiDescGreaterThan(String value) {
            addCriterion("BUSI_DESC >", value, "busiDesc");
            return (Criteria) this;
        }

        public Criteria andBusiDescGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_DESC >=", value, "busiDesc");
            return (Criteria) this;
        }

        public Criteria andBusiDescLessThan(String value) {
            addCriterion("BUSI_DESC <", value, "busiDesc");
            return (Criteria) this;
        }

        public Criteria andBusiDescLessThanOrEqualTo(String value) {
            addCriterion("BUSI_DESC <=", value, "busiDesc");
            return (Criteria) this;
        }

        public Criteria andBusiDescIn(List<String> values) {
            addCriterion("BUSI_DESC in", values, "busiDesc");
            return (Criteria) this;
        }

        public Criteria andBusiDescNotIn(List<String> values) {
            addCriterion("BUSI_DESC not in", values, "busiDesc");
            return (Criteria) this;
        }

        public Criteria andBusiDescBetween(String value1, String value2) {
            addCriterion("BUSI_DESC between", value1, value2, "busiDesc");
            return (Criteria) this;
        }

        public Criteria andBusiDescNotBetween(String value1, String value2) {
            addCriterion("BUSI_DESC not between", value1, value2, "busiDesc");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoIsNull() {
            addCriterion("BUSI_PLACE_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoIsNotNull() {
            addCriterion("BUSI_PLACE_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoEqualTo(String value) {
            addCriterion("BUSI_PLACE_PHOTO =", value, "busiPlacePhoto");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoNotEqualTo(String value) {
            addCriterion("BUSI_PLACE_PHOTO <>", value, "busiPlacePhoto");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoGreaterThan(String value) {
            addCriterion("BUSI_PLACE_PHOTO >", value, "busiPlacePhoto");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_PLACE_PHOTO >=", value, "busiPlacePhoto");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoLessThan(String value) {
            addCriterion("BUSI_PLACE_PHOTO <", value, "busiPlacePhoto");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoLessThanOrEqualTo(String value) {
            addCriterion("BUSI_PLACE_PHOTO <=", value, "busiPlacePhoto");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoLike(String value) {
            addCriterion("BUSI_PLACE_PHOTO like", value, "busiPlacePhoto");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoNotLike(String value) {
            addCriterion("BUSI_PLACE_PHOTO not like", value, "busiPlacePhoto");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoIn(List<String> values) {
            addCriterion("BUSI_PLACE_PHOTO in", values, "busiPlacePhoto");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoNotIn(List<String> values) {
            addCriterion("BUSI_PLACE_PHOTO not in", values, "busiPlacePhoto");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoBetween(String value1, String value2) {
            addCriterion("BUSI_PLACE_PHOTO between", value1, value2, "busiPlacePhoto");
            return (Criteria) this;
        }

        public Criteria andBusiPlacePhotoNotBetween(String value1, String value2) {
            addCriterion("BUSI_PLACE_PHOTO not between", value1, value2, "busiPlacePhoto");
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

        public Criteria andLicTypeEqualTo(Short value) {
            addCriterion("LIC_TYPE =", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeNotEqualTo(Short value) {
            addCriterion("LIC_TYPE <>", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeGreaterThan(Short value) {
            addCriterion("LIC_TYPE >", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("LIC_TYPE >=", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeLessThan(Short value) {
            addCriterion("LIC_TYPE <", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeLessThanOrEqualTo(Short value) {
            addCriterion("LIC_TYPE <=", value, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeIn(List<Short> values) {
            addCriterion("LIC_TYPE in", values, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeNotIn(List<Short> values) {
            addCriterion("LIC_TYPE not in", values, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeBetween(Short value1, Short value2) {
            addCriterion("LIC_TYPE between", value1, value2, "licType");
            return (Criteria) this;
        }

        public Criteria andLicTypeNotBetween(Short value1, Short value2) {
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

        public Criteria andLicPhotoIsNull() {
            addCriterion("LIC_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andLicPhotoIsNotNull() {
            addCriterion("LIC_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andLicPhotoEqualTo(String value) {
            addCriterion("LIC_PHOTO =", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoNotEqualTo(String value) {
            addCriterion("LIC_PHOTO <>", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoGreaterThan(String value) {
            addCriterion("LIC_PHOTO >", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("LIC_PHOTO >=", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoLessThan(String value) {
            addCriterion("LIC_PHOTO <", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoLessThanOrEqualTo(String value) {
            addCriterion("LIC_PHOTO <=", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoLike(String value) {
            addCriterion("LIC_PHOTO like", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoNotLike(String value) {
            addCriterion("LIC_PHOTO not like", value, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoIn(List<String> values) {
            addCriterion("LIC_PHOTO in", values, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoNotIn(List<String> values) {
            addCriterion("LIC_PHOTO not in", values, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoBetween(String value1, String value2) {
            addCriterion("LIC_PHOTO between", value1, value2, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPhotoNotBetween(String value1, String value2) {
            addCriterion("LIC_PHOTO not between", value1, value2, "licPhoto");
            return (Criteria) this;
        }

        public Criteria andLicPeriodIsNull() {
            addCriterion("LIC_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andLicPeriodIsNotNull() {
            addCriterion("LIC_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andLicPeriodEqualTo(String value) {
            addCriterion("LIC_PERIOD =", value, "licPeriod");
            return (Criteria) this;
        }

        public Criteria andLicPeriodNotEqualTo(String value) {
            addCriterion("LIC_PERIOD <>", value, "licPeriod");
            return (Criteria) this;
        }

        public Criteria andLicPeriodGreaterThan(String value) {
            addCriterion("LIC_PERIOD >", value, "licPeriod");
            return (Criteria) this;
        }

        public Criteria andLicPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("LIC_PERIOD >=", value, "licPeriod");
            return (Criteria) this;
        }

        public Criteria andLicPeriodLessThan(String value) {
            addCriterion("LIC_PERIOD <", value, "licPeriod");
            return (Criteria) this;
        }

        public Criteria andLicPeriodLessThanOrEqualTo(String value) {
            addCriterion("LIC_PERIOD <=", value, "licPeriod");
            return (Criteria) this;
        }

        public Criteria andLicPeriodLike(String value) {
            addCriterion("LIC_PERIOD like", value, "licPeriod");
            return (Criteria) this;
        }

        public Criteria andLicPeriodNotLike(String value) {
            addCriterion("LIC_PERIOD not like", value, "licPeriod");
            return (Criteria) this;
        }

        public Criteria andLicPeriodIn(List<String> values) {
            addCriterion("LIC_PERIOD in", values, "licPeriod");
            return (Criteria) this;
        }

        public Criteria andLicPeriodNotIn(List<String> values) {
            addCriterion("LIC_PERIOD not in", values, "licPeriod");
            return (Criteria) this;
        }

        public Criteria andLicPeriodBetween(String value1, String value2) {
            addCriterion("LIC_PERIOD between", value1, value2, "licPeriod");
            return (Criteria) this;
        }

        public Criteria andLicPeriodNotBetween(String value1, String value2) {
            addCriterion("LIC_PERIOD not between", value1, value2, "licPeriod");
            return (Criteria) this;
        }

        public Criteria andLicRegNameIsNull() {
            addCriterion("LIC_REG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLicRegNameIsNotNull() {
            addCriterion("LIC_REG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLicRegNameEqualTo(String value) {
            addCriterion("LIC_REG_NAME =", value, "licRegName");
            return (Criteria) this;
        }

        public Criteria andLicRegNameNotEqualTo(String value) {
            addCriterion("LIC_REG_NAME <>", value, "licRegName");
            return (Criteria) this;
        }

        public Criteria andLicRegNameGreaterThan(String value) {
            addCriterion("LIC_REG_NAME >", value, "licRegName");
            return (Criteria) this;
        }

        public Criteria andLicRegNameGreaterThanOrEqualTo(String value) {
            addCriterion("LIC_REG_NAME >=", value, "licRegName");
            return (Criteria) this;
        }

        public Criteria andLicRegNameLessThan(String value) {
            addCriterion("LIC_REG_NAME <", value, "licRegName");
            return (Criteria) this;
        }

        public Criteria andLicRegNameLessThanOrEqualTo(String value) {
            addCriterion("LIC_REG_NAME <=", value, "licRegName");
            return (Criteria) this;
        }

        public Criteria andLicRegNameIn(List<String> values) {
            addCriterion("LIC_REG_NAME in", values, "licRegName");
            return (Criteria) this;
        }

        public Criteria andLicRegNameNotIn(List<String> values) {
            addCriterion("LIC_REG_NAME not in", values, "licRegName");
            return (Criteria) this;
        }

        public Criteria andLicRegNameBetween(String value1, String value2) {
            addCriterion("LIC_REG_NAME between", value1, value2, "licRegName");
            return (Criteria) this;
        }

        public Criteria andLicRegNameNotBetween(String value1, String value2) {
            addCriterion("LIC_REG_NAME not between", value1, value2, "licRegName");
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

        public Criteria andLicRegAddrEqualTo(String value) {
            addCriterion("LIC_REG_ADDR =", value, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrNotEqualTo(String value) {
            addCriterion("LIC_REG_ADDR <>", value, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrGreaterThan(String value) {
            addCriterion("LIC_REG_ADDR >", value, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrGreaterThanOrEqualTo(String value) {
            addCriterion("LIC_REG_ADDR >=", value, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrLessThan(String value) {
            addCriterion("LIC_REG_ADDR <", value, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrLessThanOrEqualTo(String value) {
            addCriterion("LIC_REG_ADDR <=", value, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrIn(List<String> values) {
            addCriterion("LIC_REG_ADDR in", values, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrNotIn(List<String> values) {
            addCriterion("LIC_REG_ADDR not in", values, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrBetween(String value1, String value2) {
            addCriterion("LIC_REG_ADDR between", value1, value2, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLicRegAddrNotBetween(String value1, String value2) {
            addCriterion("LIC_REG_ADDR not between", value1, value2, "licRegAddr");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("LEGAL_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("LEGAL_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("LEGAL_PERSON =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("LEGAL_PERSON >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("LEGAL_PERSON <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("LEGAL_PERSON in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andAgentTypeIsNull() {
            addCriterion("AGENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAgentTypeIsNotNull() {
            addCriterion("AGENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAgentTypeEqualTo(Short value) {
            addCriterion("AGENT_TYPE =", value, "agentType");
            return (Criteria) this;
        }

        public Criteria andAgentTypeNotEqualTo(Short value) {
            addCriterion("AGENT_TYPE <>", value, "agentType");
            return (Criteria) this;
        }

        public Criteria andAgentTypeGreaterThan(Short value) {
            addCriterion("AGENT_TYPE >", value, "agentType");
            return (Criteria) this;
        }

        public Criteria andAgentTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("AGENT_TYPE >=", value, "agentType");
            return (Criteria) this;
        }

        public Criteria andAgentTypeLessThan(Short value) {
            addCriterion("AGENT_TYPE <", value, "agentType");
            return (Criteria) this;
        }

        public Criteria andAgentTypeLessThanOrEqualTo(Short value) {
            addCriterion("AGENT_TYPE <=", value, "agentType");
            return (Criteria) this;
        }

        public Criteria andAgentTypeIn(List<Short> values) {
            addCriterion("AGENT_TYPE in", values, "agentType");
            return (Criteria) this;
        }

        public Criteria andAgentTypeNotIn(List<Short> values) {
            addCriterion("AGENT_TYPE not in", values, "agentType");
            return (Criteria) this;
        }

        public Criteria andAgentTypeBetween(Short value1, Short value2) {
            addCriterion("AGENT_TYPE between", value1, value2, "agentType");
            return (Criteria) this;
        }

        public Criteria andAgentTypeNotBetween(Short value1, Short value2) {
            addCriterion("AGENT_TYPE not between", value1, value2, "agentType");
            return (Criteria) this;
        }

        public Criteria andLegalCertTypeIsNull() {
            addCriterion("LEGAL_CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLegalCertTypeIsNotNull() {
            addCriterion("LEGAL_CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLegalCertTypeEqualTo(Short value) {
            addCriterion("LEGAL_CERT_TYPE =", value, "legalCertType");
            return (Criteria) this;
        }

        public Criteria andLegalCertTypeNotEqualTo(Short value) {
            addCriterion("LEGAL_CERT_TYPE <>", value, "legalCertType");
            return (Criteria) this;
        }

        public Criteria andLegalCertTypeGreaterThan(Short value) {
            addCriterion("LEGAL_CERT_TYPE >", value, "legalCertType");
            return (Criteria) this;
        }

        public Criteria andLegalCertTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("LEGAL_CERT_TYPE >=", value, "legalCertType");
            return (Criteria) this;
        }

        public Criteria andLegalCertTypeLessThan(Short value) {
            addCriterion("LEGAL_CERT_TYPE <", value, "legalCertType");
            return (Criteria) this;
        }

        public Criteria andLegalCertTypeLessThanOrEqualTo(Short value) {
            addCriterion("LEGAL_CERT_TYPE <=", value, "legalCertType");
            return (Criteria) this;
        }

        public Criteria andLegalCertTypeIn(List<Short> values) {
            addCriterion("LEGAL_CERT_TYPE in", values, "legalCertType");
            return (Criteria) this;
        }

        public Criteria andLegalCertTypeNotIn(List<Short> values) {
            addCriterion("LEGAL_CERT_TYPE not in", values, "legalCertType");
            return (Criteria) this;
        }

        public Criteria andLegalCertTypeBetween(Short value1, Short value2) {
            addCriterion("LEGAL_CERT_TYPE between", value1, value2, "legalCertType");
            return (Criteria) this;
        }

        public Criteria andLegalCertTypeNotBetween(Short value1, Short value2) {
            addCriterion("LEGAL_CERT_TYPE not between", value1, value2, "legalCertType");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoFrontIsNull() {
            addCriterion("LEGAL_CERT_PHOTO_FRONT is null");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoFrontIsNotNull() {
            addCriterion("LEGAL_CERT_PHOTO_FRONT is not null");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoFrontEqualTo(BigDecimal value) {
            addCriterion("LEGAL_CERT_PHOTO_FRONT =", value, "legalCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoFrontNotEqualTo(BigDecimal value) {
            addCriterion("LEGAL_CERT_PHOTO_FRONT <>", value, "legalCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoFrontGreaterThan(BigDecimal value) {
            addCriterion("LEGAL_CERT_PHOTO_FRONT >", value, "legalCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoFrontGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEGAL_CERT_PHOTO_FRONT >=", value, "legalCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoFrontLessThan(BigDecimal value) {
            addCriterion("LEGAL_CERT_PHOTO_FRONT <", value, "legalCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoFrontLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEGAL_CERT_PHOTO_FRONT <=", value, "legalCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoFrontIn(List<BigDecimal> values) {
            addCriterion("LEGAL_CERT_PHOTO_FRONT in", values, "legalCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoFrontNotIn(List<BigDecimal> values) {
            addCriterion("LEGAL_CERT_PHOTO_FRONT not in", values, "legalCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoFrontBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEGAL_CERT_PHOTO_FRONT between", value1, value2, "legalCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoFrontNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEGAL_CERT_PHOTO_FRONT not between", value1, value2, "legalCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoBackIsNull() {
            addCriterion("LEGAL_CERT_PHOTO_BACK is null");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoBackIsNotNull() {
            addCriterion("LEGAL_CERT_PHOTO_BACK is not null");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoBackEqualTo(BigDecimal value) {
            addCriterion("LEGAL_CERT_PHOTO_BACK =", value, "legalCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoBackNotEqualTo(BigDecimal value) {
            addCriterion("LEGAL_CERT_PHOTO_BACK <>", value, "legalCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoBackGreaterThan(BigDecimal value) {
            addCriterion("LEGAL_CERT_PHOTO_BACK >", value, "legalCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoBackGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEGAL_CERT_PHOTO_BACK >=", value, "legalCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoBackLessThan(BigDecimal value) {
            addCriterion("LEGAL_CERT_PHOTO_BACK <", value, "legalCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoBackLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEGAL_CERT_PHOTO_BACK <=", value, "legalCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoBackIn(List<BigDecimal> values) {
            addCriterion("LEGAL_CERT_PHOTO_BACK in", values, "legalCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoBackNotIn(List<BigDecimal> values) {
            addCriterion("LEGAL_CERT_PHOTO_BACK not in", values, "legalCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoBackBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEGAL_CERT_PHOTO_BACK between", value1, value2, "legalCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andLegalCertPhotoBackNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEGAL_CERT_PHOTO_BACK not between", value1, value2, "legalCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoIsNull() {
            addCriterion("LEGAL_CERT_NO is null");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoIsNotNull() {
            addCriterion("LEGAL_CERT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoEqualTo(String value) {
            addCriterion("LEGAL_CERT_NO =", value, "legalCertNo");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoNotEqualTo(String value) {
            addCriterion("LEGAL_CERT_NO <>", value, "legalCertNo");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoGreaterThan(String value) {
            addCriterion("LEGAL_CERT_NO >", value, "legalCertNo");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_CERT_NO >=", value, "legalCertNo");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoLessThan(String value) {
            addCriterion("LEGAL_CERT_NO <", value, "legalCertNo");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_CERT_NO <=", value, "legalCertNo");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoLike(String value) {
            addCriterion("LEGAL_CERT_NO like", value, "legalCertNo");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoNotLike(String value) {
            addCriterion("LEGAL_CERT_NO not like", value, "legalCertNo");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoIn(List<String> values) {
            addCriterion("LEGAL_CERT_NO in", values, "legalCertNo");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoNotIn(List<String> values) {
            addCriterion("LEGAL_CERT_NO not in", values, "legalCertNo");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoBetween(String value1, String value2) {
            addCriterion("LEGAL_CERT_NO between", value1, value2, "legalCertNo");
            return (Criteria) this;
        }

        public Criteria andLegalCertNoNotBetween(String value1, String value2) {
            addCriterion("LEGAL_CERT_NO not between", value1, value2, "legalCertNo");
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

        public Criteria andLegalCertPeriodIsNull() {
            addCriterion("LEGAL_CERT_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andLegalCertPeriodIsNotNull() {
            addCriterion("LEGAL_CERT_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andLegalCertPeriodEqualTo(String value) {
            addCriterion("LEGAL_CERT_PERIOD =", value, "legalCertPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalCertPeriodNotEqualTo(String value) {
            addCriterion("LEGAL_CERT_PERIOD <>", value, "legalCertPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalCertPeriodGreaterThan(String value) {
            addCriterion("LEGAL_CERT_PERIOD >", value, "legalCertPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalCertPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_CERT_PERIOD >=", value, "legalCertPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalCertPeriodLessThan(String value) {
            addCriterion("LEGAL_CERT_PERIOD <", value, "legalCertPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalCertPeriodLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_CERT_PERIOD <=", value, "legalCertPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalCertPeriodLike(String value) {
            addCriterion("LEGAL_CERT_PERIOD like", value, "legalCertPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalCertPeriodNotLike(String value) {
            addCriterion("LEGAL_CERT_PERIOD not like", value, "legalCertPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalCertPeriodIn(List<String> values) {
            addCriterion("LEGAL_CERT_PERIOD in", values, "legalCertPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalCertPeriodNotIn(List<String> values) {
            addCriterion("LEGAL_CERT_PERIOD not in", values, "legalCertPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalCertPeriodBetween(String value1, String value2) {
            addCriterion("LEGAL_CERT_PERIOD between", value1, value2, "legalCertPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalCertPeriodNotBetween(String value1, String value2) {
            addCriterion("LEGAL_CERT_PERIOD not between", value1, value2, "legalCertPeriod");
            return (Criteria) this;
        }

        public Criteria andAgentCertTypeIsNull() {
            addCriterion("AGENT_CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAgentCertTypeIsNotNull() {
            addCriterion("AGENT_CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCertTypeEqualTo(Short value) {
            addCriterion("AGENT_CERT_TYPE =", value, "agentCertType");
            return (Criteria) this;
        }

        public Criteria andAgentCertTypeNotEqualTo(Short value) {
            addCriterion("AGENT_CERT_TYPE <>", value, "agentCertType");
            return (Criteria) this;
        }

        public Criteria andAgentCertTypeGreaterThan(Short value) {
            addCriterion("AGENT_CERT_TYPE >", value, "agentCertType");
            return (Criteria) this;
        }

        public Criteria andAgentCertTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("AGENT_CERT_TYPE >=", value, "agentCertType");
            return (Criteria) this;
        }

        public Criteria andAgentCertTypeLessThan(Short value) {
            addCriterion("AGENT_CERT_TYPE <", value, "agentCertType");
            return (Criteria) this;
        }

        public Criteria andAgentCertTypeLessThanOrEqualTo(Short value) {
            addCriterion("AGENT_CERT_TYPE <=", value, "agentCertType");
            return (Criteria) this;
        }

        public Criteria andAgentCertTypeIn(List<Short> values) {
            addCriterion("AGENT_CERT_TYPE in", values, "agentCertType");
            return (Criteria) this;
        }

        public Criteria andAgentCertTypeNotIn(List<Short> values) {
            addCriterion("AGENT_CERT_TYPE not in", values, "agentCertType");
            return (Criteria) this;
        }

        public Criteria andAgentCertTypeBetween(Short value1, Short value2) {
            addCriterion("AGENT_CERT_TYPE between", value1, value2, "agentCertType");
            return (Criteria) this;
        }

        public Criteria andAgentCertTypeNotBetween(Short value1, Short value2) {
            addCriterion("AGENT_CERT_TYPE not between", value1, value2, "agentCertType");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoFrontIsNull() {
            addCriterion("AGENT_CERT_PHOTO_FRONT is null");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoFrontIsNotNull() {
            addCriterion("AGENT_CERT_PHOTO_FRONT is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoFrontEqualTo(BigDecimal value) {
            addCriterion("AGENT_CERT_PHOTO_FRONT =", value, "agentCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoFrontNotEqualTo(BigDecimal value) {
            addCriterion("AGENT_CERT_PHOTO_FRONT <>", value, "agentCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoFrontGreaterThan(BigDecimal value) {
            addCriterion("AGENT_CERT_PHOTO_FRONT >", value, "agentCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoFrontGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AGENT_CERT_PHOTO_FRONT >=", value, "agentCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoFrontLessThan(BigDecimal value) {
            addCriterion("AGENT_CERT_PHOTO_FRONT <", value, "agentCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoFrontLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AGENT_CERT_PHOTO_FRONT <=", value, "agentCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoFrontIn(List<BigDecimal> values) {
            addCriterion("AGENT_CERT_PHOTO_FRONT in", values, "agentCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoFrontNotIn(List<BigDecimal> values) {
            addCriterion("AGENT_CERT_PHOTO_FRONT not in", values, "agentCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoFrontBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGENT_CERT_PHOTO_FRONT between", value1, value2, "agentCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoFrontNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGENT_CERT_PHOTO_FRONT not between", value1, value2, "agentCertPhotoFront");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoBackIsNull() {
            addCriterion("AGENT_CERT_PHOTO_BACK is null");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoBackIsNotNull() {
            addCriterion("AGENT_CERT_PHOTO_BACK is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoBackEqualTo(BigDecimal value) {
            addCriterion("AGENT_CERT_PHOTO_BACK =", value, "agentCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoBackNotEqualTo(BigDecimal value) {
            addCriterion("AGENT_CERT_PHOTO_BACK <>", value, "agentCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoBackGreaterThan(BigDecimal value) {
            addCriterion("AGENT_CERT_PHOTO_BACK >", value, "agentCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoBackGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AGENT_CERT_PHOTO_BACK >=", value, "agentCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoBackLessThan(BigDecimal value) {
            addCriterion("AGENT_CERT_PHOTO_BACK <", value, "agentCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoBackLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AGENT_CERT_PHOTO_BACK <=", value, "agentCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoBackIn(List<BigDecimal> values) {
            addCriterion("AGENT_CERT_PHOTO_BACK in", values, "agentCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoBackNotIn(List<BigDecimal> values) {
            addCriterion("AGENT_CERT_PHOTO_BACK not in", values, "agentCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoBackBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGENT_CERT_PHOTO_BACK between", value1, value2, "agentCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentCertPhotoBackNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGENT_CERT_PHOTO_BACK not between", value1, value2, "agentCertPhotoBack");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoIsNull() {
            addCriterion("AGENT_CERT_NO is null");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoIsNotNull() {
            addCriterion("AGENT_CERT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoEqualTo(String value) {
            addCriterion("AGENT_CERT_NO =", value, "agentCertNo");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoNotEqualTo(String value) {
            addCriterion("AGENT_CERT_NO <>", value, "agentCertNo");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoGreaterThan(String value) {
            addCriterion("AGENT_CERT_NO >", value, "agentCertNo");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_CERT_NO >=", value, "agentCertNo");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoLessThan(String value) {
            addCriterion("AGENT_CERT_NO <", value, "agentCertNo");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoLessThanOrEqualTo(String value) {
            addCriterion("AGENT_CERT_NO <=", value, "agentCertNo");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoLike(String value) {
            addCriterion("AGENT_CERT_NO like", value, "agentCertNo");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoNotLike(String value) {
            addCriterion("AGENT_CERT_NO not like", value, "agentCertNo");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoIn(List<String> values) {
            addCriterion("AGENT_CERT_NO in", values, "agentCertNo");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoNotIn(List<String> values) {
            addCriterion("AGENT_CERT_NO not in", values, "agentCertNo");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoBetween(String value1, String value2) {
            addCriterion("AGENT_CERT_NO between", value1, value2, "agentCertNo");
            return (Criteria) this;
        }

        public Criteria andAgentCertNoNotBetween(String value1, String value2) {
            addCriterion("AGENT_CERT_NO not between", value1, value2, "agentCertNo");
            return (Criteria) this;
        }

        public Criteria andAgentCertNameIsNull() {
            addCriterion("AGENT_CERT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAgentCertNameIsNotNull() {
            addCriterion("AGENT_CERT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCertNameEqualTo(String value) {
            addCriterion("AGENT_CERT_NAME =", value, "agentCertName");
            return (Criteria) this;
        }

        public Criteria andAgentCertNameNotEqualTo(String value) {
            addCriterion("AGENT_CERT_NAME <>", value, "agentCertName");
            return (Criteria) this;
        }

        public Criteria andAgentCertNameGreaterThan(String value) {
            addCriterion("AGENT_CERT_NAME >", value, "agentCertName");
            return (Criteria) this;
        }

        public Criteria andAgentCertNameGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_CERT_NAME >=", value, "agentCertName");
            return (Criteria) this;
        }

        public Criteria andAgentCertNameLessThan(String value) {
            addCriterion("AGENT_CERT_NAME <", value, "agentCertName");
            return (Criteria) this;
        }

        public Criteria andAgentCertNameLessThanOrEqualTo(String value) {
            addCriterion("AGENT_CERT_NAME <=", value, "agentCertName");
            return (Criteria) this;
        }

        public Criteria andAgentCertNameIn(List<String> values) {
            addCriterion("AGENT_CERT_NAME in", values, "agentCertName");
            return (Criteria) this;
        }

        public Criteria andAgentCertNameNotIn(List<String> values) {
            addCriterion("AGENT_CERT_NAME not in", values, "agentCertName");
            return (Criteria) this;
        }

        public Criteria andAgentCertNameBetween(String value1, String value2) {
            addCriterion("AGENT_CERT_NAME between", value1, value2, "agentCertName");
            return (Criteria) this;
        }

        public Criteria andAgentCertNameNotBetween(String value1, String value2) {
            addCriterion("AGENT_CERT_NAME not between", value1, value2, "agentCertName");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodIsNull() {
            addCriterion("AGENT_CERT_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodIsNotNull() {
            addCriterion("AGENT_CERT_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodEqualTo(String value) {
            addCriterion("AGENT_CERT_PERIOD =", value, "agentCertPeriod");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodNotEqualTo(String value) {
            addCriterion("AGENT_CERT_PERIOD <>", value, "agentCertPeriod");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodGreaterThan(String value) {
            addCriterion("AGENT_CERT_PERIOD >", value, "agentCertPeriod");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_CERT_PERIOD >=", value, "agentCertPeriod");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodLessThan(String value) {
            addCriterion("AGENT_CERT_PERIOD <", value, "agentCertPeriod");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodLessThanOrEqualTo(String value) {
            addCriterion("AGENT_CERT_PERIOD <=", value, "agentCertPeriod");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodLike(String value) {
            addCriterion("AGENT_CERT_PERIOD like", value, "agentCertPeriod");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodNotLike(String value) {
            addCriterion("AGENT_CERT_PERIOD not like", value, "agentCertPeriod");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodIn(List<String> values) {
            addCriterion("AGENT_CERT_PERIOD in", values, "agentCertPeriod");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodNotIn(List<String> values) {
            addCriterion("AGENT_CERT_PERIOD not in", values, "agentCertPeriod");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodBetween(String value1, String value2) {
            addCriterion("AGENT_CERT_PERIOD between", value1, value2, "agentCertPeriod");
            return (Criteria) this;
        }

        public Criteria andAgentCertPeriodNotBetween(String value1, String value2) {
            addCriterion("AGENT_CERT_PERIOD not between", value1, value2, "agentCertPeriod");
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

        public Criteria andTerminalFuncOpenIsNull() {
            addCriterion("TERMINAL_FUNC_OPEN is null");
            return (Criteria) this;
        }

        public Criteria andTerminalFuncOpenIsNotNull() {
            addCriterion("TERMINAL_FUNC_OPEN is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalFuncOpenEqualTo(String value) {
            addCriterion("TERMINAL_FUNC_OPEN =", value, "terminalFuncOpen");
            return (Criteria) this;
        }

        public Criteria andTerminalFuncOpenNotEqualTo(String value) {
            addCriterion("TERMINAL_FUNC_OPEN <>", value, "terminalFuncOpen");
            return (Criteria) this;
        }

        public Criteria andTerminalFuncOpenGreaterThan(String value) {
            addCriterion("TERMINAL_FUNC_OPEN >", value, "terminalFuncOpen");
            return (Criteria) this;
        }

        public Criteria andTerminalFuncOpenGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_FUNC_OPEN >=", value, "terminalFuncOpen");
            return (Criteria) this;
        }

        public Criteria andTerminalFuncOpenLessThan(String value) {
            addCriterion("TERMINAL_FUNC_OPEN <", value, "terminalFuncOpen");
            return (Criteria) this;
        }

        public Criteria andTerminalFuncOpenLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_FUNC_OPEN <=", value, "terminalFuncOpen");
            return (Criteria) this;
        }

        public Criteria andTerminalFuncOpenLike(String value) {
            addCriterion("TERMINAL_FUNC_OPEN like", value, "terminalFuncOpen");
            return (Criteria) this;
        }

        public Criteria andTerminalFuncOpenNotLike(String value) {
            addCriterion("TERMINAL_FUNC_OPEN not like", value, "terminalFuncOpen");
            return (Criteria) this;
        }

        public Criteria andTerminalFuncOpenIn(List<String> values) {
            addCriterion("TERMINAL_FUNC_OPEN in", values, "terminalFuncOpen");
            return (Criteria) this;
        }

        public Criteria andTerminalFuncOpenNotIn(List<String> values) {
            addCriterion("TERMINAL_FUNC_OPEN not in", values, "terminalFuncOpen");
            return (Criteria) this;
        }

        public Criteria andTerminalFuncOpenBetween(String value1, String value2) {
            addCriterion("TERMINAL_FUNC_OPEN between", value1, value2, "terminalFuncOpen");
            return (Criteria) this;
        }

        public Criteria andTerminalFuncOpenNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_FUNC_OPEN not between", value1, value2, "terminalFuncOpen");
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

        public Criteria andDistrictCodeIsNull() {
            addCriterion("DISTRICT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIsNotNull() {
            addCriterion("DISTRICT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeEqualTo(Integer value) {
            addCriterion("DISTRICT_CODE =", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotEqualTo(Integer value) {
            addCriterion("DISTRICT_CODE <>", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThan(Integer value) {
            addCriterion("DISTRICT_CODE >", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DISTRICT_CODE >=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThan(Integer value) {
            addCriterion("DISTRICT_CODE <", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThanOrEqualTo(Integer value) {
            addCriterion("DISTRICT_CODE <=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIn(List<Integer> values) {
            addCriterion("DISTRICT_CODE in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotIn(List<Integer> values) {
            addCriterion("DISTRICT_CODE not in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeBetween(Integer value1, Integer value2) {
            addCriterion("DISTRICT_CODE between", value1, value2, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andPositionLatitudeIsNull() {
            addCriterion("POSITION_LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andPositionLatitudeIsNotNull() {
            addCriterion("POSITION_LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andPositionLatitudeEqualTo(String value) {
            addCriterion("POSITION_LATITUDE =", value, "positionLatitude");
            return (Criteria) this;
        }

        public Criteria andPositionLatitudeNotEqualTo(String value) {
            addCriterion("POSITION_LATITUDE <>", value, "positionLatitude");
            return (Criteria) this;
        }

        public Criteria andPositionLatitudeGreaterThan(String value) {
            addCriterion("POSITION_LATITUDE >", value, "positionLatitude");
            return (Criteria) this;
        }

        public Criteria andPositionLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_LATITUDE >=", value, "positionLatitude");
            return (Criteria) this;
        }

        public Criteria andPositionLatitudeLessThan(String value) {
            addCriterion("POSITION_LATITUDE <", value, "positionLatitude");
            return (Criteria) this;
        }

        public Criteria andPositionLatitudeLessThanOrEqualTo(String value) {
            addCriterion("POSITION_LATITUDE <=", value, "positionLatitude");
            return (Criteria) this;
        }

        public Criteria andPositionLatitudeLike(String value) {
            addCriterion("POSITION_LATITUDE like", value, "positionLatitude");
            return (Criteria) this;
        }

        public Criteria andPositionLatitudeNotLike(String value) {
            addCriterion("POSITION_LATITUDE not like", value, "positionLatitude");
            return (Criteria) this;
        }

        public Criteria andPositionLatitudeIn(List<String> values) {
            addCriterion("POSITION_LATITUDE in", values, "positionLatitude");
            return (Criteria) this;
        }

        public Criteria andPositionLatitudeNotIn(List<String> values) {
            addCriterion("POSITION_LATITUDE not in", values, "positionLatitude");
            return (Criteria) this;
        }

        public Criteria andPositionLatitudeBetween(String value1, String value2) {
            addCriterion("POSITION_LATITUDE between", value1, value2, "positionLatitude");
            return (Criteria) this;
        }

        public Criteria andPositionLatitudeNotBetween(String value1, String value2) {
            addCriterion("POSITION_LATITUDE not between", value1, value2, "positionLatitude");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeIsNull() {
            addCriterion("POSITION_LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeIsNotNull() {
            addCriterion("POSITION_LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeEqualTo(String value) {
            addCriterion("POSITION_LONGITUDE =", value, "positionLongitude");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeNotEqualTo(String value) {
            addCriterion("POSITION_LONGITUDE <>", value, "positionLongitude");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeGreaterThan(String value) {
            addCriterion("POSITION_LONGITUDE >", value, "positionLongitude");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_LONGITUDE >=", value, "positionLongitude");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeLessThan(String value) {
            addCriterion("POSITION_LONGITUDE <", value, "positionLongitude");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeLessThanOrEqualTo(String value) {
            addCriterion("POSITION_LONGITUDE <=", value, "positionLongitude");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeLike(String value) {
            addCriterion("POSITION_LONGITUDE like", value, "positionLongitude");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeNotLike(String value) {
            addCriterion("POSITION_LONGITUDE not like", value, "positionLongitude");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeIn(List<String> values) {
            addCriterion("POSITION_LONGITUDE in", values, "positionLongitude");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeNotIn(List<String> values) {
            addCriterion("POSITION_LONGITUDE not in", values, "positionLongitude");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeBetween(String value1, String value2) {
            addCriterion("POSITION_LONGITUDE between", value1, value2, "positionLongitude");
            return (Criteria) this;
        }

        public Criteria andPositionLongitudeNotBetween(String value1, String value2) {
            addCriterion("POSITION_LONGITUDE not between", value1, value2, "positionLongitude");
            return (Criteria) this;
        }

        public Criteria andContractPhotosIsNull() {
            addCriterion("CONTRACT_PHOTOS is null");
            return (Criteria) this;
        }

        public Criteria andContractPhotosIsNotNull() {
            addCriterion("CONTRACT_PHOTOS is not null");
            return (Criteria) this;
        }

        public Criteria andContractPhotosEqualTo(String value) {
            addCriterion("CONTRACT_PHOTOS =", value, "contractPhotos");
            return (Criteria) this;
        }

        public Criteria andContractPhotosNotEqualTo(String value) {
            addCriterion("CONTRACT_PHOTOS <>", value, "contractPhotos");
            return (Criteria) this;
        }

        public Criteria andContractPhotosGreaterThan(String value) {
            addCriterion("CONTRACT_PHOTOS >", value, "contractPhotos");
            return (Criteria) this;
        }

        public Criteria andContractPhotosGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_PHOTOS >=", value, "contractPhotos");
            return (Criteria) this;
        }

        public Criteria andContractPhotosLessThan(String value) {
            addCriterion("CONTRACT_PHOTOS <", value, "contractPhotos");
            return (Criteria) this;
        }

        public Criteria andContractPhotosLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_PHOTOS <=", value, "contractPhotos");
            return (Criteria) this;
        }

        public Criteria andContractPhotosLike(String value) {
            addCriterion("CONTRACT_PHOTOS like", value, "contractPhotos");
            return (Criteria) this;
        }

        public Criteria andContractPhotosNotLike(String value) {
            addCriterion("CONTRACT_PHOTOS not like", value, "contractPhotos");
            return (Criteria) this;
        }

        public Criteria andContractPhotosIn(List<String> values) {
            addCriterion("CONTRACT_PHOTOS in", values, "contractPhotos");
            return (Criteria) this;
        }

        public Criteria andContractPhotosNotIn(List<String> values) {
            addCriterion("CONTRACT_PHOTOS not in", values, "contractPhotos");
            return (Criteria) this;
        }

        public Criteria andContractPhotosBetween(String value1, String value2) {
            addCriterion("CONTRACT_PHOTOS between", value1, value2, "contractPhotos");
            return (Criteria) this;
        }

        public Criteria andContractPhotosNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_PHOTOS not between", value1, value2, "contractPhotos");
            return (Criteria) this;
        }

        public Criteria andApplyWayIsNull() {
            addCriterion("APPLY_WAY is null");
            return (Criteria) this;
        }

        public Criteria andApplyWayIsNotNull() {
            addCriterion("APPLY_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andApplyWayEqualTo(Short value) {
            addCriterion("APPLY_WAY =", value, "applyWay");
            return (Criteria) this;
        }

        public Criteria andApplyWayNotEqualTo(Short value) {
            addCriterion("APPLY_WAY <>", value, "applyWay");
            return (Criteria) this;
        }

        public Criteria andApplyWayGreaterThan(Short value) {
            addCriterion("APPLY_WAY >", value, "applyWay");
            return (Criteria) this;
        }

        public Criteria andApplyWayGreaterThanOrEqualTo(Short value) {
            addCriterion("APPLY_WAY >=", value, "applyWay");
            return (Criteria) this;
        }

        public Criteria andApplyWayLessThan(Short value) {
            addCriterion("APPLY_WAY <", value, "applyWay");
            return (Criteria) this;
        }

        public Criteria andApplyWayLessThanOrEqualTo(Short value) {
            addCriterion("APPLY_WAY <=", value, "applyWay");
            return (Criteria) this;
        }

        public Criteria andApplyWayIn(List<Short> values) {
            addCriterion("APPLY_WAY in", values, "applyWay");
            return (Criteria) this;
        }

        public Criteria andApplyWayNotIn(List<Short> values) {
            addCriterion("APPLY_WAY not in", values, "applyWay");
            return (Criteria) this;
        }

        public Criteria andApplyWayBetween(Short value1, Short value2) {
            addCriterion("APPLY_WAY between", value1, value2, "applyWay");
            return (Criteria) this;
        }

        public Criteria andApplyWayNotBetween(Short value1, Short value2) {
            addCriterion("APPLY_WAY not between", value1, value2, "applyWay");
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

        public Criteria andOtherLicTypeIsNull() {
            addCriterion("OTHER_LIC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOtherLicTypeIsNotNull() {
            addCriterion("OTHER_LIC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherLicTypeEqualTo(String value) {
            addCriterion("OTHER_LIC_TYPE =", value, "otherLicType");
            return (Criteria) this;
        }

        public Criteria andOtherLicTypeNotEqualTo(String value) {
            addCriterion("OTHER_LIC_TYPE <>", value, "otherLicType");
            return (Criteria) this;
        }

        public Criteria andOtherLicTypeGreaterThan(String value) {
            addCriterion("OTHER_LIC_TYPE >", value, "otherLicType");
            return (Criteria) this;
        }

        public Criteria andOtherLicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_LIC_TYPE >=", value, "otherLicType");
            return (Criteria) this;
        }

        public Criteria andOtherLicTypeLessThan(String value) {
            addCriterion("OTHER_LIC_TYPE <", value, "otherLicType");
            return (Criteria) this;
        }

        public Criteria andOtherLicTypeLessThanOrEqualTo(String value) {
            addCriterion("OTHER_LIC_TYPE <=", value, "otherLicType");
            return (Criteria) this;
        }

        public Criteria andOtherLicTypeIn(List<String> values) {
            addCriterion("OTHER_LIC_TYPE in", values, "otherLicType");
            return (Criteria) this;
        }

        public Criteria andOtherLicTypeNotIn(List<String> values) {
            addCriterion("OTHER_LIC_TYPE not in", values, "otherLicType");
            return (Criteria) this;
        }

        public Criteria andOtherLicTypeBetween(String value1, String value2) {
            addCriterion("OTHER_LIC_TYPE between", value1, value2, "otherLicType");
            return (Criteria) this;
        }

        public Criteria andOtherLicTypeNotBetween(String value1, String value2) {
            addCriterion("OTHER_LIC_TYPE not between", value1, value2, "otherLicType");
            return (Criteria) this;
        }

        public Criteria andOtherLegalCertTypeIsNull() {
            addCriterion("OTHER_LEGAL_CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOtherLegalCertTypeIsNotNull() {
            addCriterion("OTHER_LEGAL_CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherLegalCertTypeEqualTo(String value) {
            addCriterion("OTHER_LEGAL_CERT_TYPE =", value, "otherLegalCertType");
            return (Criteria) this;
        }

        public Criteria andOtherLegalCertTypeNotEqualTo(String value) {
            addCriterion("OTHER_LEGAL_CERT_TYPE <>", value, "otherLegalCertType");
            return (Criteria) this;
        }

        public Criteria andOtherLegalCertTypeGreaterThan(String value) {
            addCriterion("OTHER_LEGAL_CERT_TYPE >", value, "otherLegalCertType");
            return (Criteria) this;
        }

        public Criteria andOtherLegalCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_LEGAL_CERT_TYPE >=", value, "otherLegalCertType");
            return (Criteria) this;
        }

        public Criteria andOtherLegalCertTypeLessThan(String value) {
            addCriterion("OTHER_LEGAL_CERT_TYPE <", value, "otherLegalCertType");
            return (Criteria) this;
        }

        public Criteria andOtherLegalCertTypeLessThanOrEqualTo(String value) {
            addCriterion("OTHER_LEGAL_CERT_TYPE <=", value, "otherLegalCertType");
            return (Criteria) this;
        }

        public Criteria andOtherLegalCertTypeIn(List<String> values) {
            addCriterion("OTHER_LEGAL_CERT_TYPE in", values, "otherLegalCertType");
            return (Criteria) this;
        }

        public Criteria andOtherLegalCertTypeNotIn(List<String> values) {
            addCriterion("OTHER_LEGAL_CERT_TYPE not in", values, "otherLegalCertType");
            return (Criteria) this;
        }

        public Criteria andOtherLegalCertTypeBetween(String value1, String value2) {
            addCriterion("OTHER_LEGAL_CERT_TYPE between", value1, value2, "otherLegalCertType");
            return (Criteria) this;
        }

        public Criteria andOtherLegalCertTypeNotBetween(String value1, String value2) {
            addCriterion("OTHER_LEGAL_CERT_TYPE not between", value1, value2, "otherLegalCertType");
            return (Criteria) this;
        }

        public Criteria andOtherAgentCertTypeIsNull() {
            addCriterion("OTHER_AGENT_CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOtherAgentCertTypeIsNotNull() {
            addCriterion("OTHER_AGENT_CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherAgentCertTypeEqualTo(String value) {
            addCriterion("OTHER_AGENT_CERT_TYPE =", value, "otherAgentCertType");
            return (Criteria) this;
        }

        public Criteria andOtherAgentCertTypeNotEqualTo(String value) {
            addCriterion("OTHER_AGENT_CERT_TYPE <>", value, "otherAgentCertType");
            return (Criteria) this;
        }

        public Criteria andOtherAgentCertTypeGreaterThan(String value) {
            addCriterion("OTHER_AGENT_CERT_TYPE >", value, "otherAgentCertType");
            return (Criteria) this;
        }

        public Criteria andOtherAgentCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_AGENT_CERT_TYPE >=", value, "otherAgentCertType");
            return (Criteria) this;
        }

        public Criteria andOtherAgentCertTypeLessThan(String value) {
            addCriterion("OTHER_AGENT_CERT_TYPE <", value, "otherAgentCertType");
            return (Criteria) this;
        }

        public Criteria andOtherAgentCertTypeLessThanOrEqualTo(String value) {
            addCriterion("OTHER_AGENT_CERT_TYPE <=", value, "otherAgentCertType");
            return (Criteria) this;
        }

        public Criteria andOtherAgentCertTypeIn(List<String> values) {
            addCriterion("OTHER_AGENT_CERT_TYPE in", values, "otherAgentCertType");
            return (Criteria) this;
        }

        public Criteria andOtherAgentCertTypeNotIn(List<String> values) {
            addCriterion("OTHER_AGENT_CERT_TYPE not in", values, "otherAgentCertType");
            return (Criteria) this;
        }

        public Criteria andOtherAgentCertTypeBetween(String value1, String value2) {
            addCriterion("OTHER_AGENT_CERT_TYPE between", value1, value2, "otherAgentCertType");
            return (Criteria) this;
        }

        public Criteria andOtherAgentCertTypeNotBetween(String value1, String value2) {
            addCriterion("OTHER_AGENT_CERT_TYPE not between", value1, value2, "otherAgentCertType");
            return (Criteria) this;
        }

        public Criteria andIcInfoCheckIsNull() {
            addCriterion("IC_INFO_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andIcInfoCheckIsNotNull() {
            addCriterion("IC_INFO_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIcInfoCheckEqualTo(Short value) {
            addCriterion("IC_INFO_CHECK =", value, "icInfoCheck");
            return (Criteria) this;
        }

        public Criteria andIcInfoCheckNotEqualTo(Short value) {
            addCriterion("IC_INFO_CHECK <>", value, "icInfoCheck");
            return (Criteria) this;
        }

        public Criteria andIcInfoCheckGreaterThan(Short value) {
            addCriterion("IC_INFO_CHECK >", value, "icInfoCheck");
            return (Criteria) this;
        }

        public Criteria andIcInfoCheckGreaterThanOrEqualTo(Short value) {
            addCriterion("IC_INFO_CHECK >=", value, "icInfoCheck");
            return (Criteria) this;
        }

        public Criteria andIcInfoCheckLessThan(Short value) {
            addCriterion("IC_INFO_CHECK <", value, "icInfoCheck");
            return (Criteria) this;
        }

        public Criteria andIcInfoCheckLessThanOrEqualTo(Short value) {
            addCriterion("IC_INFO_CHECK <=", value, "icInfoCheck");
            return (Criteria) this;
        }

        public Criteria andIcInfoCheckIn(List<Short> values) {
            addCriterion("IC_INFO_CHECK in", values, "icInfoCheck");
            return (Criteria) this;
        }

        public Criteria andIcInfoCheckNotIn(List<Short> values) {
            addCriterion("IC_INFO_CHECK not in", values, "icInfoCheck");
            return (Criteria) this;
        }

        public Criteria andIcInfoCheckBetween(Short value1, Short value2) {
            addCriterion("IC_INFO_CHECK between", value1, value2, "icInfoCheck");
            return (Criteria) this;
        }

        public Criteria andIcInfoCheckNotBetween(Short value1, Short value2) {
            addCriterion("IC_INFO_CHECK not between", value1, value2, "icInfoCheck");
            return (Criteria) this;
        }

        public Criteria andLegalCertCheckIsNull() {
            addCriterion("LEGAL_CERT_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andLegalCertCheckIsNotNull() {
            addCriterion("LEGAL_CERT_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andLegalCertCheckEqualTo(Short value) {
            addCriterion("LEGAL_CERT_CHECK =", value, "legalCertCheck");
            return (Criteria) this;
        }

        public Criteria andLegalCertCheckNotEqualTo(Short value) {
            addCriterion("LEGAL_CERT_CHECK <>", value, "legalCertCheck");
            return (Criteria) this;
        }

        public Criteria andLegalCertCheckGreaterThan(Short value) {
            addCriterion("LEGAL_CERT_CHECK >", value, "legalCertCheck");
            return (Criteria) this;
        }

        public Criteria andLegalCertCheckGreaterThanOrEqualTo(Short value) {
            addCriterion("LEGAL_CERT_CHECK >=", value, "legalCertCheck");
            return (Criteria) this;
        }

        public Criteria andLegalCertCheckLessThan(Short value) {
            addCriterion("LEGAL_CERT_CHECK <", value, "legalCertCheck");
            return (Criteria) this;
        }

        public Criteria andLegalCertCheckLessThanOrEqualTo(Short value) {
            addCriterion("LEGAL_CERT_CHECK <=", value, "legalCertCheck");
            return (Criteria) this;
        }

        public Criteria andLegalCertCheckIn(List<Short> values) {
            addCriterion("LEGAL_CERT_CHECK in", values, "legalCertCheck");
            return (Criteria) this;
        }

        public Criteria andLegalCertCheckNotIn(List<Short> values) {
            addCriterion("LEGAL_CERT_CHECK not in", values, "legalCertCheck");
            return (Criteria) this;
        }

        public Criteria andLegalCertCheckBetween(Short value1, Short value2) {
            addCriterion("LEGAL_CERT_CHECK between", value1, value2, "legalCertCheck");
            return (Criteria) this;
        }

        public Criteria andLegalCertCheckNotBetween(Short value1, Short value2) {
            addCriterion("LEGAL_CERT_CHECK not between", value1, value2, "legalCertCheck");
            return (Criteria) this;
        }

        public Criteria andBankActCheckIsNull() {
            addCriterion("BANK_ACT_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andBankActCheckIsNotNull() {
            addCriterion("BANK_ACT_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andBankActCheckEqualTo(Short value) {
            addCriterion("BANK_ACT_CHECK =", value, "bankActCheck");
            return (Criteria) this;
        }

        public Criteria andBankActCheckNotEqualTo(Short value) {
            addCriterion("BANK_ACT_CHECK <>", value, "bankActCheck");
            return (Criteria) this;
        }

        public Criteria andBankActCheckGreaterThan(Short value) {
            addCriterion("BANK_ACT_CHECK >", value, "bankActCheck");
            return (Criteria) this;
        }

        public Criteria andBankActCheckGreaterThanOrEqualTo(Short value) {
            addCriterion("BANK_ACT_CHECK >=", value, "bankActCheck");
            return (Criteria) this;
        }

        public Criteria andBankActCheckLessThan(Short value) {
            addCriterion("BANK_ACT_CHECK <", value, "bankActCheck");
            return (Criteria) this;
        }

        public Criteria andBankActCheckLessThanOrEqualTo(Short value) {
            addCriterion("BANK_ACT_CHECK <=", value, "bankActCheck");
            return (Criteria) this;
        }

        public Criteria andBankActCheckIn(List<Short> values) {
            addCriterion("BANK_ACT_CHECK in", values, "bankActCheck");
            return (Criteria) this;
        }

        public Criteria andBankActCheckNotIn(List<Short> values) {
            addCriterion("BANK_ACT_CHECK not in", values, "bankActCheck");
            return (Criteria) this;
        }

        public Criteria andBankActCheckBetween(Short value1, Short value2) {
            addCriterion("BANK_ACT_CHECK between", value1, value2, "bankActCheck");
            return (Criteria) this;
        }

        public Criteria andBankActCheckNotBetween(Short value1, Short value2) {
            addCriterion("BANK_ACT_CHECK not between", value1, value2, "bankActCheck");
            return (Criteria) this;
        }

        public Criteria andAgentCertCheckIsNull() {
            addCriterion("AGENT_CERT_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andAgentCertCheckIsNotNull() {
            addCriterion("AGENT_CERT_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andAgentCertCheckEqualTo(Short value) {
            addCriterion("AGENT_CERT_CHECK =", value, "agentCertCheck");
            return (Criteria) this;
        }

        public Criteria andAgentCertCheckNotEqualTo(Short value) {
            addCriterion("AGENT_CERT_CHECK <>", value, "agentCertCheck");
            return (Criteria) this;
        }

        public Criteria andAgentCertCheckGreaterThan(Short value) {
            addCriterion("AGENT_CERT_CHECK >", value, "agentCertCheck");
            return (Criteria) this;
        }

        public Criteria andAgentCertCheckGreaterThanOrEqualTo(Short value) {
            addCriterion("AGENT_CERT_CHECK >=", value, "agentCertCheck");
            return (Criteria) this;
        }

        public Criteria andAgentCertCheckLessThan(Short value) {
            addCriterion("AGENT_CERT_CHECK <", value, "agentCertCheck");
            return (Criteria) this;
        }

        public Criteria andAgentCertCheckLessThanOrEqualTo(Short value) {
            addCriterion("AGENT_CERT_CHECK <=", value, "agentCertCheck");
            return (Criteria) this;
        }

        public Criteria andAgentCertCheckIn(List<Short> values) {
            addCriterion("AGENT_CERT_CHECK in", values, "agentCertCheck");
            return (Criteria) this;
        }

        public Criteria andAgentCertCheckNotIn(List<Short> values) {
            addCriterion("AGENT_CERT_CHECK not in", values, "agentCertCheck");
            return (Criteria) this;
        }

        public Criteria andAgentCertCheckBetween(Short value1, Short value2) {
            addCriterion("AGENT_CERT_CHECK between", value1, value2, "agentCertCheck");
            return (Criteria) this;
        }

        public Criteria andAgentCertCheckNotBetween(Short value1, Short value2) {
            addCriterion("AGENT_CERT_CHECK not between", value1, value2, "agentCertCheck");
            return (Criteria) this;
        }

        public Criteria andHfflagIsNull() {
            addCriterion("HFFLAG is null");
            return (Criteria) this;
        }

        public Criteria andHfflagIsNotNull() {
            addCriterion("HFFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andHfflagEqualTo(String value) {
            addCriterion("HFFLAG =", value, "hfflag");
            return (Criteria) this;
        }

        public Criteria andHfflagNotEqualTo(String value) {
            addCriterion("HFFLAG <>", value, "hfflag");
            return (Criteria) this;
        }

        public Criteria andHfflagGreaterThan(String value) {
            addCriterion("HFFLAG >", value, "hfflag");
            return (Criteria) this;
        }

        public Criteria andHfflagGreaterThanOrEqualTo(String value) {
            addCriterion("HFFLAG >=", value, "hfflag");
            return (Criteria) this;
        }

        public Criteria andHfflagLessThan(String value) {
            addCriterion("HFFLAG <", value, "hfflag");
            return (Criteria) this;
        }

        public Criteria andHfflagLessThanOrEqualTo(String value) {
            addCriterion("HFFLAG <=", value, "hfflag");
            return (Criteria) this;
        }

        public Criteria andHfflagLike(String value) {
            addCriterion("HFFLAG like", value, "hfflag");
            return (Criteria) this;
        }

        public Criteria andHfflagNotLike(String value) {
            addCriterion("HFFLAG not like", value, "hfflag");
            return (Criteria) this;
        }

        public Criteria andHfflagIn(List<String> values) {
            addCriterion("HFFLAG in", values, "hfflag");
            return (Criteria) this;
        }

        public Criteria andHfflagNotIn(List<String> values) {
            addCriterion("HFFLAG not in", values, "hfflag");
            return (Criteria) this;
        }

        public Criteria andHfflagBetween(String value1, String value2) {
            addCriterion("HFFLAG between", value1, value2, "hfflag");
            return (Criteria) this;
        }

        public Criteria andHfflagNotBetween(String value1, String value2) {
            addCriterion("HFFLAG not between", value1, value2, "hfflag");
            return (Criteria) this;
        }

        public Criteria andInflagIsNull() {
            addCriterion("INFLAG is null");
            return (Criteria) this;
        }

        public Criteria andInflagIsNotNull() {
            addCriterion("INFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andInflagEqualTo(String value) {
            addCriterion("INFLAG =", value, "inflag");
            return (Criteria) this;
        }

        public Criteria andInflagNotEqualTo(String value) {
            addCriterion("INFLAG <>", value, "inflag");
            return (Criteria) this;
        }

        public Criteria andInflagGreaterThan(String value) {
            addCriterion("INFLAG >", value, "inflag");
            return (Criteria) this;
        }

        public Criteria andInflagGreaterThanOrEqualTo(String value) {
            addCriterion("INFLAG >=", value, "inflag");
            return (Criteria) this;
        }

        public Criteria andInflagLessThan(String value) {
            addCriterion("INFLAG <", value, "inflag");
            return (Criteria) this;
        }

        public Criteria andInflagLessThanOrEqualTo(String value) {
            addCriterion("INFLAG <=", value, "inflag");
            return (Criteria) this;
        }

        public Criteria andInflagLike(String value) {
            addCriterion("INFLAG like", value, "inflag");
            return (Criteria) this;
        }

        public Criteria andInflagNotLike(String value) {
            addCriterion("INFLAG not like", value, "inflag");
            return (Criteria) this;
        }

        public Criteria andInflagIn(List<String> values) {
            addCriterion("INFLAG in", values, "inflag");
            return (Criteria) this;
        }

        public Criteria andInflagNotIn(List<String> values) {
            addCriterion("INFLAG not in", values, "inflag");
            return (Criteria) this;
        }

        public Criteria andInflagBetween(String value1, String value2) {
            addCriterion("INFLAG between", value1, value2, "inflag");
            return (Criteria) this;
        }

        public Criteria andInflagNotBetween(String value1, String value2) {
            addCriterion("INFLAG not between", value1, value2, "inflag");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtIsNull() {
            addCriterion("FREFEELIMT is null");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtIsNotNull() {
            addCriterion("FREFEELIMT is not null");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtEqualTo(String value) {
            addCriterion("FREFEELIMT =", value, "frefeelimt");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtNotEqualTo(String value) {
            addCriterion("FREFEELIMT <>", value, "frefeelimt");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtGreaterThan(String value) {
            addCriterion("FREFEELIMT >", value, "frefeelimt");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtGreaterThanOrEqualTo(String value) {
            addCriterion("FREFEELIMT >=", value, "frefeelimt");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtLessThan(String value) {
            addCriterion("FREFEELIMT <", value, "frefeelimt");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtLessThanOrEqualTo(String value) {
            addCriterion("FREFEELIMT <=", value, "frefeelimt");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtLike(String value) {
            addCriterion("FREFEELIMT like", value, "frefeelimt");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtNotLike(String value) {
            addCriterion("FREFEELIMT not like", value, "frefeelimt");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtIn(List<String> values) {
            addCriterion("FREFEELIMT in", values, "frefeelimt");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtNotIn(List<String> values) {
            addCriterion("FREFEELIMT not in", values, "frefeelimt");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtBetween(String value1, String value2) {
            addCriterion("FREFEELIMT between", value1, value2, "frefeelimt");
            return (Criteria) this;
        }

        public Criteria andFrefeelimtNotBetween(String value1, String value2) {
            addCriterion("FREFEELIMT not between", value1, value2, "frefeelimt");
            return (Criteria) this;
        }

        public Criteria andFrefeerateIsNull() {
            addCriterion("FREFEERATE is null");
            return (Criteria) this;
        }

        public Criteria andFrefeerateIsNotNull() {
            addCriterion("FREFEERATE is not null");
            return (Criteria) this;
        }

        public Criteria andFrefeerateEqualTo(String value) {
            addCriterion("FREFEERATE =", value, "frefeerate");
            return (Criteria) this;
        }

        public Criteria andFrefeerateNotEqualTo(String value) {
            addCriterion("FREFEERATE <>", value, "frefeerate");
            return (Criteria) this;
        }

        public Criteria andFrefeerateGreaterThan(String value) {
            addCriterion("FREFEERATE >", value, "frefeerate");
            return (Criteria) this;
        }

        public Criteria andFrefeerateGreaterThanOrEqualTo(String value) {
            addCriterion("FREFEERATE >=", value, "frefeerate");
            return (Criteria) this;
        }

        public Criteria andFrefeerateLessThan(String value) {
            addCriterion("FREFEERATE <", value, "frefeerate");
            return (Criteria) this;
        }

        public Criteria andFrefeerateLessThanOrEqualTo(String value) {
            addCriterion("FREFEERATE <=", value, "frefeerate");
            return (Criteria) this;
        }

        public Criteria andFrefeerateLike(String value) {
            addCriterion("FREFEERATE like", value, "frefeerate");
            return (Criteria) this;
        }

        public Criteria andFrefeerateNotLike(String value) {
            addCriterion("FREFEERATE not like", value, "frefeerate");
            return (Criteria) this;
        }

        public Criteria andFrefeerateIn(List<String> values) {
            addCriterion("FREFEERATE in", values, "frefeerate");
            return (Criteria) this;
        }

        public Criteria andFrefeerateNotIn(List<String> values) {
            addCriterion("FREFEERATE not in", values, "frefeerate");
            return (Criteria) this;
        }

        public Criteria andFrefeerateBetween(String value1, String value2) {
            addCriterion("FREFEERATE between", value1, value2, "frefeerate");
            return (Criteria) this;
        }

        public Criteria andFrefeerateNotBetween(String value1, String value2) {
            addCriterion("FREFEERATE not between", value1, value2, "frefeerate");
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