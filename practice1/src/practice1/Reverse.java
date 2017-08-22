package practice1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,x,r=0;
		System.out.println("Enter number: ");
		n=sc.nextInt();
		while(n!=0){
			x=n%10;
			r=r*10+x;
			n=n/10;
		}
System.out.println(r);
	}

}
