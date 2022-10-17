package overloading;

public class typecasting2 {
	public static void main(String[] args)
	{
		double d=100.04;
		long l=(long)d; //explicit type casting required
		int i=(int)l; //explicit type casting required
		System.out.println("double value"+d);
		System.out.println("long value"+l);
		System.out.println("int value"+i);
	}

}
