package inheritance;
class parenta{}
class childa extends parenta
{
	public void check()
	{
		System.out.println("sucessfull casting");
	}
	public static void show(parenta p)
	{
		if(p instanceof childa)
		{
			childa b1=(childa)p;
			b1.check();
		}
	}
}
public class Downcasting 
{
public static void main(String[] args)
{
	parenta p=new childa();
	childa.show(p);
}
}
