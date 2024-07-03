package Lesson3_2.practice.practice1;

import java.util.HashMap;
import java.util.Map;

public class Main3 {

	public static void main(String[] args) {
		Map<String,Student> students = new HashMap<String,Student>();
		students.put("Alice", new Student("Alice", 19, 110120));
		students.put("Bob", new Student("Bob", 21, 110121));
		students.put("Carol", new Student("Carol", 20, 110122));
		students.put("Dave", new Student("Dave", 19, 110123));
		
		System.out.println(students.get("Alice"));
	}
}