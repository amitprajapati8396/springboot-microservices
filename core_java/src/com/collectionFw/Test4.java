package com.collectionFw;

import java.util.TreeSet;

public class Test4 {
	
public static void main(String[] args) {
		
		TreeSet<Student> ts = new TreeSet<Student>(new StudentNameComparator());
		
		Student s1 = new Student();
		s1.setStid(100);
		s1.setStname("rama");
		
		Student s2 = new Student();
		s2.setStid(101);
		s2.setStname("hyd");
		
		ts.add(s1);
		ts.add(s2);
		
		System.out.println(ts);
		
	}

}
