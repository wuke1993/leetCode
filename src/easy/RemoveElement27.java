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
        
        // ���鳤�ȴ��ڵ���2
        int sum = 0; // ��¼���ж��ٸ�val
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
        	else 	       // ��һ��û�п��ǵ��������     int[] nums = {4,5};
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
        if(front == behind && nums[front] == val)  //���� �� ��front = behind ʱ��û���ų��м�� 2��
        	sum++;
        return length-sum;    
    }
    
    public static void main(String[] args) {
    	//int[] nums = {4,5}; // ��һ��û�п��ǵ��������
    	//int val = 5;
    	
    	int[] nums = {2,2,3}; // ��front = behind ʱ��û���ų��м�� 2
    	int val = 2;
    	
    	System.out.println(removeElement(nums,val));
    	for(int n : nums)
    		System.out.print(n + "  ");
    }
}
