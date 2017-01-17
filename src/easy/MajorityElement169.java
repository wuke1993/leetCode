package easy;

import java.util.Arrays;

public class MajorityElement169 {
	public static Object majorityElement(int[] nums) {

		if(nums.length == 1 || nums.length == 2)
			return nums[0];
		
		int count = 1;
		Arrays.sort(nums);
		
		for (int i = 0; i < (nums.length - 1); i++) {
			if ((nums[i] == nums[i + 1]) && (count < (nums.length / 2))) {
				count++;
			} 
			else if((nums[i] == nums[i + 1]) && (count == (nums.length / 2)))
				return nums[i];
			else
				count = 1;
		}
		
		return null;
	}
	
	public static void main(String[] args)
	{
		int[] num = {6};
		System.out.println(majorityElement(num));
		
		int[] num0 = {6,2};
		System.out.println(majorityElement(num0));
		
		int[] nums = {6,6,2,4};
		System.out.println(majorityElement(nums));
		
		int[] num1 = {1,6,2,8,2,7,2,2,2,2,6};
		System.out.println(majorityElement(num1));
		
		int[] num2 = {1,2,0,8,2,7,2,2,2,2,6,99,22,33,22,0,5,2,2,0};
		System.out.println(majorityElement(num2));
	}
}
