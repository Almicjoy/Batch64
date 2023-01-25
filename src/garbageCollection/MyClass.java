package garbageCollection;

class A {
	
}

public class MyClass {
	
	public static void main (String[] args) throws Exception{
		
		A a1 = new A();
		a1 = null;
		//Way 1:
		//a1 stores null value and object it was previously
		//pointing to goes for garbage collection
		
		A a2 = new A();
		A a3 = new A();
		a2 = a3;
		
		//Way 2:
		//a2 references the same object as a3
		//object a2 pointed to previously goes for
		//garbage collection
		//no reference is pointing to that object's address
		
		/* JVM internally sends request to release the object from the memory space
		 * it may release immediately or later on
		 * JVM calls System.gc() which calls finalize method which removes object from memory
		 */
		
		System.gc();
		Thread.sleep(50000);
		System.out.println("Finish");
		
	} 
	
	@Override
	public void finalize() {
		System.out.println("Object removed");
	}
	
}


