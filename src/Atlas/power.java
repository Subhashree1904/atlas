package Atlas;

public class power {

	public static void main(String[] args) {
	    int base = 3, exponent = 4;
//	    System.out.println("Answer = new " + Math.pow(base, exponent));
	    long result = 1;

//	    while (exponent != 0) {
//	      result = result*base;
//	      exponent -= 1;
//	    }
	    
	    for(int i = exponent; i>0; i--) {
	    	result = result*base;
	    }
	    System.out.println("Answer = " + result);
	}

}
