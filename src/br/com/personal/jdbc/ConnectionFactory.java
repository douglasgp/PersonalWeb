package br.com.personal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/db_personal", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
