package practice1;
class Ex1{
private	String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class Setter {

	public static void main(String[] args) {
Ex1 e = new Ex1();
e.setName("Aishwarya");
System.out.println(e.getName());
	}

}
