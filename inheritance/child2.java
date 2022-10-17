package inheritance;
class parent2
{
	String name;
	public void details()
	{
		name="parent";
		System.out.println(name);
	}
}
public class child2 extends parent2 
{
  String name;
  public void details()
  {
	  super.details();
	  name="child";
	  System.out.println(name);
  }
  public static void main(String[] args)
  {
	  child2 obj=new child2();
	  obj.details();
  }
}
