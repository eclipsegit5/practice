package practice1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int[] a= new int[5],b=new int[5],c=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first array: ");
		for(int i=0; i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter second array: ");
		for(int i=0; i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("after swapping: ");
		for(int i=0; i<5;i++)
		{
			c[i]=a[i];
			a[i]=b[i];
			b[i]=c[i];
		}
		System.out.println("first array:");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("second array: " );
		for(int i=0;i<5;i++)
		{
			System.out.println(b[i]);
		}


	}

}
