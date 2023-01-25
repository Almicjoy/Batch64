package objectClassDemo;

import java.util.Objects;

public class P extends Object{
	
	int x;
	
	P(int x){
		this.x = x;
	}

	public static void main(String[] args) {
		P p = new P(10);
		P p2 = new P(10);
		System.out.println(p.equals(p2));
		System.out.println(p == p2);
		System.out.println(p);
		System.out.println(p2);
		
	}

	@Override
	public String toString() {
		return "P [x=" + x + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		P other = (P) obj;
		return x == other.x;
	}

}

/* Object -- it is a predefined class, it is a parent of all
 * 				classes by default, it is available in java.lang
 * 				package
 * Object Class methods
 * 1. getClass() 2. hashCode() 3. equals() 4. notify()
 * 5. notifyAll() 6. wait() 7. wait(long) 8. wait(long, int)
 * 9. finalize() 10. toString() 11. clone()
 */

/* must override equals() method to compare objects or it will compare
 * the address and not the content
 * can right click on it and generate hashCode and equals
 */

