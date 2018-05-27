package com.sdut.cxy.impl;

import java.util.List;

import com.sdut.cxy.dao.CustomersDao;
import com.sdut.cxy.dao.Dao;
import com.sdut.cxy.model.Customers;

public class CustomerDaoJdbcImpl extends Dao<Customers> implements CustomersDao{

	@Override
	public List<Customers> getAll() {
		String sql = "SELECT id,name,address,phone FROM customers";
		return getForList(sql);
	}

	@Override
	public void save(Customers customers) {
		String sql = "INSERT INTO customers(name,address,phone) VALUES(?,?,?)";
		update(sql, customers.getName(),customers.getAddress(),customers.getPhone());
	}

	@Override
	public Customers get(int id) {
		String sql = "SELECT id,name,address,phone FROM customers WHERE id = ?";
		return get(sql,id);
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM customers WHERE id = ?";
		update(sql,id);
	}

	@Override
	public long getCountWithName(String name) {
		String sql = "SELECT count(id) FROM customers WHERE name = ?";
		return getForValue(sql, name);
	}
	
}
