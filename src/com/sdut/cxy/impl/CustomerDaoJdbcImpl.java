package com.sdut.cxy.impl;

import java.util.List;

import com.sdut.cxy.dao.CustomersDao;
import com.sdut.cxy.dao.Dao;
import com.sdut.cxy.model.Customers;

public class CustomerDaoJdbcImpl extends Dao<Customers> implements CustomersDao{

	@Override
	public List<Customers> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Customers customers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customers get(int id) {
		return get(null, null);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getCountWithName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
