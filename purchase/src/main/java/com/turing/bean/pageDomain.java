package com.turing.bean;

import java.util.Map;

public class pageDomain {
	private int page;
	private int rows;
	private Map<String, String> queryParams;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public pageDomain() {
		
	}
	public pageDomain(int page, int rows, Map<String, String> queryParams) {
		super();
		this.page = page;
		this.rows = rows;
		this.queryParams = queryParams;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public Map<String, String> getQueryParams() {
		return queryParams;
	}
	public void setQueryParams(Map<String, String> queryParams) {
		this.queryParams = queryParams;
	}
}
