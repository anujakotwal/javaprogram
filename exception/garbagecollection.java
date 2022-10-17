package exception;

public class garbagecollection 
{
	public void finalize()
	{
		System.out.println("object is garbage collected");
	}
public static void main(String[] args)
{
	garbagecollection t1=new garbagecollection();
	t1=null;
	System.gc();
}
}
