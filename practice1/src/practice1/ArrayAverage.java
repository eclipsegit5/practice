package practice1;

public class ArrayAverage {

	public static void main(String[] args) {
int[] n = {4,5,8,3,5};
int sum=0;
for(int i=0; i<n.length;i++){
sum = sum+n[i];
}
double a = sum/(n.length);
System.out.println(a);
	}

}
