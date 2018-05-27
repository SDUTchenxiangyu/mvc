package com.sdut.cxy.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.sdut.cxy.db.JDBCUtils;

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
		Connection connection = null;
		try {
			connection = JDBCUtils.getConnection();
			return (E) queryRunner.query(connection, sql, new ScalarHandler(), objs);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.releaseConnection(connection);
		}
		return null;
	}
	public List<T> getForList(String sql,Object ...objs){
		Connection connection = null;
		try {
			connection = JDBCUtils.getConnection();
			return queryRunner.query(connection, sql, new BeanListHandler<>(clazz), objs);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.releaseConnection(connection);
		}
		return null;
	}
	public T get(String sql,Object ...objs) {
		Connection connection = null;
		try {
			connection = JDBCUtils.getConnection();
			return queryRunner.query(connection, sql, new BeanHandler<>(clazz), objs);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.releaseConnection(connection);
		}
		return null;
	}
	public void update(String sql,Object ...objs) {
		Connection connection = null;
		try {
			connection = JDBCUtils.getConnection();
			queryRunner.update(connection, sql, objs);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.releaseConnection(connection);
		}
	}
}
