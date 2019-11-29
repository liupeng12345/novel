package com.pzhu.novel.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class NovelSpiderContentXpathConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NovelSpiderContentXpathConfigExample() {
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andPreviousPageIsNull() {
            addCriterion("previous_page is null");
            return (Criteria) this;
        }

        public Criteria andPreviousPageIsNotNull() {
            addCriterion("previous_page is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousPageEqualTo(String value) {
            addCriterion("previous_page =", value, "previousPage");
            return (Criteria) this;
        }

        public Criteria andPreviousPageNotEqualTo(String value) {
            addCriterion("previous_page <>", value, "previousPage");
            return (Criteria) this;
        }

        public Criteria andPreviousPageGreaterThan(String value) {
            addCriterion("previous_page >", value, "previousPage");
            return (Criteria) this;
        }

        public Criteria andPreviousPageGreaterThanOrEqualTo(String value) {
            addCriterion("previous_page >=", value, "previousPage");
            return (Criteria) this;
        }

        public Criteria andPreviousPageLessThan(String value) {
            addCriterion("previous_page <", value, "previousPage");
            return (Criteria) this;
        }

        public Criteria andPreviousPageLessThanOrEqualTo(String value) {
            addCriterion("previous_page <=", value, "previousPage");
            return (Criteria) this;
        }

        public Criteria andPreviousPageLike(String value) {
            addCriterion("previous_page like", value, "previousPage");
            return (Criteria) this;
        }

        public Criteria andPreviousPageNotLike(String value) {
            addCriterion("previous_page not like", value, "previousPage");
            return (Criteria) this;
        }

        public Criteria andPreviousPageIn(List<String> values) {
            addCriterion("previous_page in", values, "previousPage");
            return (Criteria) this;
        }

        public Criteria andPreviousPageNotIn(List<String> values) {
            addCriterion("previous_page not in", values, "previousPage");
            return (Criteria) this;
        }

        public Criteria andPreviousPageBetween(String value1, String value2) {
            addCriterion("previous_page between", value1, value2, "previousPage");
            return (Criteria) this;
        }

        public Criteria andPreviousPageNotBetween(String value1, String value2) {
            addCriterion("previous_page not between", value1, value2, "previousPage");
            return (Criteria) this;
        }

        public Criteria andNextPageIsNull() {
            addCriterion("next_page is null");
            return (Criteria) this;
        }

        public Criteria andNextPageIsNotNull() {
            addCriterion("next_page is not null");
            return (Criteria) this;
        }

        public Criteria andNextPageEqualTo(String value) {
            addCriterion("next_page =", value, "nextPage");
            return (Criteria) this;
        }

        public Criteria andNextPageNotEqualTo(String value) {
            addCriterion("next_page <>", value, "nextPage");
            return (Criteria) this;
        }

        public Criteria andNextPageGreaterThan(String value) {
            addCriterion("next_page >", value, "nextPage");
            return (Criteria) this;
        }

        public Criteria andNextPageGreaterThanOrEqualTo(String value) {
            addCriterion("next_page >=", value, "nextPage");
            return (Criteria) this;
        }

        public Criteria andNextPageLessThan(String value) {
            addCriterion("next_page <", value, "nextPage");
            return (Criteria) this;
        }

        public Criteria andNextPageLessThanOrEqualTo(String value) {
            addCriterion("next_page <=", value, "nextPage");
            return (Criteria) this;
        }

        public Criteria andNextPageLike(String value) {
            addCriterion("next_page like", value, "nextPage");
            return (Criteria) this;
        }

        public Criteria andNextPageNotLike(String value) {
            addCriterion("next_page not like", value, "nextPage");
            return (Criteria) this;
        }

        public Criteria andNextPageIn(List<String> values) {
            addCriterion("next_page in", values, "nextPage");
            return (Criteria) this;
        }

        public Criteria andNextPageNotIn(List<String> values) {
            addCriterion("next_page not in", values, "nextPage");
            return (Criteria) this;
        }

        public Criteria andNextPageBetween(String value1, String value2) {
            addCriterion("next_page between", value1, value2, "nextPage");
            return (Criteria) this;
        }

        public Criteria andNextPageNotBetween(String value1, String value2) {
            addCriterion("next_page not between", value1, value2, "nextPage");
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