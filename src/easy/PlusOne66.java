package easy;

public class PlusOne66 {
	public static int[] plusOne(int[] digits) {
        int size = digits.length;
        int flag = 0;
        for(int i = 0; i < size; i++) {
            if(digits[i] != 9) {
                flag = 1;
                break;
            }
        }
        
        int[] result;
        
        if(flag == 0)
            result = new int[size + 1];
        else
            result = new int[size];
        
        int a = 0;
        int b = 1;
        if(flag == 1) {
            for(int i = size - 1; i >= 0; i--) {
                a = (digits[i] + b) % 10;
                b = (digits[i] + b) / 10;
                result[i] = a;
            }
        }
        else if(flag == 0)
            result[0] = 1;
        
        return result;
    }
	public static void main(String[] args) {
		int[] digits1 = {9,9};
		int[] digits2 = {8,8,5,0,5,1,9,7};
		
		plusOne(digits1);
		plusOne(digits2);
	}
}
