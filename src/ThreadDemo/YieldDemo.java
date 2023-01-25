package ThreadDemo;

public class YieldDemo {

	public static void main(String[] args) {
		MyThread7 t7 = new MyThread7();
		t7.start();
		for(int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			Thread.yield();
		}
	}

}

class MyThread7 extends Thread{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread ");
		}
		
	}
}
