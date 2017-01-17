package easy;

import java.util.HashMap;

//把罗马数字转化为int型

public class RomanToInteger13 {

	public static int romanToInt(String s) {
		
		int result = 0;
		
		//char[] romans = {'I','V','X','L','C','D','M'};
		//int[] rule = {1,5,10,50,100,500,1000};
		HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
		hs.put('I', 1);     // 基本数字
		hs.put('V', 5);
		hs.put('X', 10);    // 基本数字
		hs.put('L', 50);
		hs.put('C', 100);   // 基本数字
		hs.put('D', 500);
		hs.put('M', 1000);
		
		char[] r = s.toCharArray(); 
		
		for(int i = 0; i < r.length-1; i++)
		{
			if(r[i] == 'I' && r[i+1] != 'I') {
				result = result - hs.get(r[i]);
			}
			else if(r[i] == 'X' && r[i+1] != 'I' && r[i+1] != 'V' && r[i+1] != 'X') {
				result = result - hs.get(r[i]);
			}
            else if(r[i] == 'C' && (r[i+1] == 'D' || r[i+1] == 'M')) {
            	result = result - hs.get(r[i]);
			}
            else	
			    result = result + hs.get(r[i]);
		}
		result = result + hs.get(r[r.length-1]);
		
		return result;
	}
	
	public static void main(String[] args) {
		
		//System.out.println(romanToInt("VIII"));
		//System.out.println(romanToInt("MDCLXVI"));
		System.out.println(romanToInt("MMCCCXCIX"));
	}
}
