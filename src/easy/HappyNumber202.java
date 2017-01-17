package easy;

// 20160414    没做出来
// 
// 20160415
// 不是快乐数的数称为不快乐数（unhappy number），所有不快乐数的数位平方和计算，最後都会进入 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 的循环中

// 看评论里面主要是在讨论怎么跳出循环

public class HappyNumber202 {
	public static boolean isHappy(int n) {
        int temp = 0;
        while(n != 1) {
        	if(n == 4 || n == 16 || n == 37 || n == 58 || n == 89 || n == 145 || n == 42 || n == 20)
            	return false;
        	
            while(n / 10 > 0) {
                temp += (n % 10) * (n % 10);
                n = n / 10;
            }
            temp += n * n;
            n = temp;
            temp = 0;
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println(isHappy(167));
	}
}
