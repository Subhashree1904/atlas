package fifteenapril;
import java.time.LocalDateTime;
import java.util.Date;
import fifteenapril.Helper;

public class main {

//	public static int[] price () {
//		int[] cars = {10, 12, 15, 20};
//		return cars;
//		
//	}
// {
	
//		
//	}
//public static void main (String[] args) {
//	int num;
//	num = 25;
//	if (num%2==0) {
//		System.out.println("EVEN");
//}
//	else {
//		System.out.println("ODD");
//	}
//	}

	public static void main(String[] args) {
		int[] price = {1,2,3,4};
		Helper.printarraytwice(price);
		
		LocalDateTime dt= LocalDateTime.now();
	Helper.current(dt);
	int numbers = 20;
	Helper.cal(numbers);
	
	}
} 

	
