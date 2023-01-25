package ThreadDemo;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException{
		MyThread9 t9 = new MyThread9();
		t9.start();
		t9.join();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Main Thread");	
		}
	}

}

class MyThread9 extends Thread{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread ");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
		}
		
	}
}
