package easy_better;

// 20160414
// 2µÄ´ÎÃÝ

public class CopyOfPowerOfTwo231 {
    public static boolean isPowerOfTwo(int n) {
    	if(n == 0)
    		return false;
    	else if(n == 1)
    		return true;
    	else {
    		while(n % 2 == 0) {
    			n /= 2;
    		}
    		if(n == 1)
    		    return true;
    		else
    			return false;
    	}
    }
    public static void main(String[] args) {
    	System.out.println(isPowerOfTwo(2));
    	System.out.println(isPowerOfTwo(5));
    	System.out.println(isPowerOfTwo(1024));
    	System.out.println(isPowerOfTwo(1073741824));
    }
}
