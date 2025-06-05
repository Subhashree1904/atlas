package fifteenapril;
import fifteenapril.main;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;





public class Helper {

//	public static void main(String[] args) {
//		int[] cars = main.price();
//		 System.out.println(Arrays.toString(cars));
//		int j = 0;
//		while (j<0) {
//		 System.out.println(j+cars[j]);
//		j++;
//		}
//		for ( int i = 0; i<cars.length; i++) {
//			System.out.println(cars[i]);
//		}
//		System.out.println(main.current()); 
	
		public static void current(LocalDateTime c){
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
	        String formattedDate = c.format(formatter);

		System.out.println(formattedDate);
		}
		

	public static void printarraytwice(int[] a) {
		System.out.println("original  array is:" + Arrays.toString(a));
	
		// in below code will print in correct order
		int m = 0;
		while (m<a.length) {
		System.out.println("Correct order" + a[m]);
		m++;
		}
		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void cal (int a) {
		if (a%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
			
			
			
		}
	}
	
