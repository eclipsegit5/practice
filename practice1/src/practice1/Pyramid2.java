package practice1;

import java.util.Scanner;

public class Pyramid2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n, x, y = 1;
		n = sc.nextInt();
		System.out.println("Enter x:");
		x = sc.nextInt();
		for (int i = n; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(y + "\t");
				y = y + x;
			}
			System.out.println(" ");

		}
	}
}
