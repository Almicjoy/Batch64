package exceptionHandling;

public class Test2 {

	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.p();
		System.out.println("normal flow...");
	}
	void m() {
		int i = 50/0;
	}
	void n() {
		m();
	}
	void p() {
		try {
			n();
		} catch(Exception e) {
			System.out.println("exception handled");
		}
	}

}
