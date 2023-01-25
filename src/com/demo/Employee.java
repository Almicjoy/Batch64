package com.demo;

public class Employee {
	
	private int id;
	private String name;
	private String address;
	private int mobileNo;
	
	public Employee(int id, String name, String address, int mobileNo) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	
	//class - logical, blueprint of a concept, collection of attributes and methods
	//object - instance of the class
	
	
	//this - a reference which will hold current object address
	
	/*Object - internally calls constructor and creates a block in memory
	 * and will also initialize attributes
	 * Classes without a defined constructor have a default constructor
	 */
	
	/*Constructor Properties
	 * -has the same name of the class
	 * -will not have any return type; is returning internally by itself
	 * -will be implicitly called by the object
	 * -if you define any constructor in a class, then default constructor will not be there
	 */
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	
	
	
	void attendOffice() {
		System.out.println("Employee attendOffice");
	}
	
	void logOff() {
		System.out.println("Employee logOff");
	}
	
	

}
