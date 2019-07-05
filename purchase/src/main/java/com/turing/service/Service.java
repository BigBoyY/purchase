package com.turing.service;
/**
 *统一业务层接口
 * @author admin
 *
 */

import java.util.List;

public interface Service {
	
	
	Object findOneById(Integer id);//查询一条数据
	
	List<Object> findList(Object obj,int page,int pageSize);//查询多条数据(分页)
	
	int updateByExample(Object obj);//更改数据
	
	int insert(Object obj);//添加数据
	
	int delete(int primaryKey);//删除数据
	
	long getCount(Object obj);//获取记录数
	
	int maxPage(Object obj,long count);//获取最大页数
}
