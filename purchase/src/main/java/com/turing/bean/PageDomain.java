package com.turing.bean;

import java.util.Map;

public class PageDomain {
	public int page;//起始行
	public int rows;//size
	public Map<String, String> queryParams;//参数
	public String sortName;//按列排序
	public String sortOrder;//正序or升序
	public boolean isLimit = false;//默认不开启分页
	
}
