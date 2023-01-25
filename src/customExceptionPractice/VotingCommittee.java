package customExceptionPractice;

public class VotingCommittee {
	public void ageChecker(int age) {
		if(age < 18) {
			throw new AgeRestrictionException("Person does not meet age requirement");
		} else {
			System.out.println("Person meets age requirement");
		} 
		System.out.println("Person has been registered for voting");
	}
}
