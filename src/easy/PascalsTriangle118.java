package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wuke 
 * @date  : 2016年6月20日 下午4:20:51
 * Title  : PascalsTriangle118
 * Description : 
 */
public class PascalsTriangle118 {
    public static List<List<Integer>> generate(int numRows) {    	
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	
    	if(numRows == 0)
    		return result;
    	
    	List<Integer> temp = new ArrayList<Integer>();
    	temp.add(1);
    	result.add(temp);
    	if(numRows == 1)    			    		    		
    		return result;
    	
    	List<Integer> temps = new ArrayList<Integer>();
    	temps.add(1);
    	temps.add(1);
    	result.add(temps);
    	if(numRows == 2)	    	
    		return result;
    	
        for(int i = 3; i <= numRows; i++) {
            List<Integer> tem = new ArrayList<Integer>();
            for(int j = 0; j < i; j++) {
                if(j == 0 || j == (i - 1))
                	tem.add(1);
                else {
                	tem.add(result.get(i-2).get(j-1) + result.get(i-2).get(j));
                }
            }
            result.add(tem);
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		generate(2);
	}
}
