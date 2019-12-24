package com.pzhu.novel.mbg.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NovelShelfRowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NovelShelfRowExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNovelNameIsNull() {
            addCriterion("novel_name is null");
            return (Criteria) this;
        }

        public Criteria andNovelNameIsNotNull() {
            addCriterion("novel_name is not null");
            return (Criteria) this;
        }

        public Criteria andNovelNameEqualTo(String value) {
            addCriterion("novel_name =", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameNotEqualTo(String value) {
            addCriterion("novel_name <>", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameGreaterThan(String value) {
            addCriterion("novel_name >", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameGreaterThanOrEqualTo(String value) {
            addCriterion("novel_name >=", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameLessThan(String value) {
            addCriterion("novel_name <", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameLessThanOrEqualTo(String value) {
            addCriterion("novel_name <=", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameLike(String value) {
            addCriterion("novel_name like", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameNotLike(String value) {
            addCriterion("novel_name not like", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameIn(List<String> values) {
            addCriterion("novel_name in", values, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameNotIn(List<String> values) {
            addCriterion("novel_name not in", values, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameBetween(String value1, String value2) {
            addCriterion("novel_name between", value1, value2, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameNotBetween(String value1, String value2) {
            addCriterion("novel_name not between", value1, value2, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelIdIsNull() {
            addCriterion("novel_id is null");
            return (Criteria) this;
        }

        public Criteria andNovelIdIsNotNull() {
            addCriterion("novel_id is not null");
            return (Criteria) this;
        }

        public Criteria andNovelIdEqualTo(String value) {
            addCriterion("novel_id =", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdNotEqualTo(String value) {
            addCriterion("novel_id <>", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdGreaterThan(String value) {
            addCriterion("novel_id >", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdGreaterThanOrEqualTo(String value) {
            addCriterion("novel_id >=", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdLessThan(String value) {
            addCriterion("novel_id <", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdLessThanOrEqualTo(String value) {
            addCriterion("novel_id <=", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdLike(String value) {
            addCriterion("novel_id like", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdNotLike(String value) {
            addCriterion("novel_id not like", value, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdIn(List<String> values) {
            addCriterion("novel_id in", values, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdNotIn(List<String> values) {
            addCriterion("novel_id not in", values, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdBetween(String value1, String value2) {
            addCriterion("novel_id between", value1, value2, "novelId");
            return (Criteria) this;
        }

        public Criteria andNovelIdNotBetween(String value1, String value2) {
            addCriterion("novel_id not between", value1, value2, "novelId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(LocalDateTime value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(LocalDateTime value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<LocalDateTime> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andNovelShelfIdIsNull() {
            addCriterion("novel_shelf_id is null");
            return (Criteria) this;
        }

        public Criteria andNovelShelfIdIsNotNull() {
            addCriterion("novel_shelf_id is not null");
            return (Criteria) this;
        }

        public Criteria andNovelShelfIdEqualTo(Long value) {
            addCriterion("novel_shelf_id =", value, "novelShelfId");
            return (Criteria) this;
        }

        public Criteria andNovelShelfIdNotEqualTo(Long value) {
            addCriterion("novel_shelf_id <>", value, "novelShelfId");
            return (Criteria) this;
        }

        public Criteria andNovelShelfIdGreaterThan(Long value) {
            addCriterion("novel_shelf_id >", value, "novelShelfId");
            return (Criteria) this;
        }

        public Criteria andNovelShelfIdGreaterThanOrEqualTo(Long value) {
            addCriterion("novel_shelf_id >=", value, "novelShelfId");
            return (Criteria) this;
        }

        public Criteria andNovelShelfIdLessThan(Long value) {
            addCriterion("novel_shelf_id <", value, "novelShelfId");
            return (Criteria) this;
        }

        public Criteria andNovelShelfIdLessThanOrEqualTo(Long value) {
            addCriterion("novel_shelf_id <=", value, "novelShelfId");
            return (Criteria) this;
        }

        public Criteria andNovelShelfIdIn(List<Long> values) {
            addCriterion("novel_shelf_id in", values, "novelShelfId");
            return (Criteria) this;
        }

        public Criteria andNovelShelfIdNotIn(List<Long> values) {
            addCriterion("novel_shelf_id not in", values, "novelShelfId");
            return (Criteria) this;
        }

        public Criteria andNovelShelfIdBetween(Long value1, Long value2) {
            addCriterion("novel_shelf_id between", value1, value2, "novelShelfId");
            return (Criteria) this;
        }

        public Criteria andNovelShelfIdNotBetween(Long value1, Long value2) {
            addCriterion("novel_shelf_id not between", value1, value2, "novelShelfId");
            return (Criteria) this;
        }

        public Criteria andReadLogIdIsNull() {
            addCriterion("read_log_id is null");
            return (Criteria) this;
        }

        public Criteria andReadLogIdIsNotNull() {
            addCriterion("read_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andReadLogIdEqualTo(Long value) {
            addCriterion("read_log_id =", value, "readLogId");
            return (Criteria) this;
        }

        public Criteria andReadLogIdNotEqualTo(Long value) {
            addCriterion("read_log_id <>", value, "readLogId");
            return (Criteria) this;
        }

        public Criteria andReadLogIdGreaterThan(Long value) {
            addCriterion("read_log_id >", value, "readLogId");
            return (Criteria) this;
        }

        public Criteria andReadLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("read_log_id >=", value, "readLogId");
            return (Criteria) this;
        }

        public Criteria andReadLogIdLessThan(Long value) {
            addCriterion("read_log_id <", value, "readLogId");
            return (Criteria) this;
        }

        public Criteria andReadLogIdLessThanOrEqualTo(Long value) {
            addCriterion("read_log_id <=", value, "readLogId");
            return (Criteria) this;
        }

        public Criteria andReadLogIdIn(List<Long> values) {
            addCriterion("read_log_id in", values, "readLogId");
            return (Criteria) this;
        }

        public Criteria andReadLogIdNotIn(List<Long> values) {
            addCriterion("read_log_id not in", values, "readLogId");
            return (Criteria) this;
        }

        public Criteria andReadLogIdBetween(Long value1, Long value2) {
            addCriterion("read_log_id between", value1, value2, "readLogId");
            return (Criteria) this;
        }

        public Criteria andReadLogIdNotBetween(Long value1, Long value2) {
            addCriterion("read_log_id not between", value1, value2, "readLogId");
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