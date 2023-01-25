package IIB;

public class IIB1 extends IIBDemo{
	
	static {
		System.out.println("IIB1 Static Block");
	}
	
	IIB1(){
		System.out.println("IIB1 Constructor");
	}
	{
		System.out.println("IIB1 IIB");
	}
}
