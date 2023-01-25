package collectionDemo;

public class Test {
	public String toString() {
		return "Test";
	}
	
	@Override
	protected void finalize() {
		System.out.println("Finalize");
	}

}
