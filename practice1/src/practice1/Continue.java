package practice1;

public class Continue {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		for(int i=0;i<a.length;i++){
			if(a[i]==3){
				continue;
			}
			else{
				System.out.println(a[i]);
			}
		}

	}

}
