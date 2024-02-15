package day5;

public class Einterface {

	public static String checkGender(boolean g) {
		if(g) {
			 return "Male";
		}
		else {
			 return "Female";

		}
	}
	
	public static void main(String[] args) {
		
		Employee it = new Employee();
		Employee hr = new Employee();
		
		//IT Department
		System.out.println("------------------------IT Department------------------------");
		it.setAge(21);it.setGender(true);it.setName("Abhishek Sinha");it.setSalary(450000);it.setDept("IT");
		System.out.println(it.getName()+" "+ it.getAge()+" "+ checkGender(it.getGender())+" " + it.getSalary()+" "+ it.getDept()+" "+ Employee.company_name);

		it.setAge(21);it.setGender(false);it.setName("Swati Mishra");it.setSalary(500000);it.setDept("IT");
		System.out.println(it.getName()+" "+ it.getAge()+" "+ checkGender(it.getGender())+" " + it.getSalary()+" "+ it.getDept()+" "+ Employee.company_name);
		
		System.out.println();
		
		//HR Department
		System.out.println("------------------------HR Department------------------------");
		hr.setAge(21);hr.setGender(true);hr.setName("Swapnil Rathod");hr.setSalary(500000);hr.setDept("HR");
		System.out.println(hr.getName()+" "+ hr.getAge()+" "+ checkGender(hr.getGender())+" " + hr.getSalary()+" "+ hr.getDept()+" "+ Employee.company_name);

		hr.setAge(21);hr.setGender(false);hr.setName("Reshma Bhakta");hr.setSalary(450000);hr.setDept("HR");
		System.out.println(hr.getName()+" "+ hr.getAge()+" "+ checkGender(hr.getGender())+" " + hr.getSalary()+" "+ hr.getDept()+" "+ Employee.company_name);
	}

}
