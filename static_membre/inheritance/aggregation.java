package inheritance;
class auther
{
	String name;
	int age;
	String place;
	
	public
	auther(String n,int a,String p)
	{
		this.name=n;
		this.age=a;
		this.place=p;
	}
	
	public String getauthname()
	{
		return name;
	}
	public int getauthage()
	{
		return age;
	}
	public String getplace()
	{
		return place;
	}
}
class book
{
	String bookname;
	int price;
	auther auth;
	book(String b,int p,auther at)
	{
		this.bookname=b;
		this.price=p;
		this.auth=at;
	}
	public void showDetsils()
	{
		System.out.println("bookname="+bookname);
		System.out.println("price="+price);
		System.out.println("auther name="+auth.getauthname());
		System.out.println("auther age="+auth.getauthage());
		System.out.println("auther place="+auth.getplace());
		
	}
}
public class aggregation
{
	public static void main(String[] args)

{
	auther at=new auther("me",22,"INDIA");
	book b=new book("java",456,at);
	b.showDetsils();
}
}
