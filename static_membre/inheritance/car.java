package inheritance;
class vehical
{
	protected 
	int brand;
	
	public
	vehical(int b)
	{
		brand=b;
	}
	
}
public class car extends vehical 
{
  protected
  String name;
  double price;
  
  public
  car(int b,String n,double p)
  {
	  super(b);
	  name=n;
	  price=p;
  }
  void show()
  {
	  
	  System.out.println("brand="+brand);
	  System.out.println("name="+name);
	  System.out.println("price="+price);
	  
  }
  public static void main(String[] args)
  {
	  car c=new car(1,"swift",1234);
	  c.show();
  }
}
