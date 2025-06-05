package Atlas;

public class Reversenum {

	public static void main(String[] args) {
		int num = 56874;
		int reversed = 0;
//		System.out.println(num%10);
//		System.out.println(num/10);
		
	while (num!=0) {
		System.out.println(num);
		int digit = num % 10;
		System.out.println(digit);
		reversed = reversed * 10 + digit;
		System.out.println("reverse = "+reversed);
		num = num/10;
		System.out.println(num);
		System.out.println("*******");
	}
//	for(;num != 0; num /= 10) {
//		int digit = num%10;
//		reversed = reversed * 10 + digit;
//	} 
	System.out.println(reversed);
//	String s = Integer.toString(num);
//	StringBuilder newstring = new StringBuilder(s);
//	System.out.println(newstring.reverse());
	}

}
