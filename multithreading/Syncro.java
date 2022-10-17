package multithreading;
class first
{
	public void display(String msg)
	{
		System.out.println("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println ("]");
	}
}
class Second extends Thread
{
	String msg;
	first fobj;
	Second (first fp,String str)
	{
		fobj=fp;
		msg=str;
		start();
	}
	public void run()
	
	{
		fobj.display(msg);
	}
}

public class Syncro 
{
public static void main(String[] args)
{
	first fnew=new first();
	Second ss=new Second(fnew, "welcome");
	Second ss1=new Second(fnew,"new");
	Second ss2=new Second(fnew, "programmer");
}
}

