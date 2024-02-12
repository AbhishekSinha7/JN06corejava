package tns;
import java.util.*;

public class person {
	 
	int age;
	String gender;
	String name;
	
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the name:");
		name=sc.next();
		System.out.print("enter the age:");
		age=sc.nextInt();
		System.out.print("enter the gender:");
		gender=sc.next();
		
	}
	
	void display() {
		System.out.println(age+" "+name+" "+gender);
	}
	
	public static void main(String[] args) {

	}

}
