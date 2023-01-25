package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchData {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch64?useSSL=false", "root", "Zbot2001@@");
			PreparedStatement ps = conn.prepareStatement("select * from employee");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("id=" + rs.getInt(1) + " name=" + rs.getString(2) +
						" salary=" + rs.getFloat(3) + " address=" + rs.getString(4) + 
						" mobileNo=" + rs.getString(5));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e){
					e.printStackTrace();
			}
			
		}
	}

}
