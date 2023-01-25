package exceptionHandling;

public class CustomExceptionTest {

	public static void main(String[] args) {
		int age = 17;
		if (age < 18) {
			throw new AgeNotLessThan18("Person is not meeting age requirements");
		} else {
			System.out.println("Person meets age requirements");
		}
		
		System.out.println("Inserting data to DB");
		System.out.println("Finish");
		
	}

}
