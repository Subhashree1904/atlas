package package2;
import java.util.Arrays;

public class Great {
	public static void arrayprint() {
		 int [] price = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120}; 
		 int i = 0;
		 int max_range = price.length-1;
		 System.out.println(Arrays.toString(price));
		while (i<=max_range) {
		 System.out.println("item"+i+"@"+price[i]);
		i++;
		}
	}
	public static String hello() {
		String message;
		message="Hello world";
		return message;
	}
	public static int numone() {
		int num;
		num = 1;
		return num;
	}
}
