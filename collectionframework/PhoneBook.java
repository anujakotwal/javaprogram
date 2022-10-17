package collectionframework;
import java.util.*;
class contact
{
	String first_name;
	String last_name;
	String phone_no;
	
	public
	contact(String fn,String ln,String pn)
	{
		first_name=fn;
		last_name=ln;
		phone_no=pn;
	}
	public String toString()
	{
		return "\nfirst_name="+first_name+ "last_name="+last_name+" phone_no="+phone_no;
	}
}
public class PhoneBook 
{
public static void main(String[] args)
{
	contact c1=new contact("Rahul","Dravid","1234567890");
	contact c2=new contact("virat","sachin","6547849324");
	contact c3=new contact("Raj","sanket","5623456730");
	
	ArrayList<contact> a1=new ArrayList<contact>();
	a1.add(c1);
	a1.add(c2);
	a1.add(c3);
	System.out.println(a1);
}
}
