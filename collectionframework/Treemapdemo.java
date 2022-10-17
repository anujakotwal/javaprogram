package collectionframework;
import java.util.*;

public class Treemapdemo {
	public static void main(String[] args)
	 {
		 TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		 tm.put("a",new Integer(100));
		 tm.put("b",new Integer(200));
		 tm.put("d",new Integer(400));
		 tm.put("c",new Integer(300));
		 Set<Map.Entry<String,Integer>> st=tm.entrySet(); //returns sat veiw
		 for(Map.Entry me:st)
		 {
			 System.out.print(me.getKey()+":");
			 System.out.println(me.getValue());
		 }
}
}
