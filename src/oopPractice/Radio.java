package oopPractice;

public class Radio extends Machine implements Electronics{

	@Override
	public void start() {
		System.out.println("Start");
		
	}

	@Override
	void volumeController() {
		System.out.println("Volume changed");
		
	}
	
}
