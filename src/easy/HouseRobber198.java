package easy;

// 2016.04.22
// 想的太简单了，解法错误
// 需用动态规划

public class HouseRobber198 {
	public static int rob(int[] nums) {
        int s = nums.length;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i< s; i++) {
            sum1 += nums[i];
            i++;
        }
        for(int i = 1; i< s; i++) {
            sum2 += nums[i];
            i++;
        }
        return(sum1 > sum2 ? sum1 : sum2);
    }
	public static void main(String[] args) {
		int[] array = {1,3,4,5,6,8,9,1,1,2,4,6,1111,2,3,4,6,111,0};
		System.out.println(rob(array));
	}
}
