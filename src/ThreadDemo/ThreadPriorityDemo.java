package ThreadDemo;


public class ThreadPriorityDemo{
	public static void main(String args[]) {
		MyThread4 t = new MyThread4();
		MyThread5 t5 = new MyThread5();
		System.out.println(t.getPriority());
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		t5.start();
		for(int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}

class MyThread4 extends Thread{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread 4");
		}
	}
}

class MyThread5 extends Thread{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child Thread 5");
		}
	}
}
