package fourteenapril;
import fourteenapril.Helper;
import java.util.Arrays;

public class Main{
	public static void main (String[] args) {
		System.out.println(Arrays.toString(Helper.price()));
		Helper.current();
		Helper.charges(12.5f);
	}
}