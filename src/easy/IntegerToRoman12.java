package easy;

// 把int型转化为罗马数字

public class IntegerToRoman12 {
	public static String intToRoman(int num) {
        String[][] c = {
            {"","I","II","III","IV","V","VI","VII","VIII","IX"},
            {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
            {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
            {"","M","MM","MMM"}
        };
        
        String roman = null;
        
        roman = c[3][num / 1000];
        roman += c[2][num / 100 % 10];
        roman += c[1][num /10 % 10];
        roman += c[0][num % 10];
        
        return roman;
    }
	
	public static void main(String[]args)
	{
		System.out.println(intToRoman(1));
		System.out.println(intToRoman(9));
	}
}
