package static_membre;

public class counter {
static int count=0;
public
  counter()
  {
	count++;
	System.out.println(count);
  }

	public static void main(String[] args) {
		counter c1=new counter();
		counter c2=new counter();
		counter c3=new counter();
		// TODO Auto-generated method stub

	}

}
