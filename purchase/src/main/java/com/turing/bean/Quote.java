package com.turing.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Quote {
    private Long id;

    private String quoteNum;

    private Long enquireId;

    private Long supplierId;

    private String quoCompany;

    private String quoAddress;

    private String quoLinkman;

    private String quoPhone;

    private String quoFax;

    private String quoEmail;

    private String queTitle;

    private Date queDate;

    private Date endDate;

    private BigDecimal sumAmount;

    private BigDecimal overallPrice;

    private String quoRemark;

    private String status;
    
    private Enquire enquireObj;
    
    private  Supplier supplierObj;
    
    

    public Enquire getEnquireObj() {
		return enquireObj;
	}

	public void setEnquireObj(Enquire enquireObj) {
		this.enquireObj = enquireObj;
	}

	public Supplier getSupplierObj() {
		return supplierObj;
	}

	public void setSupplierObj(Supplier supplierObj) {
		this.supplierObj = supplierObj;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuoteNum() {
        return quoteNum;
    }

    public void setQuoteNum(String quoteNum) {
        this.quoteNum = quoteNum;
    }

    public Long getEnquireId() {
        return enquireId;
    }

    public void setEnquireId(Long enquireId) {
        this.enquireId = enquireId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getQuoCompany() {
        return quoCompany;
    }

    public void setQuoCompany(String quoCompany) {
        this.quoCompany = quoCompany;
    }

    public String getQuoAddress() {
        return quoAddress;
    }

    public void setQuoAddress(String quoAddress) {
        this.quoAddress = quoAddress;
    }

    public String getQuoLinkman() {
        return quoLinkman;
    }

    public void setQuoLinkman(String quoLinkman) {
        this.quoLinkman = quoLinkman;
    }

    public String getQuoPhone() {
        return quoPhone;
    }

    public void setQuoPhone(String quoPhone) {
        this.quoPhone = quoPhone;
    }

    public String getQuoFax() {
        return quoFax;
    }

    public void setQuoFax(String quoFax) {
        this.quoFax = quoFax;
    }

    public String getQuoEmail() {
        return quoEmail;
    }

    public void setQuoEmail(String quoEmail) {
        this.quoEmail = quoEmail;
    }

    public String getQueTitle() {
        return queTitle;
    }

    public void setQueTitle(String queTitle) {
        this.queTitle = queTitle;
    }

    public Date getQueDate() {
        return queDate;
    }

    public void setQueDate(Date queDate) {
        this.queDate = queDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(BigDecimal sumAmount) {
        this.sumAmount = sumAmount;
    }

    public BigDecimal getOverallPrice() {
        return overallPrice;
    }

    public void setOverallPrice(BigDecimal overallPrice) {
        this.overallPrice = overallPrice;
    }

    public String getQuoRemark() {
        return quoRemark;
    }

    public void setQuoRemark(String quoRemark) {
        this.quoRemark = quoRemark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}