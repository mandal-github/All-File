
public class StringBuffer1 {
	public static void main(String[] args) { 
		StringBuffer st =new StringBuffer ("String Buffer");
		st.append("is a peer class of string");
		st.append("that provieds much of");
		st.append("the functionality of string");
		System.out.println(st);
	    StringBuffer st1 =new StringBuffer ("it is used to at the specified index possition ");
	    st1.insert(14, "insert text");
	    System.out.println(st1);
	    System.out.println(st1.reverse());
		
	}

}
