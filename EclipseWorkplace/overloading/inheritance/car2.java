package inheritance;
abstract class vehicle2
{
	public abstract void engine();
}
public class car2 extends vehicle2
{
 public void engine()
 {
	 System.out.println("car engine");
	 //car engine implementation
 }
 public static void main(String[] args)
 {
	 vehicle2 v=new car2();
	 v.engine();
 }
}
