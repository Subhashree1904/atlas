package Atlas;
import java.util.Map;
import java.util.HashMap;

public class wordcount {

	public static void countWords(String text) {
		String[] words = text.split("\\s+");
		System.out.println("Total words: " + words.length);
	}
	public static void characterFrequency(String text) {
		Map<Character, Integer> frequencyMap = new HashMap<>();
//		for (char c : text.toCharArray()) {
//			if (Character.isLetterOrDigit(c)) {
//				frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
//				}
//		}
		for (char c : text.toCharArray()) {
			if (frequencyMap.containsKey(c)) {
				System.out.println(frequencyMap);
//				frequencyMap.put(c, 1);
				}
			else {
				frequencyMap.put(c, 1);
			}
		}
		System.out.println(frequencyMap);
	}
		public static void main(String[] args) {
//			String sampleText = "Hello world! This is a sample text for analysis.";
			String sampleText = "Hello";
			countWords(sampleText);
			characterFrequency(sampleText);
		}}