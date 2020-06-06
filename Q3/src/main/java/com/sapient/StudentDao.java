package com.sapient;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class StudentDao {
	
	private static Map<Integer,Student> students=new HashMap<>();
	
	static {
	
	students.put(23, new Student(23,"Uday",72,'A'));

		students.put(24, new Student(24,"Arjun",53,'C'));

		students.put(25, new Student(25,"Adam",47,'P'));

		students.put(26, new Student(26,"James",89,'F'));
	}
	
	public Student find(int id) {
		
		return students.get(id);
	}
}
