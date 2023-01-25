package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn = null;
		try {
			//2. Open connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch64?useSSL=false", "root", "Zbot2001@@");
			
			//3. issue the query
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?)");
			ps.setInt(1, 110);
			ps.setString(2, "Alessa");
			ps.setFloat(3, 4000.00f);
			ps.setString(4, "USA");
			ps.setString(5, "7654321");
			
			//4. execute the query
			int x = ps.executeUpdate();
			
			//5. fetch the result
			if(x!=0) {
				System.out.println("data inserted");
			} else {
				System.out.println("issue with query");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//6. close the connection
				conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
