package com.pzhu.novel.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class NovelSpiderXpathConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NovelSpiderXpathConfigExample() {
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

        public Criteria andWebsiteNameIsNull() {
            addCriterion("website_name is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameIsNotNull() {
            addCriterion("website_name is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameEqualTo(String value) {
            addCriterion("website_name =", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameNotEqualTo(String value) {
            addCriterion("website_name <>", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameGreaterThan(String value) {
            addCriterion("website_name >", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("website_name >=", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameLessThan(String value) {
            addCriterion("website_name <", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameLessThanOrEqualTo(String value) {
            addCriterion("website_name <=", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameLike(String value) {
            addCriterion("website_name like", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameNotLike(String value) {
            addCriterion("website_name not like", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameIn(List<String> values) {
            addCriterion("website_name in", values, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameNotIn(List<String> values) {
            addCriterion("website_name not in", values, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameBetween(String value1, String value2) {
            addCriterion("website_name between", value1, value2, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameNotBetween(String value1, String value2) {
            addCriterion("website_name not between", value1, value2, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlIsNull() {
            addCriterion("website_url is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlIsNotNull() {
            addCriterion("website_url is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlEqualTo(String value) {
            addCriterion("website_url =", value, "websiteUrl");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlNotEqualTo(String value) {
            addCriterion("website_url <>", value, "websiteUrl");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlGreaterThan(String value) {
            addCriterion("website_url >", value, "websiteUrl");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlGreaterThanOrEqualTo(String value) {
            addCriterion("website_url >=", value, "websiteUrl");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlLessThan(String value) {
            addCriterion("website_url <", value, "websiteUrl");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlLessThanOrEqualTo(String value) {
            addCriterion("website_url <=", value, "websiteUrl");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlLike(String value) {
            addCriterion("website_url like", value, "websiteUrl");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlNotLike(String value) {
            addCriterion("website_url not like", value, "websiteUrl");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlIn(List<String> values) {
            addCriterion("website_url in", values, "websiteUrl");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlNotIn(List<String> values) {
            addCriterion("website_url not in", values, "websiteUrl");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlBetween(String value1, String value2) {
            addCriterion("website_url between", value1, value2, "websiteUrl");
            return (Criteria) this;
        }

        public Criteria andWebsiteUrlNotBetween(String value1, String value2) {
            addCriterion("website_url not between", value1, value2, "websiteUrl");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgIsNull() {
            addCriterion("website_img is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgIsNotNull() {
            addCriterion("website_img is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgEqualTo(String value) {
            addCriterion("website_img =", value, "websiteImg");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgNotEqualTo(String value) {
            addCriterion("website_img <>", value, "websiteImg");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgGreaterThan(String value) {
            addCriterion("website_img >", value, "websiteImg");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgGreaterThanOrEqualTo(String value) {
            addCriterion("website_img >=", value, "websiteImg");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgLessThan(String value) {
            addCriterion("website_img <", value, "websiteImg");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgLessThanOrEqualTo(String value) {
            addCriterion("website_img <=", value, "websiteImg");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgLike(String value) {
            addCriterion("website_img like", value, "websiteImg");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgNotLike(String value) {
            addCriterion("website_img not like", value, "websiteImg");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgIn(List<String> values) {
            addCriterion("website_img in", values, "websiteImg");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgNotIn(List<String> values) {
            addCriterion("website_img not in", values, "websiteImg");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgBetween(String value1, String value2) {
            addCriterion("website_img between", value1, value2, "websiteImg");
            return (Criteria) this;
        }

        public Criteria andWebsiteImgNotBetween(String value1, String value2) {
            addCriterion("website_img not between", value1, value2, "websiteImg");
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

        public Criteria andSearchInfoIsNull() {
            addCriterion("search_info is null");
            return (Criteria) this;
        }

        public Criteria andSearchInfoIsNotNull() {
            addCriterion("search_info is not null");
            return (Criteria) this;
        }

        public Criteria andSearchInfoEqualTo(String value) {
            addCriterion("search_info =", value, "searchInfo");
            return (Criteria) this;
        }

        public Criteria andSearchInfoNotEqualTo(String value) {
            addCriterion("search_info <>", value, "searchInfo");
            return (Criteria) this;
        }

        public Criteria andSearchInfoGreaterThan(String value) {
            addCriterion("search_info >", value, "searchInfo");
            return (Criteria) this;
        }

        public Criteria andSearchInfoGreaterThanOrEqualTo(String value) {
            addCriterion("search_info >=", value, "searchInfo");
            return (Criteria) this;
        }

        public Criteria andSearchInfoLessThan(String value) {
            addCriterion("search_info <", value, "searchInfo");
            return (Criteria) this;
        }

        public Criteria andSearchInfoLessThanOrEqualTo(String value) {
            addCriterion("search_info <=", value, "searchInfo");
            return (Criteria) this;
        }

        public Criteria andSearchInfoLike(String value) {
            addCriterion("search_info like", value, "searchInfo");
            return (Criteria) this;
        }

        public Criteria andSearchInfoNotLike(String value) {
            addCriterion("search_info not like", value, "searchInfo");
            return (Criteria) this;
        }

        public Criteria andSearchInfoIn(List<String> values) {
            addCriterion("search_info in", values, "searchInfo");
            return (Criteria) this;
        }

        public Criteria andSearchInfoNotIn(List<String> values) {
            addCriterion("search_info not in", values, "searchInfo");
            return (Criteria) this;
        }

        public Criteria andSearchInfoBetween(String value1, String value2) {
            addCriterion("search_info between", value1, value2, "searchInfo");
            return (Criteria) this;
        }

        public Criteria andSearchInfoNotBetween(String value1, String value2) {
            addCriterion("search_info not between", value1, value2, "searchInfo");
            return (Criteria) this;
        }

        public Criteria andNovelTypeIsNull() {
            addCriterion("novel_type is null");
            return (Criteria) this;
        }

        public Criteria andNovelTypeIsNotNull() {
            addCriterion("novel_type is not null");
            return (Criteria) this;
        }

        public Criteria andNovelTypeEqualTo(String value) {
            addCriterion("novel_type =", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeNotEqualTo(String value) {
            addCriterion("novel_type <>", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeGreaterThan(String value) {
            addCriterion("novel_type >", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("novel_type >=", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeLessThan(String value) {
            addCriterion("novel_type <", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeLessThanOrEqualTo(String value) {
            addCriterion("novel_type <=", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeLike(String value) {
            addCriterion("novel_type like", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeNotLike(String value) {
            addCriterion("novel_type not like", value, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeIn(List<String> values) {
            addCriterion("novel_type in", values, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeNotIn(List<String> values) {
            addCriterion("novel_type not in", values, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeBetween(String value1, String value2) {
            addCriterion("novel_type between", value1, value2, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelTypeNotBetween(String value1, String value2) {
            addCriterion("novel_type not between", value1, value2, "novelType");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorIsNull() {
            addCriterion("novel_author is null");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorIsNotNull() {
            addCriterion("novel_author is not null");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorEqualTo(String value) {
            addCriterion("novel_author =", value, "novelAuthor");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorNotEqualTo(String value) {
            addCriterion("novel_author <>", value, "novelAuthor");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorGreaterThan(String value) {
            addCriterion("novel_author >", value, "novelAuthor");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("novel_author >=", value, "novelAuthor");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorLessThan(String value) {
            addCriterion("novel_author <", value, "novelAuthor");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorLessThanOrEqualTo(String value) {
            addCriterion("novel_author <=", value, "novelAuthor");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorLike(String value) {
            addCriterion("novel_author like", value, "novelAuthor");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorNotLike(String value) {
            addCriterion("novel_author not like", value, "novelAuthor");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorIn(List<String> values) {
            addCriterion("novel_author in", values, "novelAuthor");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorNotIn(List<String> values) {
            addCriterion("novel_author not in", values, "novelAuthor");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorBetween(String value1, String value2) {
            addCriterion("novel_author between", value1, value2, "novelAuthor");
            return (Criteria) this;
        }

        public Criteria andNovelAuthorNotBetween(String value1, String value2) {
            addCriterion("novel_author not between", value1, value2, "novelAuthor");
            return (Criteria) this;
        }

        public Criteria andWordCountIsNull() {
            addCriterion("word_count is null");
            return (Criteria) this;
        }

        public Criteria andWordCountIsNotNull() {
            addCriterion("word_count is not null");
            return (Criteria) this;
        }

        public Criteria andWordCountEqualTo(String value) {
            addCriterion("word_count =", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotEqualTo(String value) {
            addCriterion("word_count <>", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountGreaterThan(String value) {
            addCriterion("word_count >", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountGreaterThanOrEqualTo(String value) {
            addCriterion("word_count >=", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountLessThan(String value) {
            addCriterion("word_count <", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountLessThanOrEqualTo(String value) {
            addCriterion("word_count <=", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountLike(String value) {
            addCriterion("word_count like", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotLike(String value) {
            addCriterion("word_count not like", value, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountIn(List<String> values) {
            addCriterion("word_count in", values, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotIn(List<String> values) {
            addCriterion("word_count not in", values, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountBetween(String value1, String value2) {
            addCriterion("word_count between", value1, value2, "wordCount");
            return (Criteria) this;
        }

        public Criteria andWordCountNotBetween(String value1, String value2) {
            addCriterion("word_count not between", value1, value2, "wordCount");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlIsNull() {
            addCriterion("novel_img_url is null");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlIsNotNull() {
            addCriterion("novel_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlEqualTo(String value) {
            addCriterion("novel_img_url =", value, "novelImgUrl");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlNotEqualTo(String value) {
            addCriterion("novel_img_url <>", value, "novelImgUrl");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlGreaterThan(String value) {
            addCriterion("novel_img_url >", value, "novelImgUrl");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("novel_img_url >=", value, "novelImgUrl");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlLessThan(String value) {
            addCriterion("novel_img_url <", value, "novelImgUrl");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlLessThanOrEqualTo(String value) {
            addCriterion("novel_img_url <=", value, "novelImgUrl");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlLike(String value) {
            addCriterion("novel_img_url like", value, "novelImgUrl");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlNotLike(String value) {
            addCriterion("novel_img_url not like", value, "novelImgUrl");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlIn(List<String> values) {
            addCriterion("novel_img_url in", values, "novelImgUrl");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlNotIn(List<String> values) {
            addCriterion("novel_img_url not in", values, "novelImgUrl");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlBetween(String value1, String value2) {
            addCriterion("novel_img_url between", value1, value2, "novelImgUrl");
            return (Criteria) this;
        }

        public Criteria andNovelImgUrlNotBetween(String value1, String value2) {
            addCriterion("novel_img_url not between", value1, value2, "novelImgUrl");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionIsNull() {
            addCriterion("novel_description is null");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionIsNotNull() {
            addCriterion("novel_description is not null");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionEqualTo(String value) {
            addCriterion("novel_description =", value, "novelDescription");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionNotEqualTo(String value) {
            addCriterion("novel_description <>", value, "novelDescription");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionGreaterThan(String value) {
            addCriterion("novel_description >", value, "novelDescription");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("novel_description >=", value, "novelDescription");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionLessThan(String value) {
            addCriterion("novel_description <", value, "novelDescription");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionLessThanOrEqualTo(String value) {
            addCriterion("novel_description <=", value, "novelDescription");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionLike(String value) {
            addCriterion("novel_description like", value, "novelDescription");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionNotLike(String value) {
            addCriterion("novel_description not like", value, "novelDescription");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionIn(List<String> values) {
            addCriterion("novel_description in", values, "novelDescription");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionNotIn(List<String> values) {
            addCriterion("novel_description not in", values, "novelDescription");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionBetween(String value1, String value2) {
            addCriterion("novel_description between", value1, value2, "novelDescription");
            return (Criteria) this;
        }

        public Criteria andNovelDescriptionNotBetween(String value1, String value2) {
            addCriterion("novel_description not between", value1, value2, "novelDescription");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterIsNull() {
            addCriterion("novel_latest_chapter is null");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterIsNotNull() {
            addCriterion("novel_latest_chapter is not null");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterEqualTo(String value) {
            addCriterion("novel_latest_chapter =", value, "novelLatestChapter");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterNotEqualTo(String value) {
            addCriterion("novel_latest_chapter <>", value, "novelLatestChapter");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterGreaterThan(String value) {
            addCriterion("novel_latest_chapter >", value, "novelLatestChapter");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterGreaterThanOrEqualTo(String value) {
            addCriterion("novel_latest_chapter >=", value, "novelLatestChapter");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterLessThan(String value) {
            addCriterion("novel_latest_chapter <", value, "novelLatestChapter");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterLessThanOrEqualTo(String value) {
            addCriterion("novel_latest_chapter <=", value, "novelLatestChapter");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterLike(String value) {
            addCriterion("novel_latest_chapter like", value, "novelLatestChapter");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterNotLike(String value) {
            addCriterion("novel_latest_chapter not like", value, "novelLatestChapter");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterIn(List<String> values) {
            addCriterion("novel_latest_chapter in", values, "novelLatestChapter");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterNotIn(List<String> values) {
            addCriterion("novel_latest_chapter not in", values, "novelLatestChapter");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterBetween(String value1, String value2) {
            addCriterion("novel_latest_chapter between", value1, value2, "novelLatestChapter");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterNotBetween(String value1, String value2) {
            addCriterion("novel_latest_chapter not between", value1, value2, "novelLatestChapter");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlIsNull() {
            addCriterion("novel_latest_chapter_url is null");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlIsNotNull() {
            addCriterion("novel_latest_chapter_url is not null");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlEqualTo(String value) {
            addCriterion("novel_latest_chapter_url =", value, "novelLatestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlNotEqualTo(String value) {
            addCriterion("novel_latest_chapter_url <>", value, "novelLatestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlGreaterThan(String value) {
            addCriterion("novel_latest_chapter_url >", value, "novelLatestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlGreaterThanOrEqualTo(String value) {
            addCriterion("novel_latest_chapter_url >=", value, "novelLatestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlLessThan(String value) {
            addCriterion("novel_latest_chapter_url <", value, "novelLatestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlLessThanOrEqualTo(String value) {
            addCriterion("novel_latest_chapter_url <=", value, "novelLatestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlLike(String value) {
            addCriterion("novel_latest_chapter_url like", value, "novelLatestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlNotLike(String value) {
            addCriterion("novel_latest_chapter_url not like", value, "novelLatestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlIn(List<String> values) {
            addCriterion("novel_latest_chapter_url in", values, "novelLatestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlNotIn(List<String> values) {
            addCriterion("novel_latest_chapter_url not in", values, "novelLatestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlBetween(String value1, String value2) {
            addCriterion("novel_latest_chapter_url between", value1, value2, "novelLatestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andNovelLatestChapterUrlNotBetween(String value1, String value2) {
            addCriterion("novel_latest_chapter_url not between", value1, value2, "novelLatestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andNovelStatusIsNull() {
            addCriterion("novel_status is null");
            return (Criteria) this;
        }

        public Criteria andNovelStatusIsNotNull() {
            addCriterion("novel_status is not null");
            return (Criteria) this;
        }

        public Criteria andNovelStatusEqualTo(String value) {
            addCriterion("novel_status =", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusNotEqualTo(String value) {
            addCriterion("novel_status <>", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusGreaterThan(String value) {
            addCriterion("novel_status >", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusGreaterThanOrEqualTo(String value) {
            addCriterion("novel_status >=", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusLessThan(String value) {
            addCriterion("novel_status <", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusLessThanOrEqualTo(String value) {
            addCriterion("novel_status <=", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusLike(String value) {
            addCriterion("novel_status like", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusNotLike(String value) {
            addCriterion("novel_status not like", value, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusIn(List<String> values) {
            addCriterion("novel_status in", values, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusNotIn(List<String> values) {
            addCriterion("novel_status not in", values, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusBetween(String value1, String value2) {
            addCriterion("novel_status between", value1, value2, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelStatusNotBetween(String value1, String value2) {
            addCriterion("novel_status not between", value1, value2, "novelStatus");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeIsNull() {
            addCriterion("novel_last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeIsNotNull() {
            addCriterion("novel_last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeEqualTo(String value) {
            addCriterion("novel_last_update_time =", value, "novelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeNotEqualTo(String value) {
            addCriterion("novel_last_update_time <>", value, "novelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeGreaterThan(String value) {
            addCriterion("novel_last_update_time >", value, "novelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("novel_last_update_time >=", value, "novelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeLessThan(String value) {
            addCriterion("novel_last_update_time <", value, "novelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("novel_last_update_time <=", value, "novelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeLike(String value) {
            addCriterion("novel_last_update_time like", value, "novelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeNotLike(String value) {
            addCriterion("novel_last_update_time not like", value, "novelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeIn(List<String> values) {
            addCriterion("novel_last_update_time in", values, "novelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeNotIn(List<String> values) {
            addCriterion("novel_last_update_time not in", values, "novelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeBetween(String value1, String value2) {
            addCriterion("novel_last_update_time between", value1, value2, "novelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNovelLastUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("novel_last_update_time not between", value1, value2, "novelLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlIsNull() {
            addCriterion("novel_chapters_url is null");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlIsNotNull() {
            addCriterion("novel_chapters_url is not null");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlEqualTo(String value) {
            addCriterion("novel_chapters_url =", value, "novelChaptersUrl");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlNotEqualTo(String value) {
            addCriterion("novel_chapters_url <>", value, "novelChaptersUrl");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlGreaterThan(String value) {
            addCriterion("novel_chapters_url >", value, "novelChaptersUrl");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlGreaterThanOrEqualTo(String value) {
            addCriterion("novel_chapters_url >=", value, "novelChaptersUrl");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlLessThan(String value) {
            addCriterion("novel_chapters_url <", value, "novelChaptersUrl");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlLessThanOrEqualTo(String value) {
            addCriterion("novel_chapters_url <=", value, "novelChaptersUrl");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlLike(String value) {
            addCriterion("novel_chapters_url like", value, "novelChaptersUrl");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlNotLike(String value) {
            addCriterion("novel_chapters_url not like", value, "novelChaptersUrl");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlIn(List<String> values) {
            addCriterion("novel_chapters_url in", values, "novelChaptersUrl");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlNotIn(List<String> values) {
            addCriterion("novel_chapters_url not in", values, "novelChaptersUrl");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlBetween(String value1, String value2) {
            addCriterion("novel_chapters_url between", value1, value2, "novelChaptersUrl");
            return (Criteria) this;
        }

        public Criteria andNovelChaptersUrlNotBetween(String value1, String value2) {
            addCriterion("novel_chapters_url not between", value1, value2, "novelChaptersUrl");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoIsNull() {
            addCriterion("chapter_list_info is null");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoIsNotNull() {
            addCriterion("chapter_list_info is not null");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoEqualTo(String value) {
            addCriterion("chapter_list_info =", value, "chapterListInfo");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoNotEqualTo(String value) {
            addCriterion("chapter_list_info <>", value, "chapterListInfo");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoGreaterThan(String value) {
            addCriterion("chapter_list_info >", value, "chapterListInfo");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_list_info >=", value, "chapterListInfo");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoLessThan(String value) {
            addCriterion("chapter_list_info <", value, "chapterListInfo");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoLessThanOrEqualTo(String value) {
            addCriterion("chapter_list_info <=", value, "chapterListInfo");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoLike(String value) {
            addCriterion("chapter_list_info like", value, "chapterListInfo");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoNotLike(String value) {
            addCriterion("chapter_list_info not like", value, "chapterListInfo");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoIn(List<String> values) {
            addCriterion("chapter_list_info in", values, "chapterListInfo");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoNotIn(List<String> values) {
            addCriterion("chapter_list_info not in", values, "chapterListInfo");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoBetween(String value1, String value2) {
            addCriterion("chapter_list_info between", value1, value2, "chapterListInfo");
            return (Criteria) this;
        }

        public Criteria andChapterListInfoNotBetween(String value1, String value2) {
            addCriterion("chapter_list_info not between", value1, value2, "chapterListInfo");
            return (Criteria) this;
        }

        public Criteria andChapterNameIsNull() {
            addCriterion("chapter_name is null");
            return (Criteria) this;
        }

        public Criteria andChapterNameIsNotNull() {
            addCriterion("chapter_name is not null");
            return (Criteria) this;
        }

        public Criteria andChapterNameEqualTo(String value) {
            addCriterion("chapter_name =", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotEqualTo(String value) {
            addCriterion("chapter_name <>", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThan(String value) {
            addCriterion("chapter_name >", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_name >=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThan(String value) {
            addCriterion("chapter_name <", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThanOrEqualTo(String value) {
            addCriterion("chapter_name <=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLike(String value) {
            addCriterion("chapter_name like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotLike(String value) {
            addCriterion("chapter_name not like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameIn(List<String> values) {
            addCriterion("chapter_name in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotIn(List<String> values) {
            addCriterion("chapter_name not in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameBetween(String value1, String value2) {
            addCriterion("chapter_name between", value1, value2, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotBetween(String value1, String value2) {
            addCriterion("chapter_name not between", value1, value2, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterUrlIsNull() {
            addCriterion("chapter_url is null");
            return (Criteria) this;
        }

        public Criteria andChapterUrlIsNotNull() {
            addCriterion("chapter_url is not null");
            return (Criteria) this;
        }

        public Criteria andChapterUrlEqualTo(String value) {
            addCriterion("chapter_url =", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlNotEqualTo(String value) {
            addCriterion("chapter_url <>", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlGreaterThan(String value) {
            addCriterion("chapter_url >", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_url >=", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlLessThan(String value) {
            addCriterion("chapter_url <", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlLessThanOrEqualTo(String value) {
            addCriterion("chapter_url <=", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlLike(String value) {
            addCriterion("chapter_url like", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlNotLike(String value) {
            addCriterion("chapter_url not like", value, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlIn(List<String> values) {
            addCriterion("chapter_url in", values, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlNotIn(List<String> values) {
            addCriterion("chapter_url not in", values, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlBetween(String value1, String value2) {
            addCriterion("chapter_url between", value1, value2, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andChapterUrlNotBetween(String value1, String value2) {
            addCriterion("chapter_url not between", value1, value2, "chapterUrl");
            return (Criteria) this;
        }

        public Criteria andContentInfoIsNull() {
            addCriterion("content_info is null");
            return (Criteria) this;
        }

        public Criteria andContentInfoIsNotNull() {
            addCriterion("content_info is not null");
            return (Criteria) this;
        }

        public Criteria andContentInfoEqualTo(String value) {
            addCriterion("content_info =", value, "contentInfo");
            return (Criteria) this;
        }

        public Criteria andContentInfoNotEqualTo(String value) {
            addCriterion("content_info <>", value, "contentInfo");
            return (Criteria) this;
        }

        public Criteria andContentInfoGreaterThan(String value) {
            addCriterion("content_info >", value, "contentInfo");
            return (Criteria) this;
        }

        public Criteria andContentInfoGreaterThanOrEqualTo(String value) {
            addCriterion("content_info >=", value, "contentInfo");
            return (Criteria) this;
        }

        public Criteria andContentInfoLessThan(String value) {
            addCriterion("content_info <", value, "contentInfo");
            return (Criteria) this;
        }

        public Criteria andContentInfoLessThanOrEqualTo(String value) {
            addCriterion("content_info <=", value, "contentInfo");
            return (Criteria) this;
        }

        public Criteria andContentInfoLike(String value) {
            addCriterion("content_info like", value, "contentInfo");
            return (Criteria) this;
        }

        public Criteria andContentInfoNotLike(String value) {
            addCriterion("content_info not like", value, "contentInfo");
            return (Criteria) this;
        }

        public Criteria andContentInfoIn(List<String> values) {
            addCriterion("content_info in", values, "contentInfo");
            return (Criteria) this;
        }

        public Criteria andContentInfoNotIn(List<String> values) {
            addCriterion("content_info not in", values, "contentInfo");
            return (Criteria) this;
        }

        public Criteria andContentInfoBetween(String value1, String value2) {
            addCriterion("content_info between", value1, value2, "contentInfo");
            return (Criteria) this;
        }

        public Criteria andContentInfoNotBetween(String value1, String value2) {
            addCriterion("content_info not between", value1, value2, "contentInfo");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageIsNull() {
            addCriterion("content_previous_page is null");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageIsNotNull() {
            addCriterion("content_previous_page is not null");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageEqualTo(String value) {
            addCriterion("content_previous_page =", value, "contentPreviousPage");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageNotEqualTo(String value) {
            addCriterion("content_previous_page <>", value, "contentPreviousPage");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageGreaterThan(String value) {
            addCriterion("content_previous_page >", value, "contentPreviousPage");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageGreaterThanOrEqualTo(String value) {
            addCriterion("content_previous_page >=", value, "contentPreviousPage");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageLessThan(String value) {
            addCriterion("content_previous_page <", value, "contentPreviousPage");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageLessThanOrEqualTo(String value) {
            addCriterion("content_previous_page <=", value, "contentPreviousPage");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageLike(String value) {
            addCriterion("content_previous_page like", value, "contentPreviousPage");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageNotLike(String value) {
            addCriterion("content_previous_page not like", value, "contentPreviousPage");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageIn(List<String> values) {
            addCriterion("content_previous_page in", values, "contentPreviousPage");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageNotIn(List<String> values) {
            addCriterion("content_previous_page not in", values, "contentPreviousPage");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageBetween(String value1, String value2) {
            addCriterion("content_previous_page between", value1, value2, "contentPreviousPage");
            return (Criteria) this;
        }

        public Criteria andContentPreviousPageNotBetween(String value1, String value2) {
            addCriterion("content_previous_page not between", value1, value2, "contentPreviousPage");
            return (Criteria) this;
        }

        public Criteria andContentNextPageIsNull() {
            addCriterion("content_next_page is null");
            return (Criteria) this;
        }

        public Criteria andContentNextPageIsNotNull() {
            addCriterion("content_next_page is not null");
            return (Criteria) this;
        }

        public Criteria andContentNextPageEqualTo(String value) {
            addCriterion("content_next_page =", value, "contentNextPage");
            return (Criteria) this;
        }

        public Criteria andContentNextPageNotEqualTo(String value) {
            addCriterion("content_next_page <>", value, "contentNextPage");
            return (Criteria) this;
        }

        public Criteria andContentNextPageGreaterThan(String value) {
            addCriterion("content_next_page >", value, "contentNextPage");
            return (Criteria) this;
        }

        public Criteria andContentNextPageGreaterThanOrEqualTo(String value) {
            addCriterion("content_next_page >=", value, "contentNextPage");
            return (Criteria) this;
        }

        public Criteria andContentNextPageLessThan(String value) {
            addCriterion("content_next_page <", value, "contentNextPage");
            return (Criteria) this;
        }

        public Criteria andContentNextPageLessThanOrEqualTo(String value) {
            addCriterion("content_next_page <=", value, "contentNextPage");
            return (Criteria) this;
        }

        public Criteria andContentNextPageLike(String value) {
            addCriterion("content_next_page like", value, "contentNextPage");
            return (Criteria) this;
        }

        public Criteria andContentNextPageNotLike(String value) {
            addCriterion("content_next_page not like", value, "contentNextPage");
            return (Criteria) this;
        }

        public Criteria andContentNextPageIn(List<String> values) {
            addCriterion("content_next_page in", values, "contentNextPage");
            return (Criteria) this;
        }

        public Criteria andContentNextPageNotIn(List<String> values) {
            addCriterion("content_next_page not in", values, "contentNextPage");
            return (Criteria) this;
        }

        public Criteria andContentNextPageBetween(String value1, String value2) {
            addCriterion("content_next_page between", value1, value2, "contentNextPage");
            return (Criteria) this;
        }

        public Criteria andContentNextPageNotBetween(String value1, String value2) {
            addCriterion("content_next_page not between", value1, value2, "contentNextPage");
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

        public Criteria andNovelUrlIsNull() {
            addCriterion("novel_url is null");
            return (Criteria) this;
        }

        public Criteria andNovelUrlIsNotNull() {
            addCriterion("novel_url is not null");
            return (Criteria) this;
        }

        public Criteria andNovelUrlEqualTo(String value) {
            addCriterion("novel_url =", value, "novelUrl");
            return (Criteria) this;
        }

        public Criteria andNovelUrlNotEqualTo(String value) {
            addCriterion("novel_url <>", value, "novelUrl");
            return (Criteria) this;
        }

        public Criteria andNovelUrlGreaterThan(String value) {
            addCriterion("novel_url >", value, "novelUrl");
            return (Criteria) this;
        }

        public Criteria andNovelUrlGreaterThanOrEqualTo(String value) {
            addCriterion("novel_url >=", value, "novelUrl");
            return (Criteria) this;
        }

        public Criteria andNovelUrlLessThan(String value) {
            addCriterion("novel_url <", value, "novelUrl");
            return (Criteria) this;
        }

        public Criteria andNovelUrlLessThanOrEqualTo(String value) {
            addCriterion("novel_url <=", value, "novelUrl");
            return (Criteria) this;
        }

        public Criteria andNovelUrlLike(String value) {
            addCriterion("novel_url like", value, "novelUrl");
            return (Criteria) this;
        }

        public Criteria andNovelUrlNotLike(String value) {
            addCriterion("novel_url not like", value, "novelUrl");
            return (Criteria) this;
        }

        public Criteria andNovelUrlIn(List<String> values) {
            addCriterion("novel_url in", values, "novelUrl");
            return (Criteria) this;
        }

        public Criteria andNovelUrlNotIn(List<String> values) {
            addCriterion("novel_url not in", values, "novelUrl");
            return (Criteria) this;
        }

        public Criteria andNovelUrlBetween(String value1, String value2) {
            addCriterion("novel_url between", value1, value2, "novelUrl");
            return (Criteria) this;
        }

        public Criteria andNovelUrlNotBetween(String value1, String value2) {
            addCriterion("novel_url not between", value1, value2, "novelUrl");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
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