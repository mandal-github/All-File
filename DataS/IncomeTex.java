package Program;
import java.util.Scanner;
public class IncomeTex {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the income");
		double income =sc.nextDouble();
		if ((income >= 0 && income <=180000)) {//salb A
			System.out.println("No need tn pay tax ");
		}
		else if ((income >= 18001 && income <= 300000)) {//slab B
			double tax =income*0.1;
			System.out.println("the tex is :"+ tax);
		}else if ((income >= 300001 && income <= 500000)) {//slab C
			double tax = income*0.2;
			System.out.println(tax);
		}else if ((income >=500001 && income <= 1000000)) {//slabD
			double tax = income*0.3;
		}
		sc.close();
		

	}

}
