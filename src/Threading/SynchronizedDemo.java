package Threading;

public class SynchronizedDemo {

	public static void main(String[] args) {
		
		//Anonymous inner class
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i + " Child Thread");
				}
			}
		};
		
		t.start();
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i + " Parent Thread");
		}
		
	}

}

//class Test {
//	synchronized void demo() {
//		
//	}
//	
//	void demo2() {
//		synchronized() {
//			
//		}
//	}
//}
