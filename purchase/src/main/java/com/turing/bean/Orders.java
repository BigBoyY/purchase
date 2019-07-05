package com.turing.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Long id;

    private String orderNum;

    private String orderSource;

    private String materialCode;

    private String materialName;

    private String amount;

    private String measureUnit;

    private BigDecimal unitPrice;

    private BigDecimal sumPrice;

    private Date startDate;

    private Date endDate;

    private String address;

    private Long authorId;

    private String author;

    private String phone;

    private String fax;

    private String email;

    private String remark;

    private Long stockId;

    private Long enquireId;

    private Long contAppId;

    private Long quoteId;

    private Long contId;

    private String status;
    
    private SysUsers authorObj;
    private Stock stockObj;
    private Enquire enquireObj;
    private ContractApply contractApplyObj;
    private Quote quoteObj;
    private Contract contractObj;
    
    
    

    public SysUsers getAuthorObj() {
		return authorObj;
	}

	public void setAuthorObj(SysUsers authorObj) {
		this.authorObj = authorObj;
	}

	public Stock getStockObj() {
		return stockObj;
	}

	public void setStockObj(Stock stockObj) {
		this.stockObj = stockObj;
	}

	public Enquire getEnquireObj() {
		return enquireObj;
	}

	public void setEnquireObj(Enquire enquireObj) {
		this.enquireObj = enquireObj;
	}

	public ContractApply getContractApplyObj() {
		return contractApplyObj;
	}

	public void setContractApplyObj(ContractApply contractApplyObj) {
		this.contractApplyObj = contractApplyObj;
	}

	public Quote getQuoteObj() {
		return quoteObj;
	}

	public void setQuoteObj(Quote quoteObj) {
		this.quoteObj = quoteObj;
	}

	public Contract getContractObj() {
		return contractObj;
	}

	public void setContractObj(Contract contractObj) {
		this.contractObj = contractObj;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public Long getEnquireId() {
        return enquireId;
    }

    public void setEnquireId(Long enquireId) {
        this.enquireId = enquireId;
    }

    public Long getContAppId() {
        return contAppId;
    }

    public void setContAppId(Long contAppId) {
        this.contAppId = contAppId;
    }

    public Long getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Long quoteId) {
        this.quoteId = quoteId;
    }

    public Long getContId() {
        return contId;
    }

    public void setContId(Long contId) {
        this.contId = contId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}