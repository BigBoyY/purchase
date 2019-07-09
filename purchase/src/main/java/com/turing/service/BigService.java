package com.turing.service;
/**
 *统一业务层接口
 * @author admin
 *
 */
import java.util.List;

import com.turing.bean.PageDomain;

public interface BigService {
	
	
	Object findOneById(long id,Object obj);//根据主键查询数据
	
	List<Object> findList(Object obj,PageDomain pageDomain);//查询多条数据(分页)
	
	int updateByExample(Object obj,Object example);//根据列数据条件更改数据 全盘修改
	
	int updateByExampleSelective(Object obj,Object example);//根据列数据条件更改数据 选择性修改
	
	int updateByPrimaryKey(Object obj);//根据主键条件更改数据 全盘修改
	
	int updateByPrimaryKeySelective(Object obj);//根据主键条件更改数据 选择性修改
	
	int insert(Object obj);//添加数据 全盘插入
	
	int insertSelective(Object obj);//添加数据 选择性插入
	
	int deleteByPrimaryKey(long primaryKey,Object obj);//删除数据 根据主键删除
	
	int deleteByExample(Object obj);//删除数据 根据列数据条件删除
	
	long countByExample(Object obj);//获取记录数
	
	int maxPage(Object obj,int pageSize);//获取最大页数
}
