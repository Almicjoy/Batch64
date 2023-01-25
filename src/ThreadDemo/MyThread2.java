package ThreadDemo;

public class MyThread2 {

	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		Thread t = new Thread(m1);
		t.start();
	}

}

class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
}
