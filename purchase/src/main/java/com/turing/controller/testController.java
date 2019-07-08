package com.turing.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.turing.bean.Material;
import com.turing.bean.Orders;
import com.turing.bean.PropertyModel;
import com.turing.bean.pageDomain;
import com.turing.service.impl.Serivce;
 
@Controller
public class testController {
	@Autowired
	private	Serivce service=new Serivce();
	@RequestMapping("/")
	public String test() {
		return "schemer/need_plan_manage/Requirements_plan_overview";
	}
	@RequestMapping("/find")
	@ResponseBody
	public List<Object> findAllMaterial(int page,int rows){
		Material mater=new Material();	
		return service.findList(mater, page, rows);
	}
	@RequestMapping("/next")
	@ResponseBody
	public  ModelAndView findNext(int []  ids) {
		Material mater=new Material();	
		ModelAndView model=new ModelAndView();
		model.setViewName("schemer/need_plan_manage/demand_plan_entry");
		model.addObject("list",service.findList(mater, 1, 4));
		return model;
	}
	@RequestMapping("/findone")
	@ResponseBody
	public List<PropertyModel> findone() {
		System.out.println("没进来");
		Material mater=new Material();	
		List<Object> list=service.findList(mater, 1, 4);
		mater= (Material) list.get(0);
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
	@RequestMapping("/findone/{id}")
	@ResponseBody
	public List<PropertyModel> findone(@PathVariable("id") int id) {
		System.out.println("进来了");
		Material mater=new Material();	
		List<Object> list=service.findList(mater, 1, 4);
		for (int i = 0; i < list.size(); i++) {
			mater= (Material) list.get(i);
			if(mater.getId()==id) {
				break;
			}
		}		
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
	@PostMapping("/addCahce")
	@ResponseBody
	public String addCahce(@RequestBody Orders order) {
		System.out.println(order.getMaterialName());
		return "yes";
		
	}
	@RequestMapping("/submit")
	public String submit() {
		System.out.println("提交集合");
		return "schemer/need_plan_manage/Input_demand_plan"; 
	}
	@RequestMapping("/clear")
	public String clear() {
		System.out.println("清空集合");
		return "schemer/need_plan_manage/demand_plan_entry"; 
	}
	
	@RequestMapping("/test")
	@ResponseBody
	public List<Object> test(pageDomain pageDomain) {
		System.out.println(pageDomain.getRows()+" "+pageDomain.getPage());
		if(pageDomain.getQueryParams()!=null) {
		System.out.println(pageDomain.getQueryParams().get("materialNum"));
		System.out.println(pageDomain.getQueryParams().get("materialName"));
		System.out.println(pageDomain.getQueryParams().get("contId"));
		}
		Material mater=new Material();	
		return service.findList(mater, 1, 4);
		
	}
}
