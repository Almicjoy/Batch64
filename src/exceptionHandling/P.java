package exceptionHandling;

public class P {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(test());
		System.out.println(2);
		
	}
	static int test() {
		try {
			return 10;
		}catch(NumberFormatException ex) {
			return 20;
		}finally {
			return 30;
		}
		
		//cannot write return statement after a finally block
	}

}
