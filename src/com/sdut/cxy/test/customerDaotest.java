package com.sdut.cxy.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.sdut.cxy.dao.CustomersDao;
import com.sdut.cxy.impl.CustomerDaoJdbcImpl;
import com.sdut.cxy.model.Customers;

class customerDaotest {
	private CustomersDao customerDao = new CustomerDaoJdbcImpl();
	@Test
	void testGetAll() {
		List<Customers> customers = customerDao.getAll();
		System.out.println(customers);
	}

	@Test
	void testSave() {
		Customers customers = new Customers();
		customers.setAddress("beijing");
		customers.setName("chenxiangyu");
		customers.setPhone("17864309139");
		customerDao.save(customers);
	}

	@Test
	void testGetInt() {
		Customers cuts = customerDao.get(1);
		System.out.println(cuts);
	}

	@Test
	void testDelete() {
		customerDao.delete(1);;
	}

	@Test
	void testGetCountWithName() {
		long count = customerDao.getCountWithName("chenxiangyu");
		System.out.println(count);
	}

}
