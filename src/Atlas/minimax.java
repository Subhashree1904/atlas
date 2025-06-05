package Atlas;

public class minimax {
	
	public static int mininum (int [] A, int N) {
		
		int mini = Integer.MAX_VALUE;
		
		for(int i=0; i<N; i++) {
			if (A[i] < mini) {
			mini = A[i];
			}
		}
			return mini;
		}
		
	public static int maxnum (int [] A, int N) {
		int maxi = Integer.MIN_VALUE;
		
		for(int i=0; i<N; i++) {
			if (A[i] > maxi) {
			maxi = A[i];
			}
		}

		return maxi;
	}
	public static void main(String [] args) {
		
		int [] A = {2,5,6,1};
		int N = A.length;	
	System.out.println("Minimum value : " + mininum(A, N));
	System.out.println("Maximum value : " + maxnum(A, N));
	
	}
	}


