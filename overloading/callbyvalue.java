package overloading;

public class callbyvalue {
	public void callbyvalue(int x)
	{
		x=50;
	}
	public static void main(String[] args)
	{
		int x=100;
		callbyvalue c1=new callbyvalue();
		c1.callbyvalue(x);
		System.out.println(x);
		
	}

}
