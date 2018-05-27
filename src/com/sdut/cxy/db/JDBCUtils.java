package com.sdut.cxy.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {
	private static DataSource dataSource = null;
	static {
		dataSource = new ComboPooledDataSource("mvcapp");
	}
	public static void releaseConnection(Connection connection) {
		try {
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
}
