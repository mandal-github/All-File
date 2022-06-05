package oops.assignments.programs;

public abstract class Persistence {
	public abstract void persist();
}
class FilePersist extends Persistence
{
	public void persist()
	{
		System.out.println("File Persist");
	}
}
