package com.turing.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Stock {
    private Long id;

    private String stockNum;

    private String stockName;

    private Long authorId;

    private String author;

    private String stockType;

    private BigDecimal budget;

    private Date startDate;

    private Date endDate;

    private Date submitDate;

    private String remark;

    private Long leaderId;

    private String leader;

    private String leadAgree;

    private String leadOpinion;

    private Date leadDate;
    
    private SysUsers authorObj;
    public SysUsers getAuthorObj() {
		return authorObj;
	}

	public void setAuthorObj(SysUsers authorObj) {
		this.authorObj = authorObj;
	}

	public SysUsers getLeaderObj() {
		return leaderObj;
	}

	public void setLeaderObj(SysUsers leaderObj) {
		this.leaderObj = leaderObj;
	}

	private SysUsers leaderObj;
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
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

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
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

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getLeadAgree() {
        return leadAgree;
    }

    public void setLeadAgree(String leadAgree) {
        this.leadAgree = leadAgree;
    }

    public String getLeadOpinion() {
        return leadOpinion;
    }

    public void setLeadOpinion(String leadOpinion) {
        this.leadOpinion = leadOpinion;
    }

    public Date getLeadDate() {
        return leadDate;
    }

    public void setLeadDate(Date leadDate) {
        this.leadDate = leadDate;
    }
}