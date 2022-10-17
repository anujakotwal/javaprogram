package inheritance;
interface Movable
{
	int avg_speed=40;
	void move();
}

public class interfaceVehicle implements Movable 
{
  public void move()
  {
	  System.out.println("avg_speed is="+avg_speed);
  }
  public static void main(String[] args)
  {
	  interfaceVehicle v1=new interfaceVehicle();
	  v1.move();
  }
}
