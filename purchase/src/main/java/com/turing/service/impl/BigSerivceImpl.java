package com.turing.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.turing.mapper.OrdersMapper;
import com.turing.service.BigService;


@org.springframework.stereotype.Service
public class BigSerivceImpl implements BigService {

	private final String mapperPack = "com.turing.mapper.";
	private final String beanPack = "com.turing.bean.";
	
	@Autowired
	private SqlSessionFactory factory;

	@Override
	public Object findOneById(long id,Object obj) {		
		SqlSession session = factory.openSession();
		String methodName = "selectByPrimaryKey";		
		try {
			Class objCls = obj.getClass();
			String className = objCls.getSimpleName();
			String mapperName = mapperPack+className+"Mapper";
			Class mapperClass = Class.forName(mapperName);
			Object mapper = session.getMapper(mapperClass);
			Method method = mapperClass.getDeclaredMethod(methodName, Long.class);
			obj = method.invoke(mapper, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return obj;
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

	@Override
	public int updateByExample(Object obj,Object example) {
		SqlSession session = factory.openSession();
		int rows = 0;
		String methodName = "updateByExample";
		Class objCls = obj.getClass();
		//获取简单类名
		String className = objCls.getSimpleName();
		//生成mapper接口实例
		String mapperName = mapperPack+className+"Mapper";
		try {
			Class mapperClass= Class.forName(mapperName);
			Object mapper = session.getMapper(mapperClass);					
			//生成将要执行的方法对象
			Method method = mapperClass.getDeclaredMethod(methodName,objCls,example.getClass());
			//执行
			rows = (int) method.invoke(mapper,obj, example);			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}		
		return rows;
	}

	@Override
	public int updateByExampleSelective(Object obj,Object example) {
		SqlSession session = factory.openSession();
		int rows = 0;
		String methodName = "updateByExampleSelective";
		Class objCls = obj.getClass();
		//获取简单类名
		String className = objCls.getSimpleName();
		//生成mapper接口实例
		String mapperName = mapperPack+className+"Mapper";
		try {
			Class mapperClass= Class.forName(mapperName);
			Object mapper = session.getMapper(mapperClass);
			//生成将要执行的方法对象
			Method method = mapperClass.getDeclaredMethod(methodName,objCls,example.getClass());
			//执行
			rows = (int) method.invoke(mapper,obj, example);			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}		
		return rows;
	}

	@Override
	public int updateByPrimaryKey(Object obj) {
		int rows = 0;
		SqlSession session = factory.openSession();
		String methodName = "updateByPrimaryKey";		
		try {
			Class objCls = obj.getClass();
			String className = objCls.getSimpleName();
			String mapperName = mapperPack+className+"Mapper";
			Class mapperClass = Class.forName(mapperName);
			Object mapper = session.getMapper(mapperClass);
			Method method = mapperClass.getDeclaredMethod(methodName, obj.getClass());
			rows= (int) method.invoke(mapper, obj);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return rows;
	}

	@Override
	public int updateByPrimaryKeySelective(Object obj) {
		int rows = 0;
		SqlSession session = factory.openSession();
		String methodName = "updateByPrimaryKeySelective";		
		try {
			Class objCls = obj.getClass();
			String className = objCls.getSimpleName();
			String mapperName = mapperPack+className+"Mapper";
			Class mapperClass = Class.forName(mapperName);
			Object mapper = session.getMapper(mapperClass);
			Method method = mapperClass.getDeclaredMethod(methodName, obj.getClass());
			rows= (int) method.invoke(mapper, obj);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return rows;
	}

	@Override
	public int insert(Object obj) {
		int rows= 0;
		SqlSession session = factory.openSession();
		String methodName = "insert";
		try {
			Class cls = obj.getClass();
			String className = cls.getSimpleName();
			String mapperName = mapperPack+className+"Mapper";
			Class mapperClass = Class.forName(mapperName);
			Object mapper = session.getMapper(mapperClass);
			Method method = mapperClass.getDeclaredMethod(methodName, cls);
			rows = (int) method.invoke(mapper, obj);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return rows;
	}

	@Override
	public int insertSelective(Object obj) {
		int rows= 0;
		SqlSession session = factory.openSession();
		String methodName = "insertSelective";
		try {
			Class cls = obj.getClass();
			String className = cls.getSimpleName();
			String mapperName = mapperPack+className+"Mapper";
			Class mapperClass = Class.forName(mapperName);
			Object mapper = session.getMapper(mapperClass);
			Method method = mapperClass.getDeclaredMethod(methodName, cls);
			rows = (int) method.invoke(mapper, obj);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return rows;
	}

	@Override
	public int deleteByPrimaryKey(long primaryKey,Object obj) {
		int rows= 0;
		SqlSession session = factory.openSession();
		String methodName = "deleteByPrimaryKey";
		try {
			Class cls = obj.getClass();
			String className = cls.getSimpleName();
			String mapperName = mapperPack+className+"Mapper";
			Class mapperClass = Class.forName(mapperName);
			Object mapper = session.getMapper(mapperClass);
			Method method = mapperClass.getDeclaredMethod(methodName, Long.class);
			rows = (int) method.invoke(mapper, primaryKey);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return rows;
	}

	@Override
	public int deleteByExample(Object obj) {
		int rows = 0;
		SqlSession session =  factory.openSession();
		String methodName = "deleteByExample";
		try {
			Class cls = obj.getClass();
			String className = cls.getSimpleName();
			String mapperName = mapperPack+className+"Mapper";
			Class mapperClass = Class.forName(mapperName);
			Object mapper = session.getMapper(mapperClass);
			String exmapleName = beanPack+className+"Example";
			Class exampleClass = Class.forName(exmapleName);
			Object example =exampleClass.newInstance();
			Method criMethod = exampleClass.getDeclaredMethod("createCriteria", null);
			Object cri = criMethod.invoke(example, null);
			cri = addCriteria(obj, cri);
			
			Method method = mapperClass.getDeclaredMethod(methodName, exampleClass);
			rows = (int) method.invoke(mapper, example);
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return rows;
	}

	@Override
	public long countByExample(Object obj) {
		long count = 0;
		SqlSession session =  factory.openSession();
		String methodName = "countByExample";
		try {
			Class cls = obj.getClass();
			String className = cls.getSimpleName();
			String mapperName = mapperPack+className+"Mapper";
			Class mapperClass = Class.forName(mapperName);
			Object mapper = session.getMapper(mapperClass);
			String exmapleName = beanPack+className+"Example";
			Class exampleClass = Class.forName(exmapleName);
			Object example =exampleClass.newInstance();
			Method criMethod = exampleClass.getDeclaredMethod("createCriteria", null);
			Object cri = criMethod.invoke(example, null);
			cri = addCriteria(obj, cri);
			
			Method method = mapperClass.getDeclaredMethod(methodName, exampleClass);
			count = (long) method.invoke(mapper, example);
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return count;
	}

	@Override
	public int maxPage(Object obj) {
		int count = (int) countByExample(obj);
		
		return count;
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
	

}
