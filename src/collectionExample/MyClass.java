package collectionExample;

public class MyClass {

	public static void main(String[] args) {
		int x = 10;
		int arr[] = {10, 2, 1, 11, 9 , 20};
//		System.out.println(arr);
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		for (int y: arr) {
			System.out.println(y);
		}
	}

}

//Collection

//Array - data structure which is a collection of the same type of
//			elements with a fixed size; Array is a non-primitive type

/* Difference between Collections and Arrays
 * 1. Collections are not fixed in size; Arrays are
 * 2. WRT memory, collections are good, arrays are not good
 * 3. WRT performance, arrays are recommended
 * 4. Collections can hold heterogeneous data, Arrays cannot
 * 5. Every collection class is built using some data structure
 * 6. Collections can only hold objects not primitives, Arrays can hold objects and primitives
 */
