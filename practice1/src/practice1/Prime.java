package practice1;

public class Prime {

	public static void main(String[] args) {
int length = 20;
for(int i=0;i<=length;i++){
	if(i%2==0){
		System.out.println(i +"  Even number");
	}
	else{
		System.out.println(i +"  Odd number");
	}
}
System.out.print("Prime numbers:");
for(int j=1;j<=length;j++){
	 boolean n = true;
     for(int k=2; k < j ; k++){
            
             if(j % k == 0){
                     n = false;
                     break;
             }
     }
 
     if(n)
    	 System.out.print(j +" ");
  
}

	}

}
