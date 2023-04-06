import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
	
	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<Integer>();
		  list.add(1);
		  list.add(2);
		  list.add(3);
		  list.add(4);
		  list.add(11);
		  list.add(0);		  
		  list.add(13);
		  list.add(5);
		  list.add(10);
		  list.add(7);
		  list.add(9);
		  list.add(8);
		
		List<Integer> collect = list.stream().filter(x->x>5 && x<9).collect(Collectors.toList());
		System.out.println(collect);
		
		
		Integer min = list.stream().max((x1,x2)->x2.compareTo(x1)).get();
		System.out.println(min);
		
		
		List<Integer> sorted = list.stream().sorted((x1,x2)->x1.compareTo(x2)).collect(Collectors.toList());
		System.out.println(sorted);
		
		
		List<Integer> mapped=list.stream().sorted((x1,x2)->x1.compareTo(x2)).map(x->x+1).collect(Collectors.toList());
		System.out.println(mapped);
		
		
		System.out.println("==============Flat Map=================");
		//flatMap
		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		lists.add(Arrays.asList(1,2));
		lists.add(Arrays.asList(4,5));
		lists.add(Arrays.asList(8,9));
		lists.add(Arrays.asList(0,1));
		lists.add(Arrays.asList(5,6));
		lists.add(Arrays.asList(3,4));
		
		System.out.println(lists);
		
		List<Integer> collectList = lists.stream().flatMap(x->x.stream()).map(x->x+1).filter(x->x%2==0)
				.collect(Collectors.toList());
		System.out.println(collectList);
		//m1(10);
	  	
	}
	
	public static boolean m1(int n) {
		
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  list.add(1);
	  list.add(2);
	  list.add(3);
	  list.add(4);
	  list.add(5);
	  list.add(6);
	  list.add(7);
	  list.add(9);
	  list.add(8);
	  
	  int index = 0;
	  for(int i=0;i<list.size();i++){
		  if(list.get(i)==4 ){
			  index =i;
		  }
	  }
	  
	  list.add(index+1,n);
	  
	  System.out.println(list);
	  
	  boolean contains = list.contains(n);
	  list.remove(index+1);
	  System.out.println(list);
	  return contains;
	}

}
