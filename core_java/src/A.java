import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class A{
	public static void main(String[] args) {
//		
//		List<String> fruit = List.of("Apple","Mango","Banana","Grapes","Orange");
//		List<String> animal = List.of("Cow","Dog","Ox","Cat","Rabbit","Lion");
//		List<List<String>> list = List.of(fruit,animal);
//		
//		list.stream().flatMap(List::stream).collect(Collectors.toList());
//       
//		List<Integer> list = Arrays.asList(10,20,30,40,10,20,50,40,60,30);
//		
//        list.stream().filter(x->x<60).map(x->x*2).distinct().collect(Collectors.toList()).forEach(System.out::println);   
//		Set<Integer> set = new LinkedHashSet<Integer>();
//		set.addAll(list);
//		System.out.println(set);
//		
//		List<Integer> filter = list.stream().distinct().collect(Collectors.toList());
//		System.out.println(filter);
		
		
//		IntStream.range(1, 20).skip(5).forEach(System.out::println);
		
		int arr[]= {1,2,3,4,5,6,7,8};
		int swap[] = {};
		int temp;
		
		for(int i=0;i<arr.length;i++){
		    if(arr[i]<arr[i+1]){
		    	temp = arr[i];
		    	swap[i]=temp; 
		    }	
		}
		for(int i : swap){
			System.out.println(i);
		}
	}
}
