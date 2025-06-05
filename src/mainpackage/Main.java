package mainpackage;
public class Main {
	public static void main(String []args){
		int item1;
		int totalcash;
		item1 = 100;
		totalcash = 100;
		String message;
		
		if (totalcash>item1) {
			message = "true for item 1 money left after buying item 1 : " + (totalcash-item1);
		}
		else if (totalcash==item1) {
			message = "true for item 1";
		}
		else {
			message = "false for item 1 not enough money add : " + (item1-totalcash) + "more";
		}
		System.out.println(message);
	}
}