package practice1;

import java.util.Scanner;

public class Pyramid5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n;
		n=sc.nextInt();
		
		for(int i=n;i>0;i--){
		for(int j=0;j<i;j++)	{

		System.out.print(j+1 +"\t");	
		
		}
		System.out.println(" ");

		}


	}

}
