package iterator;
import java.util.*;
public class testiterator 
{
public static void main(String[] args)
{
	ArrayList<String> ar=new ArrayList<String>();
	ar.add("ab");
	ar.add("bc");
	ar.add("cd");
	ar.add("dr");
	
	Iterator it=ar.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
