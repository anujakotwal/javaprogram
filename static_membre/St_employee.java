package static_membre;
import java.util.*;
public class St_employee {
int eid;
String ename;
static String company_name="spark";

public void show()
{
	System.out.println("eid="+eid+"ename="+ename+"company name"+company_name);
}
public static void main(String[] args)
{
	St_employee sel=new St_employee();
	sel.eid=104;
	sel.ename="Abhijit";
	sel.show();
	
	St_employee se2=new St_employee();
	se2.eid=108;
	se2.ename="Ankita";
	se2.show();
}
}
