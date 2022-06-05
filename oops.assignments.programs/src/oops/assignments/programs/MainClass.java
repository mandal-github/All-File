package oops.assignments.programs;

public class MainClass {
	public static void main(String[] args)
	{
		
		Persistence p1 = new FilePersist();
		p1.persist();
		DataBasePersist p2 = new DataBasePersist();
		p2.persist();
	}
}
