package org.vaadin.izin.samples.backend;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MysqlService {

	public Connection getConnection() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Connection");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/izin",
				"admintnXNfg3", "GWqiCH2pds73");

		return con;

	}

}
