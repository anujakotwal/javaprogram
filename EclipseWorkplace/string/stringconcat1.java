package string;

public class stringconcat1 {
	public static void main(String[] args)
	{
		String s="Hell";
		String s1="Hello";
		String s2="Hello";
		
		if(s1.equals(s2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(s.equals(s1))
		{
			System.out.println("true");
			
		}
		else
		{
			System.out.println("false");
		}
		
		
		String s11="Java";
		String s22="Java";
		String s33=new String("Java");
		if(s11==s22)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(s11==s33)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		String st1="Abhi";
		String st2="Viraaj";
		String st3="Abhi";
		System.out.println(st1.compareTo(st2)); //return -1 because s1<s2
		System.out.println(st1.compareTo(st3));//return 0 because s1==s3
		System.out.println(st2.compareTo(st1));
	}

}
