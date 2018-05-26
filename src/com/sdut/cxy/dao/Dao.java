package com.sdut.cxy.dao;

import java.util.List;

public class Dao<T> {
	private Class<T> clazz;
	public <E> E getForValue(String sql,Object ...objs) {
		return null;
	}
	public List<T> getForList(String sql,Object ...objs){
		return null;
	}
	public T get(String sql,Object ...objs) {
		return null;
	}
	public void update(String sql,Object ...objs) {
		
	}
}
