package synchronizationExample;

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Wendy");
		MyThread t2 = new MyThread(d, "Roger");
		t1.start();
		t2.start();
	}

}

class MyThread extends Thread {
	Display d;
	String name;
	
	public MyThread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
	
}
