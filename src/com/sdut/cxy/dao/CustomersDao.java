package com.sdut.cxy.dao;

import java.util.List;

import com.sdut.cxy.model.Customers;

public interface CustomersDao {
	public List<Customers> getAll();
	public void save(Customers customers);
	public Customers get(int id);
	public void delete(int id);
	public long getCountWithName(String name);
}
