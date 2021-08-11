package com.practice.DSAlgoCrackSheet;



public class FindTheDuplicateNumber {

	private static int findDuplicate(int[] nums) {
		int temp = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
            int j = Math.abs(nums[i]);
            if (nums[j] >= 0)
                nums[j] = -nums[j];
            else
                System.out.print(j + " ");
        }
		return 0;
        
    }
	
	public static void main(String[] args) {
		int[] nums = new int[] {-3,1,3,4,2};
		
		int num = findDuplicate(nums);
		
		System.out.println(num);
		
		System.out.println("value : "+Math.abs(nums[0]));
		

	}

	
	

}
