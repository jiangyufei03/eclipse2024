package Lesson3_2.practice.practice1;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<Student>();
		
		student.add(new Student("Alice", 19, 110120)); 	
		student.add(new Student("Bob", 21, 110121)); 
		student.add(new Student("Carol", 20, 110122)); 
		student.add(new Student("Dave", 19, 110123)); 
		
		System.out.println(student);
		
	}

}
