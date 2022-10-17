package overloading;

public class overloading {
	void show(int l,int b)
	{
		System.out.println("area is "+(l+b));
	}
	void show(int l,int b,int h)
	{
		System.out.println("area is"+(l+b+h));
	}
 public static void main(String[] args)
 {
	 overloading a=new overloading();
	 a.show(5,7);
	 a.show(2,3,5);
 }
}
