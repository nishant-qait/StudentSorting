import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	
	
	public static void main(String[] args) {
	
		int i,n,id;
		double cgpa;
		String name;
		Scanner input;
		List<StudentData> StudentList = new ArrayList<StudentData>();
		StudentData student;
		System.out.println("Enter n...");
		
		input = new Scanner(System.in);
		
		n = input.nextInt();
		
		for(i=0;i<n;i++)
		{
			id = input.nextInt();
			name = input.next();
			cgpa = input.nextDouble();
			student = new StudentData(id,name,cgpa);
			
			StudentList.add(student);
		}
		
		

		Collections.sort(StudentList,new MySorting());  
		
		for(StudentData s:StudentList)
		{
			//System.out.print(" id= "+s.getId() );
			System.out.println(s.getFirstName() );
			//System.out.println( " 3cgpa = "+s.getCgpa() );
			
		}
			
		
	}
	
		

}