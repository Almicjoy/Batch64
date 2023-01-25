package ThreadDemo;

public class MyThreadExample {

	public static void main(String[] args) {
		Test t = new Test();
		t.start();
		for(int i = 6; i <= 10; i++) {
			System.out.println(i);
		}
	}

}

class Test extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		
	}
	
//	void calculate() {
//		for(int i = 0; i <= 5; i++) {
//			try {
//				Thread.sleep(10000);
//			} catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//			System.out.println(i);
//		}
//	}
}

/*Thread -- light weight process
 * -> smallest part of the process which can't be further divisible
 */

