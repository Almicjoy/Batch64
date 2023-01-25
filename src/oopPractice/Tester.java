package oopPractice;

public class Tester {

	public static void main(String[] args) {
		Machine m = new Radio();
//		Radio r1 = new Machine();
		Radio r = new Radio();
//		Machine m2 = new Machine(); cannot be instantiated
//		Electronic e = new Electronic(); cannot be instantiated
		
//		m.start();
		m.engineProcess();
		m.volumeController();
		
		r.start();
		r.engineProcess();
		r.volumeController();

	}

}
