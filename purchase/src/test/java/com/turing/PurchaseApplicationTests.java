package com.turing;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.turing.bean.Orders;
import com.turing.bean.SysUsers;
import com.turing.mapper.OrdersMapper;
import com.turing.service.Service;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.turing.mapper")
public class PurchaseApplicationTests {
	@Autowired
	private OrdersMapper ordersmapper;
	
	@Autowired
	private Service service;

	@Test
	public void contextLoads() {
		Orders order = ordersmapper.selectByPrimaryKey((long) 1);
		SysUsers users = order.getAuthorObj();
		System.out.println(users.getLoginId());
	}
	@Test
	public void test() {
		Orders order = new Orders();
		order.setId((long)1);
		List list = service.findList(order, 1, 1);
		for (Object object : list) {
			Orders orders = (Orders) object;
			System.out.println(orders.getMaterialName());
		}
	}

}
