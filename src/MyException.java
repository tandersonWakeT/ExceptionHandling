public class  MyException extends Exception  {
	public MyException() {
		System.out.println("User defined Exception thrown");
	}
	public String toString() {
		return "MyException Object : Marks must be between 0 and 100" ;
	}
}
