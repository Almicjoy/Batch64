package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BusinessLogic {
	
	Connection conn = null;
	
	public void loadDriver() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void openConnection() throws SQLException{
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?useSSL=false", "root", "Zbot2001@@");
	}
	

	public void create(Employee e) {
		loadDriver();
		
		try {
			//2. Open connection
			openConnection();
			
			//3. issue the query
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getDept());
			ps.setFloat(4, e.getSalary());
			
			int x = ps.executeUpdate();
			
			//5. fetch the result
			if(x!=0) {
				System.out.println("data inserted");
			} else {
				System.out.println("issue with query");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch(Exception e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	public void read() {
		List<Employee> employees = new ArrayList<>();
		loadDriver();
		
		try {
			openConnection();
			
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select * from employee");
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String dept = rs.getString(3);
				float salary = rs.getFloat(4);
				employees.add(new Employee(id, name, dept, salary));
			}
			rs.close();
			System.out.println(employees);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void updateSalary(int id, float salary){
		loadDriver();
		 try {
			 openConnection();
			 
			 PreparedStatement ps = conn.prepareStatement("update employee set salary=? where id=?");
			 ps.setFloat(1, salary);
			 ps.setInt(2, id);
			 
			 int x = ps.executeUpdate();
			 if(x!=0) {
				 System.out.println("data updated");
			 } else {
				 System.out.println("issue with query");
			 }
			 ps.close();
			 
			 
		 } catch(SQLException e) {
			 e.printStackTrace();
		 }finally {
			try {
				conn.close();
			} catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void deleteRow(int id) {
		loadDriver();
		try {
			openConnection();
			PreparedStatement ps = conn.prepareStatement("delete from employee where id=?");
			ps.setInt(1, id);
			int x = ps.executeUpdate();
			if(x!=0) {
				System.out.println("row deleted");
			} else {
				System.out.println("issue with query");
			}
			ps.close();
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
