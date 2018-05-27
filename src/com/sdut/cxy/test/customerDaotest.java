package com.sdut.cxy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sdut.cxy.dao.CustomersDao;
import com.sdut.cxy.impl.CustomerDaoJdbcImpl;
import com.sdut.cxy.model.Customers;

class customerDaotest {
	private CustomersDao customerDao = new CustomerDaoJdbcImpl();
	@Test
	void testGetAll() {
		fail("Not yet implemented");
	}

	@Test
	void testSave() {
		fail("Not yet implemented");
	}

	@Test
	void testGetInt() {
		Customers cuts = customerDao.get(1);
		System.out.println(cuts);
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCountWithName() {
		fail("Not yet implemented");
	}

}
