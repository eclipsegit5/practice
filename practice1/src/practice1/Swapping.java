package practice1;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
int a=7,b=2;
a=a+b;
b=a-b;
a=a-b;
System.out.println(a);
System.out.println(b);
int x,y,z;
Scanner sc = new Scanner(System.in);
System.out.println("enter x");
x=sc.nextInt();
System.out.println("enter y");
y=sc.nextInt();
z=x;
x=y;
y=z;
System.out.println(x);
System.out.println(y);
	}

}
