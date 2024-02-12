package tns;

public class polymorphisms {

	public static void main(String[] args) {
		person obj = new person();
		obj.display();
		
		obj.name="Nidhi";
		obj.age=22;
		obj.gender="female";
		
		obj.display();
		obj.accept();
		obj.display();

	}

}
