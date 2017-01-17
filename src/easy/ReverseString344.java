package easy;

// 2016.4.28

public class ReverseString344 {
	public String reverseString(String s) {
        int len = s.length();
        if(len < 2)
            return s;
        
        char[] str = s.toCharArray();
        int p1 = 0;
        int p2 = len - 1;
        while(p1 < p2) {
            char temp = str[p1];
            str[p1] = str[p2];
            str[p2]= temp;
            p1++;
            p2--;
        }
        s = new String(str);
        return s;
    }
}
