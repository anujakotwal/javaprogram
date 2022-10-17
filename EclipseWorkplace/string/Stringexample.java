package string;

public class Stringexample {
	public static void main(String[] args)
	{
		String str="spark";
		System.out.println(str.charAt(4));
		
		String str1="JAVA";
		System.out.println(str1.equalsIgnoreCase("JAVA"));
		
		String s1="count me";
		System.out.println(s1.length());
		
		String s2="change me";
		System.out.println(s2.replace("me", "you"));
		
		String s3="12345678";
		System.out.println(s3.substring(4));
		
		System.out.println(s3.substring(4,7));
		
		String s4="ABCDEF";
		System.out.println(s4.toLowerCase());
		
		String s5="abcdef";
		System.out.println(s5.toUpperCase());
		
		String s6="hello";
		System.out.println(s6.trim());
	}

}
