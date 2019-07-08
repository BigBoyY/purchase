package com.turing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.turing.service.BigService;

@Controller
public class OrdersController {
	@Autowired
	private BigService service;
	
	
}
