package static_membre;

class cricketer
{
	String name;
	String team;
	int age;
	
	public
	cricketer()//default constructor
	{
		name=" ";
		team=" ";
		age=0;
	}
	
	cricketer(String n,String t,int a) //parameterized constructor
	{
		name=n;
		team=t;
		age=a;
	}
	cricketer(String n1,int a1)
	{
		this.name=n1;
		this.age=a1;
	}
	cricketer (cricketer ckt) //copy constructor
	{
		name=ckt.name;
		team=ckt.team;
		age=ckt.age;
	}
	/*void display()
	{
		System.out.println("name="+name);
		System.out.println("team="+team);
		System.out.println("age="+age);
	}*/
	
	public String toString()
	{
		return"name="+name+"team="+team+"age=" +age;
	}
}
	public class Constructor{
		public static void main(String[] args)
		{
			cricketer C1=new cricketer();
			System.out.println(C1);
			//C1.display();
			cricketer C2=new cricketer("Scahin","India",22);
			
			System.out.println(C2);
			//C2.display();
			
			cricketer C3=new cricketer(C2);
			System.out.println(C3);
			//C3.display();
			
			C1.name="Virat";
			C1.team="India";
			C1.age=43;
			
			System.out.println(C1);
			cricketer c4=new cricketer("DHONI",36);
			System.out.println(c4);
			
		}
	}


