package com.hundsun.jrescloud.hxpoc.modules.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class UpMerchantBatchInfoEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpMerchantBatchInfoEntityExample() {
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

        public Criteria andUpBatchIdIsNull() {
            addCriterion("UP_BATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpBatchIdIsNotNull() {
            addCriterion("UP_BATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpBatchIdEqualTo(Long value) {
            addCriterion("UP_BATCH_ID =", value, "upBatchId");
            return (Criteria) this;
        }

        public Criteria andUpBatchIdNotEqualTo(Long value) {
            addCriterion("UP_BATCH_ID <>", value, "upBatchId");
            return (Criteria) this;
        }

        public Criteria andUpBatchIdGreaterThan(Long value) {
            addCriterion("UP_BATCH_ID >", value, "upBatchId");
            return (Criteria) this;
        }

        public Criteria andUpBatchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UP_BATCH_ID >=", value, "upBatchId");
            return (Criteria) this;
        }

        public Criteria andUpBatchIdLessThan(Long value) {
            addCriterion("UP_BATCH_ID <", value, "upBatchId");
            return (Criteria) this;
        }

        public Criteria andUpBatchIdLessThanOrEqualTo(Long value) {
            addCriterion("UP_BATCH_ID <=", value, "upBatchId");
            return (Criteria) this;
        }

        public Criteria andUpBatchIdIn(List<Long> values) {
            addCriterion("UP_BATCH_ID in", values, "upBatchId");
            return (Criteria) this;
        }

        public Criteria andUpBatchIdNotIn(List<Long> values) {
            addCriterion("UP_BATCH_ID not in", values, "upBatchId");
            return (Criteria) this;
        }

        public Criteria andUpBatchIdBetween(Long value1, Long value2) {
            addCriterion("UP_BATCH_ID between", value1, value2, "upBatchId");
            return (Criteria) this;
        }

        public Criteria andUpBatchIdNotBetween(Long value1, Long value2) {
            addCriterion("UP_BATCH_ID not between", value1, value2, "upBatchId");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoIsNull() {
            addCriterion("UP_BATCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoIsNotNull() {
            addCriterion("UP_BATCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoEqualTo(String value) {
            addCriterion("UP_BATCH_NO =", value, "upBatchNo");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoNotEqualTo(String value) {
            addCriterion("UP_BATCH_NO <>", value, "upBatchNo");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoGreaterThan(String value) {
            addCriterion("UP_BATCH_NO >", value, "upBatchNo");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("UP_BATCH_NO >=", value, "upBatchNo");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoLessThan(String value) {
            addCriterion("UP_BATCH_NO <", value, "upBatchNo");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoLessThanOrEqualTo(String value) {
            addCriterion("UP_BATCH_NO <=", value, "upBatchNo");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoLike(String value) {
            addCriterion("UP_BATCH_NO like", value, "upBatchNo");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoNotLike(String value) {
            addCriterion("UP_BATCH_NO not like", value, "upBatchNo");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoIn(List<String> values) {
            addCriterion("UP_BATCH_NO in", values, "upBatchNo");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoNotIn(List<String> values) {
            addCriterion("UP_BATCH_NO not in", values, "upBatchNo");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoBetween(String value1, String value2) {
            addCriterion("UP_BATCH_NO between", value1, value2, "upBatchNo");
            return (Criteria) this;
        }

        public Criteria andUpBatchNoNotBetween(String value1, String value2) {
            addCriterion("UP_BATCH_NO not between", value1, value2, "upBatchNo");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameIsNull() {
            addCriterion("UP_UPLOAD_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameIsNotNull() {
            addCriterion("UP_UPLOAD_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameEqualTo(String value) {
            addCriterion("UP_UPLOAD_FILE_NAME =", value, "upUploadFileName");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameNotEqualTo(String value) {
            addCriterion("UP_UPLOAD_FILE_NAME <>", value, "upUploadFileName");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameGreaterThan(String value) {
            addCriterion("UP_UPLOAD_FILE_NAME >", value, "upUploadFileName");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("UP_UPLOAD_FILE_NAME >=", value, "upUploadFileName");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameLessThan(String value) {
            addCriterion("UP_UPLOAD_FILE_NAME <", value, "upUploadFileName");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameLessThanOrEqualTo(String value) {
            addCriterion("UP_UPLOAD_FILE_NAME <=", value, "upUploadFileName");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameLike(String value) {
            addCriterion("UP_UPLOAD_FILE_NAME like", value, "upUploadFileName");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameNotLike(String value) {
            addCriterion("UP_UPLOAD_FILE_NAME not like", value, "upUploadFileName");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameIn(List<String> values) {
            addCriterion("UP_UPLOAD_FILE_NAME in", values, "upUploadFileName");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameNotIn(List<String> values) {
            addCriterion("UP_UPLOAD_FILE_NAME not in", values, "upUploadFileName");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameBetween(String value1, String value2) {
            addCriterion("UP_UPLOAD_FILE_NAME between", value1, value2, "upUploadFileName");
            return (Criteria) this;
        }

        public Criteria andUpUploadFileNameNotBetween(String value1, String value2) {
            addCriterion("UP_UPLOAD_FILE_NAME not between", value1, value2, "upUploadFileName");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameIsNull() {
            addCriterion("UP_DOWNLOAD_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameIsNotNull() {
            addCriterion("UP_DOWNLOAD_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameEqualTo(String value) {
            addCriterion("UP_DOWNLOAD_FILE_NAME =", value, "upDownloadFileName");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameNotEqualTo(String value) {
            addCriterion("UP_DOWNLOAD_FILE_NAME <>", value, "upDownloadFileName");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameGreaterThan(String value) {
            addCriterion("UP_DOWNLOAD_FILE_NAME >", value, "upDownloadFileName");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("UP_DOWNLOAD_FILE_NAME >=", value, "upDownloadFileName");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameLessThan(String value) {
            addCriterion("UP_DOWNLOAD_FILE_NAME <", value, "upDownloadFileName");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameLessThanOrEqualTo(String value) {
            addCriterion("UP_DOWNLOAD_FILE_NAME <=", value, "upDownloadFileName");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameLike(String value) {
            addCriterion("UP_DOWNLOAD_FILE_NAME like", value, "upDownloadFileName");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameNotLike(String value) {
            addCriterion("UP_DOWNLOAD_FILE_NAME not like", value, "upDownloadFileName");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameIn(List<String> values) {
            addCriterion("UP_DOWNLOAD_FILE_NAME in", values, "upDownloadFileName");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameNotIn(List<String> values) {
            addCriterion("UP_DOWNLOAD_FILE_NAME not in", values, "upDownloadFileName");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameBetween(String value1, String value2) {
            addCriterion("UP_DOWNLOAD_FILE_NAME between", value1, value2, "upDownloadFileName");
            return (Criteria) this;
        }

        public Criteria andUpDownloadFileNameNotBetween(String value1, String value2) {
            addCriterion("UP_DOWNLOAD_FILE_NAME not between", value1, value2, "upDownloadFileName");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameIsNull() {
            addCriterion("BANK_UPLOAD_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameIsNotNull() {
            addCriterion("BANK_UPLOAD_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameEqualTo(String value) {
            addCriterion("BANK_UPLOAD_FILE_NAME =", value, "bankUploadFileName");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameNotEqualTo(String value) {
            addCriterion("BANK_UPLOAD_FILE_NAME <>", value, "bankUploadFileName");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameGreaterThan(String value) {
            addCriterion("BANK_UPLOAD_FILE_NAME >", value, "bankUploadFileName");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_UPLOAD_FILE_NAME >=", value, "bankUploadFileName");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameLessThan(String value) {
            addCriterion("BANK_UPLOAD_FILE_NAME <", value, "bankUploadFileName");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_UPLOAD_FILE_NAME <=", value, "bankUploadFileName");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameLike(String value) {
            addCriterion("BANK_UPLOAD_FILE_NAME like", value, "bankUploadFileName");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameNotLike(String value) {
            addCriterion("BANK_UPLOAD_FILE_NAME not like", value, "bankUploadFileName");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameIn(List<String> values) {
            addCriterion("BANK_UPLOAD_FILE_NAME in", values, "bankUploadFileName");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameNotIn(List<String> values) {
            addCriterion("BANK_UPLOAD_FILE_NAME not in", values, "bankUploadFileName");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameBetween(String value1, String value2) {
            addCriterion("BANK_UPLOAD_FILE_NAME between", value1, value2, "bankUploadFileName");
            return (Criteria) this;
        }

        public Criteria andBankUploadFileNameNotBetween(String value1, String value2) {
            addCriterion("BANK_UPLOAD_FILE_NAME not between", value1, value2, "bankUploadFileName");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileIsNull() {
            addCriterion("BANK_UP_DOWNLOAD_FILE is null");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileIsNotNull() {
            addCriterion("BANK_UP_DOWNLOAD_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileEqualTo(String value) {
            addCriterion("BANK_UP_DOWNLOAD_FILE =", value, "bankUpDownloadFile");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileNotEqualTo(String value) {
            addCriterion("BANK_UP_DOWNLOAD_FILE <>", value, "bankUpDownloadFile");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileGreaterThan(String value) {
            addCriterion("BANK_UP_DOWNLOAD_FILE >", value, "bankUpDownloadFile");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_UP_DOWNLOAD_FILE >=", value, "bankUpDownloadFile");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileLessThan(String value) {
            addCriterion("BANK_UP_DOWNLOAD_FILE <", value, "bankUpDownloadFile");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileLessThanOrEqualTo(String value) {
            addCriterion("BANK_UP_DOWNLOAD_FILE <=", value, "bankUpDownloadFile");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileLike(String value) {
            addCriterion("BANK_UP_DOWNLOAD_FILE like", value, "bankUpDownloadFile");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileNotLike(String value) {
            addCriterion("BANK_UP_DOWNLOAD_FILE not like", value, "bankUpDownloadFile");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileIn(List<String> values) {
            addCriterion("BANK_UP_DOWNLOAD_FILE in", values, "bankUpDownloadFile");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileNotIn(List<String> values) {
            addCriterion("BANK_UP_DOWNLOAD_FILE not in", values, "bankUpDownloadFile");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileBetween(String value1, String value2) {
            addCriterion("BANK_UP_DOWNLOAD_FILE between", value1, value2, "bankUpDownloadFile");
            return (Criteria) this;
        }

        public Criteria andBankUpDownloadFileNotBetween(String value1, String value2) {
            addCriterion("BANK_UP_DOWNLOAD_FILE not between", value1, value2, "bankUpDownloadFile");
            return (Criteria) this;
        }

        public Criteria andUpTypeIsNull() {
            addCriterion("UP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUpTypeIsNotNull() {
            addCriterion("UP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUpTypeEqualTo(String value) {
            addCriterion("UP_TYPE =", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeNotEqualTo(String value) {
            addCriterion("UP_TYPE <>", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeGreaterThan(String value) {
            addCriterion("UP_TYPE >", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("UP_TYPE >=", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeLessThan(String value) {
            addCriterion("UP_TYPE <", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeLessThanOrEqualTo(String value) {
            addCriterion("UP_TYPE <=", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeLike(String value) {
            addCriterion("UP_TYPE like", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeNotLike(String value) {
            addCriterion("UP_TYPE not like", value, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeIn(List<String> values) {
            addCriterion("UP_TYPE in", values, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeNotIn(List<String> values) {
            addCriterion("UP_TYPE not in", values, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeBetween(String value1, String value2) {
            addCriterion("UP_TYPE between", value1, value2, "upType");
            return (Criteria) this;
        }

        public Criteria andUpTypeNotBetween(String value1, String value2) {
            addCriterion("UP_TYPE not between", value1, value2, "upType");
            return (Criteria) this;
        }

        public Criteria andStatesIsNull() {
            addCriterion("STATES is null");
            return (Criteria) this;
        }

        public Criteria andStatesIsNotNull() {
            addCriterion("STATES is not null");
            return (Criteria) this;
        }

        public Criteria andStatesEqualTo(String value) {
            addCriterion("STATES =", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotEqualTo(String value) {
            addCriterion("STATES <>", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThan(String value) {
            addCriterion("STATES >", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThanOrEqualTo(String value) {
            addCriterion("STATES >=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThan(String value) {
            addCriterion("STATES <", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThanOrEqualTo(String value) {
            addCriterion("STATES <=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLike(String value) {
            addCriterion("STATES like", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotLike(String value) {
            addCriterion("STATES not like", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesIn(List<String> values) {
            addCriterion("STATES in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotIn(List<String> values) {
            addCriterion("STATES not in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesBetween(String value1, String value2) {
            addCriterion("STATES between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotBetween(String value1, String value2) {
            addCriterion("STATES not between", value1, value2, "states");
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