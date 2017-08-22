package practice1;

import java.util.Scanner;

public class FactRecursion {
static int factorial(int n){
	if(n==1){
	return 1;
	}
	else{
		return n*factorial(n-1);
	}
}
public static void main(String[] args) {
int n,f;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number: ");
n=sc.nextInt();
f=factorial(n);
System.out.println(f);

	}

}
