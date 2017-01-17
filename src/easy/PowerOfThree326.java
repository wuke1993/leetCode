package easy;

// 20160414
// Could you do it without using any loop / recursion?

public class PowerOfThree326 {
	public static boolean isPowerOfThree(int n) {
    	if(n == 0)
    		return false;
    	else if(n == 1)
    		return true;
    	else {
    		while(n % 3 == 0) {
    			n /= 3;
    		}
    		if(n == 1)
    		    return true;
    		else
    			return false;
    	}
    }
    public static void main(String[] args) {
    	System.out.println(isPowerOfThree(3));
    	System.out.println(isPowerOfThree(9));
    	System.out.println(isPowerOfThree(10));
    	System.out.println(isPowerOfThree(1162261467));
    }
}
