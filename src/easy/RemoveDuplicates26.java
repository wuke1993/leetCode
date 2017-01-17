package easy;
//*************************************************************
//  Given a sorted array, remove the duplicates in place such that 
//  each element appear only once and return the new length.
//  Do not allocate extra space for another array, 
//  you must do this in place with constant memory.
//*************************************************************

import java.util.HashSet;

public class RemoveDuplicates26 {
	public static int removeDuplicates(int[] nums) {
		int count = 0;
        HashSet hs = new HashSet();
        for(int i = 0; i < nums.length; i++) {
            if(!(hs.contains(nums[i]))) {
                nums[count] = nums[i];
                hs.add(nums[i]);
            	count++;
            }
        }
        return count;
    }
	public static int removeDuplicates_better(int[] nums) {
		if(nums.length <1)
			return 0;
		int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[count] = nums[i];
            	count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		int[] test1 = {1,1,1,1,1};
		int[] test2 = {1,1,5,5,6,7,8,9,9};
		//System.out.println(removeDuplicates(test1));
		//System.out.println(removeDuplicates(test2));
		System.out.println(removeDuplicates_better(test1));
		System.out.println(removeDuplicates_better(test2));
	}
}
