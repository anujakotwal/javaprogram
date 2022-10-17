package static_membre;

public class staticvariable {
static int x=100;
int y=100;
public void increment()
{
	x++; y++;
}
public static void main(String[] args)
{
	staticvariable t1=new staticvariable();
	staticvariable t2=new staticvariable();
	System.out.println(staticvariable.x);
	System.out.println(t2.y);
	
	t1.increment();
	t2.increment();
	
	System.out.println(staticvariable.x);//accessed withoutSystem.out.println(T2.y
    System.out.println(t2.y);
}
}
