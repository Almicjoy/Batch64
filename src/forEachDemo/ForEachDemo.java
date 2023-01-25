package forEachDemo;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Alessa", "Bob", 
				"Charlie", "David", "Emily");
		list.stream().forEach(name -> {
			System.out.println(String.format("Name: %s", 
					name));
		});
	}
}
