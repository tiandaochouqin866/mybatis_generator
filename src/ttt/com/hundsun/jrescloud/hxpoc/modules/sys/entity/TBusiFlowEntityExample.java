package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class TBusiFlowEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBusiFlowEntityExample() {
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

        public Criteria andOperCodeIsNull() {
            addCriterion("OPER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOperCodeIsNotNull() {
            addCriterion("OPER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOperCodeEqualTo(Short value) {
            addCriterion("OPER_CODE =", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeNotEqualTo(Short value) {
            addCriterion("OPER_CODE <>", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeGreaterThan(Short value) {
            addCriterion("OPER_CODE >", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("OPER_CODE >=", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeLessThan(Short value) {
            addCriterion("OPER_CODE <", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeLessThanOrEqualTo(Short value) {
            addCriterion("OPER_CODE <=", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeIn(List<Short> values) {
            addCriterion("OPER_CODE in", values, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeNotIn(List<Short> values) {
            addCriterion("OPER_CODE not in", values, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeBetween(Short value1, Short value2) {
            addCriterion("OPER_CODE between", value1, value2, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeNotBetween(Short value1, Short value2) {
            addCriterion("OPER_CODE not between", value1, value2, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperDescIsNull() {
            addCriterion("OPER_DESC is null");
            return (Criteria) this;
        }

        public Criteria andOperDescIsNotNull() {
            addCriterion("OPER_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andOperDescEqualTo(String value) {
            addCriterion("OPER_DESC =", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescNotEqualTo(String value) {
            addCriterion("OPER_DESC <>", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescGreaterThan(String value) {
            addCriterion("OPER_DESC >", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_DESC >=", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescLessThan(String value) {
            addCriterion("OPER_DESC <", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescLessThanOrEqualTo(String value) {
            addCriterion("OPER_DESC <=", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescIn(List<String> values) {
            addCriterion("OPER_DESC in", values, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescNotIn(List<String> values) {
            addCriterion("OPER_DESC not in", values, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescBetween(String value1, String value2) {
            addCriterion("OPER_DESC between", value1, value2, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescNotBetween(String value1, String value2) {
            addCriterion("OPER_DESC not between", value1, value2, "operDesc");
            return (Criteria) this;
        }

        public Criteria andExtFileIsNull() {
            addCriterion("EXT_FILE is null");
            return (Criteria) this;
        }

        public Criteria andExtFileIsNotNull() {
            addCriterion("EXT_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andExtFileEqualTo(String value) {
            addCriterion("EXT_FILE =", value, "extFile");
            return (Criteria) this;
        }

        public Criteria andExtFileNotEqualTo(String value) {
            addCriterion("EXT_FILE <>", value, "extFile");
            return (Criteria) this;
        }

        public Criteria andExtFileGreaterThan(String value) {
            addCriterion("EXT_FILE >", value, "extFile");
            return (Criteria) this;
        }

        public Criteria andExtFileGreaterThanOrEqualTo(String value) {
            addCriterion("EXT_FILE >=", value, "extFile");
            return (Criteria) this;
        }

        public Criteria andExtFileLessThan(String value) {
            addCriterion("EXT_FILE <", value, "extFile");
            return (Criteria) this;
        }

        public Criteria andExtFileLessThanOrEqualTo(String value) {
            addCriterion("EXT_FILE <=", value, "extFile");
            return (Criteria) this;
        }

        public Criteria andExtFileLike(String value) {
            addCriterion("EXT_FILE like", value, "extFile");
            return (Criteria) this;
        }

        public Criteria andExtFileNotLike(String value) {
            addCriterion("EXT_FILE not like", value, "extFile");
            return (Criteria) this;
        }

        public Criteria andExtFileIn(List<String> values) {
            addCriterion("EXT_FILE in", values, "extFile");
            return (Criteria) this;
        }

        public Criteria andExtFileNotIn(List<String> values) {
            addCriterion("EXT_FILE not in", values, "extFile");
            return (Criteria) this;
        }

        public Criteria andExtFileBetween(String value1, String value2) {
            addCriterion("EXT_FILE between", value1, value2, "extFile");
            return (Criteria) this;
        }

        public Criteria andExtFileNotBetween(String value1, String value2) {
            addCriterion("EXT_FILE not between", value1, value2, "extFile");
            return (Criteria) this;
        }

        public Criteria andOperPersonIsNull() {
            addCriterion("OPER_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andOperPersonIsNotNull() {
            addCriterion("OPER_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andOperPersonEqualTo(String value) {
            addCriterion("OPER_PERSON =", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonNotEqualTo(String value) {
            addCriterion("OPER_PERSON <>", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonGreaterThan(String value) {
            addCriterion("OPER_PERSON >", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_PERSON >=", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonLessThan(String value) {
            addCriterion("OPER_PERSON <", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonLessThanOrEqualTo(String value) {
            addCriterion("OPER_PERSON <=", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonLike(String value) {
            addCriterion("OPER_PERSON like", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonNotLike(String value) {
            addCriterion("OPER_PERSON not like", value, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonIn(List<String> values) {
            addCriterion("OPER_PERSON in", values, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonNotIn(List<String> values) {
            addCriterion("OPER_PERSON not in", values, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonBetween(String value1, String value2) {
            addCriterion("OPER_PERSON between", value1, value2, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperPersonNotBetween(String value1, String value2) {
            addCriterion("OPER_PERSON not between", value1, value2, "operPerson");
            return (Criteria) this;
        }

        public Criteria andOperBranchIsNull() {
            addCriterion("OPER_BRANCH is null");
            return (Criteria) this;
        }

        public Criteria andOperBranchIsNotNull() {
            addCriterion("OPER_BRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andOperBranchEqualTo(Long value) {
            addCriterion("OPER_BRANCH =", value, "operBranch");
            return (Criteria) this;
        }

        public Criteria andOperBranchNotEqualTo(Long value) {
            addCriterion("OPER_BRANCH <>", value, "operBranch");
            return (Criteria) this;
        }

        public Criteria andOperBranchGreaterThan(Long value) {
            addCriterion("OPER_BRANCH >", value, "operBranch");
            return (Criteria) this;
        }

        public Criteria andOperBranchGreaterThanOrEqualTo(Long value) {
            addCriterion("OPER_BRANCH >=", value, "operBranch");
            return (Criteria) this;
        }

        public Criteria andOperBranchLessThan(Long value) {
            addCriterion("OPER_BRANCH <", value, "operBranch");
            return (Criteria) this;
        }

        public Criteria andOperBranchLessThanOrEqualTo(Long value) {
            addCriterion("OPER_BRANCH <=", value, "operBranch");
            return (Criteria) this;
        }

        public Criteria andOperBranchIn(List<Long> values) {
            addCriterion("OPER_BRANCH in", values, "operBranch");
            return (Criteria) this;
        }

        public Criteria andOperBranchNotIn(List<Long> values) {
            addCriterion("OPER_BRANCH not in", values, "operBranch");
            return (Criteria) this;
        }

        public Criteria andOperBranchBetween(Long value1, Long value2) {
            addCriterion("OPER_BRANCH between", value1, value2, "operBranch");
            return (Criteria) this;
        }

        public Criteria andOperBranchNotBetween(Long value1, Long value2) {
            addCriterion("OPER_BRANCH not between", value1, value2, "operBranch");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNull() {
            addCriterion("OPER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNotNull() {
            addCriterion("OPER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperTimeEqualTo(String value) {
            addCriterion("OPER_TIME =", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotEqualTo(String value) {
            addCriterion("OPER_TIME <>", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThan(String value) {
            addCriterion("OPER_TIME >", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_TIME >=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThan(String value) {
            addCriterion("OPER_TIME <", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThanOrEqualTo(String value) {
            addCriterion("OPER_TIME <=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLike(String value) {
            addCriterion("OPER_TIME like", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotLike(String value) {
            addCriterion("OPER_TIME not like", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeIn(List<String> values) {
            addCriterion("OPER_TIME in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotIn(List<String> values) {
            addCriterion("OPER_TIME not in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeBetween(String value1, String value2) {
            addCriterion("OPER_TIME between", value1, value2, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotBetween(String value1, String value2) {
            addCriterion("OPER_TIME not between", value1, value2, "operTime");
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

        public Criteria andOperOpinionIsNull() {
            addCriterion("OPER_OPINION is null");
            return (Criteria) this;
        }

        public Criteria andOperOpinionIsNotNull() {
            addCriterion("OPER_OPINION is not null");
            return (Criteria) this;
        }

        public Criteria andOperOpinionEqualTo(Object value) {
            addCriterion("OPER_OPINION =", value, "operOpinion");
            return (Criteria) this;
        }

        public Criteria andOperOpinionNotEqualTo(Object value) {
            addCriterion("OPER_OPINION <>", value, "operOpinion");
            return (Criteria) this;
        }

        public Criteria andOperOpinionGreaterThan(Object value) {
            addCriterion("OPER_OPINION >", value, "operOpinion");
            return (Criteria) this;
        }

        public Criteria andOperOpinionGreaterThanOrEqualTo(Object value) {
            addCriterion("OPER_OPINION >=", value, "operOpinion");
            return (Criteria) this;
        }

        public Criteria andOperOpinionLessThan(Object value) {
            addCriterion("OPER_OPINION <", value, "operOpinion");
            return (Criteria) this;
        }

        public Criteria andOperOpinionLessThanOrEqualTo(Object value) {
            addCriterion("OPER_OPINION <=", value, "operOpinion");
            return (Criteria) this;
        }

        public Criteria andOperOpinionIn(List<Object> values) {
            addCriterion("OPER_OPINION in", values, "operOpinion");
            return (Criteria) this;
        }

        public Criteria andOperOpinionNotIn(List<Object> values) {
            addCriterion("OPER_OPINION not in", values, "operOpinion");
            return (Criteria) this;
        }

        public Criteria andOperOpinionBetween(Object value1, Object value2) {
            addCriterion("OPER_OPINION between", value1, value2, "operOpinion");
            return (Criteria) this;
        }

        public Criteria andOperOpinionNotBetween(Object value1, Object value2) {
            addCriterion("OPER_OPINION not between", value1, value2, "operOpinion");
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