package com.turing.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuoteExample extends PageDomain {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuoteExample() {
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

        public Criteria andQuoteNumIsNull() {
            addCriterion("QUOTE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andQuoteNumIsNotNull() {
            addCriterion("QUOTE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteNumEqualTo(String value) {
            addCriterion("QUOTE_NUM =", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumNotEqualTo(String value) {
            addCriterion("QUOTE_NUM <>", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumGreaterThan(String value) {
            addCriterion("QUOTE_NUM >", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumGreaterThanOrEqualTo(String value) {
            addCriterion("QUOTE_NUM >=", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumLessThan(String value) {
            addCriterion("QUOTE_NUM <", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumLessThanOrEqualTo(String value) {
            addCriterion("QUOTE_NUM <=", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumLike(String value) {
            addCriterion("QUOTE_NUM like", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumNotLike(String value) {
            addCriterion("QUOTE_NUM not like", value, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumIn(List<String> values) {
            addCriterion("QUOTE_NUM in", values, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumNotIn(List<String> values) {
            addCriterion("QUOTE_NUM not in", values, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumBetween(String value1, String value2) {
            addCriterion("QUOTE_NUM between", value1, value2, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andQuoteNumNotBetween(String value1, String value2) {
            addCriterion("QUOTE_NUM not between", value1, value2, "quoteNum");
            return (Criteria) this;
        }

        public Criteria andEnquireIdIsNull() {
            addCriterion("ENQUIRE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEnquireIdIsNotNull() {
            addCriterion("ENQUIRE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEnquireIdEqualTo(Long value) {
            addCriterion("ENQUIRE_ID =", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdNotEqualTo(Long value) {
            addCriterion("ENQUIRE_ID <>", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdGreaterThan(Long value) {
            addCriterion("ENQUIRE_ID >", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ENQUIRE_ID >=", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdLessThan(Long value) {
            addCriterion("ENQUIRE_ID <", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdLessThanOrEqualTo(Long value) {
            addCriterion("ENQUIRE_ID <=", value, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdIn(List<Long> values) {
            addCriterion("ENQUIRE_ID in", values, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdNotIn(List<Long> values) {
            addCriterion("ENQUIRE_ID not in", values, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdBetween(Long value1, Long value2) {
            addCriterion("ENQUIRE_ID between", value1, value2, "enquireId");
            return (Criteria) this;
        }

        public Criteria andEnquireIdNotBetween(Long value1, Long value2) {
            addCriterion("ENQUIRE_ID not between", value1, value2, "enquireId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Long value) {
            addCriterion("SUPPLIER_ID =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Long value) {
            addCriterion("SUPPLIER_ID <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Long value) {
            addCriterion("SUPPLIER_ID >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUPPLIER_ID >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Long value) {
            addCriterion("SUPPLIER_ID <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("SUPPLIER_ID <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Long> values) {
            addCriterion("SUPPLIER_ID in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Long> values) {
            addCriterion("SUPPLIER_ID not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Long value1, Long value2) {
            addCriterion("SUPPLIER_ID between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("SUPPLIER_ID not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyIsNull() {
            addCriterion("QUO_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyIsNotNull() {
            addCriterion("QUO_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyEqualTo(String value) {
            addCriterion("QUO_COMPANY =", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyNotEqualTo(String value) {
            addCriterion("QUO_COMPANY <>", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyGreaterThan(String value) {
            addCriterion("QUO_COMPANY >", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("QUO_COMPANY >=", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyLessThan(String value) {
            addCriterion("QUO_COMPANY <", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyLessThanOrEqualTo(String value) {
            addCriterion("QUO_COMPANY <=", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyLike(String value) {
            addCriterion("QUO_COMPANY like", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyNotLike(String value) {
            addCriterion("QUO_COMPANY not like", value, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyIn(List<String> values) {
            addCriterion("QUO_COMPANY in", values, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyNotIn(List<String> values) {
            addCriterion("QUO_COMPANY not in", values, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyBetween(String value1, String value2) {
            addCriterion("QUO_COMPANY between", value1, value2, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoCompanyNotBetween(String value1, String value2) {
            addCriterion("QUO_COMPANY not between", value1, value2, "quoCompany");
            return (Criteria) this;
        }

        public Criteria andQuoAddressIsNull() {
            addCriterion("QUO_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andQuoAddressIsNotNull() {
            addCriterion("QUO_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andQuoAddressEqualTo(String value) {
            addCriterion("QUO_ADDRESS =", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressNotEqualTo(String value) {
            addCriterion("QUO_ADDRESS <>", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressGreaterThan(String value) {
            addCriterion("QUO_ADDRESS >", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressGreaterThanOrEqualTo(String value) {
            addCriterion("QUO_ADDRESS >=", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressLessThan(String value) {
            addCriterion("QUO_ADDRESS <", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressLessThanOrEqualTo(String value) {
            addCriterion("QUO_ADDRESS <=", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressLike(String value) {
            addCriterion("QUO_ADDRESS like", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressNotLike(String value) {
            addCriterion("QUO_ADDRESS not like", value, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressIn(List<String> values) {
            addCriterion("QUO_ADDRESS in", values, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressNotIn(List<String> values) {
            addCriterion("QUO_ADDRESS not in", values, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressBetween(String value1, String value2) {
            addCriterion("QUO_ADDRESS between", value1, value2, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoAddressNotBetween(String value1, String value2) {
            addCriterion("QUO_ADDRESS not between", value1, value2, "quoAddress");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanIsNull() {
            addCriterion("QUO_LINKMAN is null");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanIsNotNull() {
            addCriterion("QUO_LINKMAN is not null");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanEqualTo(String value) {
            addCriterion("QUO_LINKMAN =", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanNotEqualTo(String value) {
            addCriterion("QUO_LINKMAN <>", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanGreaterThan(String value) {
            addCriterion("QUO_LINKMAN >", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("QUO_LINKMAN >=", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanLessThan(String value) {
            addCriterion("QUO_LINKMAN <", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanLessThanOrEqualTo(String value) {
            addCriterion("QUO_LINKMAN <=", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanLike(String value) {
            addCriterion("QUO_LINKMAN like", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanNotLike(String value) {
            addCriterion("QUO_LINKMAN not like", value, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanIn(List<String> values) {
            addCriterion("QUO_LINKMAN in", values, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanNotIn(List<String> values) {
            addCriterion("QUO_LINKMAN not in", values, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanBetween(String value1, String value2) {
            addCriterion("QUO_LINKMAN between", value1, value2, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoLinkmanNotBetween(String value1, String value2) {
            addCriterion("QUO_LINKMAN not between", value1, value2, "quoLinkman");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneIsNull() {
            addCriterion("QUO_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneIsNotNull() {
            addCriterion("QUO_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneEqualTo(String value) {
            addCriterion("QUO_PHONE =", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneNotEqualTo(String value) {
            addCriterion("QUO_PHONE <>", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneGreaterThan(String value) {
            addCriterion("QUO_PHONE >", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("QUO_PHONE >=", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneLessThan(String value) {
            addCriterion("QUO_PHONE <", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneLessThanOrEqualTo(String value) {
            addCriterion("QUO_PHONE <=", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneLike(String value) {
            addCriterion("QUO_PHONE like", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneNotLike(String value) {
            addCriterion("QUO_PHONE not like", value, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneIn(List<String> values) {
            addCriterion("QUO_PHONE in", values, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneNotIn(List<String> values) {
            addCriterion("QUO_PHONE not in", values, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneBetween(String value1, String value2) {
            addCriterion("QUO_PHONE between", value1, value2, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoPhoneNotBetween(String value1, String value2) {
            addCriterion("QUO_PHONE not between", value1, value2, "quoPhone");
            return (Criteria) this;
        }

        public Criteria andQuoFaxIsNull() {
            addCriterion("QUO_FAX is null");
            return (Criteria) this;
        }

        public Criteria andQuoFaxIsNotNull() {
            addCriterion("QUO_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andQuoFaxEqualTo(String value) {
            addCriterion("QUO_FAX =", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxNotEqualTo(String value) {
            addCriterion("QUO_FAX <>", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxGreaterThan(String value) {
            addCriterion("QUO_FAX >", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxGreaterThanOrEqualTo(String value) {
            addCriterion("QUO_FAX >=", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxLessThan(String value) {
            addCriterion("QUO_FAX <", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxLessThanOrEqualTo(String value) {
            addCriterion("QUO_FAX <=", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxLike(String value) {
            addCriterion("QUO_FAX like", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxNotLike(String value) {
            addCriterion("QUO_FAX not like", value, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxIn(List<String> values) {
            addCriterion("QUO_FAX in", values, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxNotIn(List<String> values) {
            addCriterion("QUO_FAX not in", values, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxBetween(String value1, String value2) {
            addCriterion("QUO_FAX between", value1, value2, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoFaxNotBetween(String value1, String value2) {
            addCriterion("QUO_FAX not between", value1, value2, "quoFax");
            return (Criteria) this;
        }

        public Criteria andQuoEmailIsNull() {
            addCriterion("QUO_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andQuoEmailIsNotNull() {
            addCriterion("QUO_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andQuoEmailEqualTo(String value) {
            addCriterion("QUO_EMAIL =", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailNotEqualTo(String value) {
            addCriterion("QUO_EMAIL <>", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailGreaterThan(String value) {
            addCriterion("QUO_EMAIL >", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailGreaterThanOrEqualTo(String value) {
            addCriterion("QUO_EMAIL >=", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailLessThan(String value) {
            addCriterion("QUO_EMAIL <", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailLessThanOrEqualTo(String value) {
            addCriterion("QUO_EMAIL <=", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailLike(String value) {
            addCriterion("QUO_EMAIL like", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailNotLike(String value) {
            addCriterion("QUO_EMAIL not like", value, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailIn(List<String> values) {
            addCriterion("QUO_EMAIL in", values, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailNotIn(List<String> values) {
            addCriterion("QUO_EMAIL not in", values, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailBetween(String value1, String value2) {
            addCriterion("QUO_EMAIL between", value1, value2, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQuoEmailNotBetween(String value1, String value2) {
            addCriterion("QUO_EMAIL not between", value1, value2, "quoEmail");
            return (Criteria) this;
        }

        public Criteria andQueTitleIsNull() {
            addCriterion("QUE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andQueTitleIsNotNull() {
            addCriterion("QUE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andQueTitleEqualTo(String value) {
            addCriterion("QUE_TITLE =", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleNotEqualTo(String value) {
            addCriterion("QUE_TITLE <>", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleGreaterThan(String value) {
            addCriterion("QUE_TITLE >", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleGreaterThanOrEqualTo(String value) {
            addCriterion("QUE_TITLE >=", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleLessThan(String value) {
            addCriterion("QUE_TITLE <", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleLessThanOrEqualTo(String value) {
            addCriterion("QUE_TITLE <=", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleLike(String value) {
            addCriterion("QUE_TITLE like", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleNotLike(String value) {
            addCriterion("QUE_TITLE not like", value, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleIn(List<String> values) {
            addCriterion("QUE_TITLE in", values, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleNotIn(List<String> values) {
            addCriterion("QUE_TITLE not in", values, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleBetween(String value1, String value2) {
            addCriterion("QUE_TITLE between", value1, value2, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueTitleNotBetween(String value1, String value2) {
            addCriterion("QUE_TITLE not between", value1, value2, "queTitle");
            return (Criteria) this;
        }

        public Criteria andQueDateIsNull() {
            addCriterion("QUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andQueDateIsNotNull() {
            addCriterion("QUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andQueDateEqualTo(Date value) {
            addCriterion("QUE_DATE =", value, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateNotEqualTo(Date value) {
            addCriterion("QUE_DATE <>", value, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateGreaterThan(Date value) {
            addCriterion("QUE_DATE >", value, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("QUE_DATE >=", value, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateLessThan(Date value) {
            addCriterion("QUE_DATE <", value, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateLessThanOrEqualTo(Date value) {
            addCriterion("QUE_DATE <=", value, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateIn(List<Date> values) {
            addCriterion("QUE_DATE in", values, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateNotIn(List<Date> values) {
            addCriterion("QUE_DATE not in", values, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateBetween(Date value1, Date value2) {
            addCriterion("QUE_DATE between", value1, value2, "queDate");
            return (Criteria) this;
        }

        public Criteria andQueDateNotBetween(Date value1, Date value2) {
            addCriterion("QUE_DATE not between", value1, value2, "queDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andSumAmountIsNull() {
            addCriterion("SUM_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSumAmountIsNotNull() {
            addCriterion("SUM_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSumAmountEqualTo(BigDecimal value) {
            addCriterion("SUM_AMOUNT =", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotEqualTo(BigDecimal value) {
            addCriterion("SUM_AMOUNT <>", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountGreaterThan(BigDecimal value) {
            addCriterion("SUM_AMOUNT >", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_AMOUNT >=", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountLessThan(BigDecimal value) {
            addCriterion("SUM_AMOUNT <", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_AMOUNT <=", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountIn(List<BigDecimal> values) {
            addCriterion("SUM_AMOUNT in", values, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotIn(List<BigDecimal> values) {
            addCriterion("SUM_AMOUNT not in", values, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_AMOUNT between", value1, value2, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_AMOUNT not between", value1, value2, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andOverallPriceIsNull() {
            addCriterion("OVERALL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andOverallPriceIsNotNull() {
            addCriterion("OVERALL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andOverallPriceEqualTo(BigDecimal value) {
            addCriterion("OVERALL_PRICE =", value, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceNotEqualTo(BigDecimal value) {
            addCriterion("OVERALL_PRICE <>", value, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceGreaterThan(BigDecimal value) {
            addCriterion("OVERALL_PRICE >", value, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERALL_PRICE >=", value, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceLessThan(BigDecimal value) {
            addCriterion("OVERALL_PRICE <", value, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERALL_PRICE <=", value, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceIn(List<BigDecimal> values) {
            addCriterion("OVERALL_PRICE in", values, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceNotIn(List<BigDecimal> values) {
            addCriterion("OVERALL_PRICE not in", values, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERALL_PRICE between", value1, value2, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andOverallPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERALL_PRICE not between", value1, value2, "overallPrice");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkIsNull() {
            addCriterion("QUO_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkIsNotNull() {
            addCriterion("QUO_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkEqualTo(String value) {
            addCriterion("QUO_REMARK =", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkNotEqualTo(String value) {
            addCriterion("QUO_REMARK <>", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkGreaterThan(String value) {
            addCriterion("QUO_REMARK >", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("QUO_REMARK >=", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkLessThan(String value) {
            addCriterion("QUO_REMARK <", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkLessThanOrEqualTo(String value) {
            addCriterion("QUO_REMARK <=", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkLike(String value) {
            addCriterion("QUO_REMARK like", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkNotLike(String value) {
            addCriterion("QUO_REMARK not like", value, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkIn(List<String> values) {
            addCriterion("QUO_REMARK in", values, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkNotIn(List<String> values) {
            addCriterion("QUO_REMARK not in", values, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkBetween(String value1, String value2) {
            addCriterion("QUO_REMARK between", value1, value2, "quoRemark");
            return (Criteria) this;
        }

        public Criteria andQuoRemarkNotBetween(String value1, String value2) {
            addCriterion("QUO_REMARK not between", value1, value2, "quoRemark");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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