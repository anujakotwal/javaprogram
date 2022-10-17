package inheritance;
interface Movable1
{
	boolean isMovable1();
}
interface Rollable
{
	boolean isRollable();
}
public class tyre implements Movable1,Rollable
{
public boolean isMovable1()
 {
	 return true;
 }
 public boolean isRollable()
 {
	 return true;
 }
 public static void main(String[] args)
 {
	 tyre t=new tyre();
	 System.out.println(t.isMovable1());
	 System.out.println(t.isRollable());
 }
}
