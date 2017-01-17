package easy;

import java.util.HashSet;

public class ContainsDuplicate217
{
	public static boolean containsDuplicates(int[] nums) // ��ʱ������
    {
        HashSet hs = new HashSet();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.contains(nums[i]))
                return true;
            else
                hs.add(nums[i]);
        }
        return false;
    }
	public static boolean containsDuplicate(int[] nums) 
    {
        HashSet hs = new HashSet();
        for(int i=0; i<nums.length; i++)
        {
                hs.add(nums[i]);
        }
        if(hs.size()<nums.length)
            return true;
        else
        	return false;
    }
	public static void main(String[] args)
	{
		int[] nums = new int[50000];
		for(int i=0; i<50000; i++)
		{
			nums[i]=i;
		}
		
		long startMili=System.currentTimeMillis();// ��ǰʱ���Ӧ�ĺ�����
		containsDuplicate(nums);
		long endMili=System.currentTimeMillis();
		System.out.println("�ܺ�ʱΪ��"+(endMili-startMili)+"����");
		
		long start=System.currentTimeMillis();// ��ǰʱ���Ӧ�ĺ�����
		containsDuplicates(nums);
		long end=System.currentTimeMillis();
		System.out.println("�ܺ�ʱΪ��"+(end-start)+"����");
	}
}
