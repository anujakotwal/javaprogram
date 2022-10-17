package collectionframework;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArraylistExample 
{
public static void main(String[] args)
{

	ArrayList<String> a1=new ArrayList<String>();
	a1.add("ab");
	a1.add("bc");
	a1.add("cd");
	a1.add("de");
	System.out.println(a1);
	
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(60);
	a.add(30);
	a.add(50);
	a.add(40);
	System.out.println(a);
	
	Collections.sort(a);
	System.out.println(a);
}
}

