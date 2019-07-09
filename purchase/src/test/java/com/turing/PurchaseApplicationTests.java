package com.turing;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.turing.bean.Orders;
import com.turing.bean.OrdersExample;
import com.turing.bean.PageDomain;
import com.turing.bean.SysUsers;
import com.turing.mapper.OrdersMapper;
import com.turing.service.BigService;
import com.turing.util.ReflatUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.turing.mapper")
public class PurchaseApplicationTests {
	@Autowired
	private OrdersMapper ordersmapper;
	
	@Autowired
	private ReflatUtil reflatUtil;
	
	@Autowired
	private BigService service;

	@Test
	public void contextLoads() {
		Orders order = ordersmapper.selectByPrimaryKey((long) 1);
		SysUsers users = order.getAuthorObj();
		System.out.println(users.getLoginId());
	}
	@Test
	public void test() {
		Orders order = new Orders();
		PageDomain pageDomain = new PageDomain();
		pageDomain.isLimit = true;
		pageDomain.page = 1;
		pageDomain.rows = 2;
		pageDomain.sortName = "id";
		pageDomain.sortOrder="desc";
		Map<String, String> map = new HashMap<>();
		map.put("materialCode", "888");
		pageDomain.queryParams = map;
		order = (Orders) reflatUtil.reflatField(order, map);
		order.setStatus("C001-20");
		List list = service.findList(order, pageDomain);
		for (Object object : list) {
			Orders orders = (Orders) object;
			System.out.println(orders.getMaterialName());
		}
		/*try {
			Orders orders = (Orders) service.findOneById(1, new Orders());
			System.out.println(orders.getMaterialName());
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}
	@Test
	public void update() {
		Orders order = new Orders();
		order.setMaterialName("冰棍");
		order.setMaterialCode("123");
		OrdersExample example = new OrdersExample();
		example.createCriteria().andMaterialNameEqualTo("冰激凌");
		System.out.println(service.updateByExampleSelective(order,example));
	}
	
	@Test
	public void updateByPrimaryKeySelective() {
		Orders order = new Orders();
		order.setId((long)1);
		order.setMaterialName("棒棒糖");
		order.setMaterialCode("456");
		System.out.println(service.updateByPrimaryKeySelective(order));
	}
	@Test
	public void insert() {
		Orders order = new Orders();
		order.setMaterialName("棉花水");
		order.setMaterialCode("777");
		service.insert(order);
	}
	@Test
	public void delete() {
		//System.out.println(service.deleteByPrimaryKey(1, new Orders()));
		Orders order = new Orders();
		order.setMaterialName("棉花水");
		order.setMaterialCode("999");
		service.deleteByExample(order);
	}
	@Test
	public void getCount() {
		Orders order = new Orders();
		order.setMaterialName("棉花");
		System.out.println(service.countByExample(order));
	}

}
