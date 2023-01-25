package customExceptionPractice;

public class AgeRestrictionException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	AgeRestrictionException(String exc){
		super(exc);
	}
}
