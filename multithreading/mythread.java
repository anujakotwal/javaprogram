package multithreading;
class mythread1 extends Thread
{
	public void run()
	{
		System.out.println("r1");
		try
		{
			Thread.sleep(500);
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("r2");
	}
}
public class mythread 
{
public static void main(String[] args)
{
	mythread1 t1=new mythread1();
	mythread1 t2=new mythread1();
	t1.start();
	t2.start();
	System.out.println(t1.isAlive());
	System.out.println(t2.isAlive());
}
}
