package overloading;

public class typecasting {
public static void main(String[] args)
{
	int i=100;
	long l=i; //no explicit type casting required
	float f=l;// no explicit type casting required
	System.out.println("int value"+i);
	System.out.println("long value" +l);
	System.out.println("float value"+f);
}
}
