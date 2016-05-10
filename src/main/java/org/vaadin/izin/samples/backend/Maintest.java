package org.vaadin.izin.samples.backend;

import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Maintest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MysqlService my=new MysqlService();
		Statement stm=(Statement) (my.getConnection()).createStatement();
		int executeUpdate = stm.executeUpdate("INSERT INTO `izin_tur`(`izin_tur`, `izin_sebep`) VALUES ('test','test')");
		System.out.println("Ekleme islemi basarıyla tamamlandı");

	}

}
