package week1.day1;

public class AssignmentFibonacciSeries {

	public static void main(String[] args) {
		
		int fseries = 0;
		int sseries = 1;
		System.out.println(fseries);
		
		for (int n = 0; n <=8; n++) {
						
			int Nseries = fseries+sseries;
			fseries = sseries;
			sseries = Nseries;
			System.out.println(Nseries);
			
		}
		

	}

}
