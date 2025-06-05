package Atlas;

public class second {

	public static void main(String[] args) {
		int age = 20;
		boolean haslicence = true;
		
		if (age >= 18) {
			if (haslicence) {
				System.out.println("You can drive");
			}
			else {
				System.out.println("You need a licence to drive");
			}
		}
		else {
			System.out.println("You are too young to drive");
		}
			}
	}
