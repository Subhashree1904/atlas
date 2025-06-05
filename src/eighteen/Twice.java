package eighteen;

public class Twice {
	public static int[] clonearray(int[] a) {
		int[] newarray;
		newarray = new int[a.length];
		for (int c=0; c<a.length; c++) {
			newarray[c]=a[c]*2;
		}
		return newarray;
		
	}
	public static int num(int re) {
		return re*2;
	}
}
