package com.turing.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.turing.service.Service;


@Component
public class Serivce implements Service {

	private final String mapperPack = "com.turing.mapper.";
	private final String beanPack = "com.turing.bean.";
	
	@Autowired
	private SqlSessionFactory factory;

	@Override
	public Object findOneById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Object> findList(Object obj, int page, int pageSize) {
		List list = new ArrayList();
		SqlSession session = factory.openSession();
		Class cls = obj.getClass();
		try {
			//获取对象简单类名
			String className = cls.getSimpleName();
			//生成mapper实例
			String mapperName = mapperPack+className+"Mapper";
			Class mapperClass = Class.forName(mapperName);
			
			Object mapperObj = session.getMapper(mapperClass);
			
			//生成example
			String exampleName = beanPack+className+"Example";
			Class exampleClass = Class.forName(exampleName);
			Object example = exampleClass.newInstance();
			
			//生成criteria对象
			Method criteriaMethod = exampleClass.getDeclaredMethod("createCriteria", null);
			Object criteria = criteriaMethod.invoke(example, null);
			
			//添加criteria查询条件
			criteria = addCriteria(obj, criteria);
		
			String methodName = "selectByExample";
			Method method = mapperClass.getDeclaredMethod(methodName, exampleClass);
			list = (List) method.invoke(mapperObj, example);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return list;
	}

	

	/**
	 * 添加criteria条件查询
	 * @param objCls 实体对象，携带数据
	 * @param cri criteria
	 * @return
	 */
	public Object addCriteria(Object obj,Object cri) {				
		try {
			Class objCls = obj.getClass();
			Class objCri = cri.getClass();
			Field [] fields = objCls.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				//获取属性值
				Object fieldValue = field.get(obj);
				if(fieldValue!=null) {
					String filedName = field.getName();
					String methodName = "";//将要执行的方法名
					//首字母大写
					String letter = filedName.substring(0,1).toUpperCase();
					//判断属性值类型
					Class Type = field.getType();
					String fieldType = Type.getSimpleName();
					//数字类型
					if(fieldType.equals("int")||fieldType.equals("Integer")||fieldType.equals("Long")) {
						methodName = "and"+letter+filedName.substring(1)+"EqualTo";
					}
					//字符串类型
					if(fieldType.equals("String")) {
						methodName = "and"+letter+filedName.substring(1)+"Like";
					}
					//其他类型。。
					//if(){}
					System.out.println("methodName="+methodName);
					System.out.println("fieldValue="+fieldValue);
					System.out.println("type="+fieldType);
					Method method = objCri.getDeclaredMethod(methodName, Type);
					method.invoke(cri, fieldValue);
					
				}
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		return cri;
	}

	@Override
	public int updateByExample(Object obj) {
		
		return 0;
	}

	@Override
	public int insert(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int primaryKey) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getCount(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int maxPage(Object obj, long count) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
