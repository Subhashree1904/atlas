package Atlas;

public class prime {

	public static void main(String[] args) {
		int number = 11;
		System.out.println(isprime(number));
	}
	
	public static String isprime(int number) {
		if (number<=1) {
			return "Number is not prime as it is less then one";
		}
		for(int i = 2; i < number/2; i++) {
			if(number%i==0) {
				System.out.println(i);
				return "Number is not prime";
			}
		}		
		return "Number is prime";
	}

}
