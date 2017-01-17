package easy;

import java.util.HashSet;

// 由颠倒字母顺序而构成的字

public class ValidAnagram242 
{
	public static boolean isAnagram(String s, String t)
	{
		char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        
        int size = ss.length;
        int size1 = ts.length;
        
        if(size != size1)	// 先判断长度相不相等
            return false;
        else if(size == size1 && size==0) //长度为0
            return true;
        else if(size==size1 && size==1)   //长度为1
        {
        	if(ss[0] != ts[0])
        		return false;
        	else
        	    return true;
        }
        else // 此处可进行简化
        {
        	int[] nums = new int[26];
        	HashSet hs = new HashSet();
        	
        	for(int i=0; i< size; i++)
        	{
        		if(hs.contains(ss[i]))
        			nums[ss[i]-97] += 1;
        		else
        		{
        			hs.add(ss[i]);
        			nums[ss[i]-97] = 1;
        		}
        	}
        	for(int j=0; j<size1; j++)
        	{
        		if(hs.contains(ts[j]))
        			nums[ts[j]-97] -= 1;
        		else
        			return false;
        		
        	}
        	
        	for(int k=0; k<26; k++)
        	{
        		if(nums[k] != 0)
        			return false;
        	}
        	return true;
        }
	}
	
	public static void main(String[] args)
	{
		System.out.println(isAnagram("",""));
		System.out.println(isAnagram("ca","tac"));
		System.out.println(isAnagram("c","t"));
		System.out.println(isAnagram("cd","dc"));
		System.out.println(isAnagram("cat","tac"));
		System.out.println(isAnagram("catd","dtac"));
	}
}
