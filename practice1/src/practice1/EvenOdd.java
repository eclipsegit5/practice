package practice1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter any number:");
n=sc.nextInt();
if(n%2==0){
System.out.println("Even number");
}
else{
	System.out.println("Odd number");
}

	}
}
