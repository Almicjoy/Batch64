package com.demo;

public class Department extends Employee{
	
	private int id;
	private String departmentName;
	private String loc;
	
	public Department(int id, String name, String address, int mobileNo, int id2, String departmentName, String loc) {
		super(id, name, address, mobileNo);
		id = id2;
		this.departmentName = departmentName;
		this.loc = loc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}
