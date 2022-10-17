package inheritance;
class bank
{
	float getRateofInterest()
	{
		return 0;
	}
}
class SBI extends bank
{
	float getRateofInterest()
	{
		return 8.4f;
	}
	
}
class ICICI extends bank
{
	float getRateofInterest()
	{
		return 7.3f;
	}
}
class AXIS extends bank
{
	float getRateofInterest() {
		return 9.7f;
	}
}
public class testpolymorphism 
{
	public static void main(String[] args)
{
  bank b;
  b=new SBI();
  System.out.println("SBI rate of interest="+b.getRateofInterest());
  b=new ICICI();
  System.out.println("ICICI rate of interest="+b.getRateofInterest());
  b=new AXIS();
  System.out.println("AXIS rate of interest="+b.getRateofInterest());
}
}