package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class TBusiNoticeEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBusiNoticeEntityExample() {
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

        public Criteria andBusiFlowNoIsNull() {
            addCriterion("BUSI_FLOW_NO is null");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoIsNotNull() {
            addCriterion("BUSI_FLOW_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoEqualTo(Long value) {
            addCriterion("BUSI_FLOW_NO =", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoNotEqualTo(Long value) {
            addCriterion("BUSI_FLOW_NO <>", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoGreaterThan(Long value) {
            addCriterion("BUSI_FLOW_NO >", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSI_FLOW_NO >=", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoLessThan(Long value) {
            addCriterion("BUSI_FLOW_NO <", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoLessThanOrEqualTo(Long value) {
            addCriterion("BUSI_FLOW_NO <=", value, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoIn(List<Long> values) {
            addCriterion("BUSI_FLOW_NO in", values, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoNotIn(List<Long> values) {
            addCriterion("BUSI_FLOW_NO not in", values, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoBetween(Long value1, Long value2) {
            addCriterion("BUSI_FLOW_NO between", value1, value2, "busiFlowNo");
            return (Criteria) this;
        }

        public Criteria andBusiFlowNoNotBetween(Long value1, Long value2) {
            addCriterion("BUSI_FLOW_NO not between", value1, value2, "busiFlowNo");
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

        public Criteria andBusiTypeEqualTo(Short value) {
            addCriterion("BUSI_TYPE =", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotEqualTo(Short value) {
            addCriterion("BUSI_TYPE <>", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThan(Short value) {
            addCriterion("BUSI_TYPE >", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("BUSI_TYPE >=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThan(Short value) {
            addCriterion("BUSI_TYPE <", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeLessThanOrEqualTo(Short value) {
            addCriterion("BUSI_TYPE <=", value, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeIn(List<Short> values) {
            addCriterion("BUSI_TYPE in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotIn(List<Short> values) {
            addCriterion("BUSI_TYPE not in", values, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeBetween(Short value1, Short value2) {
            addCriterion("BUSI_TYPE between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiTypeNotBetween(Short value1, Short value2) {
            addCriterion("BUSI_TYPE not between", value1, value2, "busiType");
            return (Criteria) this;
        }

        public Criteria andBusiNoIsNull() {
            addCriterion("BUSI_NO is null");
            return (Criteria) this;
        }

        public Criteria andBusiNoIsNotNull() {
            addCriterion("BUSI_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBusiNoEqualTo(Long value) {
            addCriterion("BUSI_NO =", value, "busiNo");
            return (Criteria) this;
        }

        public Criteria andBusiNoNotEqualTo(Long value) {
            addCriterion("BUSI_NO <>", value, "busiNo");
            return (Criteria) this;
        }

        public Criteria andBusiNoGreaterThan(Long value) {
            addCriterion("BUSI_NO >", value, "busiNo");
            return (Criteria) this;
        }

        public Criteria andBusiNoGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSI_NO >=", value, "busiNo");
            return (Criteria) this;
        }

        public Criteria andBusiNoLessThan(Long value) {
            addCriterion("BUSI_NO <", value, "busiNo");
            return (Criteria) this;
        }

        public Criteria andBusiNoLessThanOrEqualTo(Long value) {
            addCriterion("BUSI_NO <=", value, "busiNo");
            return (Criteria) this;
        }

        public Criteria andBusiNoIn(List<Long> values) {
            addCriterion("BUSI_NO in", values, "busiNo");
            return (Criteria) this;
        }

        public Criteria andBusiNoNotIn(List<Long> values) {
            addCriterion("BUSI_NO not in", values, "busiNo");
            return (Criteria) this;
        }

        public Criteria andBusiNoBetween(Long value1, Long value2) {
            addCriterion("BUSI_NO between", value1, value2, "busiNo");
            return (Criteria) this;
        }

        public Criteria andBusiNoNotBetween(Long value1, Long value2) {
            addCriterion("BUSI_NO not between", value1, value2, "busiNo");
            return (Criteria) this;
        }

        public Criteria andBusiBranchIsNull() {
            addCriterion("BUSI_BRANCH is null");
            return (Criteria) this;
        }

        public Criteria andBusiBranchIsNotNull() {
            addCriterion("BUSI_BRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andBusiBranchEqualTo(Long value) {
            addCriterion("BUSI_BRANCH =", value, "busiBranch");
            return (Criteria) this;
        }

        public Criteria andBusiBranchNotEqualTo(Long value) {
            addCriterion("BUSI_BRANCH <>", value, "busiBranch");
            return (Criteria) this;
        }

        public Criteria andBusiBranchGreaterThan(Long value) {
            addCriterion("BUSI_BRANCH >", value, "busiBranch");
            return (Criteria) this;
        }

        public Criteria andBusiBranchGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSI_BRANCH >=", value, "busiBranch");
            return (Criteria) this;
        }

        public Criteria andBusiBranchLessThan(Long value) {
            addCriterion("BUSI_BRANCH <", value, "busiBranch");
            return (Criteria) this;
        }

        public Criteria andBusiBranchLessThanOrEqualTo(Long value) {
            addCriterion("BUSI_BRANCH <=", value, "busiBranch");
            return (Criteria) this;
        }

        public Criteria andBusiBranchIn(List<Long> values) {
            addCriterion("BUSI_BRANCH in", values, "busiBranch");
            return (Criteria) this;
        }

        public Criteria andBusiBranchNotIn(List<Long> values) {
            addCriterion("BUSI_BRANCH not in", values, "busiBranch");
            return (Criteria) this;
        }

        public Criteria andBusiBranchBetween(Long value1, Long value2) {
            addCriterion("BUSI_BRANCH between", value1, value2, "busiBranch");
            return (Criteria) this;
        }

        public Criteria andBusiBranchNotBetween(Long value1, Long value2) {
            addCriterion("BUSI_BRANCH not between", value1, value2, "busiBranch");
            return (Criteria) this;
        }

        public Criteria andCurPrcIndexIsNull() {
            addCriterion("CUR_PRC_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andCurPrcIndexIsNotNull() {
            addCriterion("CUR_PRC_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andCurPrcIndexEqualTo(Short value) {
            addCriterion("CUR_PRC_INDEX =", value, "curPrcIndex");
            return (Criteria) this;
        }

        public Criteria andCurPrcIndexNotEqualTo(Short value) {
            addCriterion("CUR_PRC_INDEX <>", value, "curPrcIndex");
            return (Criteria) this;
        }

        public Criteria andCurPrcIndexGreaterThan(Short value) {
            addCriterion("CUR_PRC_INDEX >", value, "curPrcIndex");
            return (Criteria) this;
        }

        public Criteria andCurPrcIndexGreaterThanOrEqualTo(Short value) {
            addCriterion("CUR_PRC_INDEX >=", value, "curPrcIndex");
            return (Criteria) this;
        }

        public Criteria andCurPrcIndexLessThan(Short value) {
            addCriterion("CUR_PRC_INDEX <", value, "curPrcIndex");
            return (Criteria) this;
        }

        public Criteria andCurPrcIndexLessThanOrEqualTo(Short value) {
            addCriterion("CUR_PRC_INDEX <=", value, "curPrcIndex");
            return (Criteria) this;
        }

        public Criteria andCurPrcIndexIn(List<Short> values) {
            addCriterion("CUR_PRC_INDEX in", values, "curPrcIndex");
            return (Criteria) this;
        }

        public Criteria andCurPrcIndexNotIn(List<Short> values) {
            addCriterion("CUR_PRC_INDEX not in", values, "curPrcIndex");
            return (Criteria) this;
        }

        public Criteria andCurPrcIndexBetween(Short value1, Short value2) {
            addCriterion("CUR_PRC_INDEX between", value1, value2, "curPrcIndex");
            return (Criteria) this;
        }

        public Criteria andCurPrcIndexNotBetween(Short value1, Short value2) {
            addCriterion("CUR_PRC_INDEX not between", value1, value2, "curPrcIndex");
            return (Criteria) this;
        }

        public Criteria andPrcCodeIsNull() {
            addCriterion("PRC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPrcCodeIsNotNull() {
            addCriterion("PRC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPrcCodeEqualTo(String value) {
            addCriterion("PRC_CODE =", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeNotEqualTo(String value) {
            addCriterion("PRC_CODE <>", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeGreaterThan(String value) {
            addCriterion("PRC_CODE >", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRC_CODE >=", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeLessThan(String value) {
            addCriterion("PRC_CODE <", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeLessThanOrEqualTo(String value) {
            addCriterion("PRC_CODE <=", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeLike(String value) {
            addCriterion("PRC_CODE like", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeNotLike(String value) {
            addCriterion("PRC_CODE not like", value, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeIn(List<String> values) {
            addCriterion("PRC_CODE in", values, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeNotIn(List<String> values) {
            addCriterion("PRC_CODE not in", values, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeBetween(String value1, String value2) {
            addCriterion("PRC_CODE between", value1, value2, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcCodeNotBetween(String value1, String value2) {
            addCriterion("PRC_CODE not between", value1, value2, "prcCode");
            return (Criteria) this;
        }

        public Criteria andPrcStatusIsNull() {
            addCriterion("PRC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPrcStatusIsNotNull() {
            addCriterion("PRC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPrcStatusEqualTo(Short value) {
            addCriterion("PRC_STATUS =", value, "prcStatus");
            return (Criteria) this;
        }

        public Criteria andPrcStatusNotEqualTo(Short value) {
            addCriterion("PRC_STATUS <>", value, "prcStatus");
            return (Criteria) this;
        }

        public Criteria andPrcStatusGreaterThan(Short value) {
            addCriterion("PRC_STATUS >", value, "prcStatus");
            return (Criteria) this;
        }

        public Criteria andPrcStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("PRC_STATUS >=", value, "prcStatus");
            return (Criteria) this;
        }

        public Criteria andPrcStatusLessThan(Short value) {
            addCriterion("PRC_STATUS <", value, "prcStatus");
            return (Criteria) this;
        }

        public Criteria andPrcStatusLessThanOrEqualTo(Short value) {
            addCriterion("PRC_STATUS <=", value, "prcStatus");
            return (Criteria) this;
        }

        public Criteria andPrcStatusIn(List<Short> values) {
            addCriterion("PRC_STATUS in", values, "prcStatus");
            return (Criteria) this;
        }

        public Criteria andPrcStatusNotIn(List<Short> values) {
            addCriterion("PRC_STATUS not in", values, "prcStatus");
            return (Criteria) this;
        }

        public Criteria andPrcStatusBetween(Short value1, Short value2) {
            addCriterion("PRC_STATUS between", value1, value2, "prcStatus");
            return (Criteria) this;
        }

        public Criteria andPrcStatusNotBetween(Short value1, Short value2) {
            addCriterion("PRC_STATUS not between", value1, value2, "prcStatus");
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

        public Criteria andRoleCodeIsNull() {
            addCriterion("ROLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNotNull() {
            addCriterion("ROLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeEqualTo(String value) {
            addCriterion("ROLE_CODE =", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotEqualTo(String value) {
            addCriterion("ROLE_CODE <>", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThan(String value) {
            addCriterion("ROLE_CODE >", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_CODE >=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThan(String value) {
            addCriterion("ROLE_CODE <", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("ROLE_CODE <=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLike(String value) {
            addCriterion("ROLE_CODE like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotLike(String value) {
            addCriterion("ROLE_CODE not like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIn(List<String> values) {
            addCriterion("ROLE_CODE in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotIn(List<String> values) {
            addCriterion("ROLE_CODE not in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeBetween(String value1, String value2) {
            addCriterion("ROLE_CODE between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotBetween(String value1, String value2) {
            addCriterion("ROLE_CODE not between", value1, value2, "roleCode");
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

        public Criteria andUserCodeIsNull() {
            addCriterion("USER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("USER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("USER_CODE =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("USER_CODE <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("USER_CODE >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CODE >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("USER_CODE <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_CODE <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("USER_CODE like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("USER_CODE not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("USER_CODE in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("USER_CODE not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("USER_CODE between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("USER_CODE not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNull() {
            addCriterion("NOTICE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNotNull() {
            addCriterion("NOTICE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeEqualTo(String value) {
            addCriterion("NOTICE_TIME =", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotEqualTo(String value) {
            addCriterion("NOTICE_TIME <>", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThan(String value) {
            addCriterion("NOTICE_TIME >", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICE_TIME >=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThan(String value) {
            addCriterion("NOTICE_TIME <", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThanOrEqualTo(String value) {
            addCriterion("NOTICE_TIME <=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLike(String value) {
            addCriterion("NOTICE_TIME like", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotLike(String value) {
            addCriterion("NOTICE_TIME not like", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIn(List<String> values) {
            addCriterion("NOTICE_TIME in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotIn(List<String> values) {
            addCriterion("NOTICE_TIME not in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeBetween(String value1, String value2) {
            addCriterion("NOTICE_TIME between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotBetween(String value1, String value2) {
            addCriterion("NOTICE_TIME not between", value1, value2, "noticeTime");
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