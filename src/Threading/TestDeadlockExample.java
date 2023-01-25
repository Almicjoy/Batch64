package Threading;

public class TestDeadlockExample {
	public static void main (String[] args) {
		final String resource1 = "Allen";
		final String resource2 = "Black";
		
		//t1 tries to lock resource 1 then resource 2
		Thread t1 = new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println("Thread 1: locked by " + resource1);
					
					try {
						Thread.sleep(100);
					} catch(Exception e) {
						
					}
					synchronized (resource2) {
						System.out.println("Thread 1: locked by " + resource2);
					}
				}
			}
		};
		
		//t2 tries to lock resource 2 then resource 1
		Thread t2 = new Thread() {
			public void run() {
				synchronized(resource2) {
					System.out.println("Thread 2: locked by " + resource2);
					
					try {
						Thread.sleep(100);
					} catch(Exception e) {
						
					}
					synchronized (resource1) {
						System.out.println("Thread 1: locked by " + resource1);
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
