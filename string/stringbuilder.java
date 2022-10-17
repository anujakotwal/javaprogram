package string;

public class stringbuilder 
{
 public static void main(String[] args)
 {
	 String s1=new String("spark");
	 s1.concat("institute");
	 System.out.println(s1);
	 
	 StringBuilder s2=new StringBuilder("test");
	 s2.append(123);
	 System.out.println(s2);
	 
	 StringBuilder s3=new StringBuilder("Hello");
	 s3.insert(3,"JAVA");
	 System.out.println(s3);
	 
	 StringBuilder str=new StringBuilder("hello");
	 str.reverse();
	 System.out.println(str);
	 
	 StringBuilder st=new StringBuilder("hello gud morning");
	 st.replace(6,13,"java");
	 System.out.println(st);
	 
	 StringBuilder sb=new StringBuilder();
	 System.out.println(sb.capacity());
	 sb.append("Hello");
	   System.out.println(sb.capacity());//now 16
	   sb.append("java is my favourite language");
	   System.out.println(sb.capacity());//now (16*2)+2=34
	   sb.append("String");
	   		System.out.println(sb.capacity());//now(34*2)+2=70
			 
 }
}
