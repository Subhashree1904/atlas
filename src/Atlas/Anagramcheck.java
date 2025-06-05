package Atlas;
import java.util.Arrays;

public class Anagramcheck {
	public static boolean anacheck(String str1, String str2) {
		str1 = str1.replace("\\s", "").toLowerCase();
		str2 = str2.replace("\\s", "").toLowerCase();
		
		if(str1.length() != str2.length()) {
			return false;
		}
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}
	
	public static void main(String[] args) {
		String [][] T = {{"listen", "silent"}, {"Hello", "world"}
		};
		for (String[] pair : T) {
			System.out.println(pair[0]+" " +pair[1]+" : "+ anacheck(pair[0], pair[1]));
		}
	}
	

}
