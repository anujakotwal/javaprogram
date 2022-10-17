package inheritance;
abstract class Abstract1

{
 abstract void callme();
 public void normal()
 {
	 System.out.println("it is concreat method");
 }
}
public class Abstract2 extends Abstract1
{
	void callme()
	{
		System.out.println("this is call me");
	}
	public static void main(String[] args)
	{
		Abstract2 obj=new Abstract2();
		obj.callme();
		obj.normal();
	}
}