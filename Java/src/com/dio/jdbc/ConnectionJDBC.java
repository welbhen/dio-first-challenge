package com.dio.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

	public static void main(String[] args) {
		String urlConnection = "jdbc:mysql://localhost/dio";
		
		try (Connection conn = DriverManager.getConnection(urlConnection, "root", "1322")) {
			System.out.println("Successful connection to DB!");
		} catch (SQLException e) {
			// e.printStackTrace();
			System.out.println("Error connecting to DB!!!");
		} 

	}

}
