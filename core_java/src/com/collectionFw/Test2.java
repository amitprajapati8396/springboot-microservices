package com.collectionFw;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		// generics
		Set<Student> s = new LinkedHashSet<Student>();

		Student st1 = new Student();
		st1.setStid(100);
		st1.setStname("anusha");

		Student st2 = new Student();
		st2.setStid(101);
		st2.setStname("Rishi");

		s.add(st1);
		s.add(st2);

		System.out.println("size is: " + s.size());

		for (Student st : s) {
			if (st.getStname().startsWith("a"))
				System.out.println(st.getStname());
		}
	}
}
