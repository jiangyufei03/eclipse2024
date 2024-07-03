package Lesson3_2.practice.practice1;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		
		Map<String, Integer> studentsAge = new HashMap<String, Integer>();
		studentsAge.put("Alice", 19);
		studentsAge.put("Bob", 21);
		studentsAge.put("Carol", 20);
		studentsAge.put("Dave", 19);
		
		Map<String, Integer> studentsId = new HashMap<String, Integer>();
		studentsId.put("Alice", 110120);
		studentsId.put("Bob", 110121);
		studentsId.put("Carol", 110122);
		studentsId.put("Dave", 110123);
		
		System.out.println(studentsAge.get("Alice"));
		System.out.println(studentsId.get("Alice"));
		
	
		
		
	}

}
