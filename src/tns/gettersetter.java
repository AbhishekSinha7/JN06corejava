package tns;

public class gettersetter {

	private int age;
	private String name;
	private boolean gender;
	private float salary;
	
	
	gettersetter(){
		
	}
	
	gettersetter(int age, String name, boolean gender, float salary){
		this.age=age;
		this.name=name;
		this.gender=gender;
		this.salary=salary;
		
	}
	
	void display() {
		String g;
		if(gender) {
			 g="Male";
		}
		else {
			 g="Female";

		}
		System.out.println(name+" "+age+" "+g+" "+salary);
	}
	
	//setter - getter	
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
	
	public static void main(String[] args) {
		
	}


}
