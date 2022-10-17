package exception;

public class throwexception2 
{
 public static void validate(int age)
 {
	 if(age<18)
	 {
		 //throw arithmetic exception if no eligible for vote
		 throw new ArithmeticException("person is not eligible");
	 }
	 else
	 {
		 System.out.println("person is eligible for vote");
	 }
 }
 //main method
 public static void main(String[] args)
 {
	 //calling the function
	 validate(13);
	 System.out.println("rest of the code");
 }
}
