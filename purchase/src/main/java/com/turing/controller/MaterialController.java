package com.turing.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.turing.bean.Material;

@Controller
public class MaterialController {

	@GetMapping("/getAllMaterial")
	@ResponseBody
	public List<Material> getAllMaterial() {
		
		return null;
	}
}
