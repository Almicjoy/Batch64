package collectionsPractice;

public class Employee {
	public Employee(int id, String name, Integer age, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("Employee [id=" + id + ", name=" + name + ", age=" + age + ", dept=" + dept + ", salary= %.2f]\n", salary);
	}

	private int id;
	private String name;
	private Integer age;
	private String dept;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
