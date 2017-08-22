package practice1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	//int[] numbers = {56,787,56,111};
	//for(int i =0;i<numbers.length;i++){
		//int n= numbers[i];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: ");
		int number;
		number=sc.nextInt();
		int n=number;
		int r=0,t=0;
		while(n>0){
			t=n%10;
			n=n/10;
			r=(r*10)+t;
		}
		if(number==r)
			System.out.println(number +":  palindrome");
		
		else
			System.out.println(number +": not palindrome");
		
	}

	}

