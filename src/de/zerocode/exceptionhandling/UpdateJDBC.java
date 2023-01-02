package de.zerocode.exceptionhandling;

import java.sql.*;

public class UpdateJDBC {

	public static <Increment> void main(String[] args) {
		String url = ("jdbc:mysql://localhost:3306/zerocode");
		String user = "admin";
		String password = "Vamsi@home143";
		Connection conn = null;
		Statement stmt = null;
		try {
			// getting connection
			conn = DriverManager.getConnection(url, user, password);
			// create statement
			stmt = conn.createStatement();
			//stmt.execute("CREATE TABLE Worker( name varchar(10),age int,phonenos varchar(10),mailid varchar(20),salary int) ");
			String sql = "INSERT INTO  " + " Worker( name,age,phoneno ,mailid,salary) "
					+ "Values('Vamsi', 21,'9618588682','vamsi12@gmail.com','45000'),"
					+ "('Nani','21','9390931377','nanithotha0@gmail.com','55000'),"
					+ "('prasad','22','7013376606','prasad23@gmail.com','47000')";

			stmt.execute(sql);
			System.out.println("Insert complete");

		} catch (Exception e) {
			System.out.println(e);
		} finally {

		}

	}

}
