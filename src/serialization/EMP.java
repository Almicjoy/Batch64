package serialization;

import java.io.Serializable;

public class EMP implements Serializable{
	int a;
	String b;
	
	public EMP(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public EMP() {
		super();
	}
	
}
