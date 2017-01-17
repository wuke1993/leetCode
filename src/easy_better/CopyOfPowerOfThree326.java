package easy_better;

// 20160414
// Could you do it without using any loop / recursion?

public class CopyOfPowerOfThree326 {
	public static boolean isPowerOfThree(int n) {
    	if(n == 0)
    		return false;
    	else if(1162261467 % n == 0)
    		return true;
    	else
    		return false;
    }
    public static void main(String[] args) {
    	System.out.println(isPowerOfThree(0));
    	System.out.println(isPowerOfThree(3));
    	System.out.println(isPowerOfThree(9));
    	System.out.println(isPowerOfThree(10));
    	System.out.println(isPowerOfThree(1162261467)); // int ��3�������ݿɵ�1162261467
    }
}
