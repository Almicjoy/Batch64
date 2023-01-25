package interfaceDemo;

public class Rectangle implements Figure, Figure1{

	@Override
	public void area() {
		System.out.println("Abstract method");
	}

}
