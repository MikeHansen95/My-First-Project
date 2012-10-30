package project.first.am.ctec;

public class ProgrammingClassController
{

	private ProgrammingClass currentClass;

	public ProgrammingClassController()
	{
		currentClass = new ProgrammingClass();
	}

	public void start()
	{
		currentClass.setup();

	}

}
