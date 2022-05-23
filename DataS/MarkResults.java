package Program;
import java.util.*;
public class MarkResults {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subject_1 marks");
		int sub_1marks = sc.nextInt();
		System.out.println("Enter the subject_2 marks");
		int sub_2marks = sc.nextInt();
		System.out.println("Enter the subject_3 marks");
		int sub_3marks =sc.nextInt();
		if((sub_1marks >60)&&(sub_2marks>60)&&(sub_3marks>60)) {
			System.out.println("Student is passed");
		}else if ((sub_1marks>60&&(sub_2marks>60))||(sub_1marks>60&&(sub_3marks>60))||(sub_3marks>60&&(sub_2marks>60))) {
			System.out.println("Student is promoted");
		}else {
			System.out.println("Student is Failed");
		}
		sc.close();
	
	}

}
