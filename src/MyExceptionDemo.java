import java.util.Scanner;
import com.student.Student;

class MyExceptionDemo{
	static int flag=0;
	public static void main(String args[]) {
		
		Student s1 = new Student();
		
		Scanner kb = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter student id: ");
			s1.setStudentId(kb.nextInt());
			kb.nextLine();
			
			System.out.println("Enter student name: ");
			s1.setStudentName(kb.nextLine());
				
			System.out.println("Enter student marks for the exam: ");
			s1.setMarks(kb.nextInt());
				
			if(s1.getMarks() < 0 || s1.getMarks() > 100)
				throw new InvalidMarksException();
			
		}
		
		catch(NumberFormatException e) {
			flag=1;
			System.out.println("Exception : "+ e);
		}
		catch (InvalidMarksException e) {
			flag=1;
			System.out.println("Exception : "+ e);
		}
		finally {
			kb.close();
		}
		if(flag==0) {
			System.out.println("Everything is fine");
			System.out.println("Id: " + s1.getStudentId());
			System.out.println("Name: " + s1.getStudentName());
			System.out.println("Marks: " + s1.getMarks());
		}
			
	}
}
