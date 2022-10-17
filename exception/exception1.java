package exception;

public class exception1 
{
 public static void main(String[] args)
 {
	 int a,b,c;
	 try
	 {
		 a=0;
		 b=10;
		 c=b/a;
		 System.out.println("this line will not be excuted");
		 
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("divide by zero");
	 }
	 System.out.println("After exception is handled");
 }
}
