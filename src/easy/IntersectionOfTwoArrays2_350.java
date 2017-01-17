package easy;

import java.util.ArrayList;
import java.util.HashMap;

// 20160602

public class IntersectionOfTwoArrays2_350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        // 将nums1放入HashMap内
        for(int i = 0; i < nums1.length; i++) {
        	if(hm.containsKey(nums1[i])) {
        		int temp = hm.get(nums1[i]);
        		hm.put(nums1[i], temp + 1);
        	}
        	else
        		hm.put(nums1[i], 1);
        }
        
        ArrayList<Integer> arr = new ArrayList<Integer>(); // 保存重复元素
        for(int j = 0; j < nums2.length; j++) {
        	if(hm.containsKey(nums2[j])) {
        		int temp = hm.get(nums2[j]);
        		if(temp > 0) {
        		    hm.replace(nums2[j], temp - 1);
        		    arr.add(nums2[j]);
        		}
        	}
        }
        
        int[] result = new int[arr.size()];
        for(int k = 0; k < arr.size(); k++) {
        	result[k] = arr.get(k);
        }
        
        return result;
    }
    public static void main(String [] args) {
    	int[] nums1 = {1,2,2,1};
    	int[] nums2 = {2,2};
    	int[] result = intersect(nums1,nums2);
    	for(int temp : result)
    		System.out.print(temp + "  ");
    }
}
