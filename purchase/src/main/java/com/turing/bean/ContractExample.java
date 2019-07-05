package com.turing.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractExample() {
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

        public Criteria andContNumIsNull() {
            addCriterion("CONT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andContNumIsNotNull() {
            addCriterion("CONT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andContNumEqualTo(String value) {
            addCriterion("CONT_NUM =", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumNotEqualTo(String value) {
            addCriterion("CONT_NUM <>", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumGreaterThan(String value) {
            addCriterion("CONT_NUM >", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_NUM >=", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumLessThan(String value) {
            addCriterion("CONT_NUM <", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumLessThanOrEqualTo(String value) {
            addCriterion("CONT_NUM <=", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumLike(String value) {
            addCriterion("CONT_NUM like", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumNotLike(String value) {
            addCriterion("CONT_NUM not like", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumIn(List<String> values) {
            addCriterion("CONT_NUM in", values, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumNotIn(List<String> values) {
            addCriterion("CONT_NUM not in", values, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumBetween(String value1, String value2) {
            addCriterion("CONT_NUM between", value1, value2, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumNotBetween(String value1, String value2) {
            addCriterion("CONT_NUM not between", value1, value2, "contNum");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNull() {
            addCriterion("BUYER is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNotNull() {
            addCriterion("BUYER is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerEqualTo(String value) {
            addCriterion("BUYER =", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotEqualTo(String value) {
            addCriterion("BUYER <>", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThan(String value) {
            addCriterion("BUYER >", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER >=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThan(String value) {
            addCriterion("BUYER <", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThanOrEqualTo(String value) {
            addCriterion("BUYER <=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLike(String value) {
            addCriterion("BUYER like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotLike(String value) {
            addCriterion("BUYER not like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerIn(List<String> values) {
            addCriterion("BUYER in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotIn(List<String> values) {
            addCriterion("BUYER not in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerBetween(String value1, String value2) {
            addCriterion("BUYER between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotBetween(String value1, String value2) {
            addCriterion("BUYER not between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andSellerIsNull() {
            addCriterion("SELLER is null");
            return (Criteria) this;
        }

        public Criteria andSellerIsNotNull() {
            addCriterion("SELLER is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEqualTo(String value) {
            addCriterion("SELLER =", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotEqualTo(String value) {
            addCriterion("SELLER <>", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThan(String value) {
            addCriterion("SELLER >", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThanOrEqualTo(String value) {
            addCriterion("SELLER >=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThan(String value) {
            addCriterion("SELLER <", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThanOrEqualTo(String value) {
            addCriterion("SELLER <=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLike(String value) {
            addCriterion("SELLER like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotLike(String value) {
            addCriterion("SELLER not like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerIn(List<String> values) {
            addCriterion("SELLER in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotIn(List<String> values) {
            addCriterion("SELLER not in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerBetween(String value1, String value2) {
            addCriterion("SELLER between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotBetween(String value1, String value2) {
            addCriterion("SELLER not between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andSupplierNumIsNull() {
            addCriterion("SUPPLIER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNumIsNotNull() {
            addCriterion("SUPPLIER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNumEqualTo(String value) {
            addCriterion("SUPPLIER_NUM =", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumNotEqualTo(String value) {
            addCriterion("SUPPLIER_NUM <>", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumGreaterThan(String value) {
            addCriterion("SUPPLIER_NUM >", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NUM >=", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumLessThan(String value) {
            addCriterion("SUPPLIER_NUM <", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_NUM <=", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumLike(String value) {
            addCriterion("SUPPLIER_NUM like", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumNotLike(String value) {
            addCriterion("SUPPLIER_NUM not like", value, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumIn(List<String> values) {
            addCriterion("SUPPLIER_NUM in", values, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumNotIn(List<String> values) {
            addCriterion("SUPPLIER_NUM not in", values, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NUM between", value1, value2, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andSupplierNumNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_NUM not between", value1, value2, "supplierNum");
            return (Criteria) this;
        }

        public Criteria andContDateIsNull() {
            addCriterion("CONT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andContDateIsNotNull() {
            addCriterion("CONT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andContDateEqualTo(Date value) {
            addCriterion("CONT_DATE =", value, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateNotEqualTo(Date value) {
            addCriterion("CONT_DATE <>", value, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateGreaterThan(Date value) {
            addCriterion("CONT_DATE >", value, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONT_DATE >=", value, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateLessThan(Date value) {
            addCriterion("CONT_DATE <", value, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateLessThanOrEqualTo(Date value) {
            addCriterion("CONT_DATE <=", value, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateIn(List<Date> values) {
            addCriterion("CONT_DATE in", values, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateNotIn(List<Date> values) {
            addCriterion("CONT_DATE not in", values, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateBetween(Date value1, Date value2) {
            addCriterion("CONT_DATE between", value1, value2, "contDate");
            return (Criteria) this;
        }

        public Criteria andContDateNotBetween(Date value1, Date value2) {
            addCriterion("CONT_DATE not between", value1, value2, "contDate");
            return (Criteria) this;
        }

        public Criteria andContTypeIsNull() {
            addCriterion("CONT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContTypeIsNotNull() {
            addCriterion("CONT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContTypeEqualTo(String value) {
            addCriterion("CONT_TYPE =", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeNotEqualTo(String value) {
            addCriterion("CONT_TYPE <>", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeGreaterThan(String value) {
            addCriterion("CONT_TYPE >", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_TYPE >=", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeLessThan(String value) {
            addCriterion("CONT_TYPE <", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeLessThanOrEqualTo(String value) {
            addCriterion("CONT_TYPE <=", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeLike(String value) {
            addCriterion("CONT_TYPE like", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeNotLike(String value) {
            addCriterion("CONT_TYPE not like", value, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeIn(List<String> values) {
            addCriterion("CONT_TYPE in", values, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeNotIn(List<String> values) {
            addCriterion("CONT_TYPE not in", values, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeBetween(String value1, String value2) {
            addCriterion("CONT_TYPE between", value1, value2, "contType");
            return (Criteria) this;
        }

        public Criteria andContTypeNotBetween(String value1, String value2) {
            addCriterion("CONT_TYPE not between", value1, value2, "contType");
            return (Criteria) this;
        }

        public Criteria andStockTypeIsNull() {
            addCriterion("STOCK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStockTypeIsNotNull() {
            addCriterion("STOCK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStockTypeEqualTo(String value) {
            addCriterion("STOCK_TYPE =", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotEqualTo(String value) {
            addCriterion("STOCK_TYPE <>", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThan(String value) {
            addCriterion("STOCK_TYPE >", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("STOCK_TYPE >=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThan(String value) {
            addCriterion("STOCK_TYPE <", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThanOrEqualTo(String value) {
            addCriterion("STOCK_TYPE <=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLike(String value) {
            addCriterion("STOCK_TYPE like", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotLike(String value) {
            addCriterion("STOCK_TYPE not like", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeIn(List<String> values) {
            addCriterion("STOCK_TYPE in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotIn(List<String> values) {
            addCriterion("STOCK_TYPE not in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeBetween(String value1, String value2) {
            addCriterion("STOCK_TYPE between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotBetween(String value1, String value2) {
            addCriterion("STOCK_TYPE not between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andContItemIsNull() {
            addCriterion("CONT_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andContItemIsNotNull() {
            addCriterion("CONT_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andContItemEqualTo(String value) {
            addCriterion("CONT_ITEM =", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemNotEqualTo(String value) {
            addCriterion("CONT_ITEM <>", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemGreaterThan(String value) {
            addCriterion("CONT_ITEM >", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_ITEM >=", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemLessThan(String value) {
            addCriterion("CONT_ITEM <", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemLessThanOrEqualTo(String value) {
            addCriterion("CONT_ITEM <=", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemLike(String value) {
            addCriterion("CONT_ITEM like", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemNotLike(String value) {
            addCriterion("CONT_ITEM not like", value, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemIn(List<String> values) {
            addCriterion("CONT_ITEM in", values, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemNotIn(List<String> values) {
            addCriterion("CONT_ITEM not in", values, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemBetween(String value1, String value2) {
            addCriterion("CONT_ITEM between", value1, value2, "contItem");
            return (Criteria) this;
        }

        public Criteria andContItemNotBetween(String value1, String value2) {
            addCriterion("CONT_ITEM not between", value1, value2, "contItem");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("MONEY =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("MONEY <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("MONEY >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("MONEY >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("MONEY <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("MONEY <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("MONEY like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("MONEY not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("MONEY in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("MONEY not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("MONEY between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("MONEY not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("TAX_RATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("TAX_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("TAX_RATE >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("TAX_RATE <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("TAX_RATE in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("TAX_RATE not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RATE between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RATE not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andWrapBackIsNull() {
            addCriterion("WRAP_BACK is null");
            return (Criteria) this;
        }

        public Criteria andWrapBackIsNotNull() {
            addCriterion("WRAP_BACK is not null");
            return (Criteria) this;
        }

        public Criteria andWrapBackEqualTo(String value) {
            addCriterion("WRAP_BACK =", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackNotEqualTo(String value) {
            addCriterion("WRAP_BACK <>", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackGreaterThan(String value) {
            addCriterion("WRAP_BACK >", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackGreaterThanOrEqualTo(String value) {
            addCriterion("WRAP_BACK >=", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackLessThan(String value) {
            addCriterion("WRAP_BACK <", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackLessThanOrEqualTo(String value) {
            addCriterion("WRAP_BACK <=", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackLike(String value) {
            addCriterion("WRAP_BACK like", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackNotLike(String value) {
            addCriterion("WRAP_BACK not like", value, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackIn(List<String> values) {
            addCriterion("WRAP_BACK in", values, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackNotIn(List<String> values) {
            addCriterion("WRAP_BACK not in", values, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackBetween(String value1, String value2) {
            addCriterion("WRAP_BACK between", value1, value2, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andWrapBackNotBetween(String value1, String value2) {
            addCriterion("WRAP_BACK not between", value1, value2, "wrapBack");
            return (Criteria) this;
        }

        public Criteria andVerifyStandIsNull() {
            addCriterion("VERIFY_STAND is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStandIsNotNull() {
            addCriterion("VERIFY_STAND is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStandEqualTo(String value) {
            addCriterion("VERIFY_STAND =", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandNotEqualTo(String value) {
            addCriterion("VERIFY_STAND <>", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandGreaterThan(String value) {
            addCriterion("VERIFY_STAND >", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY_STAND >=", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandLessThan(String value) {
            addCriterion("VERIFY_STAND <", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandLessThanOrEqualTo(String value) {
            addCriterion("VERIFY_STAND <=", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandLike(String value) {
            addCriterion("VERIFY_STAND like", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandNotLike(String value) {
            addCriterion("VERIFY_STAND not like", value, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandIn(List<String> values) {
            addCriterion("VERIFY_STAND in", values, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandNotIn(List<String> values) {
            addCriterion("VERIFY_STAND not in", values, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandBetween(String value1, String value2) {
            addCriterion("VERIFY_STAND between", value1, value2, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andVerifyStandNotBetween(String value1, String value2) {
            addCriterion("VERIFY_STAND not between", value1, value2, "verifyStand");
            return (Criteria) this;
        }

        public Criteria andModeIsNull() {
            addCriterion("MODE is null");
            return (Criteria) this;
        }

        public Criteria andModeIsNotNull() {
            addCriterion("MODE is not null");
            return (Criteria) this;
        }

        public Criteria andModeEqualTo(String value) {
            addCriterion("MODE =", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotEqualTo(String value) {
            addCriterion("MODE <>", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThan(String value) {
            addCriterion("MODE >", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThanOrEqualTo(String value) {
            addCriterion("MODE >=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThan(String value) {
            addCriterion("MODE <", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThanOrEqualTo(String value) {
            addCriterion("MODE <=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLike(String value) {
            addCriterion("MODE like", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotLike(String value) {
            addCriterion("MODE not like", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeIn(List<String> values) {
            addCriterion("MODE in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotIn(List<String> values) {
            addCriterion("MODE not in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeBetween(String value1, String value2) {
            addCriterion("MODE between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotBetween(String value1, String value2) {
            addCriterion("MODE not between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andPayCondIsNull() {
            addCriterion("PAY_COND is null");
            return (Criteria) this;
        }

        public Criteria andPayCondIsNotNull() {
            addCriterion("PAY_COND is not null");
            return (Criteria) this;
        }

        public Criteria andPayCondEqualTo(String value) {
            addCriterion("PAY_COND =", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondNotEqualTo(String value) {
            addCriterion("PAY_COND <>", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondGreaterThan(String value) {
            addCriterion("PAY_COND >", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_COND >=", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondLessThan(String value) {
            addCriterion("PAY_COND <", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondLessThanOrEqualTo(String value) {
            addCriterion("PAY_COND <=", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondLike(String value) {
            addCriterion("PAY_COND like", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondNotLike(String value) {
            addCriterion("PAY_COND not like", value, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondIn(List<String> values) {
            addCriterion("PAY_COND in", values, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondNotIn(List<String> values) {
            addCriterion("PAY_COND not in", values, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondBetween(String value1, String value2) {
            addCriterion("PAY_COND between", value1, value2, "payCond");
            return (Criteria) this;
        }

        public Criteria andPayCondNotBetween(String value1, String value2) {
            addCriterion("PAY_COND not between", value1, value2, "payCond");
            return (Criteria) this;
        }

        public Criteria andVerifyDateIsNull() {
            addCriterion("VERIFY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andVerifyDateIsNotNull() {
            addCriterion("VERIFY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyDateEqualTo(Date value) {
            addCriterion("VERIFY_DATE =", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateNotEqualTo(Date value) {
            addCriterion("VERIFY_DATE <>", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateGreaterThan(Date value) {
            addCriterion("VERIFY_DATE >", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("VERIFY_DATE >=", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateLessThan(Date value) {
            addCriterion("VERIFY_DATE <", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateLessThanOrEqualTo(Date value) {
            addCriterion("VERIFY_DATE <=", value, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateIn(List<Date> values) {
            addCriterion("VERIFY_DATE in", values, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateNotIn(List<Date> values) {
            addCriterion("VERIFY_DATE not in", values, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateBetween(Date value1, Date value2) {
            addCriterion("VERIFY_DATE between", value1, value2, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andVerifyDateNotBetween(Date value1, Date value2) {
            addCriterion("VERIFY_DATE not between", value1, value2, "verifyDate");
            return (Criteria) this;
        }

        public Criteria andQualityStandIsNull() {
            addCriterion("QUALITY_STAND is null");
            return (Criteria) this;
        }

        public Criteria andQualityStandIsNotNull() {
            addCriterion("QUALITY_STAND is not null");
            return (Criteria) this;
        }

        public Criteria andQualityStandEqualTo(String value) {
            addCriterion("QUALITY_STAND =", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandNotEqualTo(String value) {
            addCriterion("QUALITY_STAND <>", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandGreaterThan(String value) {
            addCriterion("QUALITY_STAND >", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandGreaterThanOrEqualTo(String value) {
            addCriterion("QUALITY_STAND >=", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandLessThan(String value) {
            addCriterion("QUALITY_STAND <", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandLessThanOrEqualTo(String value) {
            addCriterion("QUALITY_STAND <=", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandLike(String value) {
            addCriterion("QUALITY_STAND like", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandNotLike(String value) {
            addCriterion("QUALITY_STAND not like", value, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandIn(List<String> values) {
            addCriterion("QUALITY_STAND in", values, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandNotIn(List<String> values) {
            addCriterion("QUALITY_STAND not in", values, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandBetween(String value1, String value2) {
            addCriterion("QUALITY_STAND between", value1, value2, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andQualityStandNotBetween(String value1, String value2) {
            addCriterion("QUALITY_STAND not between", value1, value2, "qualityStand");
            return (Criteria) this;
        }

        public Criteria andStandardNoIsNull() {
            addCriterion("STANDARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andStandardNoIsNotNull() {
            addCriterion("STANDARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStandardNoEqualTo(String value) {
            addCriterion("STANDARD_NO =", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoNotEqualTo(String value) {
            addCriterion("STANDARD_NO <>", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoGreaterThan(String value) {
            addCriterion("STANDARD_NO >", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoGreaterThanOrEqualTo(String value) {
            addCriterion("STANDARD_NO >=", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoLessThan(String value) {
            addCriterion("STANDARD_NO <", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoLessThanOrEqualTo(String value) {
            addCriterion("STANDARD_NO <=", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoLike(String value) {
            addCriterion("STANDARD_NO like", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoNotLike(String value) {
            addCriterion("STANDARD_NO not like", value, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoIn(List<String> values) {
            addCriterion("STANDARD_NO in", values, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoNotIn(List<String> values) {
            addCriterion("STANDARD_NO not in", values, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoBetween(String value1, String value2) {
            addCriterion("STANDARD_NO between", value1, value2, "standardNo");
            return (Criteria) this;
        }

        public Criteria andStandardNoNotBetween(String value1, String value2) {
            addCriterion("STANDARD_NO not between", value1, value2, "standardNo");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("PLACE is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("PLACE =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("PLACE <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("PLACE >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("PLACE >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("PLACE <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("PLACE <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("PLACE like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("PLACE not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("PLACE in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("PLACE not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("PLACE between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("PLACE not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andContPriceIsNull() {
            addCriterion("CONT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andContPriceIsNotNull() {
            addCriterion("CONT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andContPriceEqualTo(BigDecimal value) {
            addCriterion("CONT_PRICE =", value, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceNotEqualTo(BigDecimal value) {
            addCriterion("CONT_PRICE <>", value, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceGreaterThan(BigDecimal value) {
            addCriterion("CONT_PRICE >", value, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONT_PRICE >=", value, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceLessThan(BigDecimal value) {
            addCriterion("CONT_PRICE <", value, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONT_PRICE <=", value, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceIn(List<BigDecimal> values) {
            addCriterion("CONT_PRICE in", values, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceNotIn(List<BigDecimal> values) {
            addCriterion("CONT_PRICE not in", values, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONT_PRICE between", value1, value2, "contPrice");
            return (Criteria) this;
        }

        public Criteria andContPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONT_PRICE not between", value1, value2, "contPrice");
            return (Criteria) this;
        }

        public Criteria andTransportIsNull() {
            addCriterion("TRANSPORT is null");
            return (Criteria) this;
        }

        public Criteria andTransportIsNotNull() {
            addCriterion("TRANSPORT is not null");
            return (Criteria) this;
        }

        public Criteria andTransportEqualTo(String value) {
            addCriterion("TRANSPORT =", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotEqualTo(String value) {
            addCriterion("TRANSPORT <>", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportGreaterThan(String value) {
            addCriterion("TRANSPORT >", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSPORT >=", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLessThan(String value) {
            addCriterion("TRANSPORT <", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLessThanOrEqualTo(String value) {
            addCriterion("TRANSPORT <=", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLike(String value) {
            addCriterion("TRANSPORT like", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotLike(String value) {
            addCriterion("TRANSPORT not like", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportIn(List<String> values) {
            addCriterion("TRANSPORT in", values, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotIn(List<String> values) {
            addCriterion("TRANSPORT not in", values, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportBetween(String value1, String value2) {
            addCriterion("TRANSPORT between", value1, value2, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotBetween(String value1, String value2) {
            addCriterion("TRANSPORT not between", value1, value2, "transport");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("PAY_WAY is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("PAY_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("PAY_WAY =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("PAY_WAY <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("PAY_WAY >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_WAY >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("PAY_WAY <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("PAY_WAY <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("PAY_WAY like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("PAY_WAY not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("PAY_WAY in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("PAY_WAY not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("PAY_WAY between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("PAY_WAY not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andOutPermIsNull() {
            addCriterion("OUT_PERM is null");
            return (Criteria) this;
        }

        public Criteria andOutPermIsNotNull() {
            addCriterion("OUT_PERM is not null");
            return (Criteria) this;
        }

        public Criteria andOutPermEqualTo(String value) {
            addCriterion("OUT_PERM =", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermNotEqualTo(String value) {
            addCriterion("OUT_PERM <>", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermGreaterThan(String value) {
            addCriterion("OUT_PERM >", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_PERM >=", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermLessThan(String value) {
            addCriterion("OUT_PERM <", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermLessThanOrEqualTo(String value) {
            addCriterion("OUT_PERM <=", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermLike(String value) {
            addCriterion("OUT_PERM like", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermNotLike(String value) {
            addCriterion("OUT_PERM not like", value, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermIn(List<String> values) {
            addCriterion("OUT_PERM in", values, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermNotIn(List<String> values) {
            addCriterion("OUT_PERM not in", values, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermBetween(String value1, String value2) {
            addCriterion("OUT_PERM between", value1, value2, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutPermNotBetween(String value1, String value2) {
            addCriterion("OUT_PERM not between", value1, value2, "outPerm");
            return (Criteria) this;
        }

        public Criteria andOutDayIsNull() {
            addCriterion("OUT_DAY is null");
            return (Criteria) this;
        }

        public Criteria andOutDayIsNotNull() {
            addCriterion("OUT_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andOutDayEqualTo(String value) {
            addCriterion("OUT_DAY =", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotEqualTo(String value) {
            addCriterion("OUT_DAY <>", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayGreaterThan(String value) {
            addCriterion("OUT_DAY >", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_DAY >=", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayLessThan(String value) {
            addCriterion("OUT_DAY <", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayLessThanOrEqualTo(String value) {
            addCriterion("OUT_DAY <=", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayLike(String value) {
            addCriterion("OUT_DAY like", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotLike(String value) {
            addCriterion("OUT_DAY not like", value, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayIn(List<String> values) {
            addCriterion("OUT_DAY in", values, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotIn(List<String> values) {
            addCriterion("OUT_DAY not in", values, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayBetween(String value1, String value2) {
            addCriterion("OUT_DAY between", value1, value2, "outDay");
            return (Criteria) this;
        }

        public Criteria andOutDayNotBetween(String value1, String value2) {
            addCriterion("OUT_DAY not between", value1, value2, "outDay");
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