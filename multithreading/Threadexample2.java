package multithreading;
class D implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=6;i++)
		{
			System.out.println("i="+i);
		}
	}
}
class E implements Runnable
{
	public void run()
	{
		int j;
		for(j=1;j<=6;j++)
		{
			System.out.println("j="+j);
		}
	}
}
public class Threadexample2 
{
 public static void main(String[] args)
 {
	 D obj=new D();
	 Thread t1=new Thread(obj);
	 t1.start();
	 E e=new E();
	 Thread t2=new Thread(e);
	 t2.start();
 }
 
 
}
