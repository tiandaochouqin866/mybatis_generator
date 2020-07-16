package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class SysBranchEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysBranchEntityExample() {
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

        public Criteria andBranchTypeIsNull() {
            addCriterion("BRANCH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBranchTypeIsNotNull() {
            addCriterion("BRANCH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBranchTypeEqualTo(Short value) {
            addCriterion("BRANCH_TYPE =", value, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeNotEqualTo(Short value) {
            addCriterion("BRANCH_TYPE <>", value, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeGreaterThan(Short value) {
            addCriterion("BRANCH_TYPE >", value, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("BRANCH_TYPE >=", value, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeLessThan(Short value) {
            addCriterion("BRANCH_TYPE <", value, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeLessThanOrEqualTo(Short value) {
            addCriterion("BRANCH_TYPE <=", value, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeIn(List<Short> values) {
            addCriterion("BRANCH_TYPE in", values, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeNotIn(List<Short> values) {
            addCriterion("BRANCH_TYPE not in", values, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeBetween(Short value1, Short value2) {
            addCriterion("BRANCH_TYPE between", value1, value2, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchTypeNotBetween(Short value1, Short value2) {
            addCriterion("BRANCH_TYPE not between", value1, value2, "branchType");
            return (Criteria) this;
        }

        public Criteria andBranchLevelIsNull() {
            addCriterion("BRANCH_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andBranchLevelIsNotNull() {
            addCriterion("BRANCH_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andBranchLevelEqualTo(Short value) {
            addCriterion("BRANCH_LEVEL =", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelNotEqualTo(Short value) {
            addCriterion("BRANCH_LEVEL <>", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelGreaterThan(Short value) {
            addCriterion("BRANCH_LEVEL >", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("BRANCH_LEVEL >=", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelLessThan(Short value) {
            addCriterion("BRANCH_LEVEL <", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelLessThanOrEqualTo(Short value) {
            addCriterion("BRANCH_LEVEL <=", value, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelIn(List<Short> values) {
            addCriterion("BRANCH_LEVEL in", values, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelNotIn(List<Short> values) {
            addCriterion("BRANCH_LEVEL not in", values, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelBetween(Short value1, Short value2) {
            addCriterion("BRANCH_LEVEL between", value1, value2, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andBranchLevelNotBetween(Short value1, Short value2) {
            addCriterion("BRANCH_LEVEL not between", value1, value2, "branchLevel");
            return (Criteria) this;
        }

        public Criteria andParentBranchIsNull() {
            addCriterion("PARENT_BRANCH is null");
            return (Criteria) this;
        }

        public Criteria andParentBranchIsNotNull() {
            addCriterion("PARENT_BRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andParentBranchEqualTo(Long value) {
            addCriterion("PARENT_BRANCH =", value, "parentBranch");
            return (Criteria) this;
        }

        public Criteria andParentBranchNotEqualTo(Long value) {
            addCriterion("PARENT_BRANCH <>", value, "parentBranch");
            return (Criteria) this;
        }

        public Criteria andParentBranchGreaterThan(Long value) {
            addCriterion("PARENT_BRANCH >", value, "parentBranch");
            return (Criteria) this;
        }

        public Criteria andParentBranchGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_BRANCH >=", value, "parentBranch");
            return (Criteria) this;
        }

        public Criteria andParentBranchLessThan(Long value) {
            addCriterion("PARENT_BRANCH <", value, "parentBranch");
            return (Criteria) this;
        }

        public Criteria andParentBranchLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_BRANCH <=", value, "parentBranch");
            return (Criteria) this;
        }

        public Criteria andParentBranchIn(List<Long> values) {
            addCriterion("PARENT_BRANCH in", values, "parentBranch");
            return (Criteria) this;
        }

        public Criteria andParentBranchNotIn(List<Long> values) {
            addCriterion("PARENT_BRANCH not in", values, "parentBranch");
            return (Criteria) this;
        }

        public Criteria andParentBranchBetween(Long value1, Long value2) {
            addCriterion("PARENT_BRANCH between", value1, value2, "parentBranch");
            return (Criteria) this;
        }

        public Criteria andParentBranchNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_BRANCH not between", value1, value2, "parentBranch");
            return (Criteria) this;
        }

        public Criteria andContactorIsNull() {
            addCriterion("CONTACTOR is null");
            return (Criteria) this;
        }

        public Criteria andContactorIsNotNull() {
            addCriterion("CONTACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andContactorEqualTo(String value) {
            addCriterion("CONTACTOR =", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotEqualTo(String value) {
            addCriterion("CONTACTOR <>", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorGreaterThan(String value) {
            addCriterion("CONTACTOR >", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTOR >=", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorLessThan(String value) {
            addCriterion("CONTACTOR <", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorLessThanOrEqualTo(String value) {
            addCriterion("CONTACTOR <=", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorIn(List<String> values) {
            addCriterion("CONTACTOR in", values, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotIn(List<String> values) {
            addCriterion("CONTACTOR not in", values, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorBetween(String value1, String value2) {
            addCriterion("CONTACTOR between", value1, value2, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotBetween(String value1, String value2) {
            addCriterion("CONTACTOR not between", value1, value2, "contactor");
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

        public Criteria andContactAddrIsNull() {
            addCriterion("CONTACT_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andContactAddrIsNotNull() {
            addCriterion("CONTACT_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddrEqualTo(String value) {
            addCriterion("CONTACT_ADDR =", value, "contactAddr");
            return (Criteria) this;
        }

        public Criteria andContactAddrNotEqualTo(String value) {
            addCriterion("CONTACT_ADDR <>", value, "contactAddr");
            return (Criteria) this;
        }

        public Criteria andContactAddrGreaterThan(String value) {
            addCriterion("CONTACT_ADDR >", value, "contactAddr");
            return (Criteria) this;
        }

        public Criteria andContactAddrGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_ADDR >=", value, "contactAddr");
            return (Criteria) this;
        }

        public Criteria andContactAddrLessThan(String value) {
            addCriterion("CONTACT_ADDR <", value, "contactAddr");
            return (Criteria) this;
        }

        public Criteria andContactAddrLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_ADDR <=", value, "contactAddr");
            return (Criteria) this;
        }

        public Criteria andContactAddrIn(List<String> values) {
            addCriterion("CONTACT_ADDR in", values, "contactAddr");
            return (Criteria) this;
        }

        public Criteria andContactAddrNotIn(List<String> values) {
            addCriterion("CONTACT_ADDR not in", values, "contactAddr");
            return (Criteria) this;
        }

        public Criteria andContactAddrBetween(String value1, String value2) {
            addCriterion("CONTACT_ADDR between", value1, value2, "contactAddr");
            return (Criteria) this;
        }

        public Criteria andContactAddrNotBetween(String value1, String value2) {
            addCriterion("CONTACT_ADDR not between", value1, value2, "contactAddr");
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

        public Criteria andOperationStaffIsNull() {
            addCriterion("OPERATION_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andOperationStaffIsNotNull() {
            addCriterion("OPERATION_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andOperationStaffEqualTo(String value) {
            addCriterion("OPERATION_STAFF =", value, "operationStaff");
            return (Criteria) this;
        }

        public Criteria andOperationStaffNotEqualTo(String value) {
            addCriterion("OPERATION_STAFF <>", value, "operationStaff");
            return (Criteria) this;
        }

        public Criteria andOperationStaffGreaterThan(String value) {
            addCriterion("OPERATION_STAFF >", value, "operationStaff");
            return (Criteria) this;
        }

        public Criteria andOperationStaffGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_STAFF >=", value, "operationStaff");
            return (Criteria) this;
        }

        public Criteria andOperationStaffLessThan(String value) {
            addCriterion("OPERATION_STAFF <", value, "operationStaff");
            return (Criteria) this;
        }

        public Criteria andOperationStaffLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_STAFF <=", value, "operationStaff");
            return (Criteria) this;
        }

        public Criteria andOperationStaffLike(String value) {
            addCriterion("OPERATION_STAFF like", value, "operationStaff");
            return (Criteria) this;
        }

        public Criteria andOperationStaffNotLike(String value) {
            addCriterion("OPERATION_STAFF not like", value, "operationStaff");
            return (Criteria) this;
        }

        public Criteria andOperationStaffIn(List<String> values) {
            addCriterion("OPERATION_STAFF in", values, "operationStaff");
            return (Criteria) this;
        }

        public Criteria andOperationStaffNotIn(List<String> values) {
            addCriterion("OPERATION_STAFF not in", values, "operationStaff");
            return (Criteria) this;
        }

        public Criteria andOperationStaffBetween(String value1, String value2) {
            addCriterion("OPERATION_STAFF between", value1, value2, "operationStaff");
            return (Criteria) this;
        }

        public Criteria andOperationStaffNotBetween(String value1, String value2) {
            addCriterion("OPERATION_STAFF not between", value1, value2, "operationStaff");
            return (Criteria) this;
        }

        public Criteria andIsIndependentActIsNull() {
            addCriterion("IS_INDEPENDENT_ACT is null");
            return (Criteria) this;
        }

        public Criteria andIsIndependentActIsNotNull() {
            addCriterion("IS_INDEPENDENT_ACT is not null");
            return (Criteria) this;
        }

        public Criteria andIsIndependentActEqualTo(Short value) {
            addCriterion("IS_INDEPENDENT_ACT =", value, "isIndependentAct");
            return (Criteria) this;
        }

        public Criteria andIsIndependentActNotEqualTo(Short value) {
            addCriterion("IS_INDEPENDENT_ACT <>", value, "isIndependentAct");
            return (Criteria) this;
        }

        public Criteria andIsIndependentActGreaterThan(Short value) {
            addCriterion("IS_INDEPENDENT_ACT >", value, "isIndependentAct");
            return (Criteria) this;
        }

        public Criteria andIsIndependentActGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_INDEPENDENT_ACT >=", value, "isIndependentAct");
            return (Criteria) this;
        }

        public Criteria andIsIndependentActLessThan(Short value) {
            addCriterion("IS_INDEPENDENT_ACT <", value, "isIndependentAct");
            return (Criteria) this;
        }

        public Criteria andIsIndependentActLessThanOrEqualTo(Short value) {
            addCriterion("IS_INDEPENDENT_ACT <=", value, "isIndependentAct");
            return (Criteria) this;
        }

        public Criteria andIsIndependentActIn(List<Short> values) {
            addCriterion("IS_INDEPENDENT_ACT in", values, "isIndependentAct");
            return (Criteria) this;
        }

        public Criteria andIsIndependentActNotIn(List<Short> values) {
            addCriterion("IS_INDEPENDENT_ACT not in", values, "isIndependentAct");
            return (Criteria) this;
        }

        public Criteria andIsIndependentActBetween(Short value1, Short value2) {
            addCriterion("IS_INDEPENDENT_ACT between", value1, value2, "isIndependentAct");
            return (Criteria) this;
        }

        public Criteria andIsIndependentActNotBetween(Short value1, Short value2) {
            addCriterion("IS_INDEPENDENT_ACT not between", value1, value2, "isIndependentAct");
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

        public Criteria andIsBusiShopIsNull() {
            addCriterion("IS_BUSI_SHOP is null");
            return (Criteria) this;
        }

        public Criteria andIsBusiShopIsNotNull() {
            addCriterion("IS_BUSI_SHOP is not null");
            return (Criteria) this;
        }

        public Criteria andIsBusiShopEqualTo(Short value) {
            addCriterion("IS_BUSI_SHOP =", value, "isBusiShop");
            return (Criteria) this;
        }

        public Criteria andIsBusiShopNotEqualTo(Short value) {
            addCriterion("IS_BUSI_SHOP <>", value, "isBusiShop");
            return (Criteria) this;
        }

        public Criteria andIsBusiShopGreaterThan(Short value) {
            addCriterion("IS_BUSI_SHOP >", value, "isBusiShop");
            return (Criteria) this;
        }

        public Criteria andIsBusiShopGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_BUSI_SHOP >=", value, "isBusiShop");
            return (Criteria) this;
        }

        public Criteria andIsBusiShopLessThan(Short value) {
            addCriterion("IS_BUSI_SHOP <", value, "isBusiShop");
            return (Criteria) this;
        }

        public Criteria andIsBusiShopLessThanOrEqualTo(Short value) {
            addCriterion("IS_BUSI_SHOP <=", value, "isBusiShop");
            return (Criteria) this;
        }

        public Criteria andIsBusiShopIn(List<Short> values) {
            addCriterion("IS_BUSI_SHOP in", values, "isBusiShop");
            return (Criteria) this;
        }

        public Criteria andIsBusiShopNotIn(List<Short> values) {
            addCriterion("IS_BUSI_SHOP not in", values, "isBusiShop");
            return (Criteria) this;
        }

        public Criteria andIsBusiShopBetween(Short value1, Short value2) {
            addCriterion("IS_BUSI_SHOP between", value1, value2, "isBusiShop");
            return (Criteria) this;
        }

        public Criteria andIsBusiShopNotBetween(Short value1, Short value2) {
            addCriterion("IS_BUSI_SHOP not between", value1, value2, "isBusiShop");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeIsNull() {
            addCriterion("INNER_BRANCH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeIsNotNull() {
            addCriterion("INNER_BRANCH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeEqualTo(String value) {
            addCriterion("INNER_BRANCH_CODE =", value, "innerBranchCode");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeNotEqualTo(String value) {
            addCriterion("INNER_BRANCH_CODE <>", value, "innerBranchCode");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeGreaterThan(String value) {
            addCriterion("INNER_BRANCH_CODE >", value, "innerBranchCode");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INNER_BRANCH_CODE >=", value, "innerBranchCode");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeLessThan(String value) {
            addCriterion("INNER_BRANCH_CODE <", value, "innerBranchCode");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeLessThanOrEqualTo(String value) {
            addCriterion("INNER_BRANCH_CODE <=", value, "innerBranchCode");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeLike(String value) {
            addCriterion("INNER_BRANCH_CODE like", value, "innerBranchCode");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeNotLike(String value) {
            addCriterion("INNER_BRANCH_CODE not like", value, "innerBranchCode");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeIn(List<String> values) {
            addCriterion("INNER_BRANCH_CODE in", values, "innerBranchCode");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeNotIn(List<String> values) {
            addCriterion("INNER_BRANCH_CODE not in", values, "innerBranchCode");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeBetween(String value1, String value2) {
            addCriterion("INNER_BRANCH_CODE between", value1, value2, "innerBranchCode");
            return (Criteria) this;
        }

        public Criteria andInnerBranchCodeNotBetween(String value1, String value2) {
            addCriterion("INNER_BRANCH_CODE not between", value1, value2, "innerBranchCode");
            return (Criteria) this;
        }

        public Criteria andBusiExpandIsNull() {
            addCriterion("BUSI_EXPAND is null");
            return (Criteria) this;
        }

        public Criteria andBusiExpandIsNotNull() {
            addCriterion("BUSI_EXPAND is not null");
            return (Criteria) this;
        }

        public Criteria andBusiExpandEqualTo(String value) {
            addCriterion("BUSI_EXPAND =", value, "busiExpand");
            return (Criteria) this;
        }

        public Criteria andBusiExpandNotEqualTo(String value) {
            addCriterion("BUSI_EXPAND <>", value, "busiExpand");
            return (Criteria) this;
        }

        public Criteria andBusiExpandGreaterThan(String value) {
            addCriterion("BUSI_EXPAND >", value, "busiExpand");
            return (Criteria) this;
        }

        public Criteria andBusiExpandGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_EXPAND >=", value, "busiExpand");
            return (Criteria) this;
        }

        public Criteria andBusiExpandLessThan(String value) {
            addCriterion("BUSI_EXPAND <", value, "busiExpand");
            return (Criteria) this;
        }

        public Criteria andBusiExpandLessThanOrEqualTo(String value) {
            addCriterion("BUSI_EXPAND <=", value, "busiExpand");
            return (Criteria) this;
        }

        public Criteria andBusiExpandLike(String value) {
            addCriterion("BUSI_EXPAND like", value, "busiExpand");
            return (Criteria) this;
        }

        public Criteria andBusiExpandNotLike(String value) {
            addCriterion("BUSI_EXPAND not like", value, "busiExpand");
            return (Criteria) this;
        }

        public Criteria andBusiExpandIn(List<String> values) {
            addCriterion("BUSI_EXPAND in", values, "busiExpand");
            return (Criteria) this;
        }

        public Criteria andBusiExpandNotIn(List<String> values) {
            addCriterion("BUSI_EXPAND not in", values, "busiExpand");
            return (Criteria) this;
        }

        public Criteria andBusiExpandBetween(String value1, String value2) {
            addCriterion("BUSI_EXPAND between", value1, value2, "busiExpand");
            return (Criteria) this;
        }

        public Criteria andBusiExpandNotBetween(String value1, String value2) {
            addCriterion("BUSI_EXPAND not between", value1, value2, "busiExpand");
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