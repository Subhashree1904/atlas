package twentyone;

public class Helper {
	public static int[] arraystwo (){
		int[] a = {2,3,4};
		int[] b = {5,6,7};
		int length = a.length + b.length;
		int[] result = new int[length];
		int i = 0;
	for (int post : a) {
		result[i] = post;
		i++;
	}
	for (int post : b) {
		result[i] = post;
		i++;
	}
	return result;
		
	}
}
