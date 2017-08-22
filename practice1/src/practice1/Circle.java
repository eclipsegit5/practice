package practice1;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double r, p, a;
System.out.println("Enter radius: ");
try{
r= sc.nextDouble();
a= Math.PI*r*r;
p= 2* Math.PI*r;
System.out.println("Area: " +a +"\nPerimeter: " +p);
	}
catch(Exception e){
System.out.println("Error ");	
}
	}
}
