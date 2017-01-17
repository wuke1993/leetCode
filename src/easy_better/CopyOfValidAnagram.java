package easy_better;

import java.util.HashSet;

// �ɵߵ���ĸ˳������ɵ���

public class CopyOfValidAnagram 
{
	public static boolean isAnagram(String s, String t)
	{
		char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        
        int size = ss.length;
        int size1 = ts.length;
        
        if(size != size1)	// ���жϳ����಻���
            return false;
        else if(size == size1 && size==0) //����Ϊ0
            return true;
        else if(size==size1 && size==1)   //����Ϊ1
        {
        	if(ss[0] != ts[0])
        		return false;
        	else
        	    return true;
        }
        else  // ͬʱ�������ַ������д�������  ValidAnagram242
        {
        	int[] nums = new int[26];
        	
        	for(int i=0; i< size; i++)
        	{       		
        		nums[ss[i]-97] += 1;
        		nums[ts[i]-97] -= 1;
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
