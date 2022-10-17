package inheritance;
class employee
{
	protected
	int id;
	String name;
	
	public
	employee(int i, String n)
	{
		id=i;
		name=n;
	}
}
public class department extends employee
{
	protected
	String designation;
	double salary;
	
	public
	department(int i, String n,String d,double s)
	{
		super(i,n);
		designation=d;
		salary=s;
	}
	void show()
	{

		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("designation="+designation);
		System.out.println("salary="+salary);
	}
	public static void main(String[] args)
	{
		department d=new department(1,"john","developer",23456.6);
		d.show();
	}
}
