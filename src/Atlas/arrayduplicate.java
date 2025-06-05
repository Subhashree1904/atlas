package Atlas;

public class arrayduplicate {
//	public static boolean containsDuplicate(int[] nums) {
//		for(int i = 0; i<nums.length; i++) {
//			for (int j = i+1; j<nums.length; j++) {
//				if (nums[i] == nums[j]) {
//				return true;
//			}
//			}
//		}
//		return false;
//	}
//	public static void main(String[] args) {
//		int[] nums = {1,3,4};
//		
//		boolean result = containsDuplicate(nums);
//		System.out.println("Duplicate : " + result);
//	}
//}

	public static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i<nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
                }
        }
               return false;
        }
        public static void main(String[] args) {
            int[] nums = {1,2,3,6};

            boolean result = containsDuplicate(nums);
            System.out.println("Contains Duplicate ?" + result);
}
}
