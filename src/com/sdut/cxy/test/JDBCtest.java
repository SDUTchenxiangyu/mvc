package com.sdut.cxy.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.sdut.cxy.db.JDBCUtils;

class JDBCtest {

	@Test
	void testGetConnection() throws SQLException {
		Connection connection = JDBCUtils.getConnection();
		System.out.println(connection);
	}

}
