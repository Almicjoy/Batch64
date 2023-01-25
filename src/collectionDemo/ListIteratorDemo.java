package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List a1 = new LinkedList();
		a1.add("Alessa");
		a1.add("Tsuki");
		a1.add("Chibi");
		a1.add("Shiro");
		System.out.println(a1);
		
		ListIterator itr = a1.listIterator();
		while(itr.hasNext()) {
			String s = (String) itr.next();
			if(s.equals("Tsuki")) {
				itr.add("Suna");
			} 
		}
		System.out.println(a1);
	}

}

//Sparky Zazu Tsuki Suna Chibi Shiro Godach
//Cosmo Gilbert Foxy-Dog Joxie Poxie Doxie 
//Choco Latte Blacky Sparkle Sassy Tiger Aki Meggy

