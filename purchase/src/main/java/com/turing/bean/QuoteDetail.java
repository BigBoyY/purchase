package com.turing.bean;

import java.math.BigDecimal;

public class QuoteDetail {
    private Long id;

    private Long quoteId;

    private Long orderId;

    private String materialCode;

    private String materialName;

    private String measureUnit;

    private String standard;

    private String factory;

    private String prodYear;

    private String wrap;

    private String amount;

    private BigDecimal unitPrice;

    private BigDecimal sumPrice;

    private BigDecimal mixPrice;

    private BigDecimal otherPrice;

    private BigDecimal totalPrice;

    private String startDate;

    private String endDate;
    
    private Quote quoteObj;
    
    private Orders ordersObj;
    
    

    public Quote getQuoteObj() {
		return quoteObj;
	}

	public void setQuoteObj(Quote quoteObj) {
		this.quoteObj = quoteObj;
	}

	public Orders getOrdersObj() {
		return ordersObj;
	}

	public void setOrdersObj(Orders ordersObj) {
		this.ordersObj = ordersObj;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Long quoteId) {
        this.quoteId = quoteId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getProdYear() {
        return prodYear;
    }

    public void setProdYear(String prodYear) {
        this.prodYear = prodYear;
    }

    public String getWrap() {
        return wrap;
    }

    public void setWrap(String wrap) {
        this.wrap = wrap;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(BigDecimal sumPrice) {
        this.sumPrice = sumPrice;
    }

    public BigDecimal getMixPrice() {
        return mixPrice;
    }

    public void setMixPrice(BigDecimal mixPrice) {
        this.mixPrice = mixPrice;
    }

    public BigDecimal getOtherPrice() {
        return otherPrice;
    }

    public void setOtherPrice(BigDecimal otherPrice) {
        this.otherPrice = otherPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}