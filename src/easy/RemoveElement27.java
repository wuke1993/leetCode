package easy;
//********************************************************
// 2016.4.28
// Do not allocate extra space for another array,
// you must do this in place with constant memory.
// ********************************************************

public class RemoveElement27 {
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        if(length == 0)
        	return 0;
        else if(length == 1) {
            if(nums[0] == val)
            	return 0;
            else
            	return 1;
        }    
        
        // 数组长度大于等于2
        int sum = 0; // 记录含有多少个val
        int front = 0;
        int behind = length - 1;
        
        while(front < behind) {
        	if(nums[front] == val) {
        		if(nums[behind] != val) {
        			sum++;
        			nums[front] = nums[behind];
        			front++;
        			behind--;
        		}
        		else {
        			while(nums[behind] == val && behind > front) {
        				behind--;
        				sum++;
        			}
        			sum++;
        			nums[front] = nums[behind];
        			front++;
        			behind--;
        		}
        	}
        	/*
        	else 	       // 第一次没有考虑到这种情况     int[] nums = {4,5};
        		front++;
        	*/
        	else {
        		if(nums[behind] == val) {
        			while(nums[behind] == val && behind > front) {
        				behind--;
        				sum++;
        			}
        		}
        		front++;
        	}
        }
        if(front == behind && nums[front] == val)  //处理 “ 当front = behind 时，没有排除中间的 2”
        	sum++;
        return length-sum;    
    }
    
    public static void main(String[] args) {
    	//int[] nums = {4,5}; // 第一次没有考虑到这种情况
    	//int val = 5;
    	
    	int[] nums = {2,2,3}; // 当front = behind 时，没有排除中间的 2
    	int val = 2;
    	
    	System.out.println(removeElement(nums,val));
    	for(int n : nums)
    		System.out.print(n + "  ");
    }
}
