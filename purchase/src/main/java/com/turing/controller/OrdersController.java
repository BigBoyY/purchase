package com.turing.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.turing.bean.Orders;
import com.turing.bean.PageDomain;
import com.turing.service.BigService;
import com.turing.util.ReflatUtil;

@Controller
public class OrdersController {
	@Autowired
	private BigService service;
	@Autowired
	private ReflatUtil reflatUtil;
	
	/**
	 * 查询未编采购计划C001-20
	 * @param pageDomain
	 * @return
	 */
	public List getOrdersC001(PageDomain pageDomain){
		Orders orders = new Orders();
		orders.setStatus("C001-20");
		Map<String, String> querysMap = pageDomain.queryParams;
		orders = (Orders) reflatUtil.reflatField(orders, querysMap);
		return service.findList(orders, pageDomain);
	}
	
	
	
	
	
	
	
}
