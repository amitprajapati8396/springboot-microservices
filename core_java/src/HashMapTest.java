import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		
      //HashMap
	   System.out.println("=============== HashMap =============");
       Map<Integer,String> map = new HashMap<Integer, String>();
       
       map.put(101,"Amit");
       map.put(102,"Saurabh");
       map.put(103,"Abhinay");
       map.put(105, "Vishal");
       map.put(101,"Vikash");
       
//       map.put(null,"Minni");
//       System.out.println(map);
       
	   Iterator<Integer> iterator = map.keySet().iterator();
	   while(iterator.hasNext()) {
		   int key = iterator.next();
		   System.out.println("Id : " +key+ " , Name : "+map.get(key));
	   }
	}
}
