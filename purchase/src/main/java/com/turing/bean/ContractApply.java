package com.turing.bean;

import java.math.BigDecimal;
import java.util.Date;

public class ContractApply {
    private Long id;

    private String contAppNum;

    private String statQuote;

    private String topQuote;

    private String lowQuote;

    private BigDecimal allSumPrice;

    private String remark;

    private Long authorId;

    private String author;

    private Long planerId;

    private String planer;

    private String planAgree;

    private String planOpinion;

    private Date planDate;

    private Long leaderId;

    private String leader;

    private String leadAgree;

    private String leadOpinion;

    private Date leadDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContAppNum() {
        return contAppNum;
    }

    public void setContAppNum(String contAppNum) {
        this.contAppNum = contAppNum;
    }

    public String getStatQuote() {
        return statQuote;
    }

    public void setStatQuote(String statQuote) {
        this.statQuote = statQuote;
    }

    public String getTopQuote() {
        return topQuote;
    }

    public void setTopQuote(String topQuote) {
        this.topQuote = topQuote;
    }

    public String getLowQuote() {
        return lowQuote;
    }

    public void setLowQuote(String lowQuote) {
        this.lowQuote = lowQuote;
    }

    public BigDecimal getAllSumPrice() {
        return allSumPrice;
    }

    public void setAllSumPrice(BigDecimal allSumPrice) {
        this.allSumPrice = allSumPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Long getPlanerId() {
        return planerId;
    }

    public void setPlanerId(Long planerId) {
        this.planerId = planerId;
    }

    public String getPlaner() {
        return planer;
    }

    public void setPlaner(String planer) {
        this.planer = planer;
    }

    public String getPlanAgree() {
        return planAgree;
    }

    public void setPlanAgree(String planAgree) {
        this.planAgree = planAgree;
    }

    public String getPlanOpinion() {
        return planOpinion;
    }

    public void setPlanOpinion(String planOpinion) {
        this.planOpinion = planOpinion;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
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