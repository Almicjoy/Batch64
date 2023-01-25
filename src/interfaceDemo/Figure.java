package interfaceDemo;

public interface Figure {
	
	void area();
	
	default void test() {
		System.out.println("Concrete method");
	}

}
