package com.turing.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractApplyExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContAppNumIsNull() {
            addCriterion("CONT_APP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andContAppNumIsNotNull() {
            addCriterion("CONT_APP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andContAppNumEqualTo(String value) {
            addCriterion("CONT_APP_NUM =", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumNotEqualTo(String value) {
            addCriterion("CONT_APP_NUM <>", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumGreaterThan(String value) {
            addCriterion("CONT_APP_NUM >", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_APP_NUM >=", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumLessThan(String value) {
            addCriterion("CONT_APP_NUM <", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumLessThanOrEqualTo(String value) {
            addCriterion("CONT_APP_NUM <=", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumLike(String value) {
            addCriterion("CONT_APP_NUM like", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumNotLike(String value) {
            addCriterion("CONT_APP_NUM not like", value, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumIn(List<String> values) {
            addCriterion("CONT_APP_NUM in", values, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumNotIn(List<String> values) {
            addCriterion("CONT_APP_NUM not in", values, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumBetween(String value1, String value2) {
            addCriterion("CONT_APP_NUM between", value1, value2, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andContAppNumNotBetween(String value1, String value2) {
            addCriterion("CONT_APP_NUM not between", value1, value2, "contAppNum");
            return (Criteria) this;
        }

        public Criteria andStatQuoteIsNull() {
            addCriterion("STAT_QUOTE is null");
            return (Criteria) this;
        }

        public Criteria andStatQuoteIsNotNull() {
            addCriterion("STAT_QUOTE is not null");
            return (Criteria) this;
        }

        public Criteria andStatQuoteEqualTo(String value) {
            addCriterion("STAT_QUOTE =", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteNotEqualTo(String value) {
            addCriterion("STAT_QUOTE <>", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteGreaterThan(String value) {
            addCriterion("STAT_QUOTE >", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteGreaterThanOrEqualTo(String value) {
            addCriterion("STAT_QUOTE >=", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteLessThan(String value) {
            addCriterion("STAT_QUOTE <", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteLessThanOrEqualTo(String value) {
            addCriterion("STAT_QUOTE <=", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteLike(String value) {
            addCriterion("STAT_QUOTE like", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteNotLike(String value) {
            addCriterion("STAT_QUOTE not like", value, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteIn(List<String> values) {
            addCriterion("STAT_QUOTE in", values, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteNotIn(List<String> values) {
            addCriterion("STAT_QUOTE not in", values, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteBetween(String value1, String value2) {
            addCriterion("STAT_QUOTE between", value1, value2, "statQuote");
            return (Criteria) this;
        }

        public Criteria andStatQuoteNotBetween(String value1, String value2) {
            addCriterion("STAT_QUOTE not between", value1, value2, "statQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteIsNull() {
            addCriterion("TOP_QUOTE is null");
            return (Criteria) this;
        }

        public Criteria andTopQuoteIsNotNull() {
            addCriterion("TOP_QUOTE is not null");
            return (Criteria) this;
        }

        public Criteria andTopQuoteEqualTo(String value) {
            addCriterion("TOP_QUOTE =", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteNotEqualTo(String value) {
            addCriterion("TOP_QUOTE <>", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteGreaterThan(String value) {
            addCriterion("TOP_QUOTE >", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteGreaterThanOrEqualTo(String value) {
            addCriterion("TOP_QUOTE >=", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteLessThan(String value) {
            addCriterion("TOP_QUOTE <", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteLessThanOrEqualTo(String value) {
            addCriterion("TOP_QUOTE <=", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteLike(String value) {
            addCriterion("TOP_QUOTE like", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteNotLike(String value) {
            addCriterion("TOP_QUOTE not like", value, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteIn(List<String> values) {
            addCriterion("TOP_QUOTE in", values, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteNotIn(List<String> values) {
            addCriterion("TOP_QUOTE not in", values, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteBetween(String value1, String value2) {
            addCriterion("TOP_QUOTE between", value1, value2, "topQuote");
            return (Criteria) this;
        }

        public Criteria andTopQuoteNotBetween(String value1, String value2) {
            addCriterion("TOP_QUOTE not between", value1, value2, "topQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteIsNull() {
            addCriterion("LOW_QUOTE is null");
            return (Criteria) this;
        }

        public Criteria andLowQuoteIsNotNull() {
            addCriterion("LOW_QUOTE is not null");
            return (Criteria) this;
        }

        public Criteria andLowQuoteEqualTo(String value) {
            addCriterion("LOW_QUOTE =", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteNotEqualTo(String value) {
            addCriterion("LOW_QUOTE <>", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteGreaterThan(String value) {
            addCriterion("LOW_QUOTE >", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteGreaterThanOrEqualTo(String value) {
            addCriterion("LOW_QUOTE >=", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteLessThan(String value) {
            addCriterion("LOW_QUOTE <", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteLessThanOrEqualTo(String value) {
            addCriterion("LOW_QUOTE <=", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteLike(String value) {
            addCriterion("LOW_QUOTE like", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteNotLike(String value) {
            addCriterion("LOW_QUOTE not like", value, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteIn(List<String> values) {
            addCriterion("LOW_QUOTE in", values, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteNotIn(List<String> values) {
            addCriterion("LOW_QUOTE not in", values, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteBetween(String value1, String value2) {
            addCriterion("LOW_QUOTE between", value1, value2, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andLowQuoteNotBetween(String value1, String value2) {
            addCriterion("LOW_QUOTE not between", value1, value2, "lowQuote");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceIsNull() {
            addCriterion("ALL_SUM_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceIsNotNull() {
            addCriterion("ALL_SUM_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceEqualTo(BigDecimal value) {
            addCriterion("ALL_SUM_PRICE =", value, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceNotEqualTo(BigDecimal value) {
            addCriterion("ALL_SUM_PRICE <>", value, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceGreaterThan(BigDecimal value) {
            addCriterion("ALL_SUM_PRICE >", value, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ALL_SUM_PRICE >=", value, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceLessThan(BigDecimal value) {
            addCriterion("ALL_SUM_PRICE <", value, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ALL_SUM_PRICE <=", value, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceIn(List<BigDecimal> values) {
            addCriterion("ALL_SUM_PRICE in", values, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceNotIn(List<BigDecimal> values) {
            addCriterion("ALL_SUM_PRICE not in", values, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALL_SUM_PRICE between", value1, value2, "allSumPrice");
            return (Criteria) this;
        }

        public Criteria andAllSumPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALL_SUM_PRICE not between", value1, value2, "allSumPrice");
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

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
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

        public Criteria andAuthorIdIsNull() {
            addCriterion("AUTHOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("AUTHOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(Long value) {
            addCriterion("AUTHOR_ID =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(Long value) {
            addCriterion("AUTHOR_ID <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(Long value) {
            addCriterion("AUTHOR_ID >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AUTHOR_ID >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(Long value) {
            addCriterion("AUTHOR_ID <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(Long value) {
            addCriterion("AUTHOR_ID <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<Long> values) {
            addCriterion("AUTHOR_ID in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<Long> values) {
            addCriterion("AUTHOR_ID not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(Long value1, Long value2) {
            addCriterion("AUTHOR_ID between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(Long value1, Long value2) {
            addCriterion("AUTHOR_ID not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("AUTHOR =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("AUTHOR <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("AUTHOR >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHOR >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("AUTHOR <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("AUTHOR <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("AUTHOR like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("AUTHOR not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("AUTHOR in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("AUTHOR not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("AUTHOR between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("AUTHOR not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andPlanerIdIsNull() {
            addCriterion("PLANER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlanerIdIsNotNull() {
            addCriterion("PLANER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanerIdEqualTo(Long value) {
            addCriterion("PLANER_ID =", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdNotEqualTo(Long value) {
            addCriterion("PLANER_ID <>", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdGreaterThan(Long value) {
            addCriterion("PLANER_ID >", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PLANER_ID >=", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdLessThan(Long value) {
            addCriterion("PLANER_ID <", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdLessThanOrEqualTo(Long value) {
            addCriterion("PLANER_ID <=", value, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdIn(List<Long> values) {
            addCriterion("PLANER_ID in", values, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdNotIn(List<Long> values) {
            addCriterion("PLANER_ID not in", values, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdBetween(Long value1, Long value2) {
            addCriterion("PLANER_ID between", value1, value2, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIdNotBetween(Long value1, Long value2) {
            addCriterion("PLANER_ID not between", value1, value2, "planerId");
            return (Criteria) this;
        }

        public Criteria andPlanerIsNull() {
            addCriterion("PLANER is null");
            return (Criteria) this;
        }

        public Criteria andPlanerIsNotNull() {
            addCriterion("PLANER is not null");
            return (Criteria) this;
        }

        public Criteria andPlanerEqualTo(String value) {
            addCriterion("PLANER =", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerNotEqualTo(String value) {
            addCriterion("PLANER <>", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerGreaterThan(String value) {
            addCriterion("PLANER >", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerGreaterThanOrEqualTo(String value) {
            addCriterion("PLANER >=", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerLessThan(String value) {
            addCriterion("PLANER <", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerLessThanOrEqualTo(String value) {
            addCriterion("PLANER <=", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerLike(String value) {
            addCriterion("PLANER like", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerNotLike(String value) {
            addCriterion("PLANER not like", value, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerIn(List<String> values) {
            addCriterion("PLANER in", values, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerNotIn(List<String> values) {
            addCriterion("PLANER not in", values, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerBetween(String value1, String value2) {
            addCriterion("PLANER between", value1, value2, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanerNotBetween(String value1, String value2) {
            addCriterion("PLANER not between", value1, value2, "planer");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeIsNull() {
            addCriterion("PLAN_AGREE is null");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeIsNotNull() {
            addCriterion("PLAN_AGREE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeEqualTo(String value) {
            addCriterion("PLAN_AGREE =", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeNotEqualTo(String value) {
            addCriterion("PLAN_AGREE <>", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeGreaterThan(String value) {
            addCriterion("PLAN_AGREE >", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_AGREE >=", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeLessThan(String value) {
            addCriterion("PLAN_AGREE <", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeLessThanOrEqualTo(String value) {
            addCriterion("PLAN_AGREE <=", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeLike(String value) {
            addCriterion("PLAN_AGREE like", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeNotLike(String value) {
            addCriterion("PLAN_AGREE not like", value, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeIn(List<String> values) {
            addCriterion("PLAN_AGREE in", values, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeNotIn(List<String> values) {
            addCriterion("PLAN_AGREE not in", values, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeBetween(String value1, String value2) {
            addCriterion("PLAN_AGREE between", value1, value2, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanAgreeNotBetween(String value1, String value2) {
            addCriterion("PLAN_AGREE not between", value1, value2, "planAgree");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionIsNull() {
            addCriterion("PLAN_OPINION is null");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionIsNotNull() {
            addCriterion("PLAN_OPINION is not null");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionEqualTo(String value) {
            addCriterion("PLAN_OPINION =", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionNotEqualTo(String value) {
            addCriterion("PLAN_OPINION <>", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionGreaterThan(String value) {
            addCriterion("PLAN_OPINION >", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_OPINION >=", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionLessThan(String value) {
            addCriterion("PLAN_OPINION <", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionLessThanOrEqualTo(String value) {
            addCriterion("PLAN_OPINION <=", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionLike(String value) {
            addCriterion("PLAN_OPINION like", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionNotLike(String value) {
            addCriterion("PLAN_OPINION not like", value, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionIn(List<String> values) {
            addCriterion("PLAN_OPINION in", values, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionNotIn(List<String> values) {
            addCriterion("PLAN_OPINION not in", values, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionBetween(String value1, String value2) {
            addCriterion("PLAN_OPINION between", value1, value2, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanOpinionNotBetween(String value1, String value2) {
            addCriterion("PLAN_OPINION not between", value1, value2, "planOpinion");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNull() {
            addCriterion("PLAN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanDateIsNotNull() {
            addCriterion("PLAN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDateEqualTo(Date value) {
            addCriterion("PLAN_DATE =", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotEqualTo(Date value) {
            addCriterion("PLAN_DATE <>", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThan(Date value) {
            addCriterion("PLAN_DATE >", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PLAN_DATE >=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThan(Date value) {
            addCriterion("PLAN_DATE <", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateLessThanOrEqualTo(Date value) {
            addCriterion("PLAN_DATE <=", value, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateIn(List<Date> values) {
            addCriterion("PLAN_DATE in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotIn(List<Date> values) {
            addCriterion("PLAN_DATE not in", values, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateBetween(Date value1, Date value2) {
            addCriterion("PLAN_DATE between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andPlanDateNotBetween(Date value1, Date value2) {
            addCriterion("PLAN_DATE not between", value1, value2, "planDate");
            return (Criteria) this;
        }

        public Criteria andLeaderIdIsNull() {
            addCriterion("LEADER_ID is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIdIsNotNull() {
            addCriterion("LEADER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderIdEqualTo(Long value) {
            addCriterion("LEADER_ID =", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotEqualTo(Long value) {
            addCriterion("LEADER_ID <>", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdGreaterThan(Long value) {
            addCriterion("LEADER_ID >", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LEADER_ID >=", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLessThan(Long value) {
            addCriterion("LEADER_ID <", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLessThanOrEqualTo(Long value) {
            addCriterion("LEADER_ID <=", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdIn(List<Long> values) {
            addCriterion("LEADER_ID in", values, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotIn(List<Long> values) {
            addCriterion("LEADER_ID not in", values, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdBetween(Long value1, Long value2) {
            addCriterion("LEADER_ID between", value1, value2, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotBetween(Long value1, Long value2) {
            addCriterion("LEADER_ID not between", value1, value2, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("LEADER is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("LEADER =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("LEADER <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("LEADER >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("LEADER >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("LEADER <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("LEADER <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("LEADER like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("LEADER not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("LEADER in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("LEADER not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("LEADER between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("LEADER not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeIsNull() {
            addCriterion("LEAD_AGREE is null");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeIsNotNull() {
            addCriterion("LEAD_AGREE is not null");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeEqualTo(String value) {
            addCriterion("LEAD_AGREE =", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeNotEqualTo(String value) {
            addCriterion("LEAD_AGREE <>", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeGreaterThan(String value) {
            addCriterion("LEAD_AGREE >", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeGreaterThanOrEqualTo(String value) {
            addCriterion("LEAD_AGREE >=", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeLessThan(String value) {
            addCriterion("LEAD_AGREE <", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeLessThanOrEqualTo(String value) {
            addCriterion("LEAD_AGREE <=", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeLike(String value) {
            addCriterion("LEAD_AGREE like", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeNotLike(String value) {
            addCriterion("LEAD_AGREE not like", value, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeIn(List<String> values) {
            addCriterion("LEAD_AGREE in", values, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeNotIn(List<String> values) {
            addCriterion("LEAD_AGREE not in", values, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeBetween(String value1, String value2) {
            addCriterion("LEAD_AGREE between", value1, value2, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadAgreeNotBetween(String value1, String value2) {
            addCriterion("LEAD_AGREE not between", value1, value2, "leadAgree");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionIsNull() {
            addCriterion("LEAD_OPINION is null");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionIsNotNull() {
            addCriterion("LEAD_OPINION is not null");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionEqualTo(String value) {
            addCriterion("LEAD_OPINION =", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionNotEqualTo(String value) {
            addCriterion("LEAD_OPINION <>", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionGreaterThan(String value) {
            addCriterion("LEAD_OPINION >", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("LEAD_OPINION >=", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionLessThan(String value) {
            addCriterion("LEAD_OPINION <", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionLessThanOrEqualTo(String value) {
            addCriterion("LEAD_OPINION <=", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionLike(String value) {
            addCriterion("LEAD_OPINION like", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionNotLike(String value) {
            addCriterion("LEAD_OPINION not like", value, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionIn(List<String> values) {
            addCriterion("LEAD_OPINION in", values, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionNotIn(List<String> values) {
            addCriterion("LEAD_OPINION not in", values, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionBetween(String value1, String value2) {
            addCriterion("LEAD_OPINION between", value1, value2, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadOpinionNotBetween(String value1, String value2) {
            addCriterion("LEAD_OPINION not between", value1, value2, "leadOpinion");
            return (Criteria) this;
        }

        public Criteria andLeadDateIsNull() {
            addCriterion("LEAD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLeadDateIsNotNull() {
            addCriterion("LEAD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLeadDateEqualTo(Date value) {
            addCriterion("LEAD_DATE =", value, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateNotEqualTo(Date value) {
            addCriterion("LEAD_DATE <>", value, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateGreaterThan(Date value) {
            addCriterion("LEAD_DATE >", value, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LEAD_DATE >=", value, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateLessThan(Date value) {
            addCriterion("LEAD_DATE <", value, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateLessThanOrEqualTo(Date value) {
            addCriterion("LEAD_DATE <=", value, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateIn(List<Date> values) {
            addCriterion("LEAD_DATE in", values, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateNotIn(List<Date> values) {
            addCriterion("LEAD_DATE not in", values, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateBetween(Date value1, Date value2) {
            addCriterion("LEAD_DATE between", value1, value2, "leadDate");
            return (Criteria) this;
        }

        public Criteria andLeadDateNotBetween(Date value1, Date value2) {
            addCriterion("LEAD_DATE not between", value1, value2, "leadDate");
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