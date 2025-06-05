package package1;

public class palindrome {

	public static void main(String[] args) {
		 int num = 122, original = num, reverse = 0;
	        while (num > 0) {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	            num /= 10;
	        }
	        System.out.println(original == reverse ? "Palindrome" : "Not Palindrome");
	}

}
