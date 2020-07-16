package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TCheckApplyRecordEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCheckApplyRecordEntityExample() {
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

        public Criteria andApplySerialNoIsNull() {
            addCriterion("APPLY_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andApplySerialNoIsNotNull() {
            addCriterion("APPLY_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andApplySerialNoEqualTo(BigDecimal value) {
            addCriterion("APPLY_SERIAL_NO =", value, "applySerialNo");
            return (Criteria) this;
        }

        public Criteria andApplySerialNoNotEqualTo(BigDecimal value) {
            addCriterion("APPLY_SERIAL_NO <>", value, "applySerialNo");
            return (Criteria) this;
        }

        public Criteria andApplySerialNoGreaterThan(BigDecimal value) {
            addCriterion("APPLY_SERIAL_NO >", value, "applySerialNo");
            return (Criteria) this;
        }

        public Criteria andApplySerialNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_SERIAL_NO >=", value, "applySerialNo");
            return (Criteria) this;
        }

        public Criteria andApplySerialNoLessThan(BigDecimal value) {
            addCriterion("APPLY_SERIAL_NO <", value, "applySerialNo");
            return (Criteria) this;
        }

        public Criteria andApplySerialNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLY_SERIAL_NO <=", value, "applySerialNo");
            return (Criteria) this;
        }

        public Criteria andApplySerialNoIn(List<BigDecimal> values) {
            addCriterion("APPLY_SERIAL_NO in", values, "applySerialNo");
            return (Criteria) this;
        }

        public Criteria andApplySerialNoNotIn(List<BigDecimal> values) {
            addCriterion("APPLY_SERIAL_NO not in", values, "applySerialNo");
            return (Criteria) this;
        }

        public Criteria andApplySerialNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_SERIAL_NO between", value1, value2, "applySerialNo");
            return (Criteria) this;
        }

        public Criteria andApplySerialNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLY_SERIAL_NO not between", value1, value2, "applySerialNo");
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

        public Criteria andApplyDateIsNull() {
            addCriterion("APPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("APPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(String value) {
            addCriterion("APPLY_DATE =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(String value) {
            addCriterion("APPLY_DATE <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(String value) {
            addCriterion("APPLY_DATE >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DATE >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(String value) {
            addCriterion("APPLY_DATE <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DATE <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLike(String value) {
            addCriterion("APPLY_DATE like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotLike(String value) {
            addCriterion("APPLY_DATE not like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<String> values) {
            addCriterion("APPLY_DATE in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<String> values) {
            addCriterion("APPLY_DATE not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(String value1, String value2) {
            addCriterion("APPLY_DATE between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(String value1, String value2) {
            addCriterion("APPLY_DATE not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNull() {
            addCriterion("APPLY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNotNull() {
            addCriterion("APPLY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusEqualTo(Short value) {
            addCriterion("APPLY_STATUS =", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotEqualTo(Short value) {
            addCriterion("APPLY_STATUS <>", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThan(Short value) {
            addCriterion("APPLY_STATUS >", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("APPLY_STATUS >=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThan(Short value) {
            addCriterion("APPLY_STATUS <", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThanOrEqualTo(Short value) {
            addCriterion("APPLY_STATUS <=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIn(List<Short> values) {
            addCriterion("APPLY_STATUS in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotIn(List<Short> values) {
            addCriterion("APPLY_STATUS not in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusBetween(Short value1, Short value2) {
            addCriterion("APPLY_STATUS between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotBetween(Short value1, Short value2) {
            addCriterion("APPLY_STATUS not between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("FINISH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("FINISH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(String value) {
            addCriterion("FINISH_TIME =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(String value) {
            addCriterion("FINISH_TIME <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(String value) {
            addCriterion("FINISH_TIME >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FINISH_TIME >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(String value) {
            addCriterion("FINISH_TIME <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(String value) {
            addCriterion("FINISH_TIME <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLike(String value) {
            addCriterion("FINISH_TIME like", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotLike(String value) {
            addCriterion("FINISH_TIME not like", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<String> values) {
            addCriterion("FINISH_TIME in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<String> values) {
            addCriterion("FINISH_TIME not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(String value1, String value2) {
            addCriterion("FINISH_TIME between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(String value1, String value2) {
            addCriterion("FINISH_TIME not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Short value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Short value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Short value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Short value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Short value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Short> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Short> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Short value1, Short value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Short value1, Short value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathIsNull() {
            addCriterion("CHECK_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathIsNotNull() {
            addCriterion("CHECK_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathEqualTo(String value) {
            addCriterion("CHECK_FILE_PATH =", value, "checkFilePath");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathNotEqualTo(String value) {
            addCriterion("CHECK_FILE_PATH <>", value, "checkFilePath");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathGreaterThan(String value) {
            addCriterion("CHECK_FILE_PATH >", value, "checkFilePath");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_FILE_PATH >=", value, "checkFilePath");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathLessThan(String value) {
            addCriterion("CHECK_FILE_PATH <", value, "checkFilePath");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathLessThanOrEqualTo(String value) {
            addCriterion("CHECK_FILE_PATH <=", value, "checkFilePath");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathLike(String value) {
            addCriterion("CHECK_FILE_PATH like", value, "checkFilePath");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathNotLike(String value) {
            addCriterion("CHECK_FILE_PATH not like", value, "checkFilePath");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathIn(List<String> values) {
            addCriterion("CHECK_FILE_PATH in", values, "checkFilePath");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathNotIn(List<String> values) {
            addCriterion("CHECK_FILE_PATH not in", values, "checkFilePath");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathBetween(String value1, String value2) {
            addCriterion("CHECK_FILE_PATH between", value1, value2, "checkFilePath");
            return (Criteria) this;
        }

        public Criteria andCheckFilePathNotBetween(String value1, String value2) {
            addCriterion("CHECK_FILE_PATH not between", value1, value2, "checkFilePath");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameIsNull() {
            addCriterion("CHECK_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameIsNotNull() {
            addCriterion("CHECK_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameEqualTo(String value) {
            addCriterion("CHECK_FILE_NAME =", value, "checkFileName");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameNotEqualTo(String value) {
            addCriterion("CHECK_FILE_NAME <>", value, "checkFileName");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameGreaterThan(String value) {
            addCriterion("CHECK_FILE_NAME >", value, "checkFileName");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_FILE_NAME >=", value, "checkFileName");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameLessThan(String value) {
            addCriterion("CHECK_FILE_NAME <", value, "checkFileName");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameLessThanOrEqualTo(String value) {
            addCriterion("CHECK_FILE_NAME <=", value, "checkFileName");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameLike(String value) {
            addCriterion("CHECK_FILE_NAME like", value, "checkFileName");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameNotLike(String value) {
            addCriterion("CHECK_FILE_NAME not like", value, "checkFileName");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameIn(List<String> values) {
            addCriterion("CHECK_FILE_NAME in", values, "checkFileName");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameNotIn(List<String> values) {
            addCriterion("CHECK_FILE_NAME not in", values, "checkFileName");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameBetween(String value1, String value2) {
            addCriterion("CHECK_FILE_NAME between", value1, value2, "checkFileName");
            return (Criteria) this;
        }

        public Criteria andCheckFileNameNotBetween(String value1, String value2) {
            addCriterion("CHECK_FILE_NAME not between", value1, value2, "checkFileName");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeIsNull() {
            addCriterion("CHECK_FILE_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeIsNotNull() {
            addCriterion("CHECK_FILE_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeEqualTo(String value) {
            addCriterion("CHECK_FILE_START_TIME =", value, "checkFileStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeNotEqualTo(String value) {
            addCriterion("CHECK_FILE_START_TIME <>", value, "checkFileStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeGreaterThan(String value) {
            addCriterion("CHECK_FILE_START_TIME >", value, "checkFileStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_FILE_START_TIME >=", value, "checkFileStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeLessThan(String value) {
            addCriterion("CHECK_FILE_START_TIME <", value, "checkFileStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeLessThanOrEqualTo(String value) {
            addCriterion("CHECK_FILE_START_TIME <=", value, "checkFileStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeLike(String value) {
            addCriterion("CHECK_FILE_START_TIME like", value, "checkFileStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeNotLike(String value) {
            addCriterion("CHECK_FILE_START_TIME not like", value, "checkFileStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeIn(List<String> values) {
            addCriterion("CHECK_FILE_START_TIME in", values, "checkFileStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeNotIn(List<String> values) {
            addCriterion("CHECK_FILE_START_TIME not in", values, "checkFileStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeBetween(String value1, String value2) {
            addCriterion("CHECK_FILE_START_TIME between", value1, value2, "checkFileStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileStartTimeNotBetween(String value1, String value2) {
            addCriterion("CHECK_FILE_START_TIME not between", value1, value2, "checkFileStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeIsNull() {
            addCriterion("CHECK_FILE_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeIsNotNull() {
            addCriterion("CHECK_FILE_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeEqualTo(String value) {
            addCriterion("CHECK_FILE_END_TIME =", value, "checkFileEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeNotEqualTo(String value) {
            addCriterion("CHECK_FILE_END_TIME <>", value, "checkFileEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeGreaterThan(String value) {
            addCriterion("CHECK_FILE_END_TIME >", value, "checkFileEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_FILE_END_TIME >=", value, "checkFileEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeLessThan(String value) {
            addCriterion("CHECK_FILE_END_TIME <", value, "checkFileEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeLessThanOrEqualTo(String value) {
            addCriterion("CHECK_FILE_END_TIME <=", value, "checkFileEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeLike(String value) {
            addCriterion("CHECK_FILE_END_TIME like", value, "checkFileEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeNotLike(String value) {
            addCriterion("CHECK_FILE_END_TIME not like", value, "checkFileEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeIn(List<String> values) {
            addCriterion("CHECK_FILE_END_TIME in", values, "checkFileEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeNotIn(List<String> values) {
            addCriterion("CHECK_FILE_END_TIME not in", values, "checkFileEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeBetween(String value1, String value2) {
            addCriterion("CHECK_FILE_END_TIME between", value1, value2, "checkFileEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckFileEndTimeNotBetween(String value1, String value2) {
            addCriterion("CHECK_FILE_END_TIME not between", value1, value2, "checkFileEndTime");
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