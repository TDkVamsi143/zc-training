package de.zerocode.jdbc;

import java.sql.*;

public class InsertJDBC {

	public static void main(String[] args) throws SQLException {
		String url = ("jdbc:mysql://localhost:3306/zerocode");
		String user = "admin";
		String password = "Vamsi@home143";

		Connection conn = null;
		Statement stmt = null;

		try {
			// getting connection
			conn = DriverManager.getConnection(url, user, password);
			// create MySQL statement
			stmt = conn.createStatement();
			// Executing the SQL Query
			// getting connection
						//conn = DriverManager.getConnection(url, user, password);
						// create statement
						stmt = conn.createStatement();
						 //stmt.execute("CREATE TABLE Worker( name varchar(10),age int,phonenos varchar(10),mailid varchar(20),salary int) ");
						 //stmt.execute("ALTER TABLE Worker MODIFY mailid varchar(24)");
						// stmt.execute("ALTER TABLE Worker ADD Salary int"); 
						stmt.execute("DELETE FROM Worker Where name='vamsi','nani','prasad'");
						String sql = "INSERT INTO  " + " Worker( name,age,phoneno ,mailid,salary) "
								+ "Values('Vamsi', 21,'9618588682','vamsi12@gmail.com','45000'),"
								+ "('Nani','21','9390931377','nanithotha0@gmail.com','55000'),"
								+ "('prasad','22','7013376606','prasad23@gmail.com','47000')";

					stmt.execute(sql);
						System.out.println("Insert complete");
			String sql1 = "INSERT INTO  " + " employee( name ,rollno,age,phoneno ,mailid) "
					+ "Values('Vamsi','194318', 21,'9618588682','vamsitdk01@gmail.com')";
			stmt.execute(sql1);
			System.out.println("Insert complete");
		} catch (SQLException exp) {
			exp.printStackTrace();
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}

	}

}
