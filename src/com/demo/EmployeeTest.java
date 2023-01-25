package com.demo;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee(101, "Alessa", "Valdosta, GA", 12345678);
		Employee e1 = new Employee(102, "Alvaro", "Belize City, Belize", 9876543);
		
		Address a = new Address(123, "Valdosta", "US", "GA", "1106 Slater Street");
		Department d = new Department(101, "Alessa", "Valdosta, GA", 12345678, 123, "Dep 1", "Place");
		
		System.out.println("ID: " + d.getId() + "\nName: "+ d.getName() + "\nAddress: "+ d.getAddress() + "\nMobile No: "+ d.getMobileNo() + "\n");
		System.out.println("ID: " + e1.getId() + "\nName: "+ e1.getName() + "\nAddress: "+ e1.getAddress() + "\nMobile No: "+ e1.getMobileNo() + "\n");
		
		e.attendOffice();
		e.logOff();
		test();

	}
	
	static {
		System.out.println("SIB");
	}
	
	static void test() {
		System.out.println("Static test method");
	}

}
