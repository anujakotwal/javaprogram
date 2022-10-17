package inheritance;

class parent
{
public void p1()
{
	System.out.println("parent method");
}

}

 public class child extends parent
{
	public void c1()
	{
		System.out.println("child method");
	}
	public static void main(String[] args)
	{
		child obj=new child();
		obj.p1();
		obj.c1();
	}
}
