package Program;
import java.util.Scanner;
public class LonigPage {

	public static void main(String[] args) {
		String userName ="Ritesh";
		String _name = "Ritesh.com";
		String _password ="test@123";
		Scanner sc =new Scanner(System.in);
		for(int i=1;i<=3;i++) {
			System.out.println("Enter user name");
			String name = sc.next();
			System.out.println("Enter the password :");
			String  password =sc.next();
			if((_name.contentEquals(name))&&(password.contentEquals(_password))) {
				System.out.println("welcome "+ userName);
				break;
			}else {
				if(i==3) {
					System.out.println("contact Admin");
				}else {
					System.out.println("Sorry! try again");
					
				}
			}
			
		}
			
	

	}

}
