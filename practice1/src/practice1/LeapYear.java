package practice1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		n = sc.nextInt();
		if ((n % 400 == 0) || ((n % 4 == 0) && (n % 100 != 0))) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a Leap year");
		}
	}

}
