package easy;

// �Ʋ���������
// �ݹ鳬ʱ
// ʹ�÷ǵݹ�ʵ��  ����

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
