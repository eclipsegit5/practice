package practice1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter number:");
n=sc.nextInt();
switch(n)
{
case 0:
		System.out.println("equals to 0");
		break;
case 1:
		System.out.println("greater than 0");
		break;
	default:
		System.out.println(" not equals to 1 and 0");	
		break;
}
	}

}
