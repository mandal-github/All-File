package lambda;

public class ArithmeticOpreations {

	public static void main(String[] args) 
	{
	    //lambda expression for addition
		Airthmetic addition= (int a, int b)-> a+b;
		
//		lambda expression for substraction
		Airthmetic substraction= (int a, int b)-> a-b;
		
//		lambda expression for multiplication
		Airthmetic multiplication= (int a, int b)-> a*b;
		
//		lambda expression for division 
		Airthmetic division= (int a, int b)-> a/b;
		
		System.out.println("Addition: "+addition.operation(10, 5));
		System.out.println("substraction: "+substraction.operation(10, 5));
		System.out.println("multiplication: "+multiplication.operation(10, 5));
		System.out.println("division: "+division.operation(10, 5));
		
	
	}
}
interface Airthmetic{
	int operation(int n1,int n2);


}
