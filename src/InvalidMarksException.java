public class  InvalidMarksException extends Exception  {
	
	public InvalidMarksException() {
		System.out.println("User defined Exception thrown");
	}
	public String toString() {
		return "MyException Object : Marks must be between 0 and 100" ;
	}
}
