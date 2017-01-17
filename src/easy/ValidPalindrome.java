package easy;

// 242
// 判断回文
// 两个字符串长度不等！

public class ValidPalindrome 
{
	public static boolean isPalindrome(String s, String t) 
	{
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        
        int size = ss.length;
        int size1 = ts.length;
        
        if(size != size1)	// 先判断长度相不相等
            return false;
        else if(size==size1 && size==1)   //长度为1
        {
        	if(ss[0] != ts[0])
        		return false;
        }
        else
        {
            for(int i=0; i<(size/2); i++)
            {
                if(ss[i] != ts[size-i-1])
                    return false;
            }
        }
        
        return true;
    }
	
	public static void main(String[] args)
	{
		System.out.println(isPalindrome("",""));
		System.out.println(isPalindrome("ca","tac"));
		System.out.println(isPalindrome("c","t"));
		System.out.println(isPalindrome("cd","dc"));
		System.out.println(isPalindrome("cat","tac"));
		System.out.println(isPalindrome("catd","dtac"));
	}
}
