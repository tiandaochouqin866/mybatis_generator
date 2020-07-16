package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class UpTerminalApplyInfoEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpTerminalApplyInfoEntityExample() {
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

        public Criteria andUpMchntCdIsNull() {
            addCriterion("UP_MCHNT_CD is null");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdIsNotNull() {
            addCriterion("UP_MCHNT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdEqualTo(String value) {
            addCriterion("UP_MCHNT_CD =", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdNotEqualTo(String value) {
            addCriterion("UP_MCHNT_CD <>", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdGreaterThan(String value) {
            addCriterion("UP_MCHNT_CD >", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdGreaterThanOrEqualTo(String value) {
            addCriterion("UP_MCHNT_CD >=", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdLessThan(String value) {
            addCriterion("UP_MCHNT_CD <", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdLessThanOrEqualTo(String value) {
            addCriterion("UP_MCHNT_CD <=", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdLike(String value) {
            addCriterion("UP_MCHNT_CD like", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdNotLike(String value) {
            addCriterion("UP_MCHNT_CD not like", value, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdIn(List<String> values) {
            addCriterion("UP_MCHNT_CD in", values, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdNotIn(List<String> values) {
            addCriterion("UP_MCHNT_CD not in", values, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdBetween(String value1, String value2) {
            addCriterion("UP_MCHNT_CD between", value1, value2, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpMchntCdNotBetween(String value1, String value2) {
            addCriterion("UP_MCHNT_CD not between", value1, value2, "upMchntCd");
            return (Criteria) this;
        }

        public Criteria andUpTermStIsNull() {
            addCriterion("UP_TERM_ST is null");
            return (Criteria) this;
        }

        public Criteria andUpTermStIsNotNull() {
            addCriterion("UP_TERM_ST is not null");
            return (Criteria) this;
        }

        public Criteria andUpTermStEqualTo(String value) {
            addCriterion("UP_TERM_ST =", value, "upTermSt");
            return (Criteria) this;
        }

        public Criteria andUpTermStNotEqualTo(String value) {
            addCriterion("UP_TERM_ST <>", value, "upTermSt");
            return (Criteria) this;
        }

        public Criteria andUpTermStGreaterThan(String value) {
            addCriterion("UP_TERM_ST >", value, "upTermSt");
            return (Criteria) this;
        }

        public Criteria andUpTermStGreaterThanOrEqualTo(String value) {
            addCriterion("UP_TERM_ST >=", value, "upTermSt");
            return (Criteria) this;
        }

        public Criteria andUpTermStLessThan(String value) {
            addCriterion("UP_TERM_ST <", value, "upTermSt");
            return (Criteria) this;
        }

        public Criteria andUpTermStLessThanOrEqualTo(String value) {
            addCriterion("UP_TERM_ST <=", value, "upTermSt");
            return (Criteria) this;
        }

        public Criteria andUpTermStLike(String value) {
            addCriterion("UP_TERM_ST like", value, "upTermSt");
            return (Criteria) this;
        }

        public Criteria andUpTermStNotLike(String value) {
            addCriterion("UP_TERM_ST not like", value, "upTermSt");
            return (Criteria) this;
        }

        public Criteria andUpTermStIn(List<String> values) {
            addCriterion("UP_TERM_ST in", values, "upTermSt");
            return (Criteria) this;
        }

        public Criteria andUpTermStNotIn(List<String> values) {
            addCriterion("UP_TERM_ST not in", values, "upTermSt");
            return (Criteria) this;
        }

        public Criteria andUpTermStBetween(String value1, String value2) {
            addCriterion("UP_TERM_ST between", value1, value2, "upTermSt");
            return (Criteria) this;
        }

        public Criteria andUpTermStNotBetween(String value1, String value2) {
            addCriterion("UP_TERM_ST not between", value1, value2, "upTermSt");
            return (Criteria) this;
        }

        public Criteria andUpTermCodeIsNull() {
            addCriterion("UP_TERM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUpTermCodeIsNotNull() {
            addCriterion("UP_TERM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUpTermCodeEqualTo(Integer value) {
            addCriterion("UP_TERM_CODE =", value, "upTermCode");
            return (Criteria) this;
        }

        public Criteria andUpTermCodeNotEqualTo(Integer value) {
            addCriterion("UP_TERM_CODE <>", value, "upTermCode");
            return (Criteria) this;
        }

        public Criteria andUpTermCodeGreaterThan(Integer value) {
            addCriterion("UP_TERM_CODE >", value, "upTermCode");
            return (Criteria) this;
        }

        public Criteria andUpTermCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("UP_TERM_CODE >=", value, "upTermCode");
            return (Criteria) this;
        }

        public Criteria andUpTermCodeLessThan(Integer value) {
            addCriterion("UP_TERM_CODE <", value, "upTermCode");
            return (Criteria) this;
        }

        public Criteria andUpTermCodeLessThanOrEqualTo(Integer value) {
            addCriterion("UP_TERM_CODE <=", value, "upTermCode");
            return (Criteria) this;
        }

        public Criteria andUpTermCodeIn(List<Integer> values) {
            addCriterion("UP_TERM_CODE in", values, "upTermCode");
            return (Criteria) this;
        }

        public Criteria andUpTermCodeNotIn(List<Integer> values) {
            addCriterion("UP_TERM_CODE not in", values, "upTermCode");
            return (Criteria) this;
        }

        public Criteria andUpTermCodeBetween(Integer value1, Integer value2) {
            addCriterion("UP_TERM_CODE between", value1, value2, "upTermCode");
            return (Criteria) this;
        }

        public Criteria andUpTermCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("UP_TERM_CODE not between", value1, value2, "upTermCode");
            return (Criteria) this;
        }

        public Criteria andUpTermTpIsNull() {
            addCriterion("UP_TERM_TP is null");
            return (Criteria) this;
        }

        public Criteria andUpTermTpIsNotNull() {
            addCriterion("UP_TERM_TP is not null");
            return (Criteria) this;
        }

        public Criteria andUpTermTpEqualTo(String value) {
            addCriterion("UP_TERM_TP =", value, "upTermTp");
            return (Criteria) this;
        }

        public Criteria andUpTermTpNotEqualTo(String value) {
            addCriterion("UP_TERM_TP <>", value, "upTermTp");
            return (Criteria) this;
        }

        public Criteria andUpTermTpGreaterThan(String value) {
            addCriterion("UP_TERM_TP >", value, "upTermTp");
            return (Criteria) this;
        }

        public Criteria andUpTermTpGreaterThanOrEqualTo(String value) {
            addCriterion("UP_TERM_TP >=", value, "upTermTp");
            return (Criteria) this;
        }

        public Criteria andUpTermTpLessThan(String value) {
            addCriterion("UP_TERM_TP <", value, "upTermTp");
            return (Criteria) this;
        }

        public Criteria andUpTermTpLessThanOrEqualTo(String value) {
            addCriterion("UP_TERM_TP <=", value, "upTermTp");
            return (Criteria) this;
        }

        public Criteria andUpTermTpLike(String value) {
            addCriterion("UP_TERM_TP like", value, "upTermTp");
            return (Criteria) this;
        }

        public Criteria andUpTermTpNotLike(String value) {
            addCriterion("UP_TERM_TP not like", value, "upTermTp");
            return (Criteria) this;
        }

        public Criteria andUpTermTpIn(List<String> values) {
            addCriterion("UP_TERM_TP in", values, "upTermTp");
            return (Criteria) this;
        }

        public Criteria andUpTermTpNotIn(List<String> values) {
            addCriterion("UP_TERM_TP not in", values, "upTermTp");
            return (Criteria) this;
        }

        public Criteria andUpTermTpBetween(String value1, String value2) {
            addCriterion("UP_TERM_TP between", value1, value2, "upTermTp");
            return (Criteria) this;
        }

        public Criteria andUpTermTpNotBetween(String value1, String value2) {
            addCriterion("UP_TERM_TP not between", value1, value2, "upTermTp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpIsNull() {
            addCriterion("UP_BUSS_TP_BMP is null");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpIsNotNull() {
            addCriterion("UP_BUSS_TP_BMP is not null");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpEqualTo(String value) {
            addCriterion("UP_BUSS_TP_BMP =", value, "upBussTpBmp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpNotEqualTo(String value) {
            addCriterion("UP_BUSS_TP_BMP <>", value, "upBussTpBmp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpGreaterThan(String value) {
            addCriterion("UP_BUSS_TP_BMP >", value, "upBussTpBmp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpGreaterThanOrEqualTo(String value) {
            addCriterion("UP_BUSS_TP_BMP >=", value, "upBussTpBmp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpLessThan(String value) {
            addCriterion("UP_BUSS_TP_BMP <", value, "upBussTpBmp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpLessThanOrEqualTo(String value) {
            addCriterion("UP_BUSS_TP_BMP <=", value, "upBussTpBmp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpLike(String value) {
            addCriterion("UP_BUSS_TP_BMP like", value, "upBussTpBmp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpNotLike(String value) {
            addCriterion("UP_BUSS_TP_BMP not like", value, "upBussTpBmp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpIn(List<String> values) {
            addCriterion("UP_BUSS_TP_BMP in", values, "upBussTpBmp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpNotIn(List<String> values) {
            addCriterion("UP_BUSS_TP_BMP not in", values, "upBussTpBmp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpBetween(String value1, String value2) {
            addCriterion("UP_BUSS_TP_BMP between", value1, value2, "upBussTpBmp");
            return (Criteria) this;
        }

        public Criteria andUpBussTpBmpNotBetween(String value1, String value2) {
            addCriterion("UP_BUSS_TP_BMP not between", value1, value2, "upBussTpBmp");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListIsNull() {
            addCriterion("UP_DIAL_UP_NO_LIST is null");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListIsNotNull() {
            addCriterion("UP_DIAL_UP_NO_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListEqualTo(String value) {
            addCriterion("UP_DIAL_UP_NO_LIST =", value, "upDialUpNoList");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListNotEqualTo(String value) {
            addCriterion("UP_DIAL_UP_NO_LIST <>", value, "upDialUpNoList");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListGreaterThan(String value) {
            addCriterion("UP_DIAL_UP_NO_LIST >", value, "upDialUpNoList");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListGreaterThanOrEqualTo(String value) {
            addCriterion("UP_DIAL_UP_NO_LIST >=", value, "upDialUpNoList");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListLessThan(String value) {
            addCriterion("UP_DIAL_UP_NO_LIST <", value, "upDialUpNoList");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListLessThanOrEqualTo(String value) {
            addCriterion("UP_DIAL_UP_NO_LIST <=", value, "upDialUpNoList");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListLike(String value) {
            addCriterion("UP_DIAL_UP_NO_LIST like", value, "upDialUpNoList");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListNotLike(String value) {
            addCriterion("UP_DIAL_UP_NO_LIST not like", value, "upDialUpNoList");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListIn(List<String> values) {
            addCriterion("UP_DIAL_UP_NO_LIST in", values, "upDialUpNoList");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListNotIn(List<String> values) {
            addCriterion("UP_DIAL_UP_NO_LIST not in", values, "upDialUpNoList");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListBetween(String value1, String value2) {
            addCriterion("UP_DIAL_UP_NO_LIST between", value1, value2, "upDialUpNoList");
            return (Criteria) this;
        }

        public Criteria andUpDialUpNoListNotBetween(String value1, String value2) {
            addCriterion("UP_DIAL_UP_NO_LIST not between", value1, value2, "upDialUpNoList");
            return (Criteria) this;
        }

        public Criteria andUpAddrIsNull() {
            addCriterion("UP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andUpAddrIsNotNull() {
            addCriterion("UP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andUpAddrEqualTo(String value) {
            addCriterion("UP_ADDR =", value, "upAddr");
            return (Criteria) this;
        }

        public Criteria andUpAddrNotEqualTo(String value) {
            addCriterion("UP_ADDR <>", value, "upAddr");
            return (Criteria) this;
        }

        public Criteria andUpAddrGreaterThan(String value) {
            addCriterion("UP_ADDR >", value, "upAddr");
            return (Criteria) this;
        }

        public Criteria andUpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("UP_ADDR >=", value, "upAddr");
            return (Criteria) this;
        }

        public Criteria andUpAddrLessThan(String value) {
            addCriterion("UP_ADDR <", value, "upAddr");
            return (Criteria) this;
        }

        public Criteria andUpAddrLessThanOrEqualTo(String value) {
            addCriterion("UP_ADDR <=", value, "upAddr");
            return (Criteria) this;
        }

        public Criteria andUpAddrIn(List<String> values) {
            addCriterion("UP_ADDR in", values, "upAddr");
            return (Criteria) this;
        }

        public Criteria andUpAddrNotIn(List<String> values) {
            addCriterion("UP_ADDR not in", values, "upAddr");
            return (Criteria) this;
        }

        public Criteria andUpAddrBetween(String value1, String value2) {
            addCriterion("UP_ADDR between", value1, value2, "upAddr");
            return (Criteria) this;
        }

        public Criteria andUpAddrNotBetween(String value1, String value2) {
            addCriterion("UP_ADDR not between", value1, value2, "upAddr");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameIsNull() {
            addCriterion("UP_LIC_REG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameIsNotNull() {
            addCriterion("UP_LIC_REG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameEqualTo(String value) {
            addCriterion("UP_LIC_REG_NAME =", value, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameNotEqualTo(String value) {
            addCriterion("UP_LIC_REG_NAME <>", value, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameGreaterThan(String value) {
            addCriterion("UP_LIC_REG_NAME >", value, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameGreaterThanOrEqualTo(String value) {
            addCriterion("UP_LIC_REG_NAME >=", value, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameLessThan(String value) {
            addCriterion("UP_LIC_REG_NAME <", value, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameLessThanOrEqualTo(String value) {
            addCriterion("UP_LIC_REG_NAME <=", value, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameIn(List<String> values) {
            addCriterion("UP_LIC_REG_NAME in", values, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameNotIn(List<String> values) {
            addCriterion("UP_LIC_REG_NAME not in", values, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameBetween(String value1, String value2) {
            addCriterion("UP_LIC_REG_NAME between", value1, value2, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpLicRegNameNotBetween(String value1, String value2) {
            addCriterion("UP_LIC_REG_NAME not between", value1, value2, "upLicRegName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameIsNull() {
            addCriterion("UP_BRANCH_SIMPLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameIsNotNull() {
            addCriterion("UP_BRANCH_SIMPLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameEqualTo(String value) {
            addCriterion("UP_BRANCH_SIMPLE_NAME =", value, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameNotEqualTo(String value) {
            addCriterion("UP_BRANCH_SIMPLE_NAME <>", value, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameGreaterThan(String value) {
            addCriterion("UP_BRANCH_SIMPLE_NAME >", value, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameGreaterThanOrEqualTo(String value) {
            addCriterion("UP_BRANCH_SIMPLE_NAME >=", value, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameLessThan(String value) {
            addCriterion("UP_BRANCH_SIMPLE_NAME <", value, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameLessThanOrEqualTo(String value) {
            addCriterion("UP_BRANCH_SIMPLE_NAME <=", value, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameIn(List<String> values) {
            addCriterion("UP_BRANCH_SIMPLE_NAME in", values, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameNotIn(List<String> values) {
            addCriterion("UP_BRANCH_SIMPLE_NAME not in", values, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameBetween(String value1, String value2) {
            addCriterion("UP_BRANCH_SIMPLE_NAME between", value1, value2, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBranchSimpleNameNotBetween(String value1, String value2) {
            addCriterion("UP_BRANCH_SIMPLE_NAME not between", value1, value2, "upBranchSimpleName");
            return (Criteria) this;
        }

        public Criteria andUpBusiMerchantListIsNull() {
            addCriterion("UP_BUSI_MERCHANT_LIST is null");
            return (Criteria) this;
        }

        public Criteria andUpBusiMerchantListIsNotNull() {
            addCriterion("UP_BUSI_MERCHANT_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andUpBusiMerchantListEqualTo(String value) {
            addCriterion("UP_BUSI_MERCHANT_LIST =", value, "upBusiMerchantList");
            return (Criteria) this;
        }

        public Criteria andUpBusiMerchantListNotEqualTo(String value) {
            addCriterion("UP_BUSI_MERCHANT_LIST <>", value, "upBusiMerchantList");
            return (Criteria) this;
        }

        public Criteria andUpBusiMerchantListGreaterThan(String value) {
            addCriterion("UP_BUSI_MERCHANT_LIST >", value, "upBusiMerchantList");
            return (Criteria) this;
        }

        public Criteria andUpBusiMerchantListGreaterThanOrEqualTo(String value) {
            addCriterion("UP_BUSI_MERCHANT_LIST >=", value, "upBusiMerchantList");
            return (Criteria) this;
        }

        public Criteria andUpBusiMerchantListLessThan(String value) {
            addCriterion("UP_BUSI_MERCHANT_LIST <", value, "upBusiMerchantList");
            return (Criteria) this;
        }

        public Criteria andUpBusiMerchantListLessThanOrEqualTo(String value) {
            addCriterion("UP_BUSI_MERCHANT_LIST <=", value, "upBusiMerchantList");
            return (Criteria) this;
        }

        public Criteria andUpBusiMerchantListIn(List<String> values) {
            addCriterion("UP_BUSI_MERCHANT_LIST in", values, "upBusiMerchantList");
            return (Criteria) this;
        }

        public Criteria andUpBusiMerchantListNotIn(List<String> values) {
            addCriterion("UP_BUSI_MERCHANT_LIST not in", values, "upBusiMerchantList");
            return (Criteria) this;
        }

        public Criteria andUpBusiMerchantListBetween(String value1, String value2) {
            addCriterion("UP_BUSI_MERCHANT_LIST between", value1, value2, "upBusiMerchantList");
            return (Criteria) this;
        }

        public Criteria andUpBusiMerchantListNotBetween(String value1, String value2) {
            addCriterion("UP_BUSI_MERCHANT_LIST not between", value1, value2, "upBusiMerchantList");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeIsNull() {
            addCriterion("UP_AGENCY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeIsNotNull() {
            addCriterion("UP_AGENCY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeEqualTo(String value) {
            addCriterion("UP_AGENCY_CODE =", value, "upAgencyCode");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeNotEqualTo(String value) {
            addCriterion("UP_AGENCY_CODE <>", value, "upAgencyCode");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeGreaterThan(String value) {
            addCriterion("UP_AGENCY_CODE >", value, "upAgencyCode");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("UP_AGENCY_CODE >=", value, "upAgencyCode");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeLessThan(String value) {
            addCriterion("UP_AGENCY_CODE <", value, "upAgencyCode");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeLessThanOrEqualTo(String value) {
            addCriterion("UP_AGENCY_CODE <=", value, "upAgencyCode");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeLike(String value) {
            addCriterion("UP_AGENCY_CODE like", value, "upAgencyCode");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeNotLike(String value) {
            addCriterion("UP_AGENCY_CODE not like", value, "upAgencyCode");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeIn(List<String> values) {
            addCriterion("UP_AGENCY_CODE in", values, "upAgencyCode");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeNotIn(List<String> values) {
            addCriterion("UP_AGENCY_CODE not in", values, "upAgencyCode");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeBetween(String value1, String value2) {
            addCriterion("UP_AGENCY_CODE between", value1, value2, "upAgencyCode");
            return (Criteria) this;
        }

        public Criteria andUpAgencyCodeNotBetween(String value1, String value2) {
            addCriterion("UP_AGENCY_CODE not between", value1, value2, "upAgencyCode");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdIsNull() {
            addCriterion("UP_TERM_SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdIsNotNull() {
            addCriterion("UP_TERM_SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdEqualTo(String value) {
            addCriterion("UP_TERM_SEQ_ID =", value, "upTermSeqId");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdNotEqualTo(String value) {
            addCriterion("UP_TERM_SEQ_ID <>", value, "upTermSeqId");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdGreaterThan(String value) {
            addCriterion("UP_TERM_SEQ_ID >", value, "upTermSeqId");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("UP_TERM_SEQ_ID >=", value, "upTermSeqId");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdLessThan(String value) {
            addCriterion("UP_TERM_SEQ_ID <", value, "upTermSeqId");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdLessThanOrEqualTo(String value) {
            addCriterion("UP_TERM_SEQ_ID <=", value, "upTermSeqId");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdLike(String value) {
            addCriterion("UP_TERM_SEQ_ID like", value, "upTermSeqId");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdNotLike(String value) {
            addCriterion("UP_TERM_SEQ_ID not like", value, "upTermSeqId");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdIn(List<String> values) {
            addCriterion("UP_TERM_SEQ_ID in", values, "upTermSeqId");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdNotIn(List<String> values) {
            addCriterion("UP_TERM_SEQ_ID not in", values, "upTermSeqId");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdBetween(String value1, String value2) {
            addCriterion("UP_TERM_SEQ_ID between", value1, value2, "upTermSeqId");
            return (Criteria) this;
        }

        public Criteria andUpTermSeqIdNotBetween(String value1, String value2) {
            addCriterion("UP_TERM_SEQ_ID not between", value1, value2, "upTermSeqId");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmIsNull() {
            addCriterion("UP_TERM_MAF_NM is null");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmIsNotNull() {
            addCriterion("UP_TERM_MAF_NM is not null");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmEqualTo(String value) {
            addCriterion("UP_TERM_MAF_NM =", value, "upTermMafNm");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmNotEqualTo(String value) {
            addCriterion("UP_TERM_MAF_NM <>", value, "upTermMafNm");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmGreaterThan(String value) {
            addCriterion("UP_TERM_MAF_NM >", value, "upTermMafNm");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmGreaterThanOrEqualTo(String value) {
            addCriterion("UP_TERM_MAF_NM >=", value, "upTermMafNm");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmLessThan(String value) {
            addCriterion("UP_TERM_MAF_NM <", value, "upTermMafNm");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmLessThanOrEqualTo(String value) {
            addCriterion("UP_TERM_MAF_NM <=", value, "upTermMafNm");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmLike(String value) {
            addCriterion("UP_TERM_MAF_NM like", value, "upTermMafNm");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmNotLike(String value) {
            addCriterion("UP_TERM_MAF_NM not like", value, "upTermMafNm");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmIn(List<String> values) {
            addCriterion("UP_TERM_MAF_NM in", values, "upTermMafNm");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmNotIn(List<String> values) {
            addCriterion("UP_TERM_MAF_NM not in", values, "upTermMafNm");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmBetween(String value1, String value2) {
            addCriterion("UP_TERM_MAF_NM between", value1, value2, "upTermMafNm");
            return (Criteria) this;
        }

        public Criteria andUpTermMafNmNotBetween(String value1, String value2) {
            addCriterion("UP_TERM_MAF_NM not between", value1, value2, "upTermMafNm");
            return (Criteria) this;
        }

        public Criteria andUpTermModIsNull() {
            addCriterion("UP_TERM_MOD is null");
            return (Criteria) this;
        }

        public Criteria andUpTermModIsNotNull() {
            addCriterion("UP_TERM_MOD is not null");
            return (Criteria) this;
        }

        public Criteria andUpTermModEqualTo(String value) {
            addCriterion("UP_TERM_MOD =", value, "upTermMod");
            return (Criteria) this;
        }

        public Criteria andUpTermModNotEqualTo(String value) {
            addCriterion("UP_TERM_MOD <>", value, "upTermMod");
            return (Criteria) this;
        }

        public Criteria andUpTermModGreaterThan(String value) {
            addCriterion("UP_TERM_MOD >", value, "upTermMod");
            return (Criteria) this;
        }

        public Criteria andUpTermModGreaterThanOrEqualTo(String value) {
            addCriterion("UP_TERM_MOD >=", value, "upTermMod");
            return (Criteria) this;
        }

        public Criteria andUpTermModLessThan(String value) {
            addCriterion("UP_TERM_MOD <", value, "upTermMod");
            return (Criteria) this;
        }

        public Criteria andUpTermModLessThanOrEqualTo(String value) {
            addCriterion("UP_TERM_MOD <=", value, "upTermMod");
            return (Criteria) this;
        }

        public Criteria andUpTermModLike(String value) {
            addCriterion("UP_TERM_MOD like", value, "upTermMod");
            return (Criteria) this;
        }

        public Criteria andUpTermModNotLike(String value) {
            addCriterion("UP_TERM_MOD not like", value, "upTermMod");
            return (Criteria) this;
        }

        public Criteria andUpTermModIn(List<String> values) {
            addCriterion("UP_TERM_MOD in", values, "upTermMod");
            return (Criteria) this;
        }

        public Criteria andUpTermModNotIn(List<String> values) {
            addCriterion("UP_TERM_MOD not in", values, "upTermMod");
            return (Criteria) this;
        }

        public Criteria andUpTermModBetween(String value1, String value2) {
            addCriterion("UP_TERM_MOD between", value1, value2, "upTermMod");
            return (Criteria) this;
        }

        public Criteria andUpTermModNotBetween(String value1, String value2) {
            addCriterion("UP_TERM_MOD not between", value1, value2, "upTermMod");
            return (Criteria) this;
        }

        public Criteria andUpTermDateIsNull() {
            addCriterion("UP_TERM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpTermDateIsNotNull() {
            addCriterion("UP_TERM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpTermDateEqualTo(String value) {
            addCriterion("UP_TERM_DATE =", value, "upTermDate");
            return (Criteria) this;
        }

        public Criteria andUpTermDateNotEqualTo(String value) {
            addCriterion("UP_TERM_DATE <>", value, "upTermDate");
            return (Criteria) this;
        }

        public Criteria andUpTermDateGreaterThan(String value) {
            addCriterion("UP_TERM_DATE >", value, "upTermDate");
            return (Criteria) this;
        }

        public Criteria andUpTermDateGreaterThanOrEqualTo(String value) {
            addCriterion("UP_TERM_DATE >=", value, "upTermDate");
            return (Criteria) this;
        }

        public Criteria andUpTermDateLessThan(String value) {
            addCriterion("UP_TERM_DATE <", value, "upTermDate");
            return (Criteria) this;
        }

        public Criteria andUpTermDateLessThanOrEqualTo(String value) {
            addCriterion("UP_TERM_DATE <=", value, "upTermDate");
            return (Criteria) this;
        }

        public Criteria andUpTermDateLike(String value) {
            addCriterion("UP_TERM_DATE like", value, "upTermDate");
            return (Criteria) this;
        }

        public Criteria andUpTermDateNotLike(String value) {
            addCriterion("UP_TERM_DATE not like", value, "upTermDate");
            return (Criteria) this;
        }

        public Criteria andUpTermDateIn(List<String> values) {
            addCriterion("UP_TERM_DATE in", values, "upTermDate");
            return (Criteria) this;
        }

        public Criteria andUpTermDateNotIn(List<String> values) {
            addCriterion("UP_TERM_DATE not in", values, "upTermDate");
            return (Criteria) this;
        }

        public Criteria andUpTermDateBetween(String value1, String value2) {
            addCriterion("UP_TERM_DATE between", value1, value2, "upTermDate");
            return (Criteria) this;
        }

        public Criteria andUpTermDateNotBetween(String value1, String value2) {
            addCriterion("UP_TERM_DATE not between", value1, value2, "upTermDate");
            return (Criteria) this;
        }

        public Criteria andUpTermConnMdIsNull() {
            addCriterion("UP_TERM_CONN_MD is null");
            return (Criteria) this;
        }

        public Criteria andUpTermConnMdIsNotNull() {
            addCriterion("UP_TERM_CONN_MD is not null");
            return (Criteria) this;
        }

        public Criteria andUpTermConnMdEqualTo(String value) {
            addCriterion("UP_TERM_CONN_MD =", value, "upTermConnMd");
            return (Criteria) this;
        }

        public Criteria andUpTermConnMdNotEqualTo(String value) {
            addCriterion("UP_TERM_CONN_MD <>", value, "upTermConnMd");
            return (Criteria) this;
        }

        public Criteria andUpTermConnMdGreaterThan(String value) {
            addCriterion("UP_TERM_CONN_MD >", value, "upTermConnMd");
            return (Criteria) this;
        }

        public Criteria andUpTermConnMdGreaterThanOrEqualTo(String value) {
            addCriterion("UP_TERM_CONN_MD >=", value, "upTermConnMd");
            return (Criteria) this;
        }

        public Criteria andUpTermConnMdLessThan(String value) {
            addCriterion("UP_TERM_CONN_MD <", value, "upTermConnMd");
            return (Criteria) this;
        }

        public Criteria andUpTermConnMdLessThanOrEqualTo(String value) {
            addCriterion("UP_TERM_CONN_MD <=", value, "upTermConnMd");
            return (Criteria) this;
        }

        public Criteria andUpTermConnMdIn(List<String> values) {
            addCriterion("UP_TERM_CONN_MD in", values, "upTermConnMd");
            return (Criteria) this;
        }

        public Criteria andUpTermConnMdNotIn(List<String> values) {
            addCriterion("UP_TERM_CONN_MD not in", values, "upTermConnMd");
            return (Criteria) this;
        }

        public Criteria andUpTermConnMdBetween(String value1, String value2) {
            addCriterion("UP_TERM_CONN_MD between", value1, value2, "upTermConnMd");
            return (Criteria) this;
        }

        public Criteria andUpTermConnMdNotBetween(String value1, String value2) {
            addCriterion("UP_TERM_CONN_MD not between", value1, value2, "upTermConnMd");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncIsNull() {
            addCriterion("UP_QR_FUNC is null");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncIsNotNull() {
            addCriterion("UP_QR_FUNC is not null");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncEqualTo(Short value) {
            addCriterion("UP_QR_FUNC =", value, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncNotEqualTo(Short value) {
            addCriterion("UP_QR_FUNC <>", value, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncGreaterThan(Short value) {
            addCriterion("UP_QR_FUNC >", value, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncGreaterThanOrEqualTo(Short value) {
            addCriterion("UP_QR_FUNC >=", value, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncLessThan(Short value) {
            addCriterion("UP_QR_FUNC <", value, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncLessThanOrEqualTo(Short value) {
            addCriterion("UP_QR_FUNC <=", value, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncIn(List<Short> values) {
            addCriterion("UP_QR_FUNC in", values, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncNotIn(List<Short> values) {
            addCriterion("UP_QR_FUNC not in", values, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncBetween(Short value1, Short value2) {
            addCriterion("UP_QR_FUNC between", value1, value2, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpQrFuncNotBetween(Short value1, Short value2) {
            addCriterion("UP_QR_FUNC not between", value1, value2, "upQrFunc");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardIsNull() {
            addCriterion("UP_MAGNETIC_CARD is null");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardIsNotNull() {
            addCriterion("UP_MAGNETIC_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardEqualTo(Short value) {
            addCriterion("UP_MAGNETIC_CARD =", value, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardNotEqualTo(Short value) {
            addCriterion("UP_MAGNETIC_CARD <>", value, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardGreaterThan(Short value) {
            addCriterion("UP_MAGNETIC_CARD >", value, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardGreaterThanOrEqualTo(Short value) {
            addCriterion("UP_MAGNETIC_CARD >=", value, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardLessThan(Short value) {
            addCriterion("UP_MAGNETIC_CARD <", value, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardLessThanOrEqualTo(Short value) {
            addCriterion("UP_MAGNETIC_CARD <=", value, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardIn(List<Short> values) {
            addCriterion("UP_MAGNETIC_CARD in", values, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardNotIn(List<Short> values) {
            addCriterion("UP_MAGNETIC_CARD not in", values, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardBetween(Short value1, Short value2) {
            addCriterion("UP_MAGNETIC_CARD between", value1, value2, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpMagneticCardNotBetween(Short value1, Short value2) {
            addCriterion("UP_MAGNETIC_CARD not between", value1, value2, "upMagneticCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardIsNull() {
            addCriterion("UP_CONTACT_IC_CARD is null");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardIsNotNull() {
            addCriterion("UP_CONTACT_IC_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardEqualTo(Short value) {
            addCriterion("UP_CONTACT_IC_CARD =", value, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardNotEqualTo(Short value) {
            addCriterion("UP_CONTACT_IC_CARD <>", value, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardGreaterThan(Short value) {
            addCriterion("UP_CONTACT_IC_CARD >", value, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardGreaterThanOrEqualTo(Short value) {
            addCriterion("UP_CONTACT_IC_CARD >=", value, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardLessThan(Short value) {
            addCriterion("UP_CONTACT_IC_CARD <", value, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardLessThanOrEqualTo(Short value) {
            addCriterion("UP_CONTACT_IC_CARD <=", value, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardIn(List<Short> values) {
            addCriterion("UP_CONTACT_IC_CARD in", values, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardNotIn(List<Short> values) {
            addCriterion("UP_CONTACT_IC_CARD not in", values, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardBetween(Short value1, Short value2) {
            addCriterion("UP_CONTACT_IC_CARD between", value1, value2, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpContactIcCardNotBetween(Short value1, Short value2) {
            addCriterion("UP_CONTACT_IC_CARD not between", value1, value2, "upContactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardIsNull() {
            addCriterion("UP_NONCONTACT_IC_CARD is null");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardIsNotNull() {
            addCriterion("UP_NONCONTACT_IC_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardEqualTo(Short value) {
            addCriterion("UP_NONCONTACT_IC_CARD =", value, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardNotEqualTo(Short value) {
            addCriterion("UP_NONCONTACT_IC_CARD <>", value, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardGreaterThan(Short value) {
            addCriterion("UP_NONCONTACT_IC_CARD >", value, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardGreaterThanOrEqualTo(Short value) {
            addCriterion("UP_NONCONTACT_IC_CARD >=", value, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardLessThan(Short value) {
            addCriterion("UP_NONCONTACT_IC_CARD <", value, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardLessThanOrEqualTo(Short value) {
            addCriterion("UP_NONCONTACT_IC_CARD <=", value, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardIn(List<Short> values) {
            addCriterion("UP_NONCONTACT_IC_CARD in", values, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardNotIn(List<Short> values) {
            addCriterion("UP_NONCONTACT_IC_CARD not in", values, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardBetween(Short value1, Short value2) {
            addCriterion("UP_NONCONTACT_IC_CARD between", value1, value2, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpNoncontactIcCardNotBetween(Short value1, Short value2) {
            addCriterion("UP_NONCONTACT_IC_CARD not between", value1, value2, "upNoncontactIcCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardIsNull() {
            addCriterion("UP_PAY_WITHOUT_CARD is null");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardIsNotNull() {
            addCriterion("UP_PAY_WITHOUT_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardEqualTo(Short value) {
            addCriterion("UP_PAY_WITHOUT_CARD =", value, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardNotEqualTo(Short value) {
            addCriterion("UP_PAY_WITHOUT_CARD <>", value, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardGreaterThan(Short value) {
            addCriterion("UP_PAY_WITHOUT_CARD >", value, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardGreaterThanOrEqualTo(Short value) {
            addCriterion("UP_PAY_WITHOUT_CARD >=", value, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardLessThan(Short value) {
            addCriterion("UP_PAY_WITHOUT_CARD <", value, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardLessThanOrEqualTo(Short value) {
            addCriterion("UP_PAY_WITHOUT_CARD <=", value, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardIn(List<Short> values) {
            addCriterion("UP_PAY_WITHOUT_CARD in", values, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardNotIn(List<Short> values) {
            addCriterion("UP_PAY_WITHOUT_CARD not in", values, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardBetween(Short value1, Short value2) {
            addCriterion("UP_PAY_WITHOUT_CARD between", value1, value2, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpPayWithoutCardNotBetween(Short value1, Short value2) {
            addCriterion("UP_PAY_WITHOUT_CARD not between", value1, value2, "upPayWithoutCard");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncIsNull() {
            addCriterion("UP_TERMINAL_BUSI_FUNC is null");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncIsNotNull() {
            addCriterion("UP_TERMINAL_BUSI_FUNC is not null");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncEqualTo(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC =", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncNotEqualTo(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC <>", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncGreaterThan(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC >", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncGreaterThanOrEqualTo(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC >=", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncLessThan(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC <", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncLessThanOrEqualTo(String value) {
            addCriterion("UP_TERMINAL_BUSI_FUNC <=", value, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncIn(List<String> values) {
            addCriterion("UP_TERMINAL_BUSI_FUNC in", values, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncNotIn(List<String> values) {
            addCriterion("UP_TERMINAL_BUSI_FUNC not in", values, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncBetween(String value1, String value2) {
            addCriterion("UP_TERMINAL_BUSI_FUNC between", value1, value2, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpTerminalBusiFuncNotBetween(String value1, String value2) {
            addCriterion("UP_TERMINAL_BUSI_FUNC not between", value1, value2, "upTerminalBusiFunc");
            return (Criteria) this;
        }

        public Criteria andUpStatesIsNull() {
            addCriterion("UP_STATES is null");
            return (Criteria) this;
        }

        public Criteria andUpStatesIsNotNull() {
            addCriterion("UP_STATES is not null");
            return (Criteria) this;
        }

        public Criteria andUpStatesEqualTo(String value) {
            addCriterion("UP_STATES =", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesNotEqualTo(String value) {
            addCriterion("UP_STATES <>", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesGreaterThan(String value) {
            addCriterion("UP_STATES >", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesGreaterThanOrEqualTo(String value) {
            addCriterion("UP_STATES >=", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesLessThan(String value) {
            addCriterion("UP_STATES <", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesLessThanOrEqualTo(String value) {
            addCriterion("UP_STATES <=", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesLike(String value) {
            addCriterion("UP_STATES like", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesNotLike(String value) {
            addCriterion("UP_STATES not like", value, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesIn(List<String> values) {
            addCriterion("UP_STATES in", values, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesNotIn(List<String> values) {
            addCriterion("UP_STATES not in", values, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesBetween(String value1, String value2) {
            addCriterion("UP_STATES between", value1, value2, "upStates");
            return (Criteria) this;
        }

        public Criteria andUpStatesNotBetween(String value1, String value2) {
            addCriterion("UP_STATES not between", value1, value2, "upStates");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("UPDATE_TIME like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("UPDATE_TIME not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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