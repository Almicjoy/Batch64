package exceptionHandling;

public class F {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
			
		}catch(NumberFormatException ex) {
			System.out.println(4);
			System.out.println(ex.getMessage());
			System.out.println(5);
		} finally {
			System.out.println(6);
			
		}
		System.out.println(5);
	}

}
