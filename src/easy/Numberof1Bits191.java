package easy;

public class Numberof1Bits191 {
	// you need to treat n as an unsigned value
    public static int hammingWeight(long n) {
        int count = 0;
        
        while(n > 0)
        {
        	if(n % 2 == 1)
        	    count++;
        	n = n / 2;
        }
        
        return count;
    }
    public static void main(String[] args)
    {
    	System.out.println(hammingWeight(11));
    	System.out.println(hammingWeight(2147483648l));
    }
}
