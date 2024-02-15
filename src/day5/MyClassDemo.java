package day5;

public class MyClassDemo {

	public static void main(String[] args) {
		System.out.println("Static no= "+MyClass.no);
		MyClass obj = new MyClass();
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();

		obj.display();
		obj1.display();
		obj2.display();
	}

}
