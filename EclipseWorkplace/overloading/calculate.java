package overloading;

public class calculate {
	void sum(int a,int b)
	{
		System.out.println("sum is "+(a+b));
	}
	void sum(float a,float b)
	{
		System.out.println("sum is "+(a+b));
	}
	public static void main(String[] args)
	{
		calculate c=new calculate();
		c.sum(2, 4);
		c.sum(2.3f,5.1f);
	}

}
