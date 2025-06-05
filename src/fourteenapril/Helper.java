package fourteenapril;
import java.time.LocalDateTime;

public class Helper {
	public static int[] price() {
		int[] i = {25,30,35};
		return i;
	}
	public static LocalDateTime current () {
		LocalDateTime c;
		c = LocalDateTime.now();
		System.out.println(c);
		return c;
	}
	public static void charges(float a) {
		System.out.println(a+" from helper class");
	}

}