package de.zerocode.exceptionhandling;

import java.sql.*;

public class DbConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/zerocode", "admin",
					"Vamsi@home143");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
			connection.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
