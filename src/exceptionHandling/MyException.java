package exceptionHandling;

public class MyException {

	public static void main(String[] args) {
		try {
			Class.forName("Com.demo");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
//		
//		MyException m = new MyException();
//		
//		try {
//			m.test();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		m.test2();
		
		String str = null;
		if(str == null) {
			throw new NullPointerException("string has a null value");
		}
		System.out.println(str);
		
		
	}
	
	void test() throws ClassNotFoundException {
		Class.forName("Com.demo");
	}
	
	void test2() {
		try {
			Class.forName("Com.demo");
		} catch (ClassNotFoundException e) {
			
		}
	}
	
	

}

/* 1. if a method is throwing an exception, then must also
 *    handle the method call
 * 2. if a method uses the try catch block, then the call does not 
 * 	  need handling
 * 
 * throw keyword is used to raise an exception
 */
 


