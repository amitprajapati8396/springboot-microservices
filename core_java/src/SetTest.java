import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
      
		Set<Long> tel = new TreeSet<Long>();
		
		tel.add(9090909090l);
		tel.add(9080909090l);
		tel.add(9070909090l);
		tel.add(9060909090l);
		tel.add(9050909090l);
		tel.add(9040909090l);
		tel.add(9030909090l);
		
	   tel.forEach(System.out::println);	
	}
}
