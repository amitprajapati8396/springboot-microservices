import java.util.LinkedList;
import java.util.List;

class LinkedListTest {
	public static void main(String[] args) {
       List<String> student = new LinkedList<String>();
       student.add("Peter");
       student.add("Scott");
       student.add("Lerry");
       student.add("Xavior");
       
       student.forEach(System.out::println);
       
       student.remove(2);
       System.out.println("============= After Removing an Object ==============");
       student.forEach(System.out::println);
	}
}
