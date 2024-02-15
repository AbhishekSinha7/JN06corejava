package day5;

public class Employee {

	private int age;
	private String name;
	private boolean gender;
	private float salary;
	private String department;
	public static String company_name="SkyNet Corporation";
//setter	

	void setAge(int age) {
		this.age=age;
	}
	
	  void setName(String name) {
		this.name=name;
	}
	
	  void setGender(boolean gender) {
		this.gender=gender;
	}
	  
	 void setSalary(float salary) {
			this.salary=salary;
	}
	
	 void setDept(String Dept) {
			this.department=Dept;
		}
	 
//getter
	 
	int getAge() {
		  return this.age;
	  }
	  
	String getName() {
		  return this.name;
	  }
	  
	boolean getGender() {
		  return this.gender;
	  }
	  
	float getSalary() {
		  return this.salary;
	  }
	 String getDept() {
		 return this.department;
	 }
	 
	public static void main(String[] args) {
		

	}
}
