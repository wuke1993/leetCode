package easy;

// 菲波纳切数列
// 递归超时
// 使用非递归实现  迭代

public class ClimbingStairs70 {
	public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        int sum = 0;
        
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else {
            for(int i = 2; i <= n; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }
            return sum;
        }
    }
}
