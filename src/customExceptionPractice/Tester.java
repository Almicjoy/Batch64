package customExceptionPractice;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		sc.close();
		
		VotingCommittee vc = new VotingCommittee();
		
//		try {
//			vc.ageChecker(age);
//		} catch (Exception e){
//			System.out.println("Person does not meet age requirementh");
//		} finally {
//			System.out.println("Process Complete");
//		}
		vc.ageChecker(age);
	}

}
