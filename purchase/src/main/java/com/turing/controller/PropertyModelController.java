package com.turing.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.turing.bean.Material;
import com.turing.bean.Orders;
import com.turing.bean.PropertyModel;
import com.turing.service.impl.BigSerivceImpl;
@Controller
public class PropertyModelController {
	@Autowired
	private	BigSerivceImpl Serivce=new BigSerivceImpl();
	
	@RequestMapping("/Orders/edit/{id}")
	@ResponseBody
	public List<PropertyModel> Orders_edit_id(@PathVariable("id") int id) {
		Material mater=new Material();	
		mater=(Material) Serivce.findOneById(id, mater);	
		Orders order=new Orders();
		order.setMaterialObj(mater);
		List<PropertyModel> modelList=new ArrayList<PropertyModel>();
		PropertyModel model=new PropertyModel();
		model.setName("物资编码");
		model.setValue(mater.getMaterialNum());
		modelList.add(model);
		PropertyModel model2=new PropertyModel();
		model2.setName("物资名称");
		model2.setValue(mater.getMaterialName());
		modelList.add(model2);
		PropertyModel model3=new PropertyModel();
		model3.setName("数量");
		Map<String, Object> count=new HashMap<>();
		count.put("type", "numberbox");
		model3.setEditor(count);
		modelList.add(model3);
		PropertyModel model4=new PropertyModel();
		model4.setName("计量单位");
		model4.setValue(mater.getMaterialUnit());
		modelList.add(model4);
		PropertyModel model5=new PropertyModel();
		model5.setName("预单价(元)");
		Map<String, Object> money=new HashMap<>();
		money.put("type", "numberbox");
		model5.setEditor(money);
		modelList.add(model5);
		PropertyModel model6=new PropertyModel();
		model6.setName("交货期");
		Map<String, Object> time=new HashMap<>();
		time.put("type", "datebox");
		model6.setEditor(time);
		modelList.add(model6);
		PropertyModel model7=new PropertyModel();
		model7.setName("备注");
		Map<String, Object> remark=new HashMap<>();
		remark.put("type", "textarea");
		model7.setEditor(remark);
		modelList.add(model7);
		return modelList;
	}
}
