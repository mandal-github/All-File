public class Bulider {
public static void main(String[] args) {
	StringBuilder st1 = new StringBuilder ("StringBuilder");
	st1.append("is a peer class of string");
	st1.append("that provieds much of");
	st1.append("the functionality of string");
	System.out.println(st1);
    StringBuffer st2 =new StringBuffer ("it is used to at the specified index possition ");
    st2.insert(14, "insert text");
    System.out.println(st2);
    System.out.println(st2.reverse());
	
}
	
}

