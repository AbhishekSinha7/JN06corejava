package tns;

public class GetSet {

	public static void main(String[] args) {
		String g;
		
		//getter - setter 
		gettersetter gs= new gettersetter();
		gs.setAge(21);
		gs.setName("Abhishek");
		gs.setGender(true);
		gs.setSalary(50000);
		
		if(gs.getGender()) {
			 g="Male";
		}
		else {
			 g="Female";

		}

		System.out.println(gs.getName()+" "+gs.getAge()+" "+g+" "+gs.getSalary());
		
		//constructors
		gettersetter ags= new gettersetter(22,"SomeName",false,700000);
		ags.display();

	}

}
