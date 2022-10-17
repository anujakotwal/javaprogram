package string;

public class stringex2 //string buffer example
{
   public static void main(String[] args)
   {
	   String s1=new String("spark");
	   s1.concat("institute");
	   System.out.println(s1);
	   
	   StringBuffer s2=new StringBuffer("test");
	   s2.append(123);
	   System.out.println(s2);
	   
	   StringBuffer s3=new StringBuffer("hello");
	   s3.insert(3,"JAVA");
	   System.out.println(s3);
	   
	   StringBuffer str=new StringBuffer("hello");
	   str.reverse();
	   System.out.println(str);
	   
	   StringBuffer st=new StringBuffer("hello good morning");
	   st.replace(6, 13,"java");
	   System.out.println(st);
	   
	   StringBuffer sb=new StringBuffer();
	   System.out.println(sb.capacity());
	   
	   sb.append("Hello");
	   System.out.println(sb.capacity());//now 16
	   sb.append("java is my favourite language");
	   System.out.println(sb.capacity());//noe (16*2)+2=34
	   sb.append("String");
	   		System.out.println(sb.capacity());//now(34*2)+2=70
   }   	
   }
