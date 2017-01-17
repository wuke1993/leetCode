package easy;

// 26进制问题

public class ColumnNumber171 {
	public static int titleToNumber(String s) {
		int num = 0;

		char[] title = s.toCharArray();
		int size = title.length;

		for (int i = 0; i < size; i++) {
			num = num * 26 + (title[i] - 'A' + 1);
		}

		return num;
	}

	public static void main(String[] args) {
		System.out.println(titleToNumber("DDDD"));
	}
}
