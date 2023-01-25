package optionalPractice;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
//		Optional<String> gender2 = Optional.of(null);
//		Optional<String> gender3 = Optional.ofNullable(null);
		Optional<String> emptyGender = Optional.empty();
//		System.out.println(gender);
//		System.out.println(emptyGender);
		
		//Filter on Optional
		System.out.println(gender.filter(g -> g.equals("male")));
		System.out.println(gender.filter(g -> g.equals(null)));
		System.out.println(gender.filter(g -> g.equalsIgnoreCase("male")));
		System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE")));
		
		System.out.println("Non-Empty Optional:: " + gender.map(String::toLowerCase));
		
		if(gender.isPresent()) {
			System.out.println("Value available");
		} else {
			System.out.println("Value not available");
		}
		
		gender.ifPresent(g -> System.out.println("In gender option, value available"));
	}

}
