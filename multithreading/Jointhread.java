package multithreading;
class Mythread2 extends Thread
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
public class Jointhread {
	public static void main(String[] args)
	{
		Mythread2 t1=new Mythread2();
		Mythread2 t2=new Mythread2();
		t1.start();
		
		try
		{
			t1.join();
		}
		catch(InterruptedException e1)
		{
			System.out.println(e1);
		}
		t2.start();
}
}
