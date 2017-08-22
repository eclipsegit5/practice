package practice1;

public class Fibonacci {

	public static void main(String[] args) {
		int length = 10;
		long[] s = new long[length];
		s[0] = 0;
		s[1] = 1;
		for (int i = 2; i < length; i++) {
			s[i] = s[i - 1] + s[i - 2];
		}
		for (int i = 0; i < length; i++)
			System.out.println(s[i]);

	}
}
