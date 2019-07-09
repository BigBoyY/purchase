package com.turing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.turing.bean.Material;
import com.turing.bean.pageDomain;
import com.turing.service.impl.BigSerivceImpl;

@Controller
public class MaterialController {
	@Autowired
	private	BigSerivceImpl Serivce=new BigSerivceImpl();
	/*@GetMapping("/Material/All")
	@ResponseBody
	public List<Material> getAllMaterial(pageDomain pagedomain) {
		Material mater=new Material();	
		return Serivce.findList(mater, pagedomain);
	}*/
	
	
}
