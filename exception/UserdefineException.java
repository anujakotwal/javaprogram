package exception;
class MyException extends Exception
{
	private int ex;
	public
	MyException(int a)
	{
		ex=a;
	}
	public String toString()
	{
		return "MyException ["+ex+"] is less than zero";
	}
}
public class UserdefineException 
{
	public static void sum(int a,int b) throws MyException
	{
		if(a<0)
		{
			throw new MyException(a);
		}
		else
		{
			System.out.println(a+b);
		}
	}
	public static void main(String[] args) throws Exception
	{
		try
		{
			sum (-10,10);
		}
		catch(MyException me)
		{
			System.out.println(me);
		}
	}
}


