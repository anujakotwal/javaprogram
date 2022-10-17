package iterator;
import java.util.*;
public class iterator1 
{
public static void main(String[] args)
{
	ArrayList<String> ar=new ArrayList<String>();
	ar.add("ab");
	ar.add("bc");
	ar.add("cd");
	ar.add("dr");
	System.out.println("forword Direction");
	ListIterator lit=ar.listIterator();
	while(lit.hasNext())//in forword direction
	{
		System.out.println(lit.next()+"");
	}
	System.out.println("backword direction");
		while(lit.hasPrevious())//in backword direction
		{
			System.out.println(lit.previous()+"");
		}
	}
}

