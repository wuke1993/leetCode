package easy_better;

// 无符号整数的位移操作！！！

public class CopyOfNumberof1Bits191 {
	// you need to treat n as an unsigned value
	// 此处long题目中为 int
    public static int hammingWeight(long n) {
        int count = 0;
        int num = 1;
        
        for(int i = 0; i < 32; i++)
        {
        	if((n & num) == 1)
        	    count++;
        	n = n>>>1;  // 无符号右移
        }
        
        return count;
    }
    public static void main(String[] args)
    {
    	System.out.println(hammingWeight(11));
    	System.out.println(hammingWeight(2147483648l));
    }
}
