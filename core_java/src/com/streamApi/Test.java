package com.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
   
	//find integer numbers and multiply them by 2 
	static void findEvenNumber(List<Integer> list) {
		
		list.stream().filter(x->x%2==0).map(x->x*2).forEach(System.out::println);
		
		Integer reduce = list.stream().filter(x->x%2==0).reduce(0,Integer::sum);
				
				//list.stream().filter(x->x%2==0).reduce(0,(a,b)->a+b);
		System.out.println("sum of all even numbers : "+reduce);
	}
	
	public static void main(String[] args) {
		
		findEvenNumber(Arrays.asList(1,2,3,4,6,8,10,12,11));
		
		
		
		List<Integer> list = Arrays.asList(2,3,4,5,12,89,13,1,10,8);
		 
		//list.stream().sorted().forEach(s->System.out.print(s+" "));
	     //sorted.forEach(s->System.out.print(s+","));
		//list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
