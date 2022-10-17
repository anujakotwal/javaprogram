package exception;

public class exception2 
{
public static void main(String[] args)
{
	int a,b,c;
	try
	{
		int arr[]= {1,2};
		arr[2]=3/0;
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("divide by zero");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array index out of bounds exception");
	}
}
}
