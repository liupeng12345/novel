package com.pzhu.novel.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class NovelSpiderSearchXpathConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NovelSpiderSearchXpathConfigExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSearchUrlIsNull() {
            addCriterion("search_url is null");
            return (Criteria) this;
        }

        public Criteria andSearchUrlIsNotNull() {
            addCriterion("search_url is not null");
            return (Criteria) this;
        }

        public Criteria andSearchUrlEqualTo(String value) {
            addCriterion("search_url =", value, "searchUrl");
            return (Criteria) this;
        }

        public Criteria andSearchUrlNotEqualTo(String value) {
            addCriterion("search_url <>", value, "searchUrl");
            return (Criteria) this;
        }

        public Criteria andSearchUrlGreaterThan(String value) {
            addCriterion("search_url >", value, "searchUrl");
            return (Criteria) this;
        }

        public Criteria andSearchUrlGreaterThanOrEqualTo(String value) {
            addCriterion("search_url >=", value, "searchUrl");
            return (Criteria) this;
        }

        public Criteria andSearchUrlLessThan(String value) {
            addCriterion("search_url <", value, "searchUrl");
            return (Criteria) this;
        }

        public Criteria andSearchUrlLessThanOrEqualTo(String value) {
            addCriterion("search_url <=", value, "searchUrl");
            return (Criteria) this;
        }

        public Criteria andSearchUrlLike(String value) {
            addCriterion("search_url like", value, "searchUrl");
            return (Criteria) this;
        }

        public Criteria andSearchUrlNotLike(String value) {
            addCriterion("search_url not like", value, "searchUrl");
            return (Criteria) this;
        }

        public Criteria andSearchUrlIn(List<String> values) {
            addCriterion("search_url in", values, "searchUrl");
            return (Criteria) this;
        }

        public Criteria andSearchUrlNotIn(List<String> values) {
            addCriterion("search_url not in", values, "searchUrl");
            return (Criteria) this;
        }

        public Criteria andSearchUrlBetween(String value1, String value2) {
            addCriterion("search_url between", value1, value2, "searchUrl");
            return (Criteria) this;
        }

        public Criteria andSearchUrlNotBetween(String value1, String value2) {
            addCriterion("search_url not between", value1, value2, "searchUrl");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdIsNull() {
            addCriterion("web_site_id is null");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdIsNotNull() {
            addCriterion("web_site_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdEqualTo(Integer value) {
            addCriterion("web_site_id =", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdNotEqualTo(Integer value) {
            addCriterion("web_site_id <>", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdGreaterThan(Integer value) {
            addCriterion("web_site_id >", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("web_site_id >=", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdLessThan(Integer value) {
            addCriterion("web_site_id <", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("web_site_id <=", value, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdIn(List<Integer> values) {
            addCriterion("web_site_id in", values, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdNotIn(List<Integer> values) {
            addCriterion("web_site_id not in", values, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdBetween(Integer value1, Integer value2) {
            addCriterion("web_site_id between", value1, value2, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andWebSiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("web_site_id not between", value1, value2, "webSiteId");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
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