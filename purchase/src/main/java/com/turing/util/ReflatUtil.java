package com.turing.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReflatUtil {
	
	/**
	 * 反射属性，自动注入值
	 * @return 实体对象
	 */
	public Object reflatField(Object obj,Map<String, String> querysMap ) {
		try {
			Class cls = obj.getClass();
			Field [] fields = cls.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				for (String key : querysMap.keySet()) {
					//找到相匹配属性
					if(field.getName().equals(key)) {
						field.set(obj, querysMap.get(key));
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
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
