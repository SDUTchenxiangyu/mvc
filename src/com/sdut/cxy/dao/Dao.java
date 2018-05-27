package com.sdut.cxy.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

public class Dao<T> {
	private QueryRunner queryRunner = new QueryRunner();
	private Class<T> clazz;
	public Dao() {
		Type superClass = getClass().getGenericSuperclass();
		if(superClass instanceof ParameterizedType) {
			ParameterizedType parameterizedType = (ParameterizedType) superClass;
			Type[] typeArgs = parameterizedType.getActualTypeArguments();
			if(typeArgs != null && typeArgs.length > 0) {
				if(typeArgs[0] instanceof Class) {
					clazz = (Class<T>) typeArgs[0];
				}
			}
		}
	}
	public <E> E getForValue(String sql,Object ...objs) {
		return null;
	}
	public List<T> getForList(String sql,Object ...objs){
		return null;
	}
	public T get(String sql,Object ...objs) {
		System.out.println(clazz);
		return null;
	}
	public void update(String sql,Object ...objs) {
		
	}
}
