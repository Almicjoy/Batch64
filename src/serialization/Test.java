package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		EMP e = new EMP(101, "Alessa");
		String fileName = "file.ser";
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out =  new ObjectOutputStream(file);
			out.writeObject(e);
			out.close();
			file.close();
		} catch(Exception e1) {
			System.out.println("Error: " + e1.getMessage());
		}
	}

}
