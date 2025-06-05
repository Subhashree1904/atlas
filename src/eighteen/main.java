package eighteen;
import java.util.Arrays;

import eighteen.Twice;

public class main {
	public static void main(String [] args) {
		int[] b = {2,4,3};
		int[] result = Twice.clonearray(b);
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(b));
		
		int s = 25;
		System.out.println(Twice.num(s));
	}
}
