import java.util.Comparator;

public class MySorting implements Comparator<StudentData>{

	
	public int compare(StudentData s1,StudentData s2)
	{
		
		if(s1.getCgpa()<s2.getCgpa())
		{
			return 1;
		}
		else if(s1.getCgpa()>s2.getCgpa())
		{
			return -1;
		}
		else
		{
			if(s1.getFirstName().compareTo(s2.getFirstName())>0)
			{
				return 1;
			}
			else if(s1.getFirstName().compareTo(s2.getFirstName())<0)
			{
				return -1;
			}
			else
			{
				if(s1.getId()>s2.getId())
				{
					return -1;
				}
				else
				{
					return 1;
				}
			}
			
		}
		
		
	}

}
