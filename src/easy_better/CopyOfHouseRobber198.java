package easy_better;

// 2016.04.28
// ¶¯Ì¬¹æ»®
// mark[i]=max(num[i]+mark[i-2],mark[i-1])

public class CopyOfHouseRobber198 {
	public static int rob(int[] nums) {
        int len = nums.length;
		if(len == 0)
			return 0;
		if(len == 1)
			return nums[0];
		
		int[] sum = new int[len];
		sum[0] = nums[0];
		sum[1] = Math.max(nums[0], nums[1]);
		for(int i = 2; i < len; i++) {
			sum[i] = Math.max(sum[i-1], sum[i-2] + nums[i]);
		}
		return sum[len-1];
    }
	public static void main(String[] args) {
		int[] array = {1,3,4,5,6,8,9,1,1,2,4,6,1111,2,3,4,6,111,0};
		System.out.println(rob(array));
	}
}
