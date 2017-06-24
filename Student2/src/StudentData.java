
public class StudentData {

	private int ID;
	private String FirstName;
	private double CGPA;
	
	StudentData(int id,String name,double cgpa)
	{
		ID = id;
		FirstName = name;
		CGPA     = cgpa;
	}
	
	public int getId()
	{
		return this.ID;
	}
	
	public String getFirstName()
	{
		return this.FirstName;
	}
	public double getCgpa()
	{
		return this.CGPA;
	}
}
