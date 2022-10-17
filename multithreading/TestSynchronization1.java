package multithreading;
class Table
{
	synchronized void printTable(int n)
	{
		//method not synchronized
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class mythreada1 extends Thread
{
	Table t;
	mythreada1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class mythreada2 extends Thread
{
	Table t;
	mythreada2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
public class TestSynchronization1 {
	public static void main(String[] args)
	{
		Table obj=new Table();//only one object
		mythreada1 t1=new mythreada1(obj);
		mythreada2 t2=new mythreada2(obj);
		t1.start();
		t2.start();
		
	}

}
