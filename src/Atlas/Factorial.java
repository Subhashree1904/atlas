package Atlas;

public class Factorial {

	public static void main(String[] args) {
		int d = 10;
		long factorial = 1;
		int i = 1;
		
		while(i<=d) {
			factorial = factorial * i;
			i++;
		}
//		for(int i = 1; i<=d; ++i) {
//		factorial = factorial * i;
//	}
		
//	System.out.printf("Factorial of %d is %d\n", d, factorial);
	System.out.println("Factorial of " + d + " is " + factorial);

	}

}
