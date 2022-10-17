package inheritance;
interface area   
{
	double pi=3.14;
double A(double l,double b);
}
class rect implements area
{
	public double A(double l,double b)
	{
		return(l*b);
	}
}

 class circle implements area
{
 public double A(double l,double b)
 {
	 return(pi*l*b);
 }
}
 class test
 {
	 public static void main(String[] args)
	 {
		 rect r=new rect();
		 circle c=new circle();
		 area a;
		 
		 a=r;
		 System.out.println("\n area of rectangle is="+a.A(12,13));
		 System.out.println("\n area of circle is="+a.A(2.3,1.2));
	 }
 }
 
