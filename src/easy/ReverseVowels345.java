package easy;

// 2016.4.27
// 元音字母   注意有大写小写

public class ReverseVowels345 {
    public static String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int length = s.length();
        
        if(length < 2)
        	return s;
        
        int p1 = 0;
        int p2 = length - 1;
        while(p1 < p2) {
        	if(str[p1] == 'a' || str[p1] == 'e' || str[p1] == 'i' || str[p1] == 'o'|| str[p1] == 'u' || str[p1] == 'A'|| str[p1] == 'E'|| str[p1] == 'I'|| str[p1] == 'O'|| str[p1] == 'U') {
        		if(str[p2] == 'a' || str[p2] == 'e' || str[p2] == 'i' || str[p2] == 'o'|| str[p2] == 'u' || str[p2] == 'A'|| str[p2] == 'E'|| str[p2] == 'I'|| str[p2] == 'O'|| str[p2] == 'U') {
        			char temp = str[p1];
        			str[p1] = str[p2];
        			str[p2] = temp;
        			p1++;
        		}
        		p2--;	
        	}
        	else {
        		p1++;
        		if(str[p2] != 'a' && str[p2] != 'e' && str[p2] != 'i' && str[p2] != 'o'&& str[p2] != 'u' && str[p2] != 'A' && str[p2] != 'E' && str[p2] != 'I' && str[p2] != 'O' && str[p2] != 'U')
        			p2--;
        	}
        }
        
        s = new String(str);
        return s;
    }
    public static void main(String[] args) {
    	System.out.println(reverseVowels(""));
    	System.out.println(reverseVowels("s"));
    	System.out.println(reverseVowels("hello"));
    	System.out.println(reverseVowels("Aa"));
    	System.out.println(reverseVowels("aA"));
    }
}
