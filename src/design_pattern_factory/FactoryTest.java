package design_pattern_factory;

public class FactoryTest {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		
		Shape c = sf.getShape("circle");
		c.draw();
		
		Shape r = sf.getShape("rectangle");
		r.draw();
		
		Shape s = sf.getShape("square");
		s.draw();
	}

}

//Concept: one class returns many class objects; one interface for three different classes
//not possible without overriding concepts
//
