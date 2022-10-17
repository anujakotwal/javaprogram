package inheritance;
class base
{
	public void display()
	{
		System.out.println("it is base class");
	}
}
public class derived extends base
{
	public void display()
	{
		super.display();
		System.out.println("it is a derived class");
	}
	public static void main(String[] args)
	{
		derived d1=new derived();
		d1.display();
}




}
