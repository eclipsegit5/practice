package practice1;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
double l, b,a,p;
Scanner sc = new Scanner(System.in);
try{ 
System.out.println("Enter Length: ");
l=sc.nextDouble();
System.out.println("Enter Breadth: ");
b=sc.nextDouble();
a= l*b;
p=2*(l+b);
System.out.println("Area:" +a +"\nPerimeter:" +p);
}
catch(Exception e){
	System.out.println("Error");
}
	}

}
