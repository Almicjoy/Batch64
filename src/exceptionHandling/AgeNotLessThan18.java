package exceptionHandling;

public class AgeNotLessThan18 extends RuntimeException{
	AgeNotLessThan18(String str) {
		super(str);
	}
}
