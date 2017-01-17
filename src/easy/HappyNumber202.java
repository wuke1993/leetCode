package easy;

// 20160414    û������
// 
// 20160415
// ���ǿ�����������Ϊ����������unhappy number�������в�����������λƽ���ͼ��㣬���ᶼ����� 4 �� 16 �� 37 �� 58 �� 89 �� 145 �� 42 �� 20 �� 4 ��ѭ����

// ������������Ҫ����������ô����ѭ��

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
