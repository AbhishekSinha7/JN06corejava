package tns;

public class DecisionMakingStatement {
	public static void main(String args[]) {
		
		//greater - equals - less
		int number=10;
		if(number>10) {
			//greater
		}
		else if(number==0){
			//equals
		}
		else {
			//less
		}
		
		//check positive
		if(number>0) {
//			System.out.println(number+" is positive");
		}
		
		//greatest of two numbers
		int a =12,b=25;
		
		if(a>b) {
//			System.out.println(a+ "is the largest.")
		}
		else {
//			System.out.println(b+ "is the largest.")
		}
		
		
		//greatest of 3 numbers
		int n1 =12,n2=25,n3=34;

		if(n1>n2) {
			if( n1>n3) {
				//a is largest
			}
			else {
				//n3 is largest
			}
		}
		else {
			//n2 is largest
		}
		
	}
}
