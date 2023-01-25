package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateData {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch64?useSSL=false", "root", "Zbot2001@@");
			PreparedStatement ps = conn.prepareStatement("update employee set salary=? where id=?");
			ps.setFloat(1, 3000.0f);
			ps.setInt(2, 115);
			
			int x = ps.executeUpdate();
			if(x!=0) {
				System.out.println("data updated");
			} else {
				System.out.println("issue with query");
			}
			ps.close();
			
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
