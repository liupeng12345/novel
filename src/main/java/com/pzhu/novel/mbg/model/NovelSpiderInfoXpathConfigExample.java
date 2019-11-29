package com.pzhu.novel.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class NovelSpiderInfoXpathConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NovelSpiderInfoXpathConfigExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
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

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionIsNull() {
            addCriterion("briefIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionIsNotNull() {
            addCriterion("briefIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionEqualTo(String value) {
            addCriterion("briefIntroduction =", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionNotEqualTo(String value) {
            addCriterion("briefIntroduction <>", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionGreaterThan(String value) {
            addCriterion("briefIntroduction >", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("briefIntroduction >=", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionLessThan(String value) {
            addCriterion("briefIntroduction <", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionLessThanOrEqualTo(String value) {
            addCriterion("briefIntroduction <=", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionLike(String value) {
            addCriterion("briefIntroduction like", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionNotLike(String value) {
            addCriterion("briefIntroduction not like", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionIn(List<String> values) {
            addCriterion("briefIntroduction in", values, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionNotIn(List<String> values) {
            addCriterion("briefIntroduction not in", values, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionBetween(String value1, String value2) {
            addCriterion("briefIntroduction between", value1, value2, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionNotBetween(String value1, String value2) {
            addCriterion("briefIntroduction not between", value1, value2, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andLatestChapterIsNull() {
            addCriterion("latest_chapter is null");
            return (Criteria) this;
        }

        public Criteria andLatestChapterIsNotNull() {
            addCriterion("latest_chapter is not null");
            return (Criteria) this;
        }

        public Criteria andLatestChapterEqualTo(String value) {
            addCriterion("latest_chapter =", value, "latestChapter");
            return (Criteria) this;
        }

        public Criteria andLatestChapterNotEqualTo(String value) {
            addCriterion("latest_chapter <>", value, "latestChapter");
            return (Criteria) this;
        }

        public Criteria andLatestChapterGreaterThan(String value) {
            addCriterion("latest_chapter >", value, "latestChapter");
            return (Criteria) this;
        }

        public Criteria andLatestChapterGreaterThanOrEqualTo(String value) {
            addCriterion("latest_chapter >=", value, "latestChapter");
            return (Criteria) this;
        }

        public Criteria andLatestChapterLessThan(String value) {
            addCriterion("latest_chapter <", value, "latestChapter");
            return (Criteria) this;
        }

        public Criteria andLatestChapterLessThanOrEqualTo(String value) {
            addCriterion("latest_chapter <=", value, "latestChapter");
            return (Criteria) this;
        }

        public Criteria andLatestChapterLike(String value) {
            addCriterion("latest_chapter like", value, "latestChapter");
            return (Criteria) this;
        }

        public Criteria andLatestChapterNotLike(String value) {
            addCriterion("latest_chapter not like", value, "latestChapter");
            return (Criteria) this;
        }

        public Criteria andLatestChapterIn(List<String> values) {
            addCriterion("latest_chapter in", values, "latestChapter");
            return (Criteria) this;
        }

        public Criteria andLatestChapterNotIn(List<String> values) {
            addCriterion("latest_chapter not in", values, "latestChapter");
            return (Criteria) this;
        }

        public Criteria andLatestChapterBetween(String value1, String value2) {
            addCriterion("latest_chapter between", value1, value2, "latestChapter");
            return (Criteria) this;
        }

        public Criteria andLatestChapterNotBetween(String value1, String value2) {
            addCriterion("latest_chapter not between", value1, value2, "latestChapter");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlIsNull() {
            addCriterion("latest_chapter_url is null");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlIsNotNull() {
            addCriterion("latest_chapter_url is not null");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlEqualTo(String value) {
            addCriterion("latest_chapter_url =", value, "latestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlNotEqualTo(String value) {
            addCriterion("latest_chapter_url <>", value, "latestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlGreaterThan(String value) {
            addCriterion("latest_chapter_url >", value, "latestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlGreaterThanOrEqualTo(String value) {
            addCriterion("latest_chapter_url >=", value, "latestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlLessThan(String value) {
            addCriterion("latest_chapter_url <", value, "latestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlLessThanOrEqualTo(String value) {
            addCriterion("latest_chapter_url <=", value, "latestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlLike(String value) {
            addCriterion("latest_chapter_url like", value, "latestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlNotLike(String value) {
            addCriterion("latest_chapter_url not like", value, "latestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlIn(List<String> values) {
            addCriterion("latest_chapter_url in", values, "latestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlNotIn(List<String> values) {
            addCriterion("latest_chapter_url not in", values, "latestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlBetween(String value1, String value2) {
            addCriterion("latest_chapter_url between", value1, value2, "latestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andLatestChapterUrlNotBetween(String value1, String value2) {
            addCriterion("latest_chapter_url not between", value1, value2, "latestChapterUrl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(String value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(String value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(String value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(String value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLike(String value) {
            addCriterion("last_update_time like", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotLike(String value) {
            addCriterion("last_update_time not like", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<String> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<String> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(String value1, String value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andChapterListIsNull() {
            addCriterion("chapter_list is null");
            return (Criteria) this;
        }

        public Criteria andChapterListIsNotNull() {
            addCriterion("chapter_list is not null");
            return (Criteria) this;
        }

        public Criteria andChapterListEqualTo(String value) {
            addCriterion("chapter_list =", value, "chapterList");
            return (Criteria) this;
        }

        public Criteria andChapterListNotEqualTo(String value) {
            addCriterion("chapter_list <>", value, "chapterList");
            return (Criteria) this;
        }

        public Criteria andChapterListGreaterThan(String value) {
            addCriterion("chapter_list >", value, "chapterList");
            return (Criteria) this;
        }

        public Criteria andChapterListGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_list >=", value, "chapterList");
            return (Criteria) this;
        }

        public Criteria andChapterListLessThan(String value) {
            addCriterion("chapter_list <", value, "chapterList");
            return (Criteria) this;
        }

        public Criteria andChapterListLessThanOrEqualTo(String value) {
            addCriterion("chapter_list <=", value, "chapterList");
            return (Criteria) this;
        }

        public Criteria andChapterListLike(String value) {
            addCriterion("chapter_list like", value, "chapterList");
            return (Criteria) this;
        }

        public Criteria andChapterListNotLike(String value) {
            addCriterion("chapter_list not like", value, "chapterList");
            return (Criteria) this;
        }

        public Criteria andChapterListIn(List<String> values) {
            addCriterion("chapter_list in", values, "chapterList");
            return (Criteria) this;
        }

        public Criteria andChapterListNotIn(List<String> values) {
            addCriterion("chapter_list not in", values, "chapterList");
            return (Criteria) this;
        }

        public Criteria andChapterListBetween(String value1, String value2) {
            addCriterion("chapter_list between", value1, value2, "chapterList");
            return (Criteria) this;
        }

        public Criteria andChapterListNotBetween(String value1, String value2) {
            addCriterion("chapter_list not between", value1, value2, "chapterList");
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