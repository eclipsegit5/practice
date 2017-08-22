package practice1;

public class Break {

	public static void main(String[] args) {
	int[] a = {1,2,3,4};
	for(int i=0;i<a.length;i++){
		if(a[i]==4){
			break;
		}
		else{
			System.out.println(a[i]);
		}
	}

	}

}
