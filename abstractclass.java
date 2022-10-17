abstract class shape
{
	abstract void draw();
	}
class rectanglle extends shape{
	 void draw()
	{
		int area;
		int l=7,b=9;
		area=l*b;
		System.out.println("area of rectangle= "+area);
	}
}
class square extends shape
{
	 void draw()
	{
		int side=4,areas;
		areas=side*side;
	System.out.println("area of square= "+areas);
	}
}

public class abstractclass 
{
public static void main(String[] args)
{
shape s=new square();
s.draw();
shape s1=new rectanglle();
s1.draw();
}
}