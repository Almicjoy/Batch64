package IIB;

public class IIBTest {

	public static void main(String[] args) {
		
		IIB1 i = new IIB1();
		System.out.println("================Separator================");
		IIB1 i1 = new IIB1();

	}

}

/*IIB - Instance Initialization Block
 * Syntax
 * {
 * 
 * }
 */

/* Order:
 * super()
 * IIB
 * body of constructor
 */

/* SIB - Static Block
 * static blocks execute only once
 * SIB executes before everything else
 * IIB executes for every instance of the object
 */
