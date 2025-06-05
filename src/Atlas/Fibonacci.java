package Atlas;

public class Fibonacci {

	public static void main(String[] args) {
//		int n = 10, firstTerm = 0, secondTerm = 1;
//	    System.out.println("Fibonacci Series till " + n + " terms:");
//
//	    for (int i = 1; i <= n; ++i) {
//	      System.out.print(firstTerm + ", ");
//	      int nextTerm = firstTerm + secondTerm;
//	      firstTerm = secondTerm;
//	      secondTerm = nextTerm;
//	    }
	    
//	    int n = 100, firstTerm = 0, secondTerm = 1;
//        
//	    System.out.println("Fibonacci Series Upto " + n + ": ");
//	    
//	    while (firstTerm <= n) {
//	      System.out.print(firstTerm + ", ");
//
//	      int nextTerm = firstTerm + secondTerm;
//	      firstTerm = secondTerm;
//	      secondTerm = nextTerm;
//	}
		
		int n = 1000;
		int last = 1;
		int secondlast = 0;
		while (secondlast < n) {
			if (secondlast > 10){
				System.out.println(secondlast);
			}
			int nextitem = last + secondlast;
			secondlast = last;
			last = nextitem;
//			if (secondlast > n) {
//				break;
//			}
//			n -= 1;
		}
		
	}
}
