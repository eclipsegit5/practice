package practice1;

import java.util.Scanner;

public class Pyramid1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows, difference, y = 1;
		rows = sc.nextInt();
		System.out.println("Enter the difference between numbers:");
		difference = sc.nextInt();

		if (rows > 0 && difference > 0) {
			for (int i = 0; i <= rows; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(y + "\t");
					y = y + difference;
				}
				System.out.println(" ");
			}
		} else {
			System.out.println("Error");
		}

	}

}
