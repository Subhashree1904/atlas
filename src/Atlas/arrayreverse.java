package Atlas;

public class arrayreverse {
	public static void revarray(int [] A) {
		int start = 0;
		int end = A.length-1;
		
		while (start < end) {
			int temp = A[start];
			A[start] = A[end];
			A[end] = temp;
			
			start ++;
			end--;
		}
	}
	public static void main(String[] args) {
		int[] A = {5,6,2,1};
		
		revarray(A);
		
	for(int i = 0; i<A.length; i++) {
		System.out.print(A[i] + " ");
		}
	}
}

	

//	    static void reverseArray(int[] arr) {
//	        int start = 0;
//	        int end = arr.length - 1;
//
//	        while (start < end) {
//	        	
//	            int temp = arr[start];
//	            arr[start] = arr[end];
//	            arr[end] = temp;
//	            
//	            start++;
//	            end--;
//	        }
//	    }
//
//	    public static void main(String[] args) {
//	        int[] arr = {1, 4, 3, 2, 6, 5};
//
//	        reverseArray(arr);
//
//	        for (int i = 0; i < arr.length; i++)
//	            System.out.print(arr[i] + " ");
//	    }}
