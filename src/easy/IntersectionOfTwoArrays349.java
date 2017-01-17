package easy;
//*********************************************
// 20160530
// 60 / 60 test cases passed.
// Status: Accepted
// Runtime: 6 ms
//*********************************************
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet hs = new HashSet(); // 存放nums1
        for(int i = 0; i < nums1.length; i++) {
        	hs.add(nums1[i]);
        }
        
        HashSet<Integer> re = new HashSet<Integer>(); // 存放结果
        for(int i = 0; i < nums2.length; i++) {
        	if(hs.contains(nums2[i]))
        	    re.add(nums2[i]);
        }
        
        int[] result = new int[re.size()];
        int j = 0;
        for(Integer i : re) {
        	result[j] = i;
        	j++;
        }
        	
        return result;
    }
}
