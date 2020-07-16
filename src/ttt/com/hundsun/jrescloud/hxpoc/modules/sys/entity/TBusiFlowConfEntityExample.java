package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class TBusiFlowConfEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBusiFlowConfEntityExample() {
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

        public Criteria andFlowConfNoIsNull() {
            addCriterion("FLOW_CONF_NO is null");
            return (Criteria) this;
        }

        public Criteria andFlowConfNoIsNotNull() {
            addCriterion("FLOW_CONF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFlowConfNoEqualTo(Long value) {
            addCriterion("FLOW_CONF_NO =", value, "flowConfNo");
            return (Criteria) this;
        }

        public Criteria andFlowConfNoNotEqualTo(Long value) {
            addCriterion("FLOW_CONF_NO <>", value, "flowConfNo");
            return (Criteria) this;
        }

        public Criteria andFlowConfNoGreaterThan(Long value) {
            addCriterion("FLOW_CONF_NO >", value, "flowConfNo");
            return (Criteria) this;
        }

        public Criteria andFlowConfNoGreaterThanOrEqualTo(Long value) {
            addCriterion("FLOW_CONF_NO >=", value, "flowConfNo");
            return (Criteria) this;
        }

        public Criteria andFlowConfNoLessThan(Long value) {
            addCriterion("FLOW_CONF_NO <", value, "flowConfNo");
            return (Criteria) this;
        }

        public Criteria andFlowConfNoLessThanOrEqualTo(Long value) {
            addCriterion("FLOW_CONF_NO <=", value, "flowConfNo");
            return (Criteria) this;
        }

        public Criteria andFlowConfNoIn(List<Long> values) {
            addCriterion("FLOW_CONF_NO in", values, "flowConfNo");
            return (Criteria) this;
        }

        public Criteria andFlowConfNoNotIn(List<Long> values) {
            addCriterion("FLOW_CONF_NO not in", values, "flowConfNo");
            return (Criteria) this;
        }

        public Criteria andFlowConfNoBetween(Long value1, Long value2) {
            addCriterion("FLOW_CONF_NO between", value1, value2, "flowConfNo");
            return (Criteria) this;
        }

        public Criteria andFlowConfNoNotBetween(Long value1, Long value2) {
            addCriterion("FLOW_CONF_NO not between", value1, value2, "flowConfNo");
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

        public Criteria andFlowConfVerIsNull() {
            addCriterion("FLOW_CONF_VER is null");
            return (Criteria) this;
        }

        public Criteria andFlowConfVerIsNotNull() {
            addCriterion("FLOW_CONF_VER is not null");
            return (Criteria) this;
        }

        public Criteria andFlowConfVerEqualTo(String value) {
            addCriterion("FLOW_CONF_VER =", value, "flowConfVer");
            return (Criteria) this;
        }

        public Criteria andFlowConfVerNotEqualTo(String value) {
            addCriterion("FLOW_CONF_VER <>", value, "flowConfVer");
            return (Criteria) this;
        }

        public Criteria andFlowConfVerGreaterThan(String value) {
            addCriterion("FLOW_CONF_VER >", value, "flowConfVer");
            return (Criteria) this;
        }

        public Criteria andFlowConfVerGreaterThanOrEqualTo(String value) {
            addCriterion("FLOW_CONF_VER >=", value, "flowConfVer");
            return (Criteria) this;
        }

        public Criteria andFlowConfVerLessThan(String value) {
            addCriterion("FLOW_CONF_VER <", value, "flowConfVer");
            return (Criteria) this;
        }

        public Criteria andFlowConfVerLessThanOrEqualTo(String value) {
            addCriterion("FLOW_CONF_VER <=", value, "flowConfVer");
            return (Criteria) this;
        }

        public Criteria andFlowConfVerLike(String value) {
            addCriterion("FLOW_CONF_VER like", value, "flowConfVer");
            return (Criteria) this;
        }

        public Criteria andFlowConfVerNotLike(String value) {
            addCriterion("FLOW_CONF_VER not like", value, "flowConfVer");
            return (Criteria) this;
        }

        public Criteria andFlowConfVerIn(List<String> values) {
            addCriterion("FLOW_CONF_VER in", values, "flowConfVer");
            return (Criteria) this;
        }

        public Criteria andFlowConfVerNotIn(List<String> values) {
            addCriterion("FLOW_CONF_VER not in", values, "flowConfVer");
            return (Criteria) this;
        }

        public Criteria andFlowConfVerBetween(String value1, String value2) {
            addCriterion("FLOW_CONF_VER between", value1, value2, "flowConfVer");
            return (Criteria) this;
        }

        public Criteria andFlowConfVerNotBetween(String value1, String value2) {
            addCriterion("FLOW_CONF_VER not between", value1, value2, "flowConfVer");
            return (Criteria) this;
        }

        public Criteria andEffectTimeIsNull() {
            addCriterion("EFFECT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEffectTimeIsNotNull() {
            addCriterion("EFFECT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEffectTimeEqualTo(String value) {
            addCriterion("EFFECT_TIME =", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeNotEqualTo(String value) {
            addCriterion("EFFECT_TIME <>", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeGreaterThan(String value) {
            addCriterion("EFFECT_TIME >", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeGreaterThanOrEqualTo(String value) {
            addCriterion("EFFECT_TIME >=", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeLessThan(String value) {
            addCriterion("EFFECT_TIME <", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeLessThanOrEqualTo(String value) {
            addCriterion("EFFECT_TIME <=", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeLike(String value) {
            addCriterion("EFFECT_TIME like", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeNotLike(String value) {
            addCriterion("EFFECT_TIME not like", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeIn(List<String> values) {
            addCriterion("EFFECT_TIME in", values, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeNotIn(List<String> values) {
            addCriterion("EFFECT_TIME not in", values, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeBetween(String value1, String value2) {
            addCriterion("EFFECT_TIME between", value1, value2, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeNotBetween(String value1, String value2) {
            addCriterion("EFFECT_TIME not between", value1, value2, "effectTime");
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

        public Criteria andPrcDescIsNull() {
            addCriterion("PRC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPrcDescIsNotNull() {
            addCriterion("PRC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPrcDescEqualTo(String value) {
            addCriterion("PRC_DESC =", value, "prcDesc");
            return (Criteria) this;
        }

        public Criteria andPrcDescNotEqualTo(String value) {
            addCriterion("PRC_DESC <>", value, "prcDesc");
            return (Criteria) this;
        }

        public Criteria andPrcDescGreaterThan(String value) {
            addCriterion("PRC_DESC >", value, "prcDesc");
            return (Criteria) this;
        }

        public Criteria andPrcDescGreaterThanOrEqualTo(String value) {
            addCriterion("PRC_DESC >=", value, "prcDesc");
            return (Criteria) this;
        }

        public Criteria andPrcDescLessThan(String value) {
            addCriterion("PRC_DESC <", value, "prcDesc");
            return (Criteria) this;
        }

        public Criteria andPrcDescLessThanOrEqualTo(String value) {
            addCriterion("PRC_DESC <=", value, "prcDesc");
            return (Criteria) this;
        }

        public Criteria andPrcDescIn(List<String> values) {
            addCriterion("PRC_DESC in", values, "prcDesc");
            return (Criteria) this;
        }

        public Criteria andPrcDescNotIn(List<String> values) {
            addCriterion("PRC_DESC not in", values, "prcDesc");
            return (Criteria) this;
        }

        public Criteria andPrcDescBetween(String value1, String value2) {
            addCriterion("PRC_DESC between", value1, value2, "prcDesc");
            return (Criteria) this;
        }

        public Criteria andPrcDescNotBetween(String value1, String value2) {
            addCriterion("PRC_DESC not between", value1, value2, "prcDesc");
            return (Criteria) this;
        }

        public Criteria andPrcTypeIsNull() {
            addCriterion("PRC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPrcTypeIsNotNull() {
            addCriterion("PRC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPrcTypeEqualTo(Short value) {
            addCriterion("PRC_TYPE =", value, "prcType");
            return (Criteria) this;
        }

        public Criteria andPrcTypeNotEqualTo(Short value) {
            addCriterion("PRC_TYPE <>", value, "prcType");
            return (Criteria) this;
        }

        public Criteria andPrcTypeGreaterThan(Short value) {
            addCriterion("PRC_TYPE >", value, "prcType");
            return (Criteria) this;
        }

        public Criteria andPrcTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("PRC_TYPE >=", value, "prcType");
            return (Criteria) this;
        }

        public Criteria andPrcTypeLessThan(Short value) {
            addCriterion("PRC_TYPE <", value, "prcType");
            return (Criteria) this;
        }

        public Criteria andPrcTypeLessThanOrEqualTo(Short value) {
            addCriterion("PRC_TYPE <=", value, "prcType");
            return (Criteria) this;
        }

        public Criteria andPrcTypeIn(List<Short> values) {
            addCriterion("PRC_TYPE in", values, "prcType");
            return (Criteria) this;
        }

        public Criteria andPrcTypeNotIn(List<Short> values) {
            addCriterion("PRC_TYPE not in", values, "prcType");
            return (Criteria) this;
        }

        public Criteria andPrcTypeBetween(Short value1, Short value2) {
            addCriterion("PRC_TYPE between", value1, value2, "prcType");
            return (Criteria) this;
        }

        public Criteria andPrcTypeNotBetween(Short value1, Short value2) {
            addCriterion("PRC_TYPE not between", value1, value2, "prcType");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIsNull() {
            addCriterion("FUNCTION_URL is null");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIsNotNull() {
            addCriterion("FUNCTION_URL is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlEqualTo(String value) {
            addCriterion("FUNCTION_URL =", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotEqualTo(String value) {
            addCriterion("FUNCTION_URL <>", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlGreaterThan(String value) {
            addCriterion("FUNCTION_URL >", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("FUNCTION_URL >=", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLessThan(String value) {
            addCriterion("FUNCTION_URL <", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLessThanOrEqualTo(String value) {
            addCriterion("FUNCTION_URL <=", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLike(String value) {
            addCriterion("FUNCTION_URL like", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotLike(String value) {
            addCriterion("FUNCTION_URL not like", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIn(List<String> values) {
            addCriterion("FUNCTION_URL in", values, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotIn(List<String> values) {
            addCriterion("FUNCTION_URL not in", values, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlBetween(String value1, String value2) {
            addCriterion("FUNCTION_URL between", value1, value2, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotBetween(String value1, String value2) {
            addCriterion("FUNCTION_URL not between", value1, value2, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFrontPrcIndexIsNull() {
            addCriterion("FRONT_PRC_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andFrontPrcIndexIsNotNull() {
            addCriterion("FRONT_PRC_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andFrontPrcIndexEqualTo(Short value) {
            addCriterion("FRONT_PRC_INDEX =", value, "frontPrcIndex");
            return (Criteria) this;
        }

        public Criteria andFrontPrcIndexNotEqualTo(Short value) {
            addCriterion("FRONT_PRC_INDEX <>", value, "frontPrcIndex");
            return (Criteria) this;
        }

        public Criteria andFrontPrcIndexGreaterThan(Short value) {
            addCriterion("FRONT_PRC_INDEX >", value, "frontPrcIndex");
            return (Criteria) this;
        }

        public Criteria andFrontPrcIndexGreaterThanOrEqualTo(Short value) {
            addCriterion("FRONT_PRC_INDEX >=", value, "frontPrcIndex");
            return (Criteria) this;
        }

        public Criteria andFrontPrcIndexLessThan(Short value) {
            addCriterion("FRONT_PRC_INDEX <", value, "frontPrcIndex");
            return (Criteria) this;
        }

        public Criteria andFrontPrcIndexLessThanOrEqualTo(Short value) {
            addCriterion("FRONT_PRC_INDEX <=", value, "frontPrcIndex");
            return (Criteria) this;
        }

        public Criteria andFrontPrcIndexIn(List<Short> values) {
            addCriterion("FRONT_PRC_INDEX in", values, "frontPrcIndex");
            return (Criteria) this;
        }

        public Criteria andFrontPrcIndexNotIn(List<Short> values) {
            addCriterion("FRONT_PRC_INDEX not in", values, "frontPrcIndex");
            return (Criteria) this;
        }

        public Criteria andFrontPrcIndexBetween(Short value1, Short value2) {
            addCriterion("FRONT_PRC_INDEX between", value1, value2, "frontPrcIndex");
            return (Criteria) this;
        }

        public Criteria andFrontPrcIndexNotBetween(Short value1, Short value2) {
            addCriterion("FRONT_PRC_INDEX not between", value1, value2, "frontPrcIndex");
            return (Criteria) this;
        }

        public Criteria andBackPrcIndexIsNull() {
            addCriterion("BACK_PRC_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andBackPrcIndexIsNotNull() {
            addCriterion("BACK_PRC_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andBackPrcIndexEqualTo(Short value) {
            addCriterion("BACK_PRC_INDEX =", value, "backPrcIndex");
            return (Criteria) this;
        }

        public Criteria andBackPrcIndexNotEqualTo(Short value) {
            addCriterion("BACK_PRC_INDEX <>", value, "backPrcIndex");
            return (Criteria) this;
        }

        public Criteria andBackPrcIndexGreaterThan(Short value) {
            addCriterion("BACK_PRC_INDEX >", value, "backPrcIndex");
            return (Criteria) this;
        }

        public Criteria andBackPrcIndexGreaterThanOrEqualTo(Short value) {
            addCriterion("BACK_PRC_INDEX >=", value, "backPrcIndex");
            return (Criteria) this;
        }

        public Criteria andBackPrcIndexLessThan(Short value) {
            addCriterion("BACK_PRC_INDEX <", value, "backPrcIndex");
            return (Criteria) this;
        }

        public Criteria andBackPrcIndexLessThanOrEqualTo(Short value) {
            addCriterion("BACK_PRC_INDEX <=", value, "backPrcIndex");
            return (Criteria) this;
        }

        public Criteria andBackPrcIndexIn(List<Short> values) {
            addCriterion("BACK_PRC_INDEX in", values, "backPrcIndex");
            return (Criteria) this;
        }

        public Criteria andBackPrcIndexNotIn(List<Short> values) {
            addCriterion("BACK_PRC_INDEX not in", values, "backPrcIndex");
            return (Criteria) this;
        }

        public Criteria andBackPrcIndexBetween(Short value1, Short value2) {
            addCriterion("BACK_PRC_INDEX between", value1, value2, "backPrcIndex");
            return (Criteria) this;
        }

        public Criteria andBackPrcIndexNotBetween(Short value1, Short value2) {
            addCriterion("BACK_PRC_INDEX not between", value1, value2, "backPrcIndex");
            return (Criteria) this;
        }

        public Criteria andIsBranchNodeIsNull() {
            addCriterion("IS_BRANCH_NODE is null");
            return (Criteria) this;
        }

        public Criteria andIsBranchNodeIsNotNull() {
            addCriterion("IS_BRANCH_NODE is not null");
            return (Criteria) this;
        }

        public Criteria andIsBranchNodeEqualTo(Short value) {
            addCriterion("IS_BRANCH_NODE =", value, "isBranchNode");
            return (Criteria) this;
        }

        public Criteria andIsBranchNodeNotEqualTo(Short value) {
            addCriterion("IS_BRANCH_NODE <>", value, "isBranchNode");
            return (Criteria) this;
        }

        public Criteria andIsBranchNodeGreaterThan(Short value) {
            addCriterion("IS_BRANCH_NODE >", value, "isBranchNode");
            return (Criteria) this;
        }

        public Criteria andIsBranchNodeGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_BRANCH_NODE >=", value, "isBranchNode");
            return (Criteria) this;
        }

        public Criteria andIsBranchNodeLessThan(Short value) {
            addCriterion("IS_BRANCH_NODE <", value, "isBranchNode");
            return (Criteria) this;
        }

        public Criteria andIsBranchNodeLessThanOrEqualTo(Short value) {
            addCriterion("IS_BRANCH_NODE <=", value, "isBranchNode");
            return (Criteria) this;
        }

        public Criteria andIsBranchNodeIn(List<Short> values) {
            addCriterion("IS_BRANCH_NODE in", values, "isBranchNode");
            return (Criteria) this;
        }

        public Criteria andIsBranchNodeNotIn(List<Short> values) {
            addCriterion("IS_BRANCH_NODE not in", values, "isBranchNode");
            return (Criteria) this;
        }

        public Criteria andIsBranchNodeBetween(Short value1, Short value2) {
            addCriterion("IS_BRANCH_NODE between", value1, value2, "isBranchNode");
            return (Criteria) this;
        }

        public Criteria andIsBranchNodeNotBetween(Short value1, Short value2) {
            addCriterion("IS_BRANCH_NODE not between", value1, value2, "isBranchNode");
            return (Criteria) this;
        }

        public Criteria andSendMsgIsNull() {
            addCriterion("SEND_MSG is null");
            return (Criteria) this;
        }

        public Criteria andSendMsgIsNotNull() {
            addCriterion("SEND_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andSendMsgEqualTo(Short value) {
            addCriterion("SEND_MSG =", value, "sendMsg");
            return (Criteria) this;
        }

        public Criteria andSendMsgNotEqualTo(Short value) {
            addCriterion("SEND_MSG <>", value, "sendMsg");
            return (Criteria) this;
        }

        public Criteria andSendMsgGreaterThan(Short value) {
            addCriterion("SEND_MSG >", value, "sendMsg");
            return (Criteria) this;
        }

        public Criteria andSendMsgGreaterThanOrEqualTo(Short value) {
            addCriterion("SEND_MSG >=", value, "sendMsg");
            return (Criteria) this;
        }

        public Criteria andSendMsgLessThan(Short value) {
            addCriterion("SEND_MSG <", value, "sendMsg");
            return (Criteria) this;
        }

        public Criteria andSendMsgLessThanOrEqualTo(Short value) {
            addCriterion("SEND_MSG <=", value, "sendMsg");
            return (Criteria) this;
        }

        public Criteria andSendMsgIn(List<Short> values) {
            addCriterion("SEND_MSG in", values, "sendMsg");
            return (Criteria) this;
        }

        public Criteria andSendMsgNotIn(List<Short> values) {
            addCriterion("SEND_MSG not in", values, "sendMsg");
            return (Criteria) this;
        }

        public Criteria andSendMsgBetween(Short value1, Short value2) {
            addCriterion("SEND_MSG between", value1, value2, "sendMsg");
            return (Criteria) this;
        }

        public Criteria andSendMsgNotBetween(Short value1, Short value2) {
            addCriterion("SEND_MSG not between", value1, value2, "sendMsg");
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