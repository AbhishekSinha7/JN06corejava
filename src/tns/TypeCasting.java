package tns;

public class TypeCasting {

	public static void main(String[] args) {		
		//widening conversion
		int num1= 9;
		double d1 = (int)num1;
		System.out.println(d1);
		
		//Narrowing conversion
		double d2= 9.78;
		int int2 = (int)d2;
		System.out.println(int2);
		
	}

}
