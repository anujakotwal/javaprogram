package overloading;

public class callbyreference {
	int x=10;
	int y=20;
	public void callref(callbyreference t)
	{
		t.x=100;
		t.y=200;
	}
	{
	callbyreference ts=new callbyreference();
	System.out.println("before"+ts.x+" "+ts.y);
	ts.callref(ts);
	System.out.println("after"+ts.x+" "+ts.y);

}
}