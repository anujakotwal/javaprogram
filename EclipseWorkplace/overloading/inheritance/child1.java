package inheritance;
class parent1
{
	String name;
}

public class child1 extends parent1
{
 String name;
 public void details()
 {
	 super.name="parent";
	 name="child";
	 System.out.println(super.name+" "+name);
 }
 public static void main(String[] args)
 {
	 child1 obj= new child1();
	 obj.details();
 }
}
