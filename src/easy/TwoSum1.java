package easy;

// 1

import java.util.HashSet;
//************************************************
//
// int[] nums = {3,2,4}; int target = 6; 避免会出现结果为 [0,0]
// [0,4,3,0] 0
//
//************************************************
public class TwoSum1 
{
	public int[] twoSum(int[] nums,int target)
	{
		int result[] = new int [2];
		
		HashSet num = new HashSet();
		for(int i= 0; i<nums.length; i++)
		{
			num.add(nums[i]);
		}
		
		for(int j=0; j<nums.length; j++)
		{
			int temp = target - nums[j];
			
			//num.remove(nums[j]); // 避免出现上述错误    // 此方法错误
			
			if(num.contains(temp))
			{
				for(int k=j; k<nums.length; k++)
				{
					if(nums[k]==temp && j!=k)
					{
						result[0] = j;
						result[1] = k;
						return result;
					}
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args)
	{
		TwoSum1 towS = new TwoSum1();
		//int[] nums = {2,7,11,15,3,8,9};
		//int target = 11;
		
		//int[] nums = {3,2,4};
		//int target = 6;
		
		int[] nums = {0,4,3,0};
		int target = 0;
		
		int[] result;
		
		result = towS.twoSum(nums, target);
	
		for(int i=0; i<2; i++)
			System.out.println(result[i]);
	}
}
