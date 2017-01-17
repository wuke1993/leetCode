package easy_better;

// �޷���������λ�Ʋ���������

public class CopyOfNumberof1Bits191 {
	// you need to treat n as an unsigned value
	// �˴�long��Ŀ��Ϊ int
    public static int hammingWeight(long n) {
        int count = 0;
        int num = 1;
        
        for(int i = 0; i < 32; i++)
        {
        	if((n & num) == 1)
        	    count++;
        	n = n>>>1;  // �޷�������
        }
        
        return count;
    }
    public static void main(String[] args)
    {
    	System.out.println(hammingWeight(11));
    	System.out.println(hammingWeight(2147483648l));
    }
}
