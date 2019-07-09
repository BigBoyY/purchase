package com.turing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.turing.service.BigService;
import com.turing.service.impl.BigSerivceImpl;

@Controller
public class OrdersController {
	@Autowired
	private	BigSerivceImpl Serivce=new BigSerivceImpl();
	
	@RequestMapping("/submit")
	public String submit() {
		System.out.println("提交集合");
		return "schemer/need_plan_manage/Input_demand_plan"; 
	}
}
