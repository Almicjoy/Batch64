package abstraction;

public class Rectangle extends Figure {
	
	Rectangle() {
		System.out.println("Rectangle");
	}

	@Override
	void area() {
		System.out.println("Rectangle Area");		
	}
	

}
