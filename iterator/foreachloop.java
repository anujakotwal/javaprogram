package iterator;
import java.util.*;
public class foreachloop 
{
public static void main(String[] args)
{
	LinkedList<String>l=new LinkedList<String>();
	l.add("a");
	l.add("b");
	l.add("c");
	l.add("d");
	
	for(String str:l)
	{
		System.out.println(str);
	}
}
}
