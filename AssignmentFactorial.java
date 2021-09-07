package week1.day1;

public class AssignmentFactorial {

	public static void main(String[] args) {
		int input = 5;
		int fact = 1;
		for (int i = 1; i <= input; i++) 
		{ 
			fact = i * fact;
			System.out.println(fact);
		}

	}

}
